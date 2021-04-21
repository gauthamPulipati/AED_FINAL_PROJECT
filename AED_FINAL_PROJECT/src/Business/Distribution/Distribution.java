/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distribution;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class Distribution extends Organization{
    
    private String distributionName;
    
    public Distribution(String name){
        super();
        this.distributionName=name;
    }

    public String getDistributionName() {
        return distributionName;
    }
    
    @Override
    public String toString(){
        return this.distributionName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
