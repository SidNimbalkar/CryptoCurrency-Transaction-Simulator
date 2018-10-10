/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util.Leftovers;

import Business.Util.Request.RequestItem;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class LeftoversQuantity {
    
    
     public static double calculateQuantity(ArrayList<RequestItem> foodItems) {
        double quantity = 0;

        for (RequestItem ri : foodItems) {
            String name = ri.getFoodName();
            double perServingQuantity = getQuantity(name);
            // double perServingQuantity = 1.5;
            int itemQuantity = ri.getQuantity();

            quantity += (perServingQuantity * itemQuantity);
        }
        return quantity;
    }

    public static double calculateIndividualQuantity(RequestItem foodItem) {
        double quantity = 0;
        double perServingQuantity = getQuantity(foodItem.getFoodName());
        int itemQuantity = foodItem.getQuantity();

        quantity = (perServingQuantity * itemQuantity);
        return quantity;
    }

    public static double getQuantity(String name) {
        double quantity = 0;
        quantity = Leftovers.getLeftoversQuantityPerServing(name);
        return quantity;
    }
    
}
