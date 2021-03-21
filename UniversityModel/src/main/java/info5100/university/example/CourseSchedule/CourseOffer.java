/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseOffer {

    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;
    
    double rating;
    
    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList<>();
    }
    
    
    public void AssignAsTeacher(FacultyProfile fp) {

        facultyassignment = new FacultyAssignment(fp, this);
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }
    
    

    public FacultyProfile getFacultyProfile() {
        return facultyassignment.getFacultyProfile();
    }

    public String getCourseNumber() {
        return course.getCOurseNumber();
    }

    public void generatSeats(int n) {

        for (int i = 0; i < n; i++) {

            seatlist.add(new Seat(this, i));

        }

    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }

    public SeatAssignment assignEmptySeat(CourseLoad cl) {

        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(); //seat is already linked to course offer
        sa.seat=seat;
        cl.registerStudent(sa); //coures offer seat is now linked to student
        return sa;
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }

        }
        return sum;
    }
    
    public int getCoursePrice(){
        return course.getCoursePrice();
    }
    
    public int getCourseCredits(){
        return course.getCredits();
    }
    
    public void gradeThisCourse(){
        int count=0;
        double sum=0;
        for(Seat s:seatlist){
            if(s.isOccupied() == true){
                sum=sum+s.generateGrade();
                count++;
            }
        }
        
    }
    
    public void setRating(){
        int courseDifficulty = course.getDifficulty();
        double facultyRating = facultyassignment.getFacultyProfile().getRating();
        this.rating = (courseDifficulty*facultyRating)/((courseDifficulty+facultyRating)/2);
    }    
    
    public double getRating(){
        return rating;
    }
    
    public void updateRating(String quality){
        if(rating+0.005<10 && quality.equals("Good")){
            rating+=0.005;
        }
    }
    
    public void updateRating(){
        rating-=1;
    }

}
