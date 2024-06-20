/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Package;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author andre
 */
public class TelaVisualizarVendas extends javax.swing.JFrame {

    DAO dao = new DAO();
    public TelaVisualizarVendas() {
        initComponents();
        cbxCliente.setBackground(new Color(0,0,0,0));
        cbxFormaPag.setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
        try {
            this.tblVendas.setModel(new TodasVendas());
            TableColumnModel columnModel = tblVendas.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(400);
            columnModel.getColumn(3).setPreferredWidth(30);
            columnModel.getColumn(4).setPreferredWidth(40);
            columnModel.getColumn(5).setPreferredWidth(80);
            columnModel.getColumn(6).setPreferredWidth(50);
            columnModel.getColumn(7).setPreferredWidth(80);
        String[] clientes = null;
        clientes = dao.obterClientes();
        for (String cliente : clientes) {
                cbxCliente.addItem(cliente);
        }
        } catch (Exception ex) {
            Logger.getLogger(TelaVisualizarVendas.class.getName()).log(Level.SEVERE, null, ex);
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

        jButton4 = new javax.swing.JButton();
        cbxFormaPag = new javax.swing.JComboBox<>();
        cbxCliente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Voltar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));

        cbxFormaPag.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxFormaPag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Filtro", "Pendente", "Dinheiro", "Pix" }));
        cbxFormaPag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFormaPagItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxFormaPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 380, 40));

        cbxCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Filtro" }));
        cbxCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxClienteItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 380, 40));

        tblVendas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblVendas.setRowHeight(30);
        tblVendas.setShowGrid(true);
        tblVendas.setTableHeader(null);
        jScrollPane1.setViewportView(tblVendas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 208, 1203, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoVisualizarVendas .png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxClienteItemStateChanged
        String nome = cbxCliente.getSelectedItem().toString();
        String formaPag = cbxFormaPag.getSelectedItem().toString();
        try {
            
            this.tblVendas.setModel(new TodasVendas(nome,formaPag));
            TableColumnModel columnModel = tblVendas.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(400);
            columnModel.getColumn(3).setPreferredWidth(30);
            columnModel.getColumn(4).setPreferredWidth(40);
            columnModel.getColumn(5).setPreferredWidth(80);
            columnModel.getColumn(6).setPreferredWidth(50);
            columnModel.getColumn(7).setPreferredWidth(80);
        } catch (Exception ex) {
            Logger.getLogger(TelaVisualizarVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cbxClienteItemStateChanged

    private void cbxFormaPagItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFormaPagItemStateChanged
        String nome = cbxCliente.getSelectedItem().toString();
        String formaPag = cbxFormaPag.getSelectedItem().toString();
        try {
            
            this.tblVendas.setModel(new TodasVendas(nome,formaPag));
            TableColumnModel columnModel = tblVendas.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setPreferredWidth(400);
        columnModel.getColumn(3).setPreferredWidth(30);
        columnModel.getColumn(4).setPreferredWidth(40);
        columnModel.getColumn(5).setPreferredWidth(80);
        columnModel.getColumn(6).setPreferredWidth(50);
        columnModel.getColumn(7).setPreferredWidth(80);
        } catch (Exception ex) {
            Logger.getLogger(TelaVisualizarVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxFormaPagItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVisualizarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVisualizarVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxFormaPag;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVendas;
    // End of variables declaration//GEN-END:variables
}
