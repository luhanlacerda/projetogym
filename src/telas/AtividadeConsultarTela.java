/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import atividade.Atividade;
import fachada.Fachada;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ELAINE
 */
public class AtividadeConsultarTela extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Atividade> listaAtividades;
    TelaPrincipal pai;

    public AtividadeConsultarTela(TelaPrincipal pai) {
        initComponents();
        this.pai = pai;
        modelo.setColumnIdentifiers(new String[]{"Código", "Descrição"});
        jTableAtividade.setModel(modelo);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new classesBasicas.JTextFieldSomenteNumeros();
        jButtonConsultar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAtividade = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consultar Atividade");

        jLabel1.setText("Código:");

        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png"))); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jTableAtividade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAtividade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAtividadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAtividade);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButtonConsultar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonConsultar)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jButtonDeletar)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        try {
            Fachada fachada = new Fachada();
            Atividade atividade = new Atividade();
            atividade.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            fachada.remover(atividade);
            JOptionPane.showMessageDialog(rootPane, "Atividade removida com sucesso");
            jTextFieldCodigo.setText("");
            modelo.setRowCount(0);
            jTextFieldCodigo.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed

        try {
            Fachada fachada = new Fachada();
            Atividade atividade = new Atividade();
            if (jTextFieldCodigo.getText().trim().equals("") == false) {
                atividade.setCodigo(Integer.parseInt(jTextFieldCodigo.getText().trim()));
            }
            atividade.setDescricao(title);
            this.listaAtividades = fachada.listar (atividade);
            modelo.setRowCount(0);     //zera toda a tabela. Mesma coisa que o deleteRows() fazia.
            if (this.listaAtividades.size() > 0) {
                for (Atividade atv : this.listaAtividades) {
                    modelo.addRow(new String[]{atv.getCodigo() + "", atv.getDescricao()});
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não existe resultados com o filtro passado");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
        

    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jTableAtividadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAtividadeMouseClicked
        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);
        int index = jTableAtividade.getSelectedRow();
        Atividade atividadeEscolhida = this.listaAtividades.get(index);
        AtividadeAtualizarTelaJFrame atividadeAtualizarTela = new AtividadeAtualizarTelaJFrame(atividadeEscolhida); // Vincula a tela atualizar
        atividadeAtualizarTela.setVisible(true);
    }//GEN-LAST:event_jTableAtividadeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAtividade;
    private javax.swing.JTextField jTextFieldCodigo;
    // End of variables declaration//GEN-END:variables
}
