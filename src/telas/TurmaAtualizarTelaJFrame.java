/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import aluno.Aluno;
import atividade.Atividade;
import classesBasicas.FormatacaoDataHora;
import classesBasicas.MyTableModel;
import fachada.Fachada;
import instrutor.Instrutor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import turma.Turma;

/**
 *
 * @author Luhan
 */
public class TurmaAtualizarTelaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TurmaAtualizarJFrame
     */
    Fachada fachada = new Fachada();
    MyTableModel modeloInstrutor = new MyTableModel(), modeloAtividade = new MyTableModel(), modeloMonitor = new MyTableModel();
    ArrayList<Instrutor> instrutores = new ArrayList<>();
    ArrayList<Aluno> monitores = new ArrayList<>();
    ArrayList<Atividade> atividades = new ArrayList<>();

    public TurmaAtualizarTelaJFrame(Turma turma) {
        initComponents();
        this.setLocationRelativeTo(null);
        jTableInstrutor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      //permite selecionar apenas uma linha
        modeloInstrutor.setColumnIdentifiers(new String[]{"Matrícula", "Nome"});
        carregarInstrutores();
        jTableInstrutor.setModel(modeloInstrutor);
        jTableMonitor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modeloMonitor.setColumnIdentifiers(new String[]{"Matrícula", "Nome"});
        carregarMonitores();
        jTableMonitor.setModel(modeloMonitor);
        jTableAtividade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modeloAtividade.setColumnIdentifiers(new String[]{"Código", "Descrição"});
        carregarAtividades();
        jTableAtividade.setModel(modeloAtividade);
        jTextFieldCodTur.setText(turma.getCodigo() + "");
        jFormattedTextFieldDtFinal.setText(FormatacaoDataHora.dateToString(turma.getDtfinal()));           //converte de date para string
        jFormattedTextFieldDtInicial.setText(FormatacaoDataHora.dateToString(turma.getDtinicial()));      //converte de date para string
        jFormattedTextFieldDurAula.setText(turma.getDuracaoaula() + "");
        jFormattedTextFieldHorarioAulas.setText(turma.getHorario() + "");
        jTextFieldAtividade.setText(turma.getAtividade().getCodigo() + "");
        jTextFieldInstrutor.setText(turma.getInstrutor().getMatricula() + "");
        jTextFieldMonitor.setText(turma.getAluno().getMatricula() + "");
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
        jTextFieldCodTur = new classesBasicas.JTextFieldSomenteNumeros();
        jFormattedTextFieldHorarioAulas = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDurAula = new javax.swing.JFormattedTextField();
        jTextFieldMonitor = new classesBasicas.JTextFieldSomenteNumeros();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldInstrutor = new classesBasicas.JTextFieldSomenteNumeros();
        jFormattedTextFieldDtInicial = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDtFinal = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAtividade = new classesBasicas.JTextFieldSomenteNumeros();
        jLabel9 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableInstrutor = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableMonitor = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableAtividade = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Turma Atualizar");

        jLabel1.setText("Codigo Turma: ");

        jTextFieldCodTur.setEditable(false);
        jTextFieldCodTur.setBackground(new java.awt.Color(204, 204, 204));

        try {
            jFormattedTextFieldHorarioAulas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldDurAula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTextFieldMonitor.setEditable(false);
        jTextFieldMonitor.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setText("Matrícula Monitor:");

        jLabel8.setText("Matrícula Instrutor:");

        jTextFieldInstrutor.setEditable(false);
        jTextFieldInstrutor.setBackground(new java.awt.Color(204, 204, 204));

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

        jLabel6.setText("Data Final:");

        jLabel5.setText("Data Inicial:");

        jLabel4.setText("Duração Aula:");

        jLabel3.setText("Horário da Aula:");

        jTextFieldAtividade.setEditable(false);
        jTextFieldAtividade.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAtividadeActionPerformed(evt);
            }
        });

        jLabel9.setText("Código Atividade:");

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_refresh.png"))); // NOI18N
        jButtonCadastrar.setText("Atualizar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

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
        jTableInstrutor.getTableHeader().setReorderingAllowed(false);
        jTableInstrutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInstrutorMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableInstrutor);

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
        jTableMonitor.getTableHeader().setReorderingAllowed(false);
        jTableMonitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMonitorMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableMonitor);

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
        jTableAtividade.getTableHeader().setReorderingAllowed(false);
        jTableAtividade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAtividadeMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableAtividade);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldMonitor)
                                    .addComponent(jTextFieldInstrutor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldCodTur, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jFormattedTextFieldDtFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                .addComponent(jFormattedTextFieldDtInicial, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jFormattedTextFieldHorarioAulas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(jFormattedTextFieldDurAula, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldAtividade, jTextFieldCodTur, jTextFieldInstrutor, jTextFieldMonitor});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane4, jScrollPane5, jScrollPane6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCodTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextFieldHorarioAulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedTextFieldDurAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedTextFieldDtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jFormattedTextFieldDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldAtividade, jTextFieldCodTur, jTextFieldInstrutor, jTextFieldMonitor});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane4, jScrollPane5, jScrollPane6});

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

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        try {
            //DADOS DA TURMA
            Turma turma = new Turma();
            turma.setCodigo(Integer.parseInt(jTextFieldCodTur.getText()));
            turma.setHorario(FormatacaoDataHora.stringToTime(jFormattedTextFieldHorarioAulas.getText()));
            turma.setDuracaoaula(FormatacaoDataHora.stringToTime(jFormattedTextFieldDurAula.getText()));
            turma.setDtinicial(FormatacaoDataHora.stringToDate(jFormattedTextFieldDtInicial.getText()));
            turma.setDtfinal(FormatacaoDataHora.stringToDate(jFormattedTextFieldDtFinal.getText()));
            //DADOS DE ALUNO(MONITOR)
            turma.getAluno().setMatricula(Integer.parseInt(jTextFieldMonitor.getText()));
            //DADOS DE INSTRUTOR
            turma.getInstrutor().setMatricula(Integer.parseInt(jTextFieldInstrutor.getText()));
            //DADOS DE ATIVIDADE
            turma.getAtividade().setCodigo(Integer.parseInt(jTextFieldAtividade.getText()));
            Fachada fachada = new Fachada();
            fachada.atualizar(turma);
            JOptionPane.showMessageDialog(rootPane, "Turma atualizada com sucesso");
            dispose();      //fecha a tela após clicar no OK de turma atualizada com sucesso.

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAtividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAtividadeActionPerformed

    private void jTableInstrutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInstrutorMouseClicked
        // TODO add your handling code here:
        int row = jTableInstrutor.getSelectedRow();
        if (row > -1) {
            jTextFieldInstrutor.setText(instrutores.get(row).getMatricula() + "");
        }
    }//GEN-LAST:event_jTableInstrutorMouseClicked

    private void jTableMonitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMonitorMouseClicked
        // TODO add your handling code here:
        int row = jTableMonitor.getSelectedRow();
        if (row > -1) {
            jTextFieldMonitor.setText(monitores.get(row).getMatricula() + "");
        }
    }//GEN-LAST:event_jTableMonitorMouseClicked

    private void jTableAtividadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAtividadeMouseClicked
        // TODO add your handling code here:
        int row = jTableAtividade.getSelectedRow();
        if (row > -1) {
            jTextFieldAtividade.setText(atividades.get(row).getCodigo() + "");
        }

    }//GEN-LAST:event_jTableAtividadeMouseClicked

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
            java.util.logging.Logger.getLogger(TurmaAtualizarTelaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TurmaAtualizarTelaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TurmaAtualizarTelaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TurmaAtualizarTelaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TurmaAtualizarTelaJFrame(new Turma()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtFinal;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtInicial;
    private javax.swing.JFormattedTextField jFormattedTextFieldDurAula;
    private javax.swing.JFormattedTextField jFormattedTextFieldHorarioAulas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableAtividade;
    private javax.swing.JTable jTableInstrutor;
    private javax.swing.JTable jTableMonitor;
    private javax.swing.JTextField jTextFieldAtividade;
    private javax.swing.JTextField jTextFieldCodTur;
    private javax.swing.JTextField jTextFieldInstrutor;
    private javax.swing.JTextField jTextFieldMonitor;
    // End of variables declaration//GEN-END:variables

    private void carregarInstrutores() {
        modeloInstrutor.setRowCount(0);
        try {
            instrutores = fachada.listarInstrutores(new Turma());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        if (instrutores.size() > 0) {
            for (Instrutor ins : instrutores) {
                modeloInstrutor.addRow(new String[]{ins.getMatricula() + "", ins.getNome()});
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não existe resultados para instrutor com o filtro passado");
        }
    }

    private void carregarMonitores() {
        modeloMonitor.setRowCount(0);
        try {
            monitores = fachada.listarAlunos(new Turma());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        if (monitores.size() > 0) {
            for (Aluno monitor : monitores) {
                modeloMonitor.addRow(new String[]{monitor.getMatricula() + "", monitor.getNome()});
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não existe resultados para monitor com o filtro passado");
        }

    }

    private void carregarAtividades() {
        modeloAtividade.setRowCount(0);
        try {
            atividades = fachada.listarAtividades(new Turma());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        if (atividades.size() > 0) {
            for (Atividade atv : atividades) {
                modeloAtividade.addRow(new String[]{atv.getCodigo() + "", atv.getDescricao()});
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não existe resultados para monitor com o filtro passado");
        }
    }
}
