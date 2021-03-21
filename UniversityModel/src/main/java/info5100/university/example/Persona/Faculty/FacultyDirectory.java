/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {

    Department department;
    ArrayList<FacultyProfile> teacherlist;

    public FacultyDirectory(Department d) {

        department = d;
        teacherlist = new ArrayList();

    }

    public FacultyProfile newStudentProfile(Person p, double rating) {

        FacultyProfile sp = new FacultyProfile(p, rating);
        teacherlist.add(sp);
        return sp;
    }
    
    public FacultyProfile newFacultyProfile(Person p, double rating){
        FacultyProfile fp = new FacultyProfile(p, rating);
        teacherlist.add(fp);
        return fp;
    }

    public FacultyProfile findTeachingFaculty(String id) {

        for (FacultyProfile sp : teacherlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }

    public ArrayList<FacultyProfile> getTeacherlist() {
        return teacherlist;
    }
    
    
}
