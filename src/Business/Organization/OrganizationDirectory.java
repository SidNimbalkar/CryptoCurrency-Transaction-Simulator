/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Transactions.TransactionsAdminOrganization;
import Business.Organization.Transactions.TransactionsManagerOrganization;
import Business.Organization.Transactions.TransactionsWorkerOrganization;
import Business.Organization.Management.ManagementAdminOrganization;
import Business.Organization.Management.ManagementManagerOrganization;
import Business.Organization.Management.ManagementWorkerOrganization;
import Business.Organization.Exchange.ExchangeAdminOrganization;
import Business.Organization.Exchange.ExchangeManagerOrganization;
import Business.Organization.Exchange.ExchangeWorkerOrganization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class OrganizationDirectory {
    
     private ArrayList<Organization>organizationList;

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
   
    
    public OrganizationDirectory(){
        
        organizationList = new ArrayList();
    }
    
     public Organization addOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.ExchangeAdmin.getValue())) {
            organization = new ExchangeAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ExchangeManager.getValue())) {
            organization = new ExchangeManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ExchangeWorker.getValue())) {
            organization = new ExchangeWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.TransactionsAdmin.getValue())) {
            organization = new TransactionsAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.TransactionsManager.getValue())) {
            organization = new TransactionsManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.TransactionsWorker.getValue())) {
            organization = new TransactionsWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ManagementAdmin.getValue())) {
            organization = new ManagementAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ManagementManager.getValue())) {
            organization = new ManagementManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ManagementWorker.getValue())) {
            organization = new ManagementWorkerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void remoeOrganization(Organization o){
        organizationList.remove(o);
    }

    
}
