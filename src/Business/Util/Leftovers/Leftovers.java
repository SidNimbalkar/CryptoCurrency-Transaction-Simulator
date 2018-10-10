/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util.Leftovers;

import java.util.HashMap;

/**
 *
 * @author siri chowdhary
 */
public class Leftovers {
    
       public static HashMap leftoversMap;

    public static void initializeFood() {
        leftoversMap = new HashMap();
        leftoversMap.put("Bitcoin", 1d);
        leftoversMap.put("Litecoin", 0.75d);
        leftoversMap.put("Etherium", 2d);
        leftoversMap.put("Ripple", 3d);
        leftoversMap.put("Peercoin", 1d);
        leftoversMap.put("Dash", 0.5d);
    }

    public static HashMap getLeftoversMap() {
        return leftoversMap;
    }

    public static double getLeftoversQuantityPerServing(String name) {
        return (double) leftoversMap.get(name);
        
    }
    
}
