/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class Transcript {
    
    
    HashMap<String, CourseLoad> courseloadlist;
    
    CourseLoad currentcourseload;
    
    double performanceRating;
    
    private double gpa;
    
    
    public Transcript(){
        
        courseloadlist = new HashMap<String, CourseLoad>();
        
    }
    
    public CourseLoad newCourseLoad(String sem){
        
        
        
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    
    public CourseLoad getCurrentCourseLoad(){
        
        return currentcourseload;
        
    }
    public CourseLoad getCourseLoadBySemester(String semester){
        
        return courseloadlist.get(semester);
        
    }
    
    public double getGPA(){
        //itertate over every semester   
        double rr=0;
        Iterator itr = courseloadlist.entrySet().iterator();
        int credits=0, cou=0;
        double sum=0;
        while(itr.hasNext()){
            Map.Entry mapEl = (Map.Entry)itr.next();
            CourseLoad dd=(CourseLoad)mapEl.getValue();
            sum+=dd.getSemesterGpa();
            credits+=dd.getSemesterCredits();
            rr+=dd.getAvgRating();
            cou++;
        }
        
        this.gpa = sum/cou;
        double gpa10 = gpa*(10/4);
        rr=rr/cou;
        this.performanceRating = (gpa10*rr)/((gpa10+rr)/2);
        
        return this.gpa;
    }
    
    public void updateRating(){
        this.performanceRating+=0.25;
    }
    
    public double getPerformanceRating(){
        return this.performanceRating;
    }
    
}
