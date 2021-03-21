/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

/**
 *
 * @author gauthamrajsimhapulipati
 */

import com.github.javafaker.Faker;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.university.*;
import java.util.ArrayList;

public class Test {
    
    ArrayList<String> com;
    ArrayList<String> jb;
    
    public Test(){
        this.com = new ArrayList<>();
        this.jb = new ArrayList<>();
    }
    
    public static void main(String args[]){
        
        Test t = new Test();
        
        
        
        University university = new University("Northeastern", "Boston");
        College college = new College("COE");
        College college1 = new College("Khoury");
        
        university.addCollege(college);
        university.addCollege(college1);
        
        Department dp1 = new Department("IS");
        Department dp2 = new Department("DS");
        Department dp3 = new Department("CS");
        Department dp4 = new Department("AI");
        
        dp1.setCollege(college);
        dp2.setCollege(college);
        dp3.setCollege(college1);
        dp4.setCollege(college1);
        
        for(int i=0;i<10;i++){
            Course course = dp1.newCourse("Course name "+String.valueOf(i+1), "INFO "+String.valueOf(5001+i), 4);
        }
        CourseSchedule cs1 = dp1.newCourseSchedule("Fall2020");
        CourseSchedule cs2 = dp1.newCourseSchedule("Spring2021");
        
        CourseOffer[] co1 = new CourseOffer[10],co2 = new CourseOffer[10];
        for(int i=0;i<10;i++){
            if(i<7){
                co1[i] = cs1.newCourseOffer("INFO "+String.valueOf(5001+i));
                //System.out.println(co1[i].getCourseNumber());
                co2[i] = cs2.newCourseOffer("INFO "+String.valueOf(5001+i));
                co1[i].generatSeats(30);
                
                co2[i].generatSeats(40);
            }
            else {
                co2[i] = cs1.newCourseOffer("INFO "+String.valueOf(5001+i));
                co2[i].generatSeats(40);
                
            }
        }
        
        
        PersonDirectory pd = new PersonDirectory();
        
        StudentDirectory sd1 = dp1.getStudentDirectory();
        StudentDirectory sd2 = dp2.getStudentDirectory();
        StudentDirectory sd3 = dp3.getStudentDirectory();
        StudentDirectory sd4 = dp4.getStudentDirectory();
        
        FacultyDirectory fd1 = dp1.getFacultydirectory();
        FacultyDirectory fd2 = dp2.getFacultydirectory();
        FacultyDirectory fd3 = dp3.getFacultydirectory();
        FacultyDirectory fd4 = dp4.getFacultydirectory();
        
        for(int i =0; i<20; i++){
            Person pf=pd.newPerson("Student "+String.valueOf(i+1),"fname","lname");
            if(i%4==0){
                StudentProfile sdd=sd1.newStudentProfile(pf);
                CourseLoad cl1=sdd.newCourseLoad("Fall2020");
                CourseLoad cl2=sdd.newCourseLoad("Spring2021");
                for(int j=0;j<5;j++){
                    cl1.newSeatAssignment(co1[j]);
                }
                //System.out.println(co1[1].getSeatlist().get(0).getSeatassignment().getCredits());
                for(int j=5;j<10;j++){
                    cl2.newSeatAssignment(co2[j]);
                }
            }
            else if(i%4==1){
                StudentProfile sdd=sd2.newStudentProfile(pf);
                
                
            }
            else if(i%4==2){
                StudentProfile sdd=sd3.newStudentProfile(pf);
                
            }
            else if(i%4==3){
                StudentProfile sdd=sd4.newStudentProfile(pf);
                
            }
        }
        
//        for(int i =0; i<10; i++){
//            Person pf=pd.newPerson("Faculty "+String.valueOf(i+1),"fname","lname");
//            if(i%4==0){
//                FacultyProfile f1=fd1.newFacultyProfile(pf);
//            }
//            else if(i%4==1){
//                FacultyProfile f2=fd2.newFacultyProfile(pf);
//            }
//            else if(i%4==2){
//                FacultyProfile f3=fd3.newFacultyProfile(pf);
//            }
//            else if(i%4==3){
//                FacultyProfile f4=fd4.newFacultyProfile(pf);
//            }
//        }
        
        for(int i=0;i<10;i+=4){
            //System.out.print(sd1.findStudent("Student "+String.valueOf(i+1)).getTranscript().getCurrentCourseLoad().getSeatassignments().get(0).getCredits());
        }
        
        // data using faker
        // we populate department 2, dp2
        
        PersonDirectory perDir = new PersonDirectory();
        
        Faker faker = new Faker();
        
        dp2.setPersondirectory(perDir);
        
        for(int i=1;i<=5;i++){
            System.out.println(i+"th year");
            t.generatePeople(dp2, 200);
            
        }
        
        t.generateCourses(dp2,30);
        CourseSchedule courseSchedule1 = dp2.newCourseSchedule("Fall2015");
        for(Course c:courseSchedule1.getCoursecatalog().getCourseList()){
            CourseOffer coo=courseSchedule1.newCourseOffer(c.getCOurseNumber());
            coo.AssignAsTeacher(t.getRandomFaculty(dp2));
            coo.setRating();
            coo.generatSeats(faker.number().numberBetween(120, 150));
        }
        
        t.generateCourses(dp2, 5);
        CourseSchedule courseSchedule2 = dp2.newCourseSchedule("Spring2016");
        for(Course c:courseSchedule2.getCoursecatalog().getCourseList()){
            CourseOffer coo=courseSchedule2.newCourseOffer(c.getCOurseNumber());
            coo.AssignAsTeacher(t.getRandomFaculty(dp2));
            coo.setRating();
            coo.generatSeats(faker.number().numberBetween(130, 140));
            
        }
        
        System.out.println("skfjg"+dp2.getCourseSchedule("Spring2016").getCoursecatalog().getCourseList().size());
        
        
        
        String nn=t.getRandomCourseID(courseSchedule1.getCoursecatalog());
        //System.out.println(courseSchedule2.getCourseOfferByNumber(nn).getCourseNumber());
        
        for(StudentProfile sp:dp2.getStudentDirectory().getStudentlist()){
            //System.out.println(sp.getStudentName()+"  id: "+sp.getStudentID());
            sp.newCourseLoad("Spring2016");
            for(int i=0;i<3;i++){
                String num = t.getRandomCourseID(courseSchedule2.getCoursecatalog());
                dp2.RegisterForAClass(sp.getStudentID(),num, "Spring2016");
            }
            
        }
        
        dp2.getCourseSchedule("Spring2016").gradeSemester();
        
        StudentProfile sp=dp2.getStudentDirectory().findStudent(t.getRandomStudentID(dp2.getStudentDirectory()));
        //System.out.println(sp.getTranscript().getGPA());
        
        for(SeatAssignment saa:sp.getCourseLoadBySemester("Spring2016").getSeatassignments()){
            System.out.println(saa.getSeat().getCourseoffer().getCourseNumber());
            System.out.println(sp.getTranscript().getGPA());
            System.out.println(sp.getTranscript().getPerformanceRating());
        }
        
        for(StudentProfile spp:dp2.getStudentDirectory().getStudentlist()){
            System.out.println("Student name: "+spp.getStudentName()+" and GPA: "+spp.getTranscript().getGPA()+" student performance "+spp.getTranscript().getPerformanceRating());
        }
        
        for(int i=0;i<1;i++){
            String tem=faker.company().name();
            t.com.add(tem);
            String tem1=faker.job().title();
            t.jb.add(tem1);
            EmployerProfile emp = dp2.getEmployerdirectory().newEmployerProfile(tem);
            for(int j=0;j<faker.random().nextInt(5);j++){
                Employment et=emp.newEmployment(tem1);
                et.setCourses(t.getRandomCourseOffer(dp2, "Spring2016"));
            }
        }
        
        for(int k=0;k<50;k++){
            StudentProfile spp = t.getRandomStudent(dp2.getStudentDirectory());
            String cm=t.getRandomCompany(dp2);
            String jb=t.getRandomJobName(dp2, cm);
            Employment randomjob = dp2.getEp().getJob(cm, jb);
            
            for(SeatAssignment saa:spp.getCourseLoadBySemester("Spring2016").getSeatassignments()){
                if(randomjob.getRelevantcourseoffers().contains(saa.getSeat().getCourseoffer())){
                    spp.getEmploymenthistory().getEmployments().add(randomjob);
                }
            }
        }
        
        
        
        for(CourseOffer co:dp2.getCourseSchedule("Spring2016").getSchedule()){
            System.out.println("Course Number: "+co.getCourseNumber()+" Course rating: "+co.getRating());
        }
        
        
        
        

    }
    
    public String getRandomStudentID(StudentDirectory sd){
        Faker faker = new Faker();
        return sd.getStudentlist().get(faker.random().nextInt(sd.getStudentlist().size()-1)).getStudentID();
    }
    
    public StudentProfile getRandomStudent(StudentDirectory sd){
        Faker faker = new Faker();
        return sd.getStudentlist().get(faker.random().nextInt(sd.getStudentlist().size()-1));
    }
    
    public String getRandomCourseID(CourseCatalog cc){
        Faker faker = new Faker();
        return cc.getCourseList().get(faker.random().nextInt(cc.getCourseList().size()-1)).getCOurseNumber();
    }
    
    
    
    
    public void generatePeople(Department dpt, int n){
        PersonDirectory perDi = dpt.getPersonDirectory();
        Faker faker = new Faker();
        for(int j=0;j<200;j++){
            Person person=perDi.newPerson(faker.number().digits(6), faker.name().firstName(), faker.name().lastName());
            if(j<190){
                dpt.getStudentDirectory().newStudentProfile(person);
            }
            if(j>=185){
                dpt.getFacultydirectory().newFacultyProfile(person, faker.random().nextDouble()*10);
            }
        }
    }
    
    public FacultyProfile getRandomFaculty(Department dpt){
        Faker faker = new Faker();
        return dpt.getFacultydirectory().getTeacherlist().get(faker.random().nextInt(dpt.getFacultydirectory().getTeacherlist().size()-1));
    }
    
    
    
    public void generateCourses(Department dpt, int n){
        Faker faker = new Faker();
        for(int i=0;i<n;i++){
            Course course=dpt.newCourse("Course "+String.valueOf(faker.number().digit()),"Info "+faker.number().digits(4) , faker.random().nextInt(3, 4));
            course.setDifficulty(faker.random().nextInt(10));
        }
    }
    
    public CourseOffer getRandomCourseOffer(Department dpt, String sem){
        Faker faker = new Faker();
        return dpt.getCourseSchedule("Spring2016").getSchedule().get(faker.random().nextInt(dpt.getCourseSchedule("Spring2016").getSchedule().size()-1));
    }
    
//    public Employment findJob(Department dpt, String Company, String job){
//        EmployerProfile ep = dpt.getEmployerdirectory().findCompany(Company);
//        for(Employment emp:ep.getEmployments()){
//            if(emp.getJob().equals(job)){
//                return emp;
//            }
//        }
//        return null;
//    }
    
    public String getRandomCompany(Department dpt){
        Faker faker = new Faker();
//        int num = faker.random().nextInt(dpt.getEmployerdirectory().getEmployerlist().size()-1);
//        return dpt.getEmployerdirectory().getEmployerlist().get(num-1).getName();
        return com.get(faker.random().nextInt(com.size()));
    }
    
    public String getRandomJobName(Department dpt, String company){
        Faker faker = new Faker();
//        EmployerProfile epp= dpt.getEmployerdirectory().findCompany(company);
//        int num = faker.random().nextInt(epp.getEmployments().size());
//        return epp.getEmployments().get(num).getJob();
        return jb.get(faker.random().nextInt(jb.size()));
    }
    
}
