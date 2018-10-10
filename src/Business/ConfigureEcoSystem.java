/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author siri chowdhary
 */
public class ConfigureEcoSystem {
    
    public static EcoSystem configure() {
        EcoSystem ecoSystem = EcoSystem.getInstance();

        Employee employee = ecoSystem.getEmployeeDirectory().addEmployee("System Admin");
        UserAccount ua = new UserAccount();
        String password = ua.encodePassword("s");
        ua = ecoSystem.getUserAccountDirectory().addUserAccount("s", password, employee, new SystemAdminRole());

        return ecoSystem;

    }
    
    
}
