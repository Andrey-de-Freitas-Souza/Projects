/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Color;

/**
 *
 * @author andre
 */
public class TelaPosCad extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaMenu
     */
    public TelaPosCad(String informaConta) {        
        initComponents();        
        lblConta.setText(informaConta);
        btnAcessar.setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
    }

    private TelaPosCad() {
        super("Cadastro");
        initComponents();
        btnAcessar.setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAcessar = new javax.swing.JButton();
        lblConta = new javax.swing.JLabel();
        lblLimite1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcessar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnAcessarMB.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcessarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcessarMouseExited(evt);
            }
        });
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 649, 200, 70));

        lblConta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblConta.setForeground(new java.awt.Color(255, 255, 255));
        lblConta.setText("0");
        getContentPane().add(lblConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 515, 110, 40));

        lblLimite1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblLimite1.setForeground(new java.awt.Color(255, 255, 255));
        lblLimite1.setText("R$ 300,00");
        getContentPane().add(lblLimite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 472, 110, 40));

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoTelaPosCad.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcessarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcessarMouseEntered
        btnAcessar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnAcessarMB2.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnAcessarMouseEntered

    private void btnAcessarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcessarMouseExited
        btnAcessar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnAcessarMB.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnAcessarMouseExited

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAcessarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPosCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPosCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPosCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPosCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPosCad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblConta;
    private javax.swing.JLabel lblLimite1;
    // End of variables declaration//GEN-END:variables
}
