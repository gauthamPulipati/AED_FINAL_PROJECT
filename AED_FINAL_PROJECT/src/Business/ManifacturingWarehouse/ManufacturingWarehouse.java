/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ManifacturingWarehouse;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ManufacturingWarehouse extends Organization {
    
    private String wareHouseName;

    public String getWareHouseName() {
        return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName;
    }
    
    public ManufacturingWarehouse(String warehouseName){
        super();
        this.wareHouseName = warehouseName;
        
    }
    
    @Override
    public String toString(){
        return this.wareHouseName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
