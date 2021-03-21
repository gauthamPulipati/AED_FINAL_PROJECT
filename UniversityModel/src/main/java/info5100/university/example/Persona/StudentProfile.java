/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;
import info5100.university.example.Persona.EmploymentHistory.EmploymentPortal;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;
    StudentAccount account;
    boolean graduationstatus;
    

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript();
        employmenthistory = new EmploymentHistroy();
        account= new StudentAccount();
        account.setStudent(this);
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s){
        
        return transcript.newCourseLoad(s);
    }

    public Transcript getTranscript() {
        return transcript;
    }
    
    public String getStudentName(){
        return person.getFullName();
    }
    
    public boolean getIsAlumni(){
        return graduationstatus;
    }
    
    public void setGraduationStatus(boolean status){
        this.graduationstatus = status;
    }
    
    public String getStudentID(){
        return this.person.id;
    }

    public EmploymentHistroy getEmploymenthistory() {
        return employmenthistory;
    }
    
    

}
