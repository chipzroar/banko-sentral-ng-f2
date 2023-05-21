/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Le Bronn
 */
public class UpdateBalance extends javax.swing.JFrame {

    /**
     * Creates new form UpdateBalance
     */
    String accountNumber;
    double balance;
    int userID;
    public UpdateBalance(String accountNumber, double balance, int userID) {
        initComponents();
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.userID = userID;
        jTextFieldAccNum.setText(accountNumber);
        jTextFieldCurrBal.setText(String.valueOf(balance));
    }

    public UpdateBalance() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAccNum = new javax.swing.JTextField();
        jButtonUpdateBalance = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCurrBal = new javax.swing.JTextField();
        cbTransType = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(12, 19, 79));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account Number:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Transaction Type:");

        jTextFieldAccNum.setEditable(false);
        jTextFieldAccNum.setBackground(new java.awt.Color(29, 38, 125));
        jTextFieldAccNum.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jTextFieldAccNum.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldAccNum.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldAccNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAccNumActionPerformed(evt);
            }
        });

        jButtonUpdateBalance.setBackground(new java.awt.Color(29, 38, 125));
        jButtonUpdateBalance.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButtonUpdateBalance.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateBalance.setText("Update Balance");
        jButtonUpdateBalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonUpdateBalanceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonUpdateBalanceMouseReleased(evt);
            }
        });
        jButtonUpdateBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateBalanceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Amount:");

        jTextFieldAmount.setBackground(new java.awt.Color(29, 38, 125));
        jTextFieldAmount.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jTextFieldAmount.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldAmount.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAmountActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Current Balance:");

        jTextFieldCurrBal.setEditable(false);
        jTextFieldCurrBal.setBackground(new java.awt.Color(29, 38, 125));
        jTextFieldCurrBal.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jTextFieldCurrBal.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCurrBal.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldCurrBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCurrBalActionPerformed(evt);
            }
        });

        cbTransType.setBackground(new java.awt.Color(29, 38, 125));
        cbTransType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbTransType.setForeground(new java.awt.Color(255, 255, 255));
        cbTransType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select a Transaction--", "Withdraw", "Deposit" }));
        cbTransType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTransTypeActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(92, 70, 156));
        jPanel1.setPreferredSize(new java.awt.Dimension(130, 59));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Balance");
        jLabel1.setToolTipText("");

        jLabelMin.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelMin)
                    .addComponent(jLabelClose))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonUpdateBalance)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(48, 48, 48)
                            .addComponent(jTextFieldCurrBal, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldAccNum)
                                .addComponent(cbTransType, 0, 266, Short.MAX_VALUE)))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbTransType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCurrBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jButtonUpdateBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(UpdateBalance.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jTextFieldAccNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAccNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAccNumActionPerformed

    private void jButtonUpdateBalanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpdateBalanceMousePressed
        jButtonUpdateBalance.setBackground(new Color(212, 173, 252));
    }//GEN-LAST:event_jButtonUpdateBalanceMousePressed

    private void jButtonUpdateBalanceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpdateBalanceMouseReleased
        jButtonUpdateBalance.setBackground(null);
    }//GEN-LAST:event_jButtonUpdateBalanceMouseReleased

    private void jButtonUpdateBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateBalanceActionPerformed
        String accountNumber = jTextFieldAccNum.getText();
        double balance = Double.parseDouble(jTextFieldCurrBal.getText());
        String strAmount = jTextFieldAmount.getText().trim();
        String transactionType = cbTransType.getSelectedItem().toString();

        if (transactionType.equals("--Select a Transaction--")) {
            JOptionPane.showMessageDialog(this, "Please select a transaction type.");
            return;
        }
        
        if (strAmount.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an amount.");
            return;
        }
        
        double amount = Double.parseDouble(jTextFieldAmount.getText());
        PreparedStatement ps;
        String sql;

        try {
            if (transactionType.equals("Deposit")) {
                balance += amount;
                sql = "UPDATE account SET accountBalance = ? WHERE accountID = ?";
                ps = MyConnection.getConnection().prepareStatement(sql);
                ps.setDouble(1, balance);
                ps.setString(2, accountNumber);
                ps.executeUpdate();

                sql = "INSERT INTO transaction (accountID, transactionType, transactionAmount, transactionStatus) VALUES (?, ?, ?, ?)";
                ps = MyConnection.getConnection().prepareStatement(sql);
                ps.setString(1, accountNumber); 
                ps.setString(2, "Deposit");  
                ps.setDouble(3, amount);
                ps.setInt(4, 1);  
                ps.executeUpdate();
            } else if (transactionType.equals("Withdraw")) {
                if (amount > balance) {
                    JOptionPane.showMessageDialog(this, "Insufficient balance.");
                    return;
                }
                balance -= amount;
                sql = "UPDATE account SET accountBalance = ? WHERE accountID = ?";
                ps = MyConnection.getConnection().prepareStatement(sql);
                ps.setDouble(1, balance);
                ps.setString(2, accountNumber);
                ps.executeUpdate();

                sql = "INSERT INTO transaction (accountID, transactionType, transactionAmount, transactionStatus) VALUES (?, ?, ?, ?)";
                ps = MyConnection.getConnection().prepareStatement(sql);
                ps.setString(1, accountNumber);
                ps.setString(2, "Withdraw");  
                ps.setDouble(3, amount);
                ps.setInt(4, 1);  
                ps.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Transaction successful.");
            jTextFieldCurrBal.setText(String.valueOf(balance));
        } catch(SQLException e) {
            Logger.getLogger(UpdateBalance.class.getName()).log(Level.SEVERE, null, e);
        } 
    }//GEN-LAST:event_jButtonUpdateBalanceActionPerformed

    private void jTextFieldAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAmountActionPerformed

    private void cbTransTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTransTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTransTypeActionPerformed

    private void jTextFieldCurrBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCurrBalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCurrBalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBalance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTransType;
    private javax.swing.JButton jButtonUpdateBalance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAccNum;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldCurrBal;
    // End of variables declaration//GEN-END:variables
}