/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class TelaPrincipal extends javax.swing.JFrame {
    private User logado;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(User logado) throws Exception {
        super("MyBanK");
        initComponents();
        setLocationRelativeTo(null);
        this.logado = logado;
        lblAste.setVisible(false);
        btnOlhoFechado.setBackground(new Color(0,0,0,0));
        btnOlhoAberto.setBackground(new Color(0,0,0,0));
        btnUser.setBackground(new Color(0,0,0,0));
        btnFechaUser.setBackground(new Color(0,0,0,0));
        btnPix.setBackground(new Color(0,0,0,0));
        btnInvestir.setBackground(new Color(0,0,0,0));
        btnDeposito.setBackground(new Color(0,0,0,0));
        btnTransferir.setBackground(new Color(0,0,0,0));
        btnConfig.setBackground(new Color(0,0,0,0));        
        btnSaldo.setBackground(new Color(0,0,0,0));
        btnHelp.setBackground(new Color(0,0,0,0));
        btnFatura.setBackground(new Color(0,0,0,0));
        btnInvestido.setBackground(new Color(0,0,0,0));
        btnDesconectar.setBackground(new Color(0,0,0,0));
        btnAumentarLimite.setBackground(new Color(0,0,0,0));
        btnAumentarLimite.setVisible(false);    
        btnDesconectar.setVisible(false);
        btnFechaUser.setVisible(false);
        btnOlhoAberto.setVisible(false);
        imgUserMenu.setVisible(false);        
        lblEmail.setVisible(false);
        btnMinhasInfo.setVisible(false);
        btnMinhasInfo.setBackground(new Color(0,0,0,0));
        btnChavePix.setBackground(new Color(0,0,0,0));
        btnChavePix.setVisible(false);
        btnFechaConfig.setBackground(new Color(0,0,0,0));
        btnFechaConfig.setVisible(false);
        imgConfig.setVisible(false);
        
        DAO dao = new DAO();
        lblEmail.setText(dao.verificaEmail(logado.getCodConta()));
        String saldo = Double.toString(dao.verificaSaldo(logado.getCodConta()));
        int index = saldo.indexOf(".") + 1;
        String aposvirgula = saldo.substring(index, saldo.length());
        if(aposvirgula.length() == 1){
         String saldoCerto = (saldo + "0").replace(".", ","); 
         lblSaldo.setText("R$ " + saldoCerto);
        }
        else{
        String saldoCerto = saldo.replace(".", ",");            
        lblSaldo.setText("R$ " + saldoCerto);    
        }
        String investido = Double.toString(dao.verificaSaldoInvestido(logado.getCodConta()));
        String investidoCerto = investido.replace('.', ',');
        lblInvestido.setText(investidoCerto);
        logado.setSaldo(Double.parseDouble(saldo));        
        ArrayList<Transferencia> todasTransfe = dao.todastTransfeUsuario(logado.getCodConta());
        if(todasTransfe.size() == 0){
            lblExtrato1.setVisible(false);
            lblExtrato2.setVisible(false);
            lblExtrato3.setVisible(false);
            lblExtrato4.setVisible(false);   
            lblExtrato5.setVisible(false);        
        }
        else if(todasTransfe.size() == 1){
            lblExtrato1.setVisible(true);
            lblExtrato2.setVisible(false);
            lblExtrato3.setVisible(false);
            lblExtrato4.setVisible(false);   
            lblExtrato5.setVisible(false);
            String valor = Double.toString(todasTransfe.get(0).getValor());
            int index1 = valor.indexOf(".") + 1;
            String aposavirgula = valor.substring(index1, valor.length());
            String valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }
            String transfe = ( "   Data: " + (todasTransfe.get(0).getDia())+"     "+ todasTransfe.get(0).getTipo()+ "     R$ "+ valorCerto);
            String transfeCerto = transfe.replace('.', ',');
            lblExtrato1.setText(transfeCerto);
            if(todasTransfe.get(0).getTipo().equals("Depósito")||todasTransfe.get(0).getDestinatario()== logado.getCodConta()){
                lblExtrato1.setForeground(Color.green);
            }
            
            else{
                lblExtrato1.setForeground(Color.red);
            }
            if(todasTransfe.get(0).getTipo().equals("Investimento")){
                lblExtrato1.setForeground(Color.red);
            }        
        }
        else if(todasTransfe.size() == 2){
            lblExtrato1.setVisible(true);
            lblExtrato3.setVisible(false);
            lblExtrato4.setVisible(false);   
            lblExtrato5.setVisible(false);
            String valor = Double.toString(todasTransfe.get(0).getValor());
            int index1 = valor.indexOf(".") + 1;
            String aposavirgula = valor.substring(index1, valor.length());
            String valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }
            String transfe = ( "   Data: " + (todasTransfe.get(0).getDia())+"     "+ todasTransfe.get(0).getTipo()+ "     R$ "+ valorCerto);
            String transfeCerto = transfe.replace('.', ',');
            lblExtrato1.setText(transfeCerto);
            if(todasTransfe.get(0).getTipo().equals("Depósito")||todasTransfe.get(0).getDestinatario()== logado.getCodConta()){
                lblExtrato1.setForeground(Color.green);
            }
            
            else{
                lblExtrato1.setForeground(Color.red);
            }
            if(todasTransfe.get(0).getTipo().equals("Investimento")){
                lblExtrato1.setForeground(Color.red);
            }
            lblExtrato2.setVisible(true);
            valor = Double.toString(todasTransfe.get(1).getValor());
            index1 = valor.indexOf(".") + 1;
            aposavirgula = valor.substring(index1, valor.length());
            valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }
            transfe = ( "   Data: " + (todasTransfe.get(1).getDia())+"     "+ todasTransfe.get(1).getTipo()+ "     R$ "+ valorCerto);
            transfeCerto = transfe.replace('.', ',');
            lblExtrato2.setText(transfeCerto);
            if(todasTransfe.get(1).getTipo().equals("Depósito")||todasTransfe.get(1).getDestinatario()== logado.getCodConta()){
                lblExtrato2.setForeground(Color.green);
            }
            
            else{
                lblExtrato2.setForeground(Color.red);
            }
            if(todasTransfe.get(1).getTipo().equals("Investimento")){
                lblExtrato2.setForeground(Color.red);
            } 
        }
        else if(todasTransfe.size() == 3){
            lblExtrato1.setVisible(true);
            lblExtrato4.setVisible(false);   
            lblExtrato5.setVisible(false);
            String valor = Double.toString(todasTransfe.get(0).getValor());
            int index1 = valor.indexOf(".") + 1;
            String aposavirgula = valor.substring(index1, valor.length());
            String valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }
            String transfe = ( "   Data: " + (todasTransfe.get(1).getDia())+"     "+ todasTransfe.get(0).getTipo()+ "     R$ "+ valorCerto);
            String transfeCerto = transfe.replace('.', ',');
            lblExtrato1.setText(transfeCerto);
            if(todasTransfe.get(0).getTipo().equals("Depósito")||todasTransfe.get(0).getDestinatario()== logado.getCodConta()){
                lblExtrato1.setForeground(Color.green);
            }
            
            else{
                lblExtrato1.setForeground(Color.red);
            }
            if(todasTransfe.get(0).getTipo().equals("Investimento")){
                lblExtrato1.setForeground(Color.red);
            }
            lblExtrato2.setVisible(true);
            valor = Double.toString(todasTransfe.get(1).getValor());
            index1 = valor.indexOf(".") + 1;
            aposavirgula = valor.substring(index1, valor.length());
            valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }
            transfe = ( "   Data: " + (todasTransfe.get(1).getDia())+"     "+ todasTransfe.get(1).getTipo()+ "     R$ "+valorCerto);
            transfeCerto = transfe.replace('.', ',');
            lblExtrato2.setText(transfeCerto);
            if(todasTransfe.get(1).getTipo().equals("Depósito")||todasTransfe.get(1).getDestinatario()== logado.getCodConta()){
                lblExtrato2.setForeground(Color.green);
            }
            
            else{
                lblExtrato2.setForeground(Color.red);
            }
            if(todasTransfe.get(1).getTipo().equals("Investimento")){
                lblExtrato2.setForeground(Color.red);
            }
            lblExtrato3.setVisible(true);
            valor = Double.toString(todasTransfe.get(2).getValor());
            index1 = valor.indexOf(".") + 1;
            aposavirgula = valor.substring(index1, valor.length());
            valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }
            transfe = ( "   Data: " + (todasTransfe.get(2).getDia())+"     "+ todasTransfe.get(2).getTipo()+ "     R$ "+ valorCerto);
            transfeCerto = transfe.replace('.', ',');
            lblExtrato3.setText(transfeCerto);
            if(todasTransfe.get(2).getTipo().equals("Depósito")||todasTransfe.get(2).getDestinatario()== logado.getCodConta()){
                lblExtrato3.setForeground(Color.green);
            }
            
            else{
                lblExtrato3.setForeground(Color.red);
            }
            if(todasTransfe.get(2).getTipo().equals("Investimento")){
                lblExtrato3.setForeground(Color.red);
            } 
        }
        else if(todasTransfe.size() == 4){
            lblExtrato1.setVisible(true);
            lblExtrato5.setVisible(false);
            String valor = Double.toString(todasTransfe.get(0).getValor());
            int index1 = valor.indexOf(".") + 1;
            String aposavirgula = valor.substring(index1, valor.length());
            String valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }
            String transfe = ( "   Data: " + (todasTransfe.get(0).getDia())+"     "+ todasTransfe.get(0).getTipo()+ "     R$ "+ valorCerto);
            String transfeCerto = transfe.replace('.', ',');
            lblExtrato1.setText(transfeCerto);
            if(todasTransfe.get(0).getTipo().equals("Depósito")||todasTransfe.get(0).getDestinatario()== logado.getCodConta()){
                lblExtrato1.setForeground(Color.green);
            }
            
            else{
                lblExtrato1.setForeground(Color.red);
            }
            if(todasTransfe.get(0).getTipo().equals("Investimento")){
                lblExtrato1.setForeground(Color.red);
            }
            lblExtrato2.setVisible(true);
            valor = Double.toString(todasTransfe.get(1).getValor());
            index1 = valor.indexOf(".") + 1;
            aposavirgula = valor.substring(index1, valor.length());
            valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }
            transfe = ( "   Data: " + (todasTransfe.get(1).getDia())+"     "+ todasTransfe.get(1).getTipo()+ "     R$ "+valorCerto);
            transfeCerto = transfe.replace('.', ',');
            lblExtrato2.setText(transfeCerto);
            if(todasTransfe.get(1).getTipo().equals("Depósito")||todasTransfe.get(1).getDestinatario()== logado.getCodConta()){
                lblExtrato2.setForeground(Color.green);
            }
            
            else{
                lblExtrato2.setForeground(Color.red);
            }
            if(todasTransfe.get(1).getTipo().equals("Investimento")){
                lblExtrato2.setForeground(Color.red);
            }
            lblExtrato3.setVisible(true);
            valor = Double.toString(todasTransfe.get(2).getValor());
            index1 = valor.indexOf(".") + 1;
            aposavirgula = valor.substring(index1, valor.length());
            valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }
            transfe = ( "   Data: " + (todasTransfe.get(2).getDia())+"     "+ todasTransfe.get(2).getTipo()+ "     R$ "+ valorCerto);
            transfeCerto = transfe.replace('.', ',');
            lblExtrato3.setText(transfeCerto);
            if(todasTransfe.get(2).getTipo().equals("Depósito")||todasTransfe.get(2).getDestinatario()== logado.getCodConta()){
                lblExtrato3.setForeground(Color.green);
            }
            
            else{
                lblExtrato3.setForeground(Color.red);
            }
            if(todasTransfe.get(2).getTipo().equals("Investimento")){
                lblExtrato3.setForeground(Color.red);
            }
            valor = Double.toString(todasTransfe.get(3).getValor());
            index1 = valor.indexOf(".") + 1;
            aposavirgula = valor.substring(index1, valor.length());
            valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }
            transfe = ( "   Data: " + (todasTransfe.get(3).getDia())+"     "+ todasTransfe.get(3).getTipo()+ "     R$ "+valorCerto);
            transfeCerto = transfe.replace('.', ',');
            lblExtrato4.setText(transfeCerto);
            if(todasTransfe.get(3).getTipo().equals("Depósito")||todasTransfe.get(3).getDestinatario()== logado.getCodConta()){
                lblExtrato4.setForeground(Color.green);
            }
            
            else{
                lblExtrato4.setForeground(Color.red);
            }
            if(todasTransfe.get(3).getTipo().equals("Investimento")){
                lblExtrato4.setForeground(Color.red);
            }
           
        }        
        else{
        for(int i =0;i<5;i++){
        String valor = Double.toString(todasTransfe.get(i).getValor());
        int index1 = valor.indexOf(".") + 1;
        String aposavirgula = valor.substring(index1, valor.length());
        String valorCerto = valor.replace('.',',');
                if(aposavirgula.length() == 1){                   
                    valorCerto = (valor + '0').replace('.',',');
                }
                else{
                    valorCerto = valor.replace('.',',');
                }   
        String transfe = ( "   Data: " + (todasTransfe.get(i).getDia())+"     "+ todasTransfe.get(i).getTipo()+ "     R$ "+valorCerto);
        String transfeCerto = transfe.replace('.', ',');
        if(i==0){
            lblExtrato1.setText(transfeCerto);
            if(todasTransfe.get(i).getTipo().equals("Depósito")||todasTransfe.get(i).getDestinatario()== logado.getCodConta()){
                lblExtrato1.setForeground(Color.green);
            }
            
            else{
                lblExtrato1.setForeground(Color.red);
            }
            if(todasTransfe.get(i).getTipo().equals("Investimento")){
                lblExtrato1.setForeground(Color.red);
            }
        }
        if(i==1){
            lblExtrato2.setText(transfeCerto);
            if(todasTransfe.get(i).getTipo().equals("Depósito")||todasTransfe.get(i).getDestinatario()== logado.getCodConta()){
                lblExtrato2.setForeground(Color.green);
            }           
            else{
                lblExtrato2.setForeground(Color.red);
            }
            if(todasTransfe.get(i).getTipo().equals("Investimento")){
                lblExtrato2.setForeground(Color.red);
            }
        }
        if(i==2){
            lblExtrato3.setText(transfeCerto);
            if(todasTransfe.get(i).getTipo().equals("Depósito")|| todasTransfe.get(i).getDestinatario()== logado.getCodConta()){
                lblExtrato3.setForeground(Color.green);
            }
            
            else{
                lblExtrato3.setForeground(Color.red);
            }
            if(todasTransfe.get(i).getTipo().equals("Investimento")){
                lblExtrato3.setForeground(Color.red);
            }
        }
        if(i==3){
            lblExtrato4.setText(transfeCerto);
            if(todasTransfe.get(i).getTipo().equals("Depósito")||todasTransfe.get(i).getDestinatario()== logado.getCodConta()){
                lblExtrato4.setForeground(Color.green);
            }
            else{
                lblExtrato4.setForeground(Color.red);
            }
            if(todasTransfe.get(i).getTipo().equals("Investimento")){
                lblExtrato4.setForeground(Color.red);
            }
        }
        if(i==4){
            lblExtrato5.setText(transfeCerto);
            if(todasTransfe.get(i).getTipo().equals("Depósito")||todasTransfe.get(i).getDestinatario()== logado.getCodConta()){
                lblExtrato5.setForeground(Color.green);
            }
            
            else{
                lblExtrato5.setForeground(Color.red);
            }
            if(todasTransfe.get(i).getTipo().equals("Investimento")){
                lblExtrato5.setForeground(Color.red);
            }
        }
        
        }
        }
        
    }

    public TelaPrincipal() {
        initComponents();
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

        btnAumentarLimite = new javax.swing.JButton();
        btnFechaConfig = new javax.swing.JButton();
        btnChavePix = new javax.swing.JButton();
        imgConfig = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnMinhasInfo = new javax.swing.JButton();
        btnFechaUser = new javax.swing.JButton();
        btnDesconectar = new javax.swing.JButton();
        imgUserMenu = new javax.swing.JLabel();
        lblInvestido = new javax.swing.JLabel();
        lblExtrato1 = new javax.swing.JLabel();
        lblExtrato2 = new javax.swing.JLabel();
        lblExtrato3 = new javax.swing.JLabel();
        lblExtrato4 = new javax.swing.JLabel();
        lblExtrato5 = new javax.swing.JLabel();
        lblAste = new javax.swing.JLabel();
        lblrendimento = new javax.swing.JLabel();
        totinve = new javax.swing.JLabel();
        btnFatura = new javax.swing.JButton();
        btnInvestido = new javax.swing.JButton();
        lblSaldo = new javax.swing.JLabel();
        btnSaldo = new javax.swing.JButton();
        rend = new javax.swing.JLabel();
        btnConfig = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnInvestir = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnPix = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        btnOlhoFechado = new javax.swing.JButton();
        btnOlhoAberto = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAumentarLimite.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnAumentarLimite.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnAumentarLimite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAumentarLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarLimiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAumentarLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 280, 40));

        btnFechaConfig.setIcon(new javax.swing.JLabel() {
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
        btnFechaConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechaConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaConfigActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechaConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 22, 50, 40));

        btnChavePix.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnCadastrarPix.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnChavePix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChavePix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChavePixActionPerformed(evt);
            }
        });
        getContentPane().add(btnChavePix, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 245, 280, 40));

        imgConfig.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoMenu.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 0, -1, -1));

        lblEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail.setText("jLabel1");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        btnMinhasInfo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnMinhasInfo.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnMinhasInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinhasInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinhasInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinhasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 310, 50));

        btnFechaUser.setIcon(new javax.swing.JLabel() {
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
        btnFechaUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 60, 40));

        btnDesconectar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnDesconectar.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnDesconectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 310, 70));

        imgUserMenu.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoMeuPerfil.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgUserMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblInvestido.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblInvestido.setForeground(java.awt.Color.green);
        lblInvestido.setText("????");
        getContentPane().add(lblInvestido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, -1, -1));

        lblExtrato1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblExtrato1.setForeground(new java.awt.Color(255, 255, 255));
        lblExtrato1.setText("Extrato");
        getContentPane().add(lblExtrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        lblExtrato2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblExtrato2.setForeground(new java.awt.Color(255, 255, 255));
        lblExtrato2.setText("Extrato");
        getContentPane().add(lblExtrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        lblExtrato3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblExtrato3.setForeground(new java.awt.Color(255, 255, 255));
        lblExtrato3.setText("Extrato");
        getContentPane().add(lblExtrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        lblExtrato4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblExtrato4.setForeground(new java.awt.Color(255, 255, 255));
        lblExtrato4.setText("Extrato");
        getContentPane().add(lblExtrato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        lblExtrato5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblExtrato5.setForeground(new java.awt.Color(255, 255, 255));
        lblExtrato5.setText("Extrato");
        getContentPane().add(lblExtrato5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        lblAste.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        lblAste.setText("*****");
        getContentPane().add(lblAste, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 150, -1, -1));

        lblrendimento.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblrendimento.setForeground(java.awt.Color.green);
        lblrendimento.setText("10%");
        getContentPane().add(lblrendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 700, -1, -1));

        totinve.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        totinve.setForeground(new java.awt.Color(255, 255, 255));
        totinve.setText("Total Investido:");
        getContentPane().add(totinve, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        btnFatura.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnExtrato.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnFatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 150, 40));

        btnInvestido.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnInvestimentosTexto2.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnInvestido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInvestido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvestidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvestido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 605, 260, 40));

        lblSaldo.setFont(new java.awt.Font("Dialog", 1, 33)); // NOI18N
        lblSaldo.setText("R$ 00,00");
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 160, -1, -1));

        btnSaldo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnSaldo1.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, -1, 40));

        rend.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        rend.setForeground(new java.awt.Color(255, 255, 255));
        rend.setText("Rendimento:");
        getContentPane().add(rend, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, -1, -1));

        btnConfig.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnMenu.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 50, 50));

        btnHelp.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnInfo.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 50, 50));

        btnInvestir.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnInvestir.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnInvestir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInvestir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvestirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvestir, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 230, 90, 120));

        btnDeposito.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnDeposito.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 90, 120));

        btnPix.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnPix.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnPix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPixActionPerformed(evt);
            }
        });
        getContentPane().add(btnPix, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 120));

        btnTransferir.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnTransferencia.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 230, 90, 120));

        btnOlhoFechado.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnOlhoFechado.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnOlhoFechado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOlhoFechado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlhoFechadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnOlhoFechado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 22, -1, 40));

        btnOlhoAberto.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnOlhoAberto.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnOlhoAberto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOlhoAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlhoAbertoActionPerformed(evt);
            }
        });
        getContentPane().add(btnOlhoAberto, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 22, 65, 40));

        btnUser.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/btnMeuPerfil.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 70));

        imgFundo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/Andrey-de-Freitas-Souza/html-css/blob/main/Imagens/FundoTelaPrincipal.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOlhoFechadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlhoFechadoActionPerformed
        btnOlhoAberto.setVisible(true);
        btnOlhoFechado.setVisible(false);
        lblAste.setVisible(true);
        lblSaldo.setVisible(false);
        lblExtrato1.setVisible(false);
        lblExtrato2.setVisible(false);
        lblExtrato3.setVisible(false);
        lblExtrato4.setVisible(false);
        lblExtrato5.setVisible(false);
        lblInvestido.setVisible(false);
        lblrendimento.setVisible(false);
        totinve.setVisible(false);
        rend.setVisible(false);
        
        
    }//GEN-LAST:event_btnOlhoFechadoActionPerformed

    private void btnOlhoAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlhoAbertoActionPerformed
        try {
            btnOlhoFechado.setVisible(true);
            btnOlhoAberto.setVisible(false);
            lblAste.setVisible(false);
            lblSaldo.setVisible(true);
            DAO dao = new DAO();
            ArrayList<Transferencia> todasTransfe = dao.todastTransfeUsuario(logado.getCodConta());
            if(todasTransfe.size() == 0){
            lblExtrato1.setVisible(false);
            lblExtrato2.setVisible(false);
            lblExtrato3.setVisible(false);
            lblExtrato4.setVisible(false);   
            lblExtrato5.setVisible(false);        
            }
            else if(todasTransfe.size() == 1){
            lblExtrato1.setVisible(true);
            lblExtrato2.setVisible(false);
            lblExtrato3.setVisible(false);
            lblExtrato4.setVisible(false);   
            lblExtrato5.setVisible(false);        
            }
            else if(todasTransfe.size() == 2){
            lblExtrato1.setVisible(true);
            lblExtrato2.setVisible(true);
            lblExtrato3.setVisible(false);
            lblExtrato4.setVisible(false);   
            lblExtrato5.setVisible(false);        
            }
            else if(todasTransfe.size() == 3){
            lblExtrato1.setVisible(true);
            lblExtrato2.setVisible(true);
            lblExtrato3.setVisible(true);
            lblExtrato4.setVisible(false);   
            lblExtrato5.setVisible(false);        
            }
            else if(todasTransfe.size() == 4){
            lblExtrato1.setVisible(true);
            lblExtrato2.setVisible(true);
            lblExtrato3.setVisible(true);
            lblExtrato4.setVisible(true);   
            lblExtrato5.setVisible(false);        
            }
            else{
            lblExtrato1.setVisible(true);
            lblExtrato2.setVisible(true);
            lblExtrato3.setVisible(true);
            lblExtrato4.setVisible(true);
            lblExtrato5.setVisible(true);            
            }
            lblInvestido.setVisible(true);
            lblrendimento.setVisible(true);
            totinve.setVisible(true);
            rend.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btnOlhoAbertoActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        imgUserMenu.setVisible(true);
        //btnOlhoFechado.setVisible(false);
        //btnOlhoAberto.setVisible(false);
        btnUser.setVisible(false);
        btnFechaUser.setVisible(true);
        btnDesconectar.setVisible(true);
        lblEmail.setVisible(true);
        btnMinhasInfo.setVisible(true);
        
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnFechaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaUserActionPerformed
        imgUserMenu.setVisible(false);
        //btnOlhoFechado.setVisible(true);
        //btnOlhoAberto.setVisible(true);
        btnUser.setVisible(true);
        btnFechaUser.setVisible(false);
        btnDesconectar.setVisible(false);
        lblEmail.setVisible(false);
        btnMinhasInfo.setVisible(false);
    }//GEN-LAST:event_btnFechaUserActionPerformed

    private void btnPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPixActionPerformed
        TelaPix tp = new TelaPix(logado);
        tp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPixActionPerformed

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        TelaExtrato te = new TelaExtrato(logado);
        te.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnInvestirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvestirActionPerformed
       TelaInvestir tb = new TelaInvestir(logado);
       tb.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnInvestirActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
       TelaTransferir tt = new TelaTransferir(logado);
       tt.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
       TelaDeposito td = new TelaDeposito(logado);
       td.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        TelaHelp th = new TelaHelp(logado);
        th.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDesconectarActionPerformed

    private void btnChavePixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChavePixActionPerformed
        TelaCadastrarPix tcp = new TelaCadastrarPix(logado);
        tcp.setVisible(true);
        
        
    }//GEN-LAST:event_btnChavePixActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        imgConfig.setVisible(true);
        btnConfig.setVisible(false);
        btnChavePix.setVisible(true);
        btnFechaConfig.setVisible(true);
        btnAumentarLimite.setVisible(true);
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnFechaConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaConfigActionPerformed
        imgConfig.setVisible(false);
        btnConfig.setVisible(true);
        btnChavePix.setVisible(false);
        btnFechaConfig.setVisible(false);
        btnAumentarLimite.setVisible(false);
    }//GEN-LAST:event_btnFechaConfigActionPerformed

    private void btnInvestidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvestidoActionPerformed
        TelaInvestir ti = new TelaInvestir(logado);
        ti.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInvestidoActionPerformed

    private void btnFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaturaActionPerformed
        TelaExtrato te = new TelaExtrato(logado);
        te.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFaturaActionPerformed

    private void btnMinhasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinhasInfoActionPerformed
        TelaMinhasInfo tmi = new TelaMinhasInfo(logado);
        tmi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMinhasInfoActionPerformed

    private void btnAumentarLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarLimiteActionPerformed
        TelaAumentarLimite tal = new TelaAumentarLimite(logado);
        tal.setVisible(true);
        
    }//GEN-LAST:event_btnAumentarLimiteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentarLimite;
    private javax.swing.JButton btnChavePix;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnFatura;
    private javax.swing.JButton btnFechaConfig;
    private javax.swing.JButton btnFechaUser;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnInvestido;
    private javax.swing.JButton btnInvestir;
    private javax.swing.JButton btnMinhasInfo;
    private javax.swing.JButton btnOlhoAberto;
    private javax.swing.JButton btnOlhoFechado;
    private javax.swing.JButton btnPix;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel imgConfig;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel imgUserMenu;
    private javax.swing.JLabel lblAste;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblExtrato1;
    private javax.swing.JLabel lblExtrato2;
    private javax.swing.JLabel lblExtrato3;
    private javax.swing.JLabel lblExtrato4;
    private javax.swing.JLabel lblExtrato5;
    private javax.swing.JLabel lblInvestido;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblrendimento;
    private javax.swing.JLabel rend;
    private javax.swing.JLabel totinve;
    // End of variables declaration//GEN-END:variables
}
