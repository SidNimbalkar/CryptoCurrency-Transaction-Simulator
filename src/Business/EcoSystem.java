/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;

    
    private EcoSystem() {
        
        super(null);
        networkList = new ArrayList();
    }

    public static EcoSystem getInstance() {
        
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        
        return ecoSystem;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SystemAdminRole());
        return roles;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network createAndAddNetwork() {
        Network network=new Network();
        networkList.add(network );
        return network ;
    }

    public boolean checkIfNetworkExisits(String networkName) {
        for(Network network:networkList) {
            if(network.getName().equals(networkName)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfUserNameIsUnique(String userName) {
        for (Network network:networkList) {
            for (Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()) {

                // Check Enterprise's UAD
                UserAccountDirectory useraccdir=enterprise.getUserAccountDirectory();
                if(useraccdir.checkIfUserNameExists(userName)) {
                    return true;
                }

                // Check Enterprise's organizations
                for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()) {
                    useraccdir = org.getUserAccountDirectory();
                    if(useraccdir.checkIfUserNameExists(userName)) {
                        return true;
                    }
                    
                }
                
            }
            
        }
        
        return false;
        
    }  
}
