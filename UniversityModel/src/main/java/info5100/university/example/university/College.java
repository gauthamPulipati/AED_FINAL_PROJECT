/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.university;

import info5100.university.example.Department.Department;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class College {
    String collegeName;
    ArrayList <Department> departmentList;
    University uni;
    CollegeStudentsDirectory students;
    
    public College(String collegeName){
        this.collegeName = collegeName;
        students = new CollegeStudentsDirectory(this);
    }

    public String getCollegeName() {
        return collegeName;
    }
    
    public void addUniversity(University uni){
        this.uni=uni;
    }
    
    public University getUniversity(){
        return this.uni;
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }
    
    public void addDepartments(Department department){
        department.setCollege(this);
        departmentList.add(department);
    }
    
    public void addStudentCollege(StudentProfile student){
        students.addStudents(student);
    }
    
}
