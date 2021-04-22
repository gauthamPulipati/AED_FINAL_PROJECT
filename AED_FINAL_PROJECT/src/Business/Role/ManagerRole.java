/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;
import userinterface.Manager.ManagerJPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        
        ArrayList<Enterprise> warehouseEnterprises = new ArrayList();
        Network net = null;
        int fl=0;
        for(Network network:business.getNetworkList()){
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                if(ent.getName() == enterprise.getName()){
                    fl=1;
                    net = network;
                    break;
                }
                if(fl==1){
                    break;
                }
            }
        }
        for(Enterprise ent:net.getEnterpriseDirectory().getEnterpriseList()){
            if(ent.getEnterpriseType().getValue().equals("Manifacturing Unit")){
                warehouseEnterprises.add(ent);
            }
        }
        return new ManagerJPanel(userProcessContainer, account, warehouseEnterprises);
    }
    
    @Override
    public String toString(){
        return "Manager";
    }
}
