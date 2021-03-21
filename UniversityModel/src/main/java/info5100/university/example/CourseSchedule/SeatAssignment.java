/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    
    Seat seat;
    CourseLoad courseload;
    private double grade;
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
    }
        public SeatAssignment(){

    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
        
    }
    
    public int getPaidCoursePrice(){
        
        return this.seat.courseoffer.getCoursePrice();
    }
    
    public double getGrade(){
        return this.grade;
    }
    
    public int getCredits(){
        return seat.getCredits();
    }
    
    public void setSeat(Seat seat){
        this.seat=seat;
    }
    
    public double setGrade(double grade){
        this.grade = grade;
        return this.grade;
    }
    
    public double getCourseRating(){
        return seat.courseoffer.getRating();
    }

    public Seat getSeat() {
        return seat;
    }
    
    
    
}
