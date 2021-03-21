/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 *
 * @author kal bugrara
 */
public class StudentAccount {
    StudentProfile student;
    String status;
    private int amountOwed;
    private int creditedAmount;
    
    
    public void setStudent(StudentProfile student){
        this.student=student;
    }

    public StudentProfile getStudent() {
        return student;
    }

    public String getStatus() {
        
        if(this.amountOwed == this.creditedAmount){
            this.status = "No dues";
        }
        else{
            this.status = "You have dues to pay";
        }
        
        return status;
    }

    public int getAmountOwed() {
        return amountOwed;
    }

    public int getCreditedAmount() {
        return creditedAmount;
    }
    
    public void addCreditAmount(int credit){
        this.creditedAmount+=credit;
    }
    
    public int getPaidTotals(){
        int cost=this.student.transcript.getCurrentCourseLoad().calculateSemesterCost();
        this.amountOwed=cost;
        return cost;
    }
}
