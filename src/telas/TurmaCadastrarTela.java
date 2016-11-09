/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import aluno.Aluno;
import atividade.Atividade;
import classesBasicas.FormatacaoDataHora;
import fachada.Fachada;
import instrutor.Instrutor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import turma.Turma;

/**
 *
 * @author ELAINE
 */
public class TurmaCadastrarTela extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroTurma
     */
    Fachada fachada = new Fachada();
    DefaultTableModel modeloInstrutor = new DefaultTableModel(), modeloAtividade = new DefaultTableModel(), modeloMonitor = new DefaultTableModel();

    public TurmaCadastrarTela() {
        initComponents();
        modeloInstrutor.setColumnIdentifiers(new String[]{"Matrícula", "Nome"});
        jTableInstrutor.setModel(modeloInstrutor);
        modeloMonitor.setColumnIdentifiers(new String[]{"Matrícula", "Nome"});
        jTableMonitor.setModel(modeloMonitor);
        modeloAtividade.setColumnIdentifiers(new String[]{"Código", "Descrição"});
        jTableAtividade.setModel(modeloAtividade);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCodTur = new javax.swing.JTextField();
        jFormattedTextFieldDurAula = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDtInicial = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDtFinal = new javax.swing.JFormattedTextField();
        jFormattedTextFieldHorarioAulasInicio = new javax.swing.JFormattedTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAtividade = new javax.swing.JTable();
        jTextFieldMonitor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMonitor = new javax.swing.JTable();
        jTextFieldAtividade = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableInstrutor = new javax.swing.JTable();
        jTextFieldInstrutor = new javax.swing.JTextField();
        jButtonPesquisarMonitor = new javax.swing.JButton();
        jButtonPesquisarAtividade = new javax.swing.JButton();
        jButtonPesquisarInstrutor = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Turma");

        jLabel1.setText("Codigo Turma: ");

        jLabel3.setText("Horário da Aula:");

        jLabel4.setText("Duração Aula:");

        jLabel5.setText("Data Inicial:");

        jLabel6.setText("Data Final:");

        jLabel7.setText("Monitor:");

        jLabel8.setText("Instrutor:");

        jLabel9.setText("Atividade:");

        try {
            jFormattedTextFieldDurAula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldDtInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldDtFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldHorarioAulasInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jTableAtividade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAtividade.setToolTipText("");
        jScrollPane1.setViewportView(jTableAtividade);

        jTableMonitor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMonitor.setToolTipText("");
        jScrollPane2.setViewportView(jTableMonitor);

        jTableInstrutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableInstrutor.setToolTipText("");
        jScrollPane3.setViewportView(jTableInstrutor);

        jButtonPesquisarMonitor.setText("Pesquisar");
        jButtonPesquisarMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarMonitorActionPerformed(evt);
            }
        });

        jButtonPesquisarAtividade.setText("Pesquisar");
        jButtonPesquisarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAtividadeActionPerformed(evt);
            }
        });

        jButtonPesquisarInstrutor.setText("Pesquisar");
        jButtonPesquisarInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarInstrutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDurAula, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldHorarioAulasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(jTextFieldCodTur, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldDtInicial))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonPesquisarMonitor))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisarAtividade))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisarInstrutor))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFormattedTextFieldDtFinal, jFormattedTextFieldDtInicial, jFormattedTextFieldDurAula, jFormattedTextFieldHorarioAulasInicio});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldCodTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonPesquisarMonitor)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextFieldHorarioAulasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedTextFieldDurAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisarAtividade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisarInstrutor))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar)
                .addGap(31, 31, 31))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jFormattedTextFieldDtFinal, jFormattedTextFieldDtInicial, jFormattedTextFieldDurAula});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        try {
            //DADOS DA TURMA
            Turma turma = new Turma();
            turma.setCodigo(Integer.parseInt(jTextFieldCodTur.getText()));
            turma.setHorario(FormatacaoDataHora.getHorario(jFormattedTextFieldHorarioAulasInicio.getText()));
            turma.setDuracaoaula(FormatacaoDataHora.getHorario(jFormattedTextFieldDurAula.getText()));
            turma.setDtinicial(FormatacaoDataHora.getData(jFormattedTextFieldDtInicial.getText()));
            turma.setDtfinal(FormatacaoDataHora.getData(jFormattedTextFieldDtFinal.getText()));
            //DADOS DE ALUNO
            turma.getAluno().setMatricula(Integer.parseInt(jTextFieldMonitor.getText()));
            //DADOS DE INSTRUTOR
            turma.getInstrutor().setMatricula(Integer.parseInt(jTextFieldInstrutor.getText()));
            //DADOS DE ATIVIDADE
            turma.getAtividade().setCodigo(Integer.parseInt(jTextFieldAtividade.getText()));
            fachada.cadastrar(turma);
            JOptionPane.showMessageDialog(rootPane, "Turma cadastrada com sucesso");
            //Limpar Campos preenchidos 
            jTextFieldCodTur.setText("");
            jFormattedTextFieldHorarioAulasInicio.setText("");
            jFormattedTextFieldDurAula.setText("");
            jFormattedTextFieldDtInicial.setText("");
            jFormattedTextFieldDtFinal.setText("");
            jTextFieldAtividade.setText("");
            jTextFieldInstrutor.setText("");
            jTextFieldMonitor.setText("");
            modeloMonitor.setRowCount(0);
            modeloAtividade.setRowCount(0);
            modeloInstrutor.setRowCount(0);
            jTextFieldCodTur.requestFocus(); // Retornar para o início

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }


    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void deleteRowsMonitor() {
        while (modeloMonitor.getRowCount() > 0) {
            modeloMonitor.removeRow(0);
        }
    }

    private void deleteRowsInstrutor() {
        while (modeloInstrutor.getRowCount() > 0) {
            modeloInstrutor.removeRow(0);
        }
    }

    private void deleteRowsAtividade() {
        while (modeloAtividade.getRowCount() > 0) {
            modeloAtividade.removeRow(0);
        }
    }

    private void jButtonPesquisarMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarMonitorActionPerformed
        // TODO add your handling code here:
        try {
            Turma turma = new Turma();
            //monitor
            if (jTextFieldMonitor.getText().trim().equals("") == false) {
                turma.getAluno().setMatricula(Integer.parseInt(jTextFieldMonitor.getText().trim()));
            }
            ArrayList<Aluno> resposta = fachada.listarAlunos(turma);
            deleteRowsMonitor();
            if (resposta.size() > 0) {
                for (Aluno monitor : resposta) {
                    modeloMonitor.addRow(new String[]{monitor.getMatricula() + "", monitor.getNome()});
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Não existe resultados para alunos com o filtro passado");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPesquisarMonitorActionPerformed

    private void jButtonPesquisarInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarInstrutorActionPerformed
        // TODO add your handling code here:
        try {
            Turma turma = new Turma();
            //instrutor
            if (jTextFieldInstrutor.getText().trim().equals("") == false) {
                turma.getInstrutor().setMatricula(Integer.parseInt(jTextFieldInstrutor.getText().trim()));
            }
            ArrayList<Instrutor> resposta = fachada.listarInstrutores(turma);
            deleteRowsInstrutor();
            if (resposta.size() > 0) {
                for (Instrutor ins : resposta) {
                    modeloInstrutor.addRow(new String[]{ins.getMatricula() + "", ins.getNome()});
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Não existe resultados para instrutores com o filtro passado");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPesquisarInstrutorActionPerformed

    private void jButtonPesquisarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAtividadeActionPerformed
        // TODO add your handling code here:
        try {
            Turma turma = new Turma();
            //atividade
            if (jTextFieldAtividade.getText().trim().equals("") == false) {
                turma.getAtividade().setCodigo(Integer.parseInt(jTextFieldAtividade.getText().trim()));
            }
            ArrayList<Atividade> resposta = fachada.listarAtividades(turma);
            deleteRowsAtividade();
            if (resposta.size() > 0) {
                for (Atividade atv : resposta) {
                    modeloAtividade.addRow(new String[]{atv.getCodigo() + "", atv.getDescricao()});
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Não existe resultados para atividades com o filtro passado");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPesquisarAtividadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonPesquisarAtividade;
    private javax.swing.JButton jButtonPesquisarInstrutor;
    private javax.swing.JButton jButtonPesquisarMonitor;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtFinal;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtInicial;
    private javax.swing.JFormattedTextField jFormattedTextFieldDurAula;
    private javax.swing.JFormattedTextField jFormattedTextFieldHorarioAulasInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAtividade;
    private javax.swing.JTable jTableInstrutor;
    private javax.swing.JTable jTableMonitor;
    private javax.swing.JTextField jTextFieldAtividade;
    private javax.swing.JTextField jTextFieldCodTur;
    private javax.swing.JTextField jTextFieldInstrutor;
    private javax.swing.JTextField jTextFieldMonitor;
    // End of variables declaration//GEN-END:variables

}
