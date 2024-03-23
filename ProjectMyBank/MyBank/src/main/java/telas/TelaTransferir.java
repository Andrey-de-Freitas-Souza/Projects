/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class TelaTransferir extends javax.swing.JFrame {
    private User logado;
    private boolean confirmacao;
    /**
     * Creates new form TelaTransferir
     */
    public TelaTransferir(User logado) {
        super("Transferência");
        initComponents();
        this.logado = logado;
        setLocationRelativeTo(null);
        btnVoltar.setBackground(new Color(0,0,0,0));
        txtConta.setBackground(new Color(0,0,0,0));
        txtValor.setBackground(new Color(0,0,0,0));
        txtDesc.setBackground(new Color(0,0,0,0));
        btnTransferir.setBackground(new Color(0,0,0,0));
    }
     public TelaTransferir(boolean confirmacao,User logado,double valor,int destinatario,String descricao,double saldofinaldest) {
        super("Transferir");
        this.logado = logado;
        this.confirmacao = confirmacao;
        initComponents();
        setLocationRelativeTo(null);
        btnVoltar.setBackground(new Color(0,0,0,0));
        txtConta.setBackground(new Color(0,0,0,0));
        txtValor.setBackground(new Color(0,0,0,0));
        txtDesc.setBackground(new Color(0,0,0,0));
        btnTransferir.setBackground(new Color(0,0,0,0));
        int id = 1;
        DAO dao = new DAO();
        if(confirmacao){
                LocalDate dataAtual = LocalDate.now();
                String data = dataAtual.toString();
                
                try {
                    double novoSaldo = logado.getSaldo() - valor;
                    logado.setSaldo(novoSaldo);
                    ArrayList listaId = dao.todasTransferencias();
                    while(listaId.contains(id)){
                        id++;
                    }
                    dao.transferir(id,valor,data, logado,novoSaldo,destinatario,descricao,saldofinaldest);                   
                } catch (Exception ex) {
                    Logger.getLogger(TelaDeposito.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            this.confirmacao = false;            
 
    }

    public TelaTransferir() {
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

        btnTransferir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtConta = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTransferir.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnTrasnferir.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransferirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransferirMouseExited(evt);
            }
        });
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 582, 110, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setText("R$");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 509, 20, 40));

        txtDesc.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtDesc.setBorder(null);
        getContentPane().add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 424, 330, 40));

        txtValor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtValor.setBorder(null);
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 509, 307, 40));

        txtConta.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtConta.setBorder(null);
        getContentPane().add(txtConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 342, 332, 40));

        btnVoltar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/Arrow%201.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 40, -1));

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoTelaTransferencia.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            TelaPrincipal tp = new TelaPrincipal(logado);
            tp.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(TelaTransferir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        try {
            DAO dao = new DAO();
            ArrayList todasContas = dao.todasContas();
            if(todasContas.contains(Integer.parseInt(txtConta.getText()))){
                String txttransferencia = txtValor.getText();
                String transferenciaCerto = txttransferencia.replace(',', '.');
                double transferencia = Double.parseDouble(transferenciaCerto);
                double valor = transferencia;
                int destinatario = Integer.parseInt(txtConta.getText());
                String descricao = txtDesc.getText();            
                double saldodestinatario = dao.verificaSaldo(destinatario);
                double saldofinaldest = saldodestinatario + valor;
                String chave = " ";
                TelaDigiteSenha tds = new TelaDigiteSenha(logado,valor,2,destinatario,descricao,saldofinaldest,chave);
                tds.setVisible(true);
                int id = 1;
                if(confirmacao){
                    LocalDate dataAtual = LocalDate.now();
                    String data = dataAtual.toString();

                    try {
                        double novoSaldo = logado.getSaldo() - valor;
                        logado.setSaldo(novoSaldo);
                        ArrayList listaId = dao.todasTransferencias();
                        while(listaId.contains(id)){
                            id++;
                        }
                        dao.transferir(id,valor,data, logado,novoSaldo,destinatario,descricao,saldofinaldest);

                    } catch (Exception ex) {
                        Logger.getLogger(TelaDeposito.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
            else{
                int tipo = 14;
                TelaAvisos ta = new TelaAvisos(tipo);
                ta.setVisible(true);
            }
            this.confirmacao = false;            
        } catch (Exception ex) {
            Logger.getLogger(TelaTransferir.class.getName()).log(Level.SEVERE, null, ex);
            int tipo = 12;
            TelaAvisos ta = new TelaAvisos(tipo);
            ta.setVisible(true);
        }
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnTransferirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferirMouseEntered
        btnTransferir.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnTrasnferir2.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnTransferirMouseEntered

    private void btnTransferirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferirMouseExited
        btnTransferir.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnTrasnferir.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnTransferirMouseExited

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
            java.util.logging.Logger.getLogger(TelaTransferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTransferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTransferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTransferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTransferir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
