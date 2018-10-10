/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.BitcoinD.Bitcoin;
import Business.BitcoinD.BitcoinDir;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sid
 */
public class MinedBitcoinsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MinedBitcoinsJPanel
     */
        private JPanel processContainer;
    private BitcoinDir bitcoinDir;
    public MinedBitcoinsJPanel(JPanel processContainer, BitcoinDir bitD) {
        initComponents();
        this.bitcoinDir = bitD;
        this.processContainer= processContainer;
        
        for(int i=0; i<3;i++)
        {
       Bitcoin bitcoin = bitcoinDir.addBitcoin();
       bitcoin.setCoinName("Bitcoin");
       bitcoin.setCurrentHash("1FfmbHfnpaZjKFvyi1okTjJJusN455paPH");
       bitcoin.setPrevHash(" ");
       
       String temp = getSaltString();
       bitcoin.setSignature(temp);
        }
      
        
        populate();
    }
 
 private void populate()
{
    
    DefaultTableModel dtm= (DefaultTableModel) tab.getModel();
        dtm.setRowCount(0);
        
        for(Bitcoin car : bitcoinDir.getBitcoinList()){
            
          
            Object[] row= new Object[2];
            
            row[0]=car.getSignature();
            row[1]=car.getCurrentHash();
            
            
           
            dtm.addRow(row);
            
            
        }
}
 
 private String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        btn2 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        yearlyBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Signature", "Current Hash"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setResizable(false);
            tab.getColumnModel().getColumn(1).setResizable(false);
        }

        btn2.setText("Monthly");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        yearlyBtn.setText("Latest");
        yearlyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyBtnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZIcons/full - Copy.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(yearlyBtn)
                        .addGap(18, 18, 18)
                        .addComponent(btn2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(backBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn2)
                            .addComponent(yearlyBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(backBtn)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         
                BitcoinMChartJPanel panel= new BitcoinMChartJPanel(processContainer, bitcoinDir);
                processContainer.add("AccountPanel",panel);
                CardLayout layout = (CardLayout) processContainer.getLayout();
                layout.next(processContainer);
            
    }//GEN-LAST:event_btn2ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        processContainer.remove(this);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.previous(processContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void yearlyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyBtnActionPerformed
         BitcoinYChartJPanel panel= new BitcoinYChartJPanel(processContainer, bitcoinDir);
                processContainer.add("AccountPanel",panel);
                CardLayout layout = (CardLayout) processContainer.getLayout();
                layout.next(processContainer);
    }//GEN-LAST:event_yearlyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab;
    private javax.swing.JButton yearlyBtn;
    // End of variables declaration//GEN-END:variables

    
}
