/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class TelaCadCursos extends javax.swing.JFrame {
    private Administrador admlogado;
    /**
     * Creates new form TelaCadCursos
     */
    public TelaCadCursos() {
        super ("Cadastro de cursos"); 
        initComponents();
        txtId.setBackground(new Color (0,0,0,0));
        txtNome.setBackground(new Color (0,0,0,0));
        spAulas.setBackground(new Color (0,0,0,0));
        btnVoltar.setBackground(new Color (0,0,0,0));
        cbAulas.setBackground(new Color (0,0,0,0));
        btnCad.setBackground(new Color (0,0,0,0));
        btnAtualizar.setBackground(new Color (0,0,0,0));
        btnRemover.setBackground(new Color (0,0,0,0));
        buscarCursos();
        setLocationRelativeTo(null);
        txtDescricao.setWrapStyleWord(true);
        txtDescricao.setLineWrap(true);
        
    }
    public TelaCadCursos(Administrador admlogado) {
        super ("Cadastro de cursos"); 
        initComponents();
        txtId.setBackground(new Color (0,0,0,0));
        txtNome.setBackground(new Color (0,0,0,0));
        spAulas.setBackground(new Color (0,0,0,0));
        btnVoltar.setBackground(new Color (0,0,0,0));
        btnCad.setBackground(new Color (0,0,0,0));
        btnAtualizar.setBackground(new Color (0,0,0,0));
        btnRemover.setBackground(new Color (0,0,0,0));
        buscarCursos();
        setLocationRelativeTo(null);
        txtDescricao.setWrapStyleWord(true);
        txtDescricao.setLineWrap(true);
        this.admlogado = admlogado;
        
    }
    private void buscarCursos (){
        try{
            DAO dao = new DAO();
            Cursos [] cursos = dao.obterCursos();
            cbCursos.setModel(new DefaultComboBoxModel<>(cursos));
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, "Cursos indisponíveis, tente novamente mais tarde.");
        e.printStackTrace();
        }
    }
   
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCad = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        cbAulas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbCursos = new javax.swing.JComboBox<>();
        spAulas = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCad.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113307373419900979/btnCadastrarP1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadMouseExited(evt);
            }
        });
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });
        getContentPane().add(btnCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 140, 40));

        txtId.setBorder(null);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 145, 285, 40));

        txtNome.setBorder(null);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 205, 285, 40));

        btnAtualizar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113519121066365018/btnAtualizar1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseExited(evt);
            }
        });
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 140, 40));

        btnRemover.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113519120508522566/btnRemover1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoverMouseExited(evt);
            }
        });
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 140, 40));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição: "));
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 310, 140));

        cbAulas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------", "Iniciante", "Básico", "Intermediário", "Avançado", " ", " ", " " }));
        cbAulas.setBorder(null);
        cbAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAulasActionPerformed(evt);
            }
        });
        getContentPane().add(cbAulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 270, 295, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html>(Para remover, preencha    apenas o id do curso)</html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 120, -1));

        cbCursos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                cbCursosCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        cbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCursosActionPerformed(evt);
            }
        });
        getContentPane().add(cbCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 300, -1));

        spAulas.setBorder(null);
        getContentPane().add(spAulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 325, 285, 40));

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
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 140, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" id do curso:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome do curso:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Categoria:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 255, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantidade de aulas:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113532813677969601/TelaCadCursos.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        String nomeCurso = txtNome.getText();
        String tipoCurso = cbAulas.getSelectedItem().toString();
        int qtdAulas = Integer.parseInt(spAulas.getText());
        String descricao = txtDescricao.getText();
        if (nomeCurso == null || nomeCurso.length() == 0 || tipoCurso == null || tipoCurso.length() == 0){
                JOptionPane.showMessageDialog (null, "Preencha nome e categoria");
        }
        else{
            try{
                int escolha = JOptionPane.showConfirmDialog(null, "Você deseja cadastrar esse novo curso?");
                if (escolha == JOptionPane.YES_OPTION){
                    Cursos curso = new Cursos(nomeCurso, tipoCurso,qtdAulas,descricao);
                    DAO dao = new DAO();
                    dao.inserirCurso(curso);
                    JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso");
                    txtNome.setText("");
                    txtId.setText("");
                    spAulas.setText("");
                    txtDescricao.setText("");
                    cbAulas.setSelectedIndex(0);
                    dao.obterCursos();
                }            
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Falha técnica, tente mais tarde");
                e.printStackTrace();
            }
    }
    }//GEN-LAST:event_btnCadActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Você deseja atualizar o curso?");
        if (escolha == JOptionPane.YES_OPTION){
        try{
            int id = Integer.parseInt (txtId.getText());
            String nome = txtNome.getText();
            String tipo = cbAulas.getSelectedItem().toString();
            String descricao = txtDescricao.getText();
            int qtdAulas = Integer.parseInt(spAulas.getText());
            
            Cursos curso = new Cursos(id, nome, tipo,qtdAulas,descricao);
            DAO dao = new DAO();
            dao.atualizarCurso(curso);
            JOptionPane.showMessageDialog(null, "Curso atualizado com sucesso");
            dao.obterCursos();
            txtNome.setText("");
            txtId.setText("");
            spAulas.setText("");
            txtDescricao.setText("");
            cbAulas.setSelectedIndex(0);
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente mais tarde.");
            e.printStackTrace();
}
}// TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        String campoid = txtId.getText();
        if (campoid == null || campoid.length() == 0){
                JOptionPane.showMessageDialog (null, "Preencha o id");
        }
        else{
            int escolha = JOptionPane.showConfirmDialog(null, "Remover curso?");
        if (escolha == JOptionPane.YES_OPTION){
        try{
            int id = Integer.parseInt(txtId.getText());
            Cursos curso = new Cursos (id);
            DAO dao = new DAO();
            dao.removerCurso(curso);
            JOptionPane.showMessageDialog(null, "Curso removido com sucesso!");
            dao.obterCursos();
            txtNome.setText("");
            txtId.setText("");
            spAulas.setText("");
            txtDescricao.setText("");
            cbAulas.setSelectedIndex(0);
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente mais tarde.");
        e.printStackTrace();
        }
        }
      }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void cbAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAulasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAulasActionPerformed

    private void cbCursosCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cbCursosCaretPositionChanged
        
    }//GEN-LAST:event_cbCursosCaretPositionChanged

    private void cbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCursosActionPerformed

        int id = cbCursos.getSelectedIndex();
        try{
        DAO dao = new DAO();
        Cursos [] cursos = dao.obterCursos();
        txtId.setText(Integer.toString((cursos[id].getId())));
        spAulas.setText(Integer.toString((cursos[id].getQtdAulas())));
        cbAulas.setSelectedItem(cursos[id].getTipo());
        txtNome.setText(cursos[id].getNome());
        txtDescricao.setText(cursos[id].getDescricao());        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Cursos indisponíveis, tente novamente mais tarde.");
        e.printStackTrace();    
        }
    }//GEN-LAST:event_cbCursosActionPerformed

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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenuAdm tma = new TelaMenuAdm(admlogado);
        tma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadMouseEntered
        btnCad.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113307373793185875/btnCadastrarP2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnCadMouseEntered

    private void btnCadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadMouseExited
        btnCad.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113307373419900979/btnCadastrarP1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnCadMouseExited

    private void btnAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseEntered
        btnAtualizar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113519121351589991/btnAtualizar2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnAtualizarMouseEntered

    private void btnAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseExited
        btnAtualizar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113519121066365018/btnAtualizar1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnAtualizarMouseExited

    private void btnRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseEntered
        btnRemover.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113519120751804496/btnRemover2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnRemoverMouseEntered

    private void btnRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseExited
        btnRemover.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113519120508522566/btnRemover1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnRemoverMouseExited

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
            java.util.logging.Logger.getLogger(TelaCadCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbAulas;
    private javax.swing.JComboBox<Cursos> cbCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField spAulas;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
