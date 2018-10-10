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
import javax.swing.JPanel;
import userInterface.systemAdminWorkArea.SystemAdminWorkAreaJPanel2;

/**
 *
 * @author siri chowdhary
 */
public class SystemAdminRole extends Role {
    
    public SystemAdminRole() {
        super(null);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new SystemAdminWorkAreaJPanel2(userProcessContainer,business); //To change body of generated methods, choose Tools | Templates.
    }
    
}
