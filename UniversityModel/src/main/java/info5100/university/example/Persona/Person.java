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
public class Person {
    
    String fname;
    String lname;
    String id;
    public Person (String id, String fname, String lname){
        
        this.fname=fname;
        this.lname=lname;
        this.id = id;
    }
    public String getPersonId(){
        return id;
    }
    
    public String getFullName(){
        return fname+" "+lname;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
    
}
