/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ELAINE
 */
public class TelaCadastroTurma extends javax.swing.JInternalFrame {
ArrayList<Turma> ListaTurma = new ArrayList<>();
    
    
    /**
     * Creates new form TelaCadastroTurma
     */
    public TelaCadastroTurma() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCodTur = new javax.swing.JTextField();
        jTextFieldNumAlunos = new javax.swing.JTextField();
        jTextFieldMatAluno = new javax.swing.JTextField();
        jTextFieldMatInst = new javax.swing.JTextField();
        jTextFieldCodAtiv = new javax.swing.JTextField();
        jFormattedTextFieldDurAula = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDtInicial = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDtFinal = new javax.swing.JFormattedTextField();
        jFormattedTextFieldHorarioAulasInicio = new javax.swing.JFormattedTextField();
        jFormattedTextFieldHorarioAulasFinal = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Turma");

        jLabel1.setText("Codigo Turma: ");

        jLabel2.setText("Número de Alunos:");

        jLabel3.setText("Horário de Aulas:");

        jLabel4.setText("Duração Aula:");

        jLabel5.setText("Data Inicial:");

        jLabel6.setText("Data Final:");

        jLabel7.setText("Matrícula Monitor:");

        jLabel8.setText("Matrícula Instrutor:");

        jLabel9.setText("Código Atividade:");

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

        try {
            jFormattedTextFieldHorarioAulasFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setText("ás");

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");

        jButtonDeletar.setText("Deletar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldDtInicial)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDurAula, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldHorarioAulasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldHorarioAulasFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCodTur, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumAlunos))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMatInst))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldMatAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCodAtiv))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDeletar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFormattedTextFieldDtFinal, jFormattedTextFieldDtInicial, jFormattedTextFieldDurAula, jFormattedTextFieldHorarioAulasFinal, jFormattedTextFieldHorarioAulasInicio});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldCodAtiv, jTextFieldMatAluno, jTextFieldMatInst});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldCodTur, jTextFieldNumAlunos});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButtonDeletar, jButtonEditar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCodTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMatAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNumAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldMatInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCodAtiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldHorarioAulasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldHorarioAulasFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldDurAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldDtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonDeletar))
                .addGap(30, 30, 30))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jFormattedTextFieldDtFinal, jFormattedTextFieldDtInicial, jFormattedTextFieldDurAula});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldCodAtiv, jTextFieldMatAluno, jTextFieldMatInst});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldCodTur, jTextFieldNumAlunos});

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if (jTextFieldCodTur.getText().equals("")){
            jTextFieldCodTur.setVisible(true);
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Codigo da turma. ", "AVISO", JOptionPane.WARNING_MESSAGE);
              jTextFieldCodTur.requestFocus();
            
        }else if (jTextFieldNumAlunos.getText().equals("")){
            jTextFieldNumAlunos.setVisible(true);
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Número de Alunos. ", "AVISO", JOptionPane.WARNING_MESSAGE);
            jTextFieldNumAlunos.requestFocus();
       
        }else if (jTextFieldMatInst.getText().equals("")){
            jTextFieldMatInst.setVisible(isIcon);
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Matrícula do Instrutor. ", "AVISO", JOptionPane.WARNING_MESSAGE);
            jTextFieldMatInst.requestFocus();
            
            
        }else if (jTextFieldCodAtiv.getText().equals("")){
            jTextFieldCodAtiv.setVisible(true);
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Código da Atividade. ", "AVISO", JOptionPane.WARNING_MESSAGE);
            jTextFieldCodAtiv.requestFocus();
            
            
        }else if (jFormattedTextFieldDurAula.getText().equals("  :  ")){
            jFormattedTextFieldDurAula.setVisible(true);{
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Duração da Aula.", "AVISO", JOptionPane.WARNING_MESSAGE);
             jFormattedTextFieldDurAula.requestFocus();
        }
            
        } else if (jFormattedTextFieldHorarioAulasInicio.getText().equals("  :  ")){
            jFormattedTextFieldHorarioAulasInicio.setVisible(true);
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Horário das Aula.", "AVISO", JOptionPane.WARNING_MESSAGE);
            jFormattedTextFieldHorarioAulasInicio.requestFocus();
            
        }else if (jFormattedTextFieldHorarioAulasFinal.getText().equals("  :  ")){
            jFormattedTextFieldHorarioAulasFinal.setVisible(true);
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Horário das Aula.", "AVISO", JOptionPane.WARNING_MESSAGE);
            jFormattedTextFieldHorarioAulasFinal.requestFocus();
            
        }else if (jFormattedTextFieldDtInicial.getText().equals("  /  /    ")){
            jFormattedTextFieldDtInicial.setVisible(true);
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Data Inicial.", "AVISO", JOptionPane.WARNING_MESSAGE);
            jFormattedTextFieldDtInicial.requestFocus();
            
        }else if (jFormattedTextFieldDtFinal.getText().equals("  /  /    ")){
            jFormattedTextFieldDtFinal.setVisible(true);
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Data Final.", "AVISO", JOptionPane.WARNING_MESSAGE);
            jFormattedTextFieldDtFinal.requestFocus();
        
        }else { 
            
            Turma turma = new Turma();
            ListaTurma.add(turma);
            JOptionPane.showMessageDialog(null, "Turma Cadastrada com Sucesso!");
            
            jTextFieldCodAtiv.setText("");
            jTextFieldCodTur.setText("");
            jTextFieldMatAluno.setText("");
            jTextFieldMatInst.setText("");
            jTextFieldNumAlunos.setText("");
            jFormattedTextFieldDtFinal.setText("");
            jFormattedTextFieldDtInicial.setText("");
            jFormattedTextFieldDurAula.setText("");
            jFormattedTextFieldHorarioAulasFinal.setText("");
            jFormattedTextFieldHorarioAulasInicio.setText("");
            jTextFieldCodTur.requestFocus();
            
            
        
            
            
            
        }
        
       
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtFinal;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtInicial;
    private javax.swing.JFormattedTextField jFormattedTextFieldDurAula;
    private javax.swing.JFormattedTextField jFormattedTextFieldHorarioAulasFinal;
    private javax.swing.JFormattedTextField jFormattedTextFieldHorarioAulasInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodAtiv;
    private javax.swing.JTextField jTextFieldCodTur;
    private javax.swing.JTextField jTextFieldMatAluno;
    private javax.swing.JTextField jTextFieldMatInst;
    private javax.swing.JTextField jTextFieldNumAlunos;
    // End of variables declaration//GEN-END:variables

    private static class Turma {

        public Turma() {
        }
    }
}
