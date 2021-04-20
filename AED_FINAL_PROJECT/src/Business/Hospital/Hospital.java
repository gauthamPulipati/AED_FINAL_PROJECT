/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class Hospital extends Organization{
    
    private String hospitalName;
    
    public Hospital(String hospitalName){
        super();
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
