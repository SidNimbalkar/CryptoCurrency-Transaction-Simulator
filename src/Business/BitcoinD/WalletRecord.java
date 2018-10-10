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
public class WalletRecord {
      private ArrayList<Wallet> walletList;
    public WalletRecord() {
    
        walletList = new ArrayList<Wallet>();
    }
    
    public List<Wallet> getWalletList(){
        return walletList;
    }
    
    public Wallet addWallet(){
        Wallet s = new Wallet();
        walletList.add(s);
        return s;
    }
    
    public void removeWallet(Wallet b){
        walletList.remove(b);
    }
    
    public Wallet searchWallet(String keyword){
        for (Wallet w : walletList) {
            if(w.getCoinName().equals(keyword)){
                return w;
            }
        }
        return null;
    }
}
