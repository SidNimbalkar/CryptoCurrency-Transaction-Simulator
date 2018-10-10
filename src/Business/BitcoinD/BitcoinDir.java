/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BitcoinD;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sid
 */
public class BitcoinDir {
    private List<Bitcoin> bitcoinList;
    public BitcoinDir() {
    
        bitcoinList = new ArrayList<Bitcoin>();
    }
    
    public List<Bitcoin> getBitcoinList(){
        return bitcoinList;
    }
    
    public Bitcoin addBitcoin(){
        Bitcoin s = new Bitcoin();
        bitcoinList.add(s);
        return s;
    }
    
    public void removeBitcoin(Bitcoin b){
        bitcoinList.remove(b);
    }
    
    public Bitcoin searchBitcoin(String keyword){
        for (Bitcoin bitcoin : bitcoinList) {
            if(bitcoin.getCoinName().equals(keyword)){
                return bitcoin;
            }
        }
        return null;
    }
}
