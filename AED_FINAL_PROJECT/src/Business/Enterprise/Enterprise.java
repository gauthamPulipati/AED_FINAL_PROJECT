 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Distribution.Distribution;
import Business.Distribution.DistributionDirectory;
import Business.FDA.FDA;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.ManifacturingWarehouse.ManufacturingWarehouse;
import Business.ManifacturingWarehouse.ManufacturingWarehouseDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.RetailStore.RetailStore;
import Business.RetailStore.RetailStoreDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private HospitalDirectory hospitalDirectory;
    private ManufacturingWarehouseDirectory manufacturingWarehouseDirectory;
    private RetailStoreDirectory retailStoreDirectory;
    private DistributionDirectory distributionDirectory;
    private FDA fdaInstance = new FDA();
    
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        hospitalDirectory = new HospitalDirectory();
        manufacturingWarehouseDirectory = new ManufacturingWarehouseDirectory();
        retailStoreDirectory = new RetailStoreDirectory();
        distributionDirectory = new DistributionDirectory();
        
    }
    

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
        
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Manifacturing("Manifacturing Unit"),
        Distribution("Distribution Unit"),
        FDA("FDA"),
        Retail("Retail");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
            public String toString(){
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Hospital createHospital(String name){
        for(Hospital hos:this.hospitalDirectory.getHospitals()){
            if(hos.getName().equals(name)){
                return null;
            }
        }
        Hospital hospital = this.hospitalDirectory.createHospital(name);
        return hospital;
    }
    
    public RetailStore createRetailStore(String name){
        for(RetailStore ret:this.retailStoreDirectory.getStores()){
            if(ret.getStoreName().equals(name)){
                return null;
            }
        }
        RetailStore retailStore = new RetailStore(name);
        return retailStore;
    }
    
    public ManufacturingWarehouse createManifacturingWarehouse(String name){
        return manufacturingWarehouseDirectory.createWarehouse(name);
    }
    
    public Distribution createDustributionUnit(String name){
        return distributionDirectory.createDistributionUnit(name);
    }
    
    public FDA getFDAInstance(){
        return fdaInstance;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public ManufacturingWarehouseDirectory getManufacturingWarehouseDirectory() {
        return manufacturingWarehouseDirectory;
    }

    public RetailStoreDirectory getRetailStoreDirectory() {
        return retailStoreDirectory;
    }

    public DistributionDirectory getDistributionDirectory() {
        return distributionDirectory;
    }
    
    
}
