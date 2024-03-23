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
public class TelaInvestir extends javax.swing.JFrame {
    private User logado;
    private boolean confirmacao;
    private boolean confirmacao2;
    /**
     * Creates new form TelaBoleto
     */
    public TelaInvestir(User logado) {
        super("Investimentos");
        try {
            initComponents();
            this.logado = logado;
            DAO dao = new DAO();
            setLocationRelativeTo(null);
            btnVoltar.setBackground(new Color(0,0,0,0));
            txtValor.setBackground(new Color(0,0,0,0));
            btnRetirar.setBackground(new Color(0,0,0,0));
            btnAdicionar.setBackground(new Color(0,0,0,0));
            String investido = Double.toString(dao.verificaSaldoInvestido(logado.getCodConta()));
            String aposvirgula = investido.substring(investido.indexOf('.')+1,investido.length());
            String investidoCerto = investido.replace('.',',');
            if(aposvirgula.length() == 1){
                investidoCerto = (investido+ '0').replace('.',',');
            }
            else{
                investidoCerto = investido.replace('.',',');
            }
            try {
                lblSaldo.setText(investidoCerto);
            } catch (Exception ex) {
                Logger.getLogger(TelaInvestir.class.getName()).log(Level.SEVERE, null, ex);
                int tipo = 12;
                TelaAvisos ta = new TelaAvisos(tipo);
                ta.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaInvestir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public TelaInvestir(boolean confirmacao2,boolean confirmacao,User logado,double valor,int destinatario,String descricao,double saldofinaldest,String chave) {
        super("boleto");
         try {
             initComponents();
             DAO dao = new DAO();
             this.logado = logado;
             setLocationRelativeTo(null);
             btnVoltar.setBackground(new Color(0,0,0,0));
             txtValor.setBackground(new Color(0,0,0,0));
             String investido = Double.toString(dao.verificaSaldoInvestido(logado.getCodConta()));
             String aposvirgula = investido.substring(investido.indexOf('.')+1,investido.length());
             String investidoCerto = investido.replace('.',',');
             if(aposvirgula.length() == 1){
                 investidoCerto = (investido+ '0').replace('.',',');
             }
             else{
                 investidoCerto = investido.replace('.',',');
             }
             lblSaldo.setText(investidoCerto);
             btnRetirar.setBackground(new Color(0,0,0,0));
             btnAdicionar.setBackground(new Color(0,0,0,0));
             this.confirmacao = confirmacao;
             this.confirmacao2 = confirmacao2;
             try {
                 lblSaldo.setText(investidoCerto);
             } catch (Exception ex) {
                 Logger.getLogger(TelaInvestir.class.getName()).log(Level.SEVERE, null, ex);
                 
             }
             int id = 1;
             if(confirmacao){
                 LocalDate dataAtual = LocalDate.now();
                 String data = dataAtual.toString();
                 
                 try {
                     double novoSaldo = logado.getSaldo() - valor;
                     double saldoDest = dao.verificaSaldoInvestido(logado.getCodConta());
                     double novoSaldoInvestido = saldoDest + valor;
                     logado.setSaldo(novoSaldo);
                     ArrayList listaId = dao.todasTransferencias();
                     while(listaId.contains(id)){
                         id++;
                     }
                     dao.investir(id,valor,data, logado,novoSaldo,novoSaldoInvestido);
                     
                 } catch (Exception ex) {
                     Logger.getLogger(TelaDeposito.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }
             this.confirmacao = false;
             if(confirmacao2){
                 LocalDate dataAtual = LocalDate.now();
                 String data = dataAtual.toString();
                 
                 try {
                     double novoSaldo = logado.getSaldo() + valor;
                     double saldoDest = dao.verificaSaldoInvestido(logado.getCodConta());
                     double novoSaldoInvestido = saldoDest - valor;
                     logado.setSaldo(novoSaldo);
                     ArrayList listaId = dao.todasTransferencias();
                     while(listaId.contains(id)){
                         id++;
                     }
                     dao.tirarInvestido(id,valor,data, logado,novoSaldo,novoSaldoInvestido);
                     
                 } catch (Exception ex) {
                     Logger.getLogger(TelaDeposito.class.getName()).log(Level.SEVERE, null, ex);
                     
                 }
                 
             }
             this.confirmacao2 = false;
        } catch (Exception ex) {
            Logger.getLogger(TelaInvestir.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }        
    public TelaInvestir() {
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

        btnAdicionar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdicionar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnAdicionar.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarMouseExited(evt);
            }
        });
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 617, 110, 40));

        btnRetirar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnRetirar.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetirarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetirarMouseExited(evt);
            }
        });
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 617, 110, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setText("R$");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 552, 20, 40));

        lblSaldo.setFont(new java.awt.Font("Dialog", 0, 55)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldo.setText("34876,00");
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 292, -1, -1));

        txtValor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtValor.setBorder(null);
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 552, 307, 40));

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
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoTelaInvestimentos.png?raw=true")
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
            Logger.getLogger(TelaInvestir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            String textvalor = txtValor.getText();
            String textValorCerto = textvalor.replace(',', '.');
            double investimento = Double.parseDouble(textValorCerto);
            double valor = investimento;            
            DAO dao = new DAO();
            double saldo = dao.verificaSaldo(logado.getCodConta());
            double saldoNovo = saldo - valor;
            String chave = " ";
            TelaDigiteSenha tds = new TelaDigiteSenha(logado,valor,4,logado.getCodConta(),"Sem descrição",saldoNovo,chave);
            tds.setVisible(true);
            int id = 1;
            if(confirmacao){
                LocalDate dataAtual = LocalDate.now();
                String data = dataAtual.toString();
                
                try {
                    double novoSaldo = logado.getSaldo() - valor;
                    double saldoDest = dao.verificaSaldoInvestido(logado.getCodConta());
                    double novoSaldoInvestido = saldoDest + valor;
                    logado.setSaldo(novoSaldo);
                    ArrayList listaId = dao.todasTransferencias();
                    while(listaId.contains(id)){
                        id++;
                    }
                    dao.investir(id,valor,data, logado,novoSaldo,novoSaldoInvestido);
                    
                } catch (Exception ex) {
                    Logger.getLogger(TelaDeposito.class.getName()).log(Level.SEVERE, null, ex);
                    
                }                

            }
            this.confirmacao = false;            
        } catch (Exception ex) {
            Logger.getLogger(TelaInvestir.class.getName()).log(Level.SEVERE, null, ex);
            int tipo = 12;
                TelaAvisos ta = new TelaAvisos(tipo);
                ta.setVisible(true);
        }

        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        try {
            String textvalor = txtValor.getText();
            String textValorCerto = textvalor.replace(',', '.');
            double investimento = Double.parseDouble(textValorCerto);
            double valor = investimento;            
            DAO dao = new DAO();
            double saldo = dao.verificaSaldo(logado.getCodConta());
            double saldoNovo = saldo - valor;
            String chave = " ";
            TelaDigiteSenha tds = new TelaDigiteSenha(logado,valor,5,logado.getCodConta(),"Sem descrição",saldoNovo,chave);
            tds.setVisible(true);
            int id = 1;
            if(confirmacao2){
                LocalDate dataAtual = LocalDate.now();
                String data = dataAtual.toString();
                
                try {
                    double novoSaldo = logado.getSaldo() + valor;
                    double saldoDest = dao.verificaSaldoInvestido(logado.getCodConta());
                    double novoSaldoInvestido = saldoDest - valor;
                    logado.setSaldo(novoSaldo);
                    ArrayList listaId = dao.todasTransferencias();
                    while(listaId.contains(id)){
                        id++;
                    }
                    dao.tirarInvestido(id,valor,data, logado,novoSaldo,novoSaldoInvestido);
                    
                } catch (Exception ex) {
                    Logger.getLogger(TelaDeposito.class.getName()).log(Level.SEVERE, null, ex);                  
                }

            }
            this.confirmacao2 = false;            
        } catch (Exception ex) {
            Logger.getLogger(TelaInvestir.class.getName()).log(Level.SEVERE, null, ex);
            int tipo = 12;
                TelaAvisos ta = new TelaAvisos(tipo);
                ta.setVisible(true);
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseEntered
        btnAdicionar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnAdicionar2.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnAdicionarMouseEntered

    private void btnAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseExited
        btnAdicionar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnAdicionar.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnAdicionarMouseExited

    private void btnRetirarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarMouseEntered
        btnRetirar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnRetirar2.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnRetirarMouseEntered

    private void btnRetirarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarMouseExited
        btnRetirar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnRetirar.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnRetirarMouseExited

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
            java.util.logging.Logger.getLogger(TelaInvestir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInvestir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInvestir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInvestir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInvestir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
