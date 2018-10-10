/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Management;

import Business.Organization.Organization;
import Business.Role.Management.ManagementWorkerRole;
import Business.Role.Exchange.ExchangeAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class ManagementWorkerOrganization extends Organization{
    
     public ManagementWorkerOrganization() {
        super(Type.ManagementWorker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagementWorkerRole());
        return roles;
    }
    
}
