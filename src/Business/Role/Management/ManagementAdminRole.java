/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Management;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.Management.ManagementAdmin.ManagementAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author siri chowdhary
 */
public class ManagementAdminRole extends Role {

    
     public ManagementAdminRole() {
        super(RoleType.ManagementAdmin);
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new ManagementAdminWorkAreaJPanel(userProcessContainer,enterprise); //To change body of generated methods, choose Tools | Templates.
    }
    
}
