/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author andre
 */
public class TelaHelp extends javax.swing.JFrame {
    private User logado;
   
    public TelaHelp(User logado) {
        super("Créditos");
        initComponents();
        setLocationRelativeTo(null);
        this.logado = logado;
        btnFechar.setBackground(new Color(0,0,0,0));
        btnLinkedin.setBackground(new Color(0,0,0,0));
        btnGitHub.setBackground(new Color(0,0,0,0));
        btnCurriculo.setBackground(new Color(0,0,0,0));
    }

    public TelaHelp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCurriculo = new javax.swing.JButton();
        btnGitHub = new javax.swing.JButton();
        btnLinkedin = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCurriculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurriculoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCurriculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 60, 72));

        btnGitHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGitHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitHubActionPerformed(evt);
            }
        });
        getContentPane().add(btnGitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 260, 75, 75));

        btnLinkedin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkedinActionPerformed(evt);
            }
        });
        getContentPane().add(btnLinkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 260, 75, 75));

        btnFechar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnFecharPeq2.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFecharMouseExited(evt);
            }
        });
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 697, 130, 50));

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoTelaHelp.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        try {
            TelaPrincipal tp = new TelaPrincipal(logado);
            tp.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(TelaHelp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseEntered
        btnFechar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnFecharPeq.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnFecharMouseEntered

    private void btnFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseExited
        btnFechar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnFecharPeq2.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnFecharMouseExited
    private void linkLinkedin() {
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/andrey-de-freitas-souza-91206b26a/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
    private void linkGitHub() {
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/Andrey-de-Freitas-Souza"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
    private void linkCurriculo() {
        try {
            Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1gG1VqyEmNEuMOM9C_p7k11m1fFlHhXMu/view?usp=sharing"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
    private void btnLinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkedinActionPerformed
        linkLinkedin();
    }//GEN-LAST:event_btnLinkedinActionPerformed

    private void btnGitHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitHubActionPerformed
        linkGitHub();
    }//GEN-LAST:event_btnGitHubActionPerformed

    private void btnCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurriculoActionPerformed
        linkCurriculo();
    }//GEN-LAST:event_btnCurriculoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHelp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCurriculo;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGitHub;
    private javax.swing.JButton btnLinkedin;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
