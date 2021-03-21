/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    String semester;
    ArrayList<SeatAssignment> seatassignments;
    private int semestercredits;
    
    public CourseLoad(String s){
        seatassignments = new ArrayList<SeatAssignment>();
        semester = s;
    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment();
        sa.setSeat(seat);
        seat.setSeatAssignment(sa);
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        
        
        sa.assignSeatToStudent(this);
        
        seatassignments.add(sa);
    }
    
    public int calculateSemesterCost(){
        int cost =0;
        for(SeatAssignment sa:seatassignments){
            if(sa.seat.isOccupied()){
                cost+=sa.getPaidCoursePrice();
            }
        }
        return cost;
    }
    
    public double getSemesterGpa(){
        double gpasum=0;
        int total_credits=0;
        for(SeatAssignment sa:seatassignments){
            int credits= sa.getCredits();
            double ta = sa.getGrade()*credits;
            gpasum=gpasum+ta;
            total_credits+=sa.getCredits();
        }
        this.semestercredits=total_credits;
        return gpasum/total_credits;
    }
    
    public int getSemesterCredits(){
        return this.semestercredits;
    }
    
    public String getSemester(){
        return semester;
    }

    public ArrayList<SeatAssignment> getSeatassignments() {
        return seatassignments;
    }
    
    public double getAvgRating(){
        
        double ss=0;
        for(SeatAssignment sa:seatassignments){
            ss+=sa.getCourseRating();
        }
        
        return ss/seatassignments.size();
    }
    
    
    
}
