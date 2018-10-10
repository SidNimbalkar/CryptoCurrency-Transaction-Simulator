/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Management;

import Business.Organization.Organization;
import Business.Role.Management.ManagementManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class ManagementManagerOrganization extends Organization{
    
     public ManagementManagerOrganization() {
        super(Type.ManagementManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagementManagerRole());
        return roles;
    }
    
}
