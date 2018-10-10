/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import Business.Util.Inventory.DistributedItemsDirectory;
import Business.Util.Inventory.Inventory;
import Business.Util.Request.RequestItem;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class ExchangeEnterprise extends Enterprise{
    
    private Inventory inventory;
    private Inventory wasteInventory;
    private ArrayList<DistributedItemsDirectory> distributedList;

    public ExchangeEnterprise(String name) {
        super(name, EnterpriseType.Exchange);
        inventory = new Inventory();
        wasteInventory = new Inventory();
        distributedList = new ArrayList();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getWasteInventory() {
        return wasteInventory;
    }

    public void setWasteInventory(Inventory wasteInventory) {
        this.wasteInventory = wasteInventory;
    }

    public ArrayList<DistributedItemsDirectory> getDistributedList() {
        return distributedList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public void updateInventory() {

        // Traverse inventory
        System.out.println("\nInventory");
        for (RequestItem ri : inventory.getRequestItemList()) {
            System.out.println(ri.getFoodName() + " " + ri.getQuantity() + " " + ri.getHoursToPerish());

            // If perished, add to wastage inventory
            if (ri.getHoursToPerish() <= 0 && wasteInventory != null) {
                wasteInventory.addRequestItem(ri);
            }
        }

        // Add to wastage inventory
        if (wasteInventory != null) {
            System.out.println("\nWastage");
            // Remove from inventory, items added to wastage inventory
            inventory.getRequestItemList().removeAll(wasteInventory.getRequestItemList());
            for (RequestItem wri : wasteInventory.getRequestItemList()) {
                System.out.println(wri.getFoodName() + " " + wri.getQuantity() + " " + wri.getHoursToPerish());
            }
        }
    }

    public void addDistributedItem(DistributedItemsDirectory distributed) {
        distributedList.add(distributed);
    }
    
    
    
    
}
