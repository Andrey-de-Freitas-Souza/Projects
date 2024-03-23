/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class TelaDigiteSenha extends javax.swing.JFrame {
    private User logado;
    private double valor;
    private boolean confirmacao;
    private int tipo;
    private int destinatario;
    private String chave;
    private boolean confirmacao2;
    
    public TelaDigiteSenha(User logado,double valor,int tipo,int destinatario,String descricao,double saldofinaldest,String chave) {
        initComponents();
        this.tipo = tipo;
        this.destinatario = destinatario;
        this.chave = chave;
        if(tipo == 1){
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    TelaDeposito td = new TelaDeposito(confirmacao,logado,valor);
                    td.setVisible(true);
                    dispose();
                }
            });    
        }
        else if(tipo == 2){
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    TelaTransferir tt = new TelaTransferir(confirmacao,logado,valor,destinatario,descricao,saldofinaldest);
                    tt.setVisible(true);
                    dispose();
                }
            });    
        }
        else if(tipo == 3){
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    TelaPix tp = new TelaPix(confirmacao,logado,valor,destinatario,descricao,saldofinaldest,chave);
                    tp.setVisible(true);
                    dispose();
                }
            });    
        }
        else if(tipo == 4){
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    TelaInvestir ti = new TelaInvestir(false,true,logado,valor,destinatario,descricao,saldofinaldest,chave);
                    ti.setVisible(true);
                    dispose();
                }
            });    
        }
        else if(tipo == 5){
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
            addWindowListener(new WindowAdapter() {
                @Override
                
                public void windowClosing(WindowEvent e) {
                    TelaInvestir ti = new TelaInvestir(true,false,logado,valor,destinatario,descricao,saldofinaldest,chave);
                    ti.setVisible(true);
                    dispose();
                }
            });    
        }
        this.valor = valor;
        txtSenha.setBackground(new Color (0,0,0,0));
        btnOk.setBackground(new Color (0,0,0,0));
        setLocationRelativeTo(null);
        this.logado = logado;
        txtDeposito.setVisible(false);
        imgDeposito.setVisible(false);
        imgTransfe.setVisible(false);
        txtTransfe.setVisible(false);
        txtNome.setVisible(false);
        imgPix.setVisible(false);
        imgAdcInvest.setVisible(false);
        imvRmvInvest.setVisible(false);
        
    }

    public TelaDigiteSenha() {
        initComponents();
        txtSenha.setBackground(new Color (0,0,0,0));
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

        jButton1 = new javax.swing.JButton();
        txtTransfe = new javax.swing.JLabel();
        imvRmvInvest = new javax.swing.JLabel();
        imgAdcInvest = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        imgPix = new javax.swing.JLabel();
        imgTransfe = new javax.swing.JLabel();
        txtDeposito = new javax.swing.JLabel();
        imgDeposito = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTransfe.setFont(new java.awt.Font("Dialog", 0, 54)); // NOI18N
        txtTransfe.setForeground(new java.awt.Color(255, 255, 255));
        txtTransfe.setText("00,00");
        getContentPane().add(txtTransfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 144, -1, 60));

        imvRmvInvest.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoRmvInvest.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imvRmvInvest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        imgAdcInvest.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoAdcInvest.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgAdcInvest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setText("Andrey de Freitas Souza");
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        imgPix.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoAvisoPix.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgPix, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        imgTransfe.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoAvisoTransfe.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgTransfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtDeposito.setFont(new java.awt.Font("Dialog", 0, 54)); // NOI18N
        txtDeposito.setForeground(new java.awt.Color(255, 255, 255));
        txtDeposito.setText("00,00");
        getContentPane().add(txtDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 171, -1, 60));

        imgDeposito.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoAvisoDeposito.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 388, -1));

        btnOk.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnOk.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOkMouseExited(evt);
            }
        });
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 207, 70, 40));

        txtSenha.setBorder(null);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 153, 267, 40));

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoTelaDigiteSenha.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String senha = new String(txtSenha.getPassword());
        if(senha.equals(logado.getSenha())&& tipo == 1){
            this.confirmacao = true;
                String textvalor = Double.toString(valor);
                int index = textvalor.indexOf('.')+1;
                String aposvirgula = textvalor.substring(index,textvalor.length());
                String valorCerto = textvalor.replace('.', ',');        
                if(aposvirgula.length() == 1){
                    valorCerto = (textvalor+ '0').replace('.', ',');
                }
                else{
                    valorCerto = textvalor.replace('.', ',');
                }            
            txtDeposito.setVisible(true);
            imgDeposito.setVisible(true);
            txtDeposito.setText(valorCerto);
            
        }
        else if(senha.equals(logado.getSenha())&& tipo == 2){
            try {
                DAO dao = new DAO();
                this.confirmacao = true;
                txtTransfe.setVisible(true);
                imgTransfe.setVisible(true);
                String textvalor = Double.toString(valor);
                int index = textvalor.indexOf('.')+1;
                String aposvirgula = textvalor.substring(index,textvalor.length());
                String valorCerto = textvalor.replace('.', ',');        
                if(aposvirgula.length() == 1){
                    valorCerto = (textvalor+ '0').replace('.', ',');
                }
                else{
                    valorCerto = textvalor.replace('.', ',');
                }
                txtTransfe.setText(valorCerto);
                txtTransfe.setText(valorCerto);
                txtNome.setVisible(true);
                txtNome.setText(dao.verificaNome(destinatario));
            } catch (Exception ex) {
                Logger.getLogger(TelaDigiteSenha.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if(senha.equals(logado.getSenha())&& tipo == 3){
            try {
                DAO dao = new DAO();
                this.confirmacao = true;
                txtTransfe.setVisible(true);
                imgPix.setVisible(true);
                String textvalor = Double.toString(valor);
                int index = textvalor.indexOf('.')+1;
                String aposvirgula = textvalor.substring(index,textvalor.length());
                String valorCerto = textvalor.replace('.', ',');        
                if(aposvirgula.length() == 1){
                    valorCerto = (textvalor+ '0').replace('.', ',');
                }
                else{
                    valorCerto = textvalor.replace('.', ',');
                }
                txtTransfe.setText(valorCerto);
                txtTransfe.setText(valorCerto);
                txtNome.setVisible(true);
                txtNome.setText(dao.verificaNome(destinatario));
            } catch (Exception ex) {
                Logger.getLogger(TelaDigiteSenha.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if(senha.equals(logado.getSenha())&& tipo == 4){
            try {
                DAO dao = new DAO();
                this.confirmacao = true;
                this.confirmacao2 = false;
                txtTransfe.setVisible(true);
                imgAdcInvest.setVisible(true); 
                String textvalor = Double.toString(valor);
                int index = textvalor.indexOf('.')+1;
                String aposvirgula = textvalor.substring(index,textvalor.length());
                String valorCerto = textvalor.replace('.', ',');        
                if(aposvirgula.length() == 1){
                    valorCerto = (textvalor+ '0').replace('.', ',');
                }
                else{
                    valorCerto = textvalor.replace('.', ',');
                }
                txtTransfe.setText(valorCerto);
                txtTransfe.setText(valorCerto);
                txtNome.setVisible(true);
                txtNome.setText(dao.verificaNome(destinatario));
            } catch (Exception ex) {
                Logger.getLogger(TelaDigiteSenha.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if(senha.equals(logado.getSenha())&& tipo == 5){
            try {
                DAO dao = new DAO();
                this.confirmacao = false;
                this.confirmacao2 = true;
                txtTransfe.setVisible(true);
                imvRmvInvest.setVisible(true);
                String textvalor = Double.toString(valor);
                int index = textvalor.indexOf('.')+1;
                String aposvirgula = textvalor.substring(index,textvalor.length());
                String valorCerto = textvalor.replace('.', ',');        
                if(aposvirgula.length() == 1){
                    valorCerto = (textvalor+ '0').replace('.', ',');
                }
                else{
                    valorCerto = textvalor.replace('.', ',');
                }
                txtTransfe.setText(valorCerto);
                txtTransfe.setText(valorCerto);
                txtNome.setVisible(true);
                txtNome.setText(dao.verificaNome(destinatario));
            } catch (Exception ex) {
                Logger.getLogger(TelaDigiteSenha.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
            txtSenha.setText("");
            jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoTelaSenhaInvalida.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
            boolean confirmacao = false;
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnOkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseEntered
        btnOk.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnOk2.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnOkMouseEntered

    private void btnOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseExited
        btnOk.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnOk.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnOkMouseExited

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
            java.util.logging.Logger.getLogger(TelaDigiteSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDigiteSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDigiteSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDigiteSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDigiteSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel imgAdcInvest;
    private javax.swing.JLabel imgDeposito;
    private javax.swing.JLabel imgPix;
    private javax.swing.JLabel imgTransfe;
    private javax.swing.JLabel imvRmvInvest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtDeposito;
    private javax.swing.JLabel txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JLabel txtTransfe;
    // End of variables declaration//GEN-END:variables
}
