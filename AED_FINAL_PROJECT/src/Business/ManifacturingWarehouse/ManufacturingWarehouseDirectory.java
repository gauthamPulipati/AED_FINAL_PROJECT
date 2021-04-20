/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ManifacturingWarehouse;

import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class ManufacturingWarehouseDirectory {
   private ArrayList<ManifacturingWarehouse> warehousedirectory;
    
    public ManifacturingWarehouse createWarehouse(String name){
        
        for (ManifacturingWarehouse warehouse:warehousedirectory){
            if(warehouse.getName().equals(name)){
                return null;
            }
        }
        
        ManifacturingWarehouse warehouse = new ManifacturingWarehouse(name);
        this.warehousedirectory.add(warehouse);
        return warehouse;
    }
    
    public void deleteWarehouse(String name){
        for (ManifacturingWarehouse warehouse:warehousedirectory){
            if(warehouse.getWarehouseDetails().equals(name)){
                warehousedirectory.remove(warehouse);
                break;
            }
        }
    }

    public ArrayList<ManifacturingWarehouse> getWarehousedirectory() {
        return warehousedirectory;
    } 
    
}
