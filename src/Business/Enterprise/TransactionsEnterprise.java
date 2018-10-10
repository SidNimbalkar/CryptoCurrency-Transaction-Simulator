/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class TransactionsEnterprise extends Enterprise{
    
     public TransactionsEnterprise(String name) {
        super(name, EnterpriseType.Transactions);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
