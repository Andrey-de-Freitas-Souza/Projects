/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pacote;

import java.awt.Color;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);
        btnEntrada.setBackground(new Color(0,0,0,0));
        btnSaida.setBackground(new Color(0,0,0,0));
        btnExtrato.setBackground(new Color(0,0,0,0));
       
        DAO dao = new DAO();            
        try {  
        txtPatrimonio.setText(dao.obtemPatimonio());
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSaida = new javax.swing.JButton();
        btnExtrato = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        txtPatrimonio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 360, 100));

        btnExtrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtratoActionPerformed(evt);
            }
        });
        getContentPane().add(btnExtrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 360, 100));

        btnEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 360, 100));

        txtPatrimonio.setFont(new java.awt.Font("Segoe UI", 1, 110)); // NOI18N
        txtPatrimonio.setText("5.735,54");
        getContentPane().add(txtPatrimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Group 20_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        TelaEntrada te = new TelaEntrada();
        te.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
        TelaSaida ts = new TelaSaida();
        ts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void btnExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtratoActionPerformed
        TelaExtrato tex = new TelaExtrato();
        tex.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExtratoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnExtrato;
    private javax.swing.JButton btnSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtPatrimonio;
    // End of variables declaration//GEN-END:variables
}
