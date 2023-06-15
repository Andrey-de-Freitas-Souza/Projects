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
public class TelaMenuAdm extends javax.swing.JFrame {
    private Administrador admlogado;
    /**
     * Creates new form TelaMenuAdm
     */
    public TelaMenuAdm() {
        super ("Menu Adm"); 
        initComponents();
        btnMostrarAluno.setBackground(new Color (0,0,0,0));
        btnMinhasInfo.setBackground(new Color (0,0,0,0));
        btnAreaUser.setBackground(new Color (0,0,0,0));
        btnCadCursos.setBackground(new Color (0,0,0,0));
        btnDesconectar.setBackground(new Color (0,0,0,0));
        setLocationRelativeTo(null);
        
    }
    public TelaMenuAdm(Administrador admlogado) {
        super ("Menu Adm"); 
        initComponents(); 
        btnMostrarAluno.setBackground(new Color (0,0,0,0));
        btnMinhasInfo.setBackground(new Color (0,0,0,0));
        btnAreaUser.setBackground(new Color (0,0,0,0));
        btnCadCursos.setBackground(new Color (0,0,0,0));
        btnDesconectar.setBackground(new Color (0,0,0,0));
        setLocationRelativeTo(null);       
        this.admlogado = admlogado;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMostrarAluno = new javax.swing.JButton();
        btnCadCursos = new javax.swing.JButton();
        btnMinhasInfo = new javax.swing.JButton();
        btnAreaUser = new javax.swing.JButton();
        btnDesconectar = new javax.swing.JButton();
        imgFundoMenuAdm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(828, 444));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrarAluno.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113505423073497169/btnMostrarAluno.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnMostrarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarAlunoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarAlunoMouseExited(evt);
            }
        });
        btnMostrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 150, 70));

        btnCadCursos.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113505422410788914/btnGerenciarCursos.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnCadCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadCursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadCursosMouseExited(evt);
            }
        });
        btnCadCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCursosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 150, 70));

        btnMinhasInfo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113323379550867467/btnMinhasInfo1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnMinhasInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinhasInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinhasInfoMouseExited(evt);
            }
        });
        btnMinhasInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinhasInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinhasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 150, 70));

        btnAreaUser.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113505422062665850/btnAreaAluno2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnAreaUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAreaUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAreaUserMouseExited(evt);
            }
        });
        btnAreaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnAreaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 150, 70));

        btnDesconectar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1114224451173752912/btnDesconectar1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnDesconectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDesconectarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDesconectarMouseExited(evt);
            }
        });
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 300, -1, -1));

        imgFundoMenuAdm.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1111062139340345415/synapses_3_1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        imgFundoMenuAdm.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                imgFundoMenuAdmAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(imgFundoMenuAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAlunoActionPerformed
        TelaMostrarAlunos tma = new TelaMostrarAlunos(admlogado);
        tma.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_btnMostrarAlunoActionPerformed

    private void btnCadCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCursosActionPerformed
        TelaCadCursos tcc = new TelaCadCursos(admlogado);
        tcc.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnCadCursosActionPerformed

    private void imgFundoMenuAdmAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_imgFundoMenuAdmAncestorAdded
        
    }//GEN-LAST:event_imgFundoMenuAdmAncestorAdded

    private void btnAreaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaUserActionPerformed
        Usuario logado = new Usuario(admlogado.getId(),admlogado.getNome(),"adm",admlogado.getEmail()," ","Adm","Adm ","Adm ","Adm");
        TelaMenu tm = new TelaMenu(logado);
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAreaUserActionPerformed

    private void btnMinhasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinhasInfoActionPerformed
        TelaMinhasInfoAdm tmia = new TelaMinhasInfoAdm(admlogado);
        tmia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMinhasInfoActionPerformed

    private void btnMostrarAlunoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarAlunoMouseEntered
        btnMostrarAluno.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113505421571936286/btnMostrarAluno2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnMostrarAlunoMouseEntered

    private void btnMostrarAlunoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarAlunoMouseExited
        btnMostrarAluno.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113505423073497169/btnMostrarAluno.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnMostrarAlunoMouseExited

    private void btnCadCursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadCursosMouseEntered
        btnCadCursos.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113505422754725958/btnGerenciarCursos2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnCadCursosMouseEntered

    private void btnCadCursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadCursosMouseExited
        btnCadCursos.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113505422410788914/btnGerenciarCursos.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnCadCursosMouseExited

    private void btnMinhasInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinhasInfoMouseEntered
        btnMinhasInfo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113323377688596520/btnMinhasInfo2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnMinhasInfoMouseEntered

    private void btnMinhasInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinhasInfoMouseExited
        btnMinhasInfo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113323379550867467/btnMinhasInfo1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnMinhasInfoMouseExited

    private void btnAreaUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAreaUserMouseEntered
        btnAreaUser.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113505421815197778/btnAreaAluno.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnAreaUserMouseEntered

    private void btnAreaUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAreaUserMouseExited
        btnAreaUser.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113505422062665850/btnAreaAluno2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnAreaUserMouseExited

    private void btnDesconectarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesconectarMouseEntered
        btnDesconectar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1114224451383472179/btnDesconectar2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnDesconectarMouseEntered

    private void btnDesconectarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesconectarMouseExited
        btnDesconectar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1114224451173752912/btnDesconectar1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnDesconectarMouseExited

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDesconectarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreaUser;
    private javax.swing.JButton btnCadCursos;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnMinhasInfo;
    private javax.swing.JButton btnMostrarAluno;
    private javax.swing.JLabel imgFundoMenuAdm;
    // End of variables declaration//GEN-END:variables
}