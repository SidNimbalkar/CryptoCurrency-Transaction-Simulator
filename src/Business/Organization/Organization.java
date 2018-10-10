/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public abstract class Organization {
    
    private static int counter = 0;
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    
    public enum Type{
        
        ExchangeAdmin("Exchange Admin Organization"),
        ExchangeManager("Exchange Manager Organization"),
        ExchangeWorker("Exchange Worker Organization"),
        TransactionsAdmin("Transactions Admin Organization"),
        TransactionsManager("Transactions Manager Organization"),
        TransactionsWorker("Transactions Worker Organization"),
        ManagementAdmin("Management Admin Organization"),
        ManagementManager("Management Manager Organization"),
        ManagementWorker("Management Worker Organization");
        
        private String value;
        
        private Type(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
    
    public Organization(String name){
        
        this.name=name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory= new UserAccountDirectory();
        organizationID=++counter;
    }
    
    public abstract ArrayList<Role>getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
