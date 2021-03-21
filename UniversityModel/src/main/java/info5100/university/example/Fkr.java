/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import com.github.javafaker.Faker;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class Fkr {
    public static void main(String[] args){
        Faker faker = new Faker();
        System.out.println(faker.random().nextInt(3, 4));
        
        or(int i=0;i<10;i++){
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
    }
}
