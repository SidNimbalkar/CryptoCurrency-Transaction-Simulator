/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee>employeeList;

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public EmployeeDirectory(){
        employeeList = new ArrayList();
        
    }
    
    public Employee addEmployee(String name){
        
        Employee emp = new Employee();
        emp.setName(name);
        employeeList.add(emp);
        return emp;
    }
    
    public void removeEmployee(Employee emp){
        
        employeeList.remove(emp);
    }

    public Employee createEmployee(String rrh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
