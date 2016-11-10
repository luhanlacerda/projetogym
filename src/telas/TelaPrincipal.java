/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;



/**
 *
 * @author aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
       // conecta.conexao(); // conecta é o objeto que chama a conexão (com o banco)
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneTelaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemArquivoSair = new javax.swing.JMenuItem();
        jMenuAluno = new javax.swing.JMenu();
        jMenuItemAlunoCadastrar = new javax.swing.JMenuItem();
        jMenuItemAlunoAtualizar = new javax.swing.JMenuItem();
        jMenuItemAlunoConsultar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemTurmaCadastrar = new javax.swing.JMenuItem();
        jMenuItemTurmaAtualizar = new javax.swing.JMenuItem();
        jMenuItemTurmaConsultar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAtividade = new javax.swing.JMenu();
        jMenuItemAtividadeCadastrar = new javax.swing.JMenuItem();
        jMenuItemAtividadeAtualizar = new javax.swing.JMenuItem();
        jMenuItemAtividadeConsultar = new javax.swing.JMenuItem();
        jMenuInstrutor = new javax.swing.JMenu();
        jMenuItemInstrutorCadastrar = new javax.swing.JMenuItem();
        jMenuItemInstrutorAtualizar = new javax.swing.JMenuItem();
        jMenuItemInstrutorConsultar = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        javax.swing.GroupLayout jDesktopPaneTelaPrincipalLayout = new javax.swing.GroupLayout(jDesktopPaneTelaPrincipal);
        jDesktopPaneTelaPrincipal.setLayout(jDesktopPaneTelaPrincipalLayout);
        jDesktopPaneTelaPrincipalLayout.setHorizontalGroup(
            jDesktopPaneTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPaneTelaPrincipalLayout.setVerticalGroup(
            jDesktopPaneTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_view_list.png"))); // NOI18N
        jMenuArquivo.setText("Arquivo");

        jMenuItemArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        jMenuItemArquivoSair.setText("Sair");
        jMenuItemArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemArquivoSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemArquivoSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group.png"))); // NOI18N
        jMenuAluno.setText("Aluno");

        jMenuItemAlunoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jMenuItemAlunoCadastrar.setText("Cadastrar");
        jMenuItemAlunoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoCadastrarActionPerformed(evt);
            }
        });
        jMenuAluno.add(jMenuItemAlunoCadastrar);

        jMenuItemAlunoAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_refresh.png"))); // NOI18N
        jMenuItemAlunoAtualizar.setText("Atualizar");
        jMenuItemAlunoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoAtualizarActionPerformed(evt);
            }
        });
        jMenuAluno.add(jMenuItemAlunoAtualizar);

        jMenuItemAlunoConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png"))); // NOI18N
        jMenuItemAlunoConsultar.setText("Consultar");
        jMenuItemAlunoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoConsultarActionPerformed(evt);
            }
        });
        jMenuAluno.add(jMenuItemAlunoConsultar);

        jMenuBar1.add(jMenuAluno);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/text_padding_left.png"))); // NOI18N
        jMenu3.setText("Turma");

        jMenuItemTurmaCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jMenuItemTurmaCadastrar.setText("Cadastrar");
        jMenuItemTurmaCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTurmaCadastrarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTurmaCadastrar);

        jMenuItemTurmaAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_refresh_1.png"))); // NOI18N
        jMenuItemTurmaAtualizar.setText("Atualizar");
        jMenuItemTurmaAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTurmaAtualizarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTurmaAtualizar);

        jMenuItemTurmaConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png"))); // NOI18N
        jMenuItemTurmaConsultar.setText("Consultar");
        jMenuItemTurmaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTurmaConsultarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTurmaConsultar);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_add_1.png"))); // NOI18N
        jMenuItem1.setText("Inserir Aluno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenuAtividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/text_list_bullets.png"))); // NOI18N
        jMenuAtividade.setText("Atividade");

        jMenuItemAtividadeCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jMenuItemAtividadeCadastrar.setText("Cadastrar");
        jMenuItemAtividadeCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtividadeCadastrarActionPerformed(evt);
            }
        });
        jMenuAtividade.add(jMenuItemAtividadeCadastrar);

        jMenuItemAtividadeAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_refresh_1.png"))); // NOI18N
        jMenuItemAtividadeAtualizar.setText("Atualizar");
        jMenuItemAtividadeAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtividadeAtualizarActionPerformed(evt);
            }
        });
        jMenuAtividade.add(jMenuItemAtividadeAtualizar);

        jMenuItemAtividadeConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png"))); // NOI18N
        jMenuItemAtividadeConsultar.setText("Consultar");
        jMenuItemAtividadeConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtividadeConsultarActionPerformed(evt);
            }
        });
        jMenuAtividade.add(jMenuItemAtividadeConsultar);

        jMenuBar1.add(jMenuAtividade);

        jMenuInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_gray.png"))); // NOI18N
        jMenuInstrutor.setText("Instrutor");

        jMenuItemInstrutorCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jMenuItemInstrutorCadastrar.setText("Cadastrar");
        jMenuItemInstrutorCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInstrutorCadastrarActionPerformed(evt);
            }
        });
        jMenuInstrutor.add(jMenuItemInstrutorCadastrar);

        jMenuItemInstrutorAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_refresh_1.png"))); // NOI18N
        jMenuItemInstrutorAtualizar.setText("Atualizar");
        jMenuItemInstrutorAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInstrutorAtualizarActionPerformed(evt);
            }
        });
        jMenuInstrutor.add(jMenuItemInstrutorAtualizar);

        jMenuItemInstrutorConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png"))); // NOI18N
        jMenuItemInstrutorConsultar.setText("Consultar");
        jMenuItemInstrutorConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInstrutorConsultarActionPerformed(evt);
            }
        });
        jMenuInstrutor.add(jMenuItemInstrutorConsultar);

        jMenuBar1.add(jMenuInstrutor);

        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/world.png"))); // NOI18N
        jMenuSobre.setText("Sobre");
        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneTelaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneTelaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlunoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoCadastrarActionPerformed
        // LIGAÇÃO DA TELA ALUNO A TELA PRINCIPAL
        AlunoCadastrarTela telaCadastroAluno = new AlunoCadastrarTela();
        jDesktopPaneTelaPrincipal.add(telaCadastroAluno);
        telaCadastroAluno.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItemAlunoCadastrarActionPerformed

    private void jMenuItemTurmaCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTurmaCadastrarActionPerformed
        //  LIGAÇÃO DA TELA TURMA A TELA PRINCIPAL
        TurmaCadastrarTela telaCadastroTurma = new  TurmaCadastrarTela();
        jDesktopPaneTelaPrincipal.add(telaCadastroTurma);
        telaCadastroTurma.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemTurmaCadastrarActionPerformed

    private void jMenuItemAtividadeCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtividadeCadastrarActionPerformed
        // LIGAÇÃO DA TELA ATIVIDADE A TELA PRINCIPAL
        AtividadeCadastrarTela telaCadastroAtividade = new AtividadeCadastrarTela();
        jDesktopPaneTelaPrincipal.add(telaCadastroAtividade);
        telaCadastroAtividade.setVisible(true);
    }//GEN-LAST:event_jMenuItemAtividadeCadastrarActionPerformed

    private void jMenuItemInstrutorCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInstrutorCadastrarActionPerformed
        // LIGAÇÃO DA TELA INSTRUTOR A TELA PRINCIPAL
        InstrutorCadastrarTela telaCadastroInstrutor = new InstrutorCadastrarTela();
        jDesktopPaneTelaPrincipal.add(telaCadastroInstrutor);
        telaCadastroInstrutor.setVisible(true);
    }//GEN-LAST:event_jMenuItemInstrutorCadastrarActionPerformed

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed
        // LIGAÇÃO DA TELA SOBRE A TELA PRINCIPAL
        TelaSobre telaSobre = new TelaSobre();
        jDesktopPaneTelaPrincipal.add(telaSobre);
        telaSobre.setVisible(true);
    }//GEN-LAST:event_jMenuSobreActionPerformed

    private void jMenuItemArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemArquivoSairActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jMenuItemArquivoSairActionPerformed

    private void jMenuItemAtividadeAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtividadeAtualizarActionPerformed
        AtividadeAtualizarTela atividadeAtualizarTela = new AtividadeAtualizarTela();
        jDesktopPaneTelaPrincipal.add(atividadeAtualizarTela);
        atividadeAtualizarTela.setVisible(true);
    }//GEN-LAST:event_jMenuItemAtividadeAtualizarActionPerformed

    private void jMenuItemAlunoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoAtualizarActionPerformed
       AlunoAtualizarTela alunoAtualizarTela = new AlunoAtualizarTela();
       jDesktopPaneTelaPrincipal.add(alunoAtualizarTela);
       alunoAtualizarTela.setVisible(true);
  
    }//GEN-LAST:event_jMenuItemAlunoAtualizarActionPerformed

    private void jMenuItemAlunoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoConsultarActionPerformed
       AlunoConsultarTela alunoConsultarTela = new AlunoConsultarTela();
       jDesktopPaneTelaPrincipal.add(alunoConsultarTela);
       alunoConsultarTela.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemAlunoConsultarActionPerformed

    private void jMenuItemTurmaAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTurmaAtualizarActionPerformed
        TurmaAtualizarTela turmaAtualizarTela = new TurmaAtualizarTela();
        jDesktopPaneTelaPrincipal.add(turmaAtualizarTela);
        turmaAtualizarTela.setVisible(true);
       
    }//GEN-LAST:event_jMenuItemTurmaAtualizarActionPerformed

    private void jMenuItemTurmaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTurmaConsultarActionPerformed
         TurmaConsultarTela turmaConsultarTela = new TurmaConsultarTela();
         jDesktopPaneTelaPrincipal.add(turmaConsultarTela);
         turmaConsultarTela.setVisible(true);
    }//GEN-LAST:event_jMenuItemTurmaConsultarActionPerformed

    private void jMenuItemAtividadeConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtividadeConsultarActionPerformed
       AtividadeConsultarTela atividadeConsultarTela = new AtividadeConsultarTela();
       jDesktopPaneTelaPrincipal.add(atividadeConsultarTela);
       atividadeConsultarTela.setVisible(true);
    }//GEN-LAST:event_jMenuItemAtividadeConsultarActionPerformed

    private void jMenuItemInstrutorAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInstrutorAtualizarActionPerformed
       InstrutorAtualizarTela instrutorAtualizarTela = new InstrutorAtualizarTela();
       jDesktopPaneTelaPrincipal.add(instrutorAtualizarTela);
       instrutorAtualizarTela.setVisible(true);
    }//GEN-LAST:event_jMenuItemInstrutorAtualizarActionPerformed

    private void jMenuItemInstrutorConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInstrutorConsultarActionPerformed
        InstrutorConsultarTela instrutorConsultarTela = new InstrutorConsultarTela();
        jDesktopPaneTelaPrincipal.add(instrutorConsultarTela);
        instrutorConsultarTela.setVisible(true);
    }//GEN-LAST:event_jMenuItemInstrutorConsultarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        TurmaInserirAlunoTela turmaInserirAlunoTela = new TurmaInserirAlunoTela();
        jDesktopPaneTelaPrincipal.add(turmaInserirAlunoTela);
        turmaInserirAlunoTela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JDesktopPane jDesktopPaneTelaPrincipal;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuAluno;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenu jMenuAtividade;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInstrutor;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAlunoAtualizar;
    private javax.swing.JMenuItem jMenuItemAlunoCadastrar;
    private javax.swing.JMenuItem jMenuItemAlunoConsultar;
    private javax.swing.JMenuItem jMenuItemArquivoSair;
    private javax.swing.JMenuItem jMenuItemAtividadeAtualizar;
    private javax.swing.JMenuItem jMenuItemAtividadeCadastrar;
    private javax.swing.JMenuItem jMenuItemAtividadeConsultar;
    private javax.swing.JMenuItem jMenuItemInstrutorAtualizar;
    private javax.swing.JMenuItem jMenuItemInstrutorCadastrar;
    private javax.swing.JMenuItem jMenuItemInstrutorConsultar;
    private javax.swing.JMenuItem jMenuItemTurmaAtualizar;
    private javax.swing.JMenuItem jMenuItemTurmaCadastrar;
    private javax.swing.JMenuItem jMenuItemTurmaConsultar;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables
}
