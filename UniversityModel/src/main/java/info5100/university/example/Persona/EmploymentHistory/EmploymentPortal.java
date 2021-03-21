/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Employer.EmployerProfile;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class EmploymentPortal {
    private EmployerDirectory ed;
    
    public EmploymentPortal(EmployerDirectory ed){
        this.ed=ed;
    }
    
    public Employment getJob(String company, String job){
        EmployerProfile ep = ed.findCompany(company);
        for(Employment emp:ep.getEmployments()){
            if(job.equals(emp.job)){
                return emp;
            }
        }
        return null;
    }
}
