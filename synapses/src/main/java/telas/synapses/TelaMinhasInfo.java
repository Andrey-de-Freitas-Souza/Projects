/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Color;




public class TelaMinhasInfo extends javax.swing.JFrame {
    private Usuario logado;
    /**
     * Creates new form TelaMinhasInfo
     * @param logado
     */
    public TelaMinhasInfo(Usuario logado) {
        super ("Minhas informações"); 
        initComponents();
        btnVoltar.setBackground(new Color (0,0,0,0));
        txtNome.setText(logado.getNome());
        txtId.setText(Integer.toString(logado.getId()));
        txtFone.setText(logado.getFone());
        txtEmail.setText(logado.getEmail());
        setLocationRelativeTo(null);       
        this.logado = logado;
    }

    private TelaMinhasInfo() {
        super ("Minhas informações"); 
        initComponents();
        btnVoltar.setBackground(new Color (0,0,0,0));
        txtNome.setText(logado.getNome());
        txtId.setText(Integer.toString(logado.getId()));
        txtFone.setText(logado.getFone());
        txtEmail.setText(logado.getEmail());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFone = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        imgFundoMinhasInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Id:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        txtId.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtId.setText("jLabel5");
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        txtNome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtNome.setText("jLabel1");
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        lblNome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNome.setText("Nome:");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Telefone:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtFone.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtFone.setText("jLabel7");
        jPanel1.add(txtFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtEmail.setText("jLabel6");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnVoltar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113296736774008902/btnVoltar_1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarMouseExited(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 170, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 400, 220));

        imgFundoMinhasInfo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1111060429461016606/TelaMinhasInfo.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgFundoMinhasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenu tm = new TelaMenu(logado);
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseEntered
        btnVoltar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113296735628963870/btnVoltar2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnVoltarMouseEntered

    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseExited
        btnVoltar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113296736774008902/btnVoltar_1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnVoltarMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMinhasInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel imgFundoMinhasInfo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtFone;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtNome;
    // End of variables declaration//GEN-END:variables
}
