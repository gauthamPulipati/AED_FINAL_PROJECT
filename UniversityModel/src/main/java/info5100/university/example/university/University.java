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
public class University {
    String name;
    String location;
    UniversityStudentDirectory universityStudentDirectory;
    ArrayList<College> colleges;
    
    public University(String name, String location){
        this.name = name;
        this.location = location;
        colleges = new ArrayList<>();
        universityStudentDirectory = new UniversityStudentDirectory(this);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
    
    public void addCollege(College college){
        college.addUniversity(this);
        this.colleges.add(college);
    }
    
    public void addStudent(StudentProfile student){
        this.universityStudentDirectory.addStudent(student);
    }

    public UniversityStudentDirectory getUniversityStudentDirectory() {
        return universityStudentDirectory;
    }

    public void setUniversityStudentDirectory(UniversityStudentDirectory universityStudentDirectory) {
        this.universityStudentDirectory = universityStudentDirectory;
    }
    
}
