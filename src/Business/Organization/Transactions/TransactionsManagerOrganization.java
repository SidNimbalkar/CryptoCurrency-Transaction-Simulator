/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Transactions;

import Business.Organization.Organization;
import Business.Role.Transactions.TransactionsManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class TransactionsManagerOrganization extends Organization{
    
     public TransactionsManagerOrganization() {
        super(Type.TransactionsManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransactionsManagerRole());
        return roles;
    }
    
}
