/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Exchange;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.Exchange.ExchangeAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class ExchangeAdminOrganization extends Organization{

    public ExchangeAdminOrganization() {
        super(Type.ExchangeAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ExchangeAdminRole());
        return roles;
    }
    
}
