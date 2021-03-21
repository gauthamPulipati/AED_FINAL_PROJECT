/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class Degree {
    
    Department department;
    ArrayList<Course> core;
    ArrayList<Course> elective;
    
    String degreeName;
    
    public Degree(String degreeName){
        this.degreeName=degreeName;
        department.addDegree(this);
    }
    
    public void addCoreCourse(Course course){
        this.core.add(course);
    }
    
    public void addElectiveCourse(Course course){
        this.elective.add(course);
    }

    public ArrayList<Course> getCore() {
        return core;
    }

    public ArrayList<Course> getElective() {
        return elective;
    }

    public String getDegreeName() {
        return degreeName;
    }
    
    
    
}
