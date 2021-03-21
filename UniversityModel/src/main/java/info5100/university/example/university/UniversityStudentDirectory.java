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
public class UniversityStudentDirectory {
    
    University university;
    
    ArrayList<StudentProfile> studentList;
    
    public UniversityStudentDirectory(University university){
        this.university = university;
        studentList = new ArrayList<>();
    }

    public University getUniversity() {
        return university;
    }

    public ArrayList<StudentProfile> getStudentList() {
        return studentList;
    }
    
    public void addStudent(StudentProfile sd){
        this.studentList.add(sd);
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
