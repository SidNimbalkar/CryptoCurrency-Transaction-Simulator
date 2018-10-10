/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Management;

import Business.Organization.Organization;
import Business.Role.Management.ManagementAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class ManagementAdminOrganization extends Organization{
    
     public ManagementAdminOrganization() {
        super(Type.ManagementAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagementAdminRole());
        return roles;
    }
    
}
