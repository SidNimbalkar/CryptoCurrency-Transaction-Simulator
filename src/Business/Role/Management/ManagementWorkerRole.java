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
import UserInterface.Management.ManagementWorker.ManagementWorkerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author siri chowdhary
 */
public class ManagementWorkerRole extends Role {
     public ManagementWorkerRole() {
        super(RoleType.ManagementWorker);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new ManagementWorkerWorkAreaJPanel(userProcessContainer , account ,enterprise , network); //To change body of generated methods, choose Tools | Templates.
    }
    
}
