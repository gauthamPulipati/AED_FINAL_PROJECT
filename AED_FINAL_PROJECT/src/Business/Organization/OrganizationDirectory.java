/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.DoctorApprove.getValue())){
            organization = new ApprovingDoctorOrganization(String.valueOf(type));
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DoctorConsult.getValue())){
            organization = new ConsultingDoctorOrganization(String.valueOf(type));
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FDAClinicalApproval.getValue())){
            organization = new FDAClinicalOrganization(String.valueOf(type));
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HomeDelivery.getValue())){
            organization = new HomeDeliveryOrganization(String.valueOf(type));
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LaboratoryAdmin.getValue())){
            organization = new LaboratoryAdminOrganization(String.valueOf(type));
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Manager.getValue())){
            organization = new ManagerOrganization(String.valueOf(type));
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ManifacturingAdmin.getValue())){
            organization = new ManifacturingAdminOrganization(String.valueOf(type));
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RetailDelivery.getValue())){
            organization = new RetailDeliveryOrganization(String.valueOf(type));
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ShippingMan.getValue())){
            organization = new ShippingOrganization(String.valueOf(type));
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.StoreAdmin.getValue())){
            organization = new StoreAdminOrganziation(String.valueOf(type));
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Technician.getValue())){
            organization = new TechnicianOrganization(String.valueOf(type));
            organizationList.add(organization);
        }
        return organization;
    }
}