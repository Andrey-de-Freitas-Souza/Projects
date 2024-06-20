/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Package;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author andre
 */
public class CadastroProduto extends javax.swing.JFrame {
    DAO dao = new DAO();
    int idMud = 0;
    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
        initComponents();
        setLocationRelativeTo(null);
        btnCadProd.setBackground(new Color(0,0,0,0));
        btnEditProd.setBackground(new Color(0,0,0,0));
        btnRemProd.setBackground(new Color(0,0,0,0));
        spnQtdProduto.setBackground(new Color(0,0,0,0));
        txtNomeProduto.setBackground(new Color(0,0,0,0));
        txtValorCompra.setBackground(new Color(0,0,0,0));
        txtValorVenda.setBackground(new Color(0,0,0,0));
        btnConfirmaEdit.setBackground(new Color(0,0,0,0));
        btnCancelaEdit.setBackground(new Color(0,0,0,0));
        btnConfirmaEdit.setVisible(false);
        btnCancelaEdit.setVisible(false);
        aviso.setVisible(false);
        
        try{
            this.tblProdutos.setModel(new TodosProdutos());
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente mais tarde.");
        }
        TableColumnModel columnModel = tblProdutos.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(34);
        columnModel.getColumn(1).setPreferredWidth(400);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(50);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aviso = new javax.swing.JLabel();
        btnCancelaEdit = new javax.swing.JButton();
        btnConfirmaEdit = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtNomeProduto = new javax.swing.JTextField();
        spnQtdProduto = new javax.swing.JSpinner();
        txtValorVenda = new javax.swing.JFormattedTextField();
        txtValorCompra = new javax.swing.JFormattedTextField();
        btnEditProd = new javax.swing.JButton();
        btnRemProd = new javax.swing.JButton();
        btnCadProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        imgCadProdutos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(720, 1280));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aviso.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 0, 0));
        aviso.setText("Atenção você está editando o produto 11111");
        getContentPane().add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        btnCancelaEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnCancelarEdicao.png"))); // NOI18N
        btnCancelaEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelaEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 120, 75));

        btnConfirmaEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnConfirmarEdicao.png"))); // NOI18N
        btnConfirmaEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmaEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 120, 75));

        btnVoltar.setText("Voltar");
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));

        txtNomeProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomeProduto.setBorder(null);
        getContentPane().add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 195, 380, 45));

        spnQtdProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnQtdProduto.setBorder(null);
        spnQtdProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(spnQtdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 287, 380, 45));

        txtValorVenda.setBorder(null);
        txtValorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        txtValorVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtValorVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 472, 380, 45));

        txtValorCompra.setBorder(null);
        txtValorCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        txtValorCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtValorCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 379, 380, 45));

        btnEditProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnEditarProd.png"))); // NOI18N
        btnEditProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 610, 120, 75));

        btnRemProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnRemProd.png"))); // NOI18N
        btnRemProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 120, 75));

        btnCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnCadProd.png"))); // NOI18N
        btnCadProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 120, 75));

        tblProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblProdutos.setEnabled(false);
        tblProdutos.setRowHeight(30);
        tblProdutos.setShowGrid(true);
        tblProdutos.setTableHeader(null);
        jScrollPane1.setViewportView(tblProdutos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 150, 738, 530));

        imgCadProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoCadastroProdutos.png"))); // NOI18N
        getContentPane().add(imgCadProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProdActionPerformed
        boolean VerificaNomeProd = false;
        String nomeProduto = txtNomeProduto.getText();
        try {
            String[] produtos = dao.obterProdutos();
            for (String produto : produtos) {
                if(produto.equals(nomeProduto)){
                    VerificaNomeProd = true;
                }
            
            }
        } catch (Exception ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(VerificaNomeProd){
            JOptionPane.showMessageDialog(null, "Esse produto já está cadastrado verifique o nome do produto");
        }
        else{
            Double valorCompra = Double.valueOf(txtValorCompra.getText().replace(",", "."));
            Double valorVenda = Double.valueOf(txtValorVenda.getText().replace(",", "."));
            int qtdDisp = (int) spnQtdProduto.getValue();
            int qtdComprada = (int) spnQtdProduto.getValue();
            try {
                dao.cadastrarProduto(nomeProduto,valorCompra,valorVenda,qtdDisp,qtdComprada);
                this.tblProdutos.setModel(new TodosProdutos());
                TableColumnModel columnModel = tblProdutos.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(34);
        columnModel.getColumn(1).setPreferredWidth(400);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(50);
            } catch (Exception ex) {
                Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnCadProdActionPerformed

    private void btnRemProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemProdActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Qual o ID do produto que você deseja apagar?"));
        
        try {
            dao.removerProduto(id);
            this.tblProdutos.setModel(new TodosProdutos());
        } catch(java.sql.SQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null, "Não foi possível remover o produto pois,\n já existem vendas dele, tente edita-lo.");
        }
        catch (Exception ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemProdActionPerformed

    private void btnEditProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProdActionPerformed
    
       btnCadProd.setVisible(false);
btnRemProd.setVisible(false);
btnEditProd.setVisible(false);
btnConfirmaEdit.setVisible(true);
btnCancelaEdit.setVisible(true);

// Exibir caixa de diálogo para obter o ID do produto
String verificaResp = JOptionPane.showInputDialog("Qual o ID do produto que você deseja editar?");

// Verificar se o usuário clicou em "Cancelar" ou fechou a caixa de diálogo
if (verificaResp == null) {
    // Restaurar visibilidade dos botões
    btnCadProd.setVisible(true);
    btnRemProd.setVisible(true);
    btnEditProd.setVisible(true);
    btnConfirmaEdit.setVisible(false);
    btnCancelaEdit.setVisible(false);
} else {
    try {
        // Converter a entrada para um inteiro
        idMud = Integer.parseInt(verificaResp);

        // Obter o produto correspondente ao ID
        Produtos produto = dao.pegaProduto(idMud);

        // Preencher os campos do formulário com os dados do produto
        txtNomeProduto.setText(produto.getNome());
        txtValorCompra.setText(Double.toString(produto.getValorCompra()).replace(".", ","));
        txtValorVenda.setText(Double.toString(produto.getValorVenda()).replace(".", ","));
        spnQtdProduto.setValue(produto.getEstoque());
        aviso.setVisible(true);
        aviso.setText("Atenção você está editando o produto " + idMud);
        
    } catch (NumberFormatException e) {
        // Se a entrada não for um número válido, exibir mensagem de erro e restaurar visibilidade dos botões
        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
        btnCadProd.setVisible(true);
        btnRemProd.setVisible(true);
        btnEditProd.setVisible(true);
        btnConfirmaEdit.setVisible(false);
        btnCancelaEdit.setVisible(false);
    } catch (Exception ex) {
        // Tratar exceções ao tentar obter o produto
        Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Erro ao buscar o produto. Tente novamente.");
        
        // Restaurar visibilidade dos botões
        btnCadProd.setVisible(true);
        btnRemProd.setVisible(true);
        btnEditProd.setVisible(true);
        btnConfirmaEdit.setVisible(false);
        btnCancelaEdit.setVisible(false);
        }
    }
        
    }//GEN-LAST:event_btnEditProdActionPerformed

    private void btnConfirmaEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaEditActionPerformed
        btnCadProd.setVisible(true);
        btnRemProd.setVisible(true);
        btnEditProd.setVisible(true);
        btnConfirmaEdit.setVisible(false);
        btnCancelaEdit.setVisible(false);
        boolean VerificaNomeProd = false;
        String nomeProduto = txtNomeProduto.getText();
        
        try {
            Produtos produtoID = dao.pegaProdutoNome(nomeProduto);
            String[] produtos = dao.obterProdutos();
            for (String produto : produtos) {
                if(produto.equals(nomeProduto) && produtoID.getId() != idMud){
                    VerificaNomeProd = true;
                }            
            }
        } 
        catch (Exception ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(VerificaNomeProd){
            JOptionPane.showMessageDialog(null, "Não foi possível concluir a edição pois,\n já existe um produto com esse nome.");
            aviso.setVisible(false);
        }
        else{
            Double valorCompra = Double.valueOf(txtValorCompra.getText().replace(",", "."));
            Double valorVenda = Double.valueOf(txtValorVenda.getText().replace(",", "."));
            int qtdDisp = (int) spnQtdProduto.getValue();
            int qtdComprada = (int) spnQtdProduto.getValue();
            try {
                dao.editaProduto(idMud,nomeProduto,valorCompra,valorVenda,qtdDisp,qtdComprada);
                this.tblProdutos.setModel(new TodosProdutos());
                TableColumnModel columnModel = tblProdutos.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(34);
        columnModel.getColumn(1).setPreferredWidth(400);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(50);
            } catch (Exception ex) {
                Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConfirmaEditActionPerformed

    private void btnCancelaEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaEditActionPerformed
        txtNomeProduto.setText("");
        txtValorCompra.setText("");
        txtValorVenda.setText("");       
        spnQtdProduto.setValue(0);
        btnCadProd.setVisible(true);
        btnRemProd.setVisible(true);
        btnEditProd.setVisible(true);
        btnConfirmaEdit.setVisible(false);
        btnCancelaEdit.setVisible(false);
        aviso.setVisible(false);
    }//GEN-LAST:event_btnCancelaEditActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JButton btnCadProd;
    private javax.swing.JButton btnCancelaEdit;
    private javax.swing.JButton btnConfirmaEdit;
    private javax.swing.JButton btnEditProd;
    private javax.swing.JButton btnRemProd;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel imgCadProdutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnQtdProduto;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JFormattedTextField txtValorCompra;
    private javax.swing.JFormattedTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
