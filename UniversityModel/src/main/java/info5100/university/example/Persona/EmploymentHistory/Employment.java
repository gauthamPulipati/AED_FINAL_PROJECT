/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Employment {
    ArrayList<CourseOffer> relevantcourseoffers;
    int weight;
    String quality;
    String job;
    
    EmployerProfile employer;
    
    public Employment(String j, EmployerProfile employer){
        this.employer = employer;
        this.relevantcourseoffers = new ArrayList();
        this.job = j;
        
        for(CourseOffer co: relevantcourseoffers){
            co.updateRating(quality);
        }
    }
    
    public void setCourses(CourseOffer co){
        relevantcourseoffers.add(co);
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    
    public ArrayList<CourseOffer> getRelevantcourseoffers() {
        return relevantcourseoffers;
    }

    public int getWeight() {
        return weight;
    }

    public String getQuality() {
        return quality;
    }

    public String getJob() {
        return job;
    }


    public EmployerProfile getEmployer() {
        return employer;
    }
    
    

}
