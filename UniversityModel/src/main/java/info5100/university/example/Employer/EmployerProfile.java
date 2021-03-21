/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Employer;

import info5100.university.example.Persona.EmploymentHistory.Employment;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EmployerProfile {
    String name;
    ArrayList<Employment> employments;
    public EmployerProfile(String n){  //could be company instead of just a name as a string
        name = n;
        employments = new ArrayList<>();
    }
    public boolean isMatch(String id){
        if(name.equals(id)) return true;             //String is an object and can do equal matach
        return false;
    }
    
    public Employment newEmployment(String j){
        Employment emp = new Employment(j,this);
        emp.setQuality("good");
        employments.add(emp);
        return emp;
    }
    

    public ArrayList<Employment> getEmployments() {
        return employments;
    }
    
    public String getName(){
        return this.name;
    }
    
}
