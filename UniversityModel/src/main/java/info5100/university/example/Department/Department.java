/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Persona.EmploymentHistory.EmploymentPortal;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.university.College;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Department {

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    College college;
    ArrayList<Degree> degreeList;
    EmployerDirectory employerdirectory;
    EmploymentPortal ep;

    HashMap<String, CourseSchedule> mastercoursecatalog;

    
    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<String, CourseSchedule>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        facultydirectory = new FacultyDirectory(this);
        employerdirectory = new EmployerDirectory(this);
        ep=employerdirectory.getEp();
        
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public EmployerDirectory getEmployerdirectory() {
        return employerdirectory;
    }
    
    

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    
    public PersonDirectory getPersonDirectory() {

        return persondirectory;

    }

    public EmploymentPortal getEp() {
        return ep;
    }

    public StudentDirectory getStudentDirectory() {
    return studentdirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }

    public Course newCourse(String n, String nm, int cr) {

        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.get(semester);

        return css.calculateTotalRevenues();

    }

        public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCourseLoadBySemester(semester);

        CourseSchedule cs = mastercoursecatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);

    }
    
    
    public void setCollege(College college){
        this.college=college;
    }

    public College getCollege() {
        return college;
    }
    
    public void addDegree(Degree degree){
        this.degreeList.add(degree);
    }
    
    public void applyForJob(String studentID, String company, String Job){
        
        
    }
    
}
