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
import java.util.ArrayList;
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
        try {
//            
//            Dados d = new Dados();
//            d.conectar();
//            d.desconectar();
//            JOptionPane.showMessageDialog(null, "Banco de dados conectado com sucesso!");

            
           // CADASTRANDO
//            Turma t = new Turma();
//            t.setCodigo(3);
//            t.setHorario(FormatacaoDataHora.getHorario("8:00"));
//            t.setDuracaoaula(FormatacaoDataHora.getHorario("9:00"));
//            t.setDtinicial(FormatacaoDataHora.getData("06/11/2016"));
//            t.setDtfinal(FormatacaoDataHora.getData("10/11/2016"));
//            t.getInstrutor().setMatricula(1);
//            t.getAluno().setMatricula(1);
//            t.getAtividade().setCodigo(1);
//            NegocioTurma n = new NegocioTurma();
//            n.cadastrar(t);
//            JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!");
                      
            //ATUALIZANDO  
            /*Turma t = new Turma();
            t.setCodigo(1);
            t.setHorario(FormatacaoDataHora.getHorario("16:00"));
            t.setDuracaoaula(FormatacaoDataHora.getHorario("06:00"));
            t.setDtinicial(FormatacaoDataHora.getData("31/10/2016"));
            t.setDtfinal(FormatacaoDataHora.getData("01/12/2020"));
            t.getInstrutor().setMatricula(1);
            t.getAluno().setMatricula(1);
            t.getAtividade().setCodigo(1);
            
            NegocioTurma n = new NegocioTurma();
            n.atualizar(t);
            JOptionPane.showMessageDialog(null, "Turma atualizada com sucesso!");
            */
            
            //REMOVENDO
           /*  Turma t = new Turma();
             t.setCodigo(1);
             NegocioTurma n = new NegocioTurma();
             n.remover(t);
             JOptionPane.showMessageDialog(null, "Turma removida com sucesso!");
           */
           
           //LISTANDO TURMA
//             Turma turma = new Turma();
//             NegocioTurma n = new NegocioTurma();
//            ArrayList<Turma> retorno = n.listar(turma);
//            for (Turma t : retorno) {
//                JOptionPane.showMessageDialog(null, t.listarTurmas());
               
//         }

           //PESQUISANDO ALUNO MONITOR EM TURMA
           //nome, cpf, rg, contato,data matricula, data nasc, altura, peso,logradouro,numero,complemento,cep, uf, pais
            Turma t = new Turma();
            t.getAluno().setMatricula(1);
            t.getAluno().setNome("João");
            t.getAluno().setDtmatricula(FormatacaoDataHora.getData("10/12/2016"));
            
            NegocioTurma n = new NegocioTurma();
            n.pegarMonitor(t);
            JOptionPane.showMessageDialog(null, "Pesquisa realizada com sucesso!");
           
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar: " + e.getMessage());
            
        }
    }
}
