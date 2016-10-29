/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoBD;

import classesBasicas.FormatacaoDataHora;
import dados.Dados;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import turma.NegocioTurma;
import turma.Turma;

/**
 *
 * @author Luhan
 */
public class ConexaoBDElaine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
            // TODO code application logic here
//    try {
//            
//            Dados d = new Dados();
//            d.conectar();
//            d.desconectar();
//            JOptionPane.showMessageDialog(null, "Banco de dados conectado com sucesso!");
//            
//            
            
            //CADASTRANDO
//            Turma t = new Turma();
//            t.setCodigo(3);
//            t.setHorario(FormatacaoDataHora.getHorario("11:00"));
//            t.setDuracaoaula(FormatacaoDataHora.getHorario("01:00"));
//            t.setDtinicial(FormatacaoDataHora.getData("28/10/2016"));
//            t.setDtfinal(FormatacaoDataHora.getData("28/11/2016"));
//            t.getInstrutor().setMatricula(1);
//            t.getAluno().setMatricula(1);
//            t.getAtividade().setCodigo(1);
//            NegocioTurma n = new NegocioTurma();
//            n.cadastrar(t);
//            JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!");
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        
//         try {
            /*
            Dados d = new Dados();
            d.conectar();
            d.desconectar();
            JOptionPane.showMessageDialog(null, "Banco de dados conectado com sucesso!");
            */
            
            
            //CADASTRANDO
           /* Turma t = new Turma();
            t.setCodigo(3);
            t.setHorario(FormatacaoDataHora.getHorario("11:00"));
            t.setDuracaoaula(FormatacaoDataHora.getHorario("01:00"));
            t.setDtinicial(FormatacaoDataHora.getData("28/10/2016"));
            t.setDtfinal(FormatacaoDataHora.getData("28/11/2016"));
            t.getInstrutor().setMatricula(1);
            t.getAluno().setMatricula(1);
            t.getAtividade().setCodigo(1);
            NegocioTurma n = new NegocioTurma();
            n.cadastrar(t);
            JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
        }
        */
         
         try {
            //ATUALIZANDO  -- esta adicionando e não atualizando
            Turma t = new Turma();
            t.setCodigo(8);
            t.setHorario(FormatacaoDataHora.getHorario("15:00"));
            t.setDuracaoaula(FormatacaoDataHora.getHorario("05:00"));
            t.setDtinicial(FormatacaoDataHora.getData("25/10/2016"));
            t.setDtfinal(FormatacaoDataHora.getData("25/11/2016"));
            t.getInstrutor().setMatricula(1);
            t.getAluno().setMatricula(1);
            t.getAtividade().setCodigo(1);
            NegocioTurma n = new NegocioTurma();
            n.atualizar(t);
            JOptionPane.showMessageDialog(null, "Turma atualizada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
//     
    // REMOVENDO
     
    
    }
    }
}

    
    
    
    
    

    
    
   
