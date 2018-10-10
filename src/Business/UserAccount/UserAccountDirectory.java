/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount>userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    public UserAccount addUserAccount(String username,String password,Employee employee,Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public void removeUserAccount(UserAccount ua) {
        userAccountList.remove(ua);
    }
    public UserAccount searchUser(String userName, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(userName)) {
                if (ua.matchPassword(password, ua.getPassword())) {
                    return ua;
                }
            }
        }
        return null;
    }
    public UserAccount searchUser(Employee employee) {
        for (UserAccount ua : userAccountList) {
            if (ua.getEmployee().equals(employee)) {
                return ua;
            }
        }
        return null;
    }
    public boolean checkIfUserNameExists(String userName) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfUsernameIsUnique(String userName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UserAccount createUserAccount(String s, String s0, Employee employee, SystemAdminRole systemAdminRole) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
