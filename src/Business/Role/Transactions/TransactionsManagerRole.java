/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Transactions;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.Transactions.ManagerWorkArea.EventsManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author siri chowdhary
 */
public class TransactionsManagerRole extends Role {
    
     public TransactionsManagerRole() {
        super(RoleType.TransactionsManager);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new EventsManagerWorkAreaJPanel(userProcessContainer,account,enterprise);//To change body of generated methods, choose Tools | Templates.
    }
}
    

