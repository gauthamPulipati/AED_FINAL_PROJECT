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

import java.util.Random;

public class Seat {
    
    boolean occupied; 
    int number;
    SeatAssignment seatassignment;
    CourseOffer courseoffer;
    public Seat (CourseOffer co, int n){
        courseoffer = co;
        number = n;
        occupied = false;
        
    }
    
    public Boolean isOccupied(){
        return occupied;

    }
    public SeatAssignment newSeatAssignment(){
        
        seatassignment = new SeatAssignment(); //links seatassignment to seat
        
        occupied = true;   
        return seatassignment;
    }
    
    public int getCredits(){
        return courseoffer.getCourseCredits();
    }

    public SeatAssignment getSeatassignment() {
        return seatassignment;
    }
    
    public void setSeatAssignment(SeatAssignment sa){
        this.seatassignment=sa;
    }
    
    public double generateGrade(){
        Random random = new Random();
        double gr;
        if(random.nextInt(2)%2==0){
            gr=3.5;
        }
        else{
            gr=4.0;
        }
        this.seatassignment.setGrade(gr);
        return gr;
    }

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }
    
    
    
}
