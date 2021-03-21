/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.university;

import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class CollegeStudentsDirectory {
    
    College college;
    ArrayList<StudentProfile> studentList;
    
    public CollegeStudentsDirectory(College college){
        this.college = college;
        studentList = new ArrayList<>();
    }

    public College getCollege() {
        return college;
    }

    public ArrayList<StudentProfile> getStudentList() {
        return studentList;
    }
    
    public void addStudents(StudentProfile student){
        this.studentList.add(student);
    }
    
    public StudentProfile findStudent(String id){
        for(StudentProfile student:studentList){
            if(student.isMatch(id)){
                return student;
            }
        }
        return null;
    }
}
