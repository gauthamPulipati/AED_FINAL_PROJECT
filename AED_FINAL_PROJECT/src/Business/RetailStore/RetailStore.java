/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RetailStore;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class RetailStore {
  
    private String storeName;
    
    public RetailStore(String storeName){
        super();
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
