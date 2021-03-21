/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EmploymentHistroy {
    EmploymentPortal ep;
    ArrayList<Employment> employments;
    
    public EmploymentHistroy(){
        employments = new ArrayList();
    }
    
    public Employment newEmployment(Employment ne){
        employments.add(ne);
        return ne;
    }
    
    public void assignJob(String company, String job){
        employments.add(ep.getJob(company, job));
    }

    public ArrayList<Employment> getEmployments() {
        return employments;
    }
    
    
}
