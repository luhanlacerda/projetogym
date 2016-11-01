/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoBD;

import aluno.Aluno;
import aluno.NegocioAluno;
import classesBasicas.FormatacaoDataHora;
import dados.Dados;
import instrutor.Instrutor;
import instrutor.NegocioInstrutor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luhan
 */
public class ConexaoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            /*
            Dados d = new Dados();
            d.conectar();
            d.desconectar();
            JOptionPane.showMessageDialog(null, "Banco de dados conectado com sucesso!");
             */

            /*
            //CADASTRO INSTRUTOR
            Instrutor instrutor = new Instrutor();            
            instrutor.setMatricula(2);
            instrutor.setRg("6543210");
            instrutor.setCpf("333.333.333-33");
            instrutor.setNome("Mirosmar");
            instrutor.setDtnascimento(FormatacaoDataHora.getData("02/02/2002"));
            instrutor.setContato("(81)9.9999-9999");
            NegocioInstrutor n = new NegocioInstrutor();
            n.cadastrar(instrutor);
            JOptionPane.showMessageDialog(null, "Instrutor cadastrado com sucesso!");
             */
            
            /*
            //ATUALIZAR INSTRUTOR
            Instrutor instrutor = new Instrutor();
            instrutor.setMatricula(1);
            instrutor.setRg("6543210");
            instrutor.setCpf("987.654.321-00");
            instrutor.setNome("Mirosmar");
            instrutor.setDtnascimento("02/02/2002");
            instrutor.setContato("(81)9.9999-9999");
            NegocioInstrutor n = new NegocioInstrutor();
            n.atualizar(instrutor);
            JOptionPane.showMessageDialog(null, "Instrutor atualizado com sucesso!");
            */
 
            /*
            //DELETAR INSTRUTOR
            Instrutor instrutor = new Instrutor();
            instrutor.setMatricula(2);
            NegocioInstrutor n = new NegocioInstrutor();
            n.remover(instrutor);
            JOptionPane.showMessageDialog(null, "Instrutor removido com sucesso!");
            */
            
            
            //LISTAR INSTRUTOR
            Instrutor instrutor = new Instrutor();
            NegocioInstrutor n = new NegocioInstrutor();
            ArrayList<Instrutor> retorno = n.listar(instrutor);
            for (Instrutor i : retorno) {
                JOptionPane.showMessageDialog(null, i.listarInstrutores());
            } 
            
            
            /*
            Aluno a = new Aluno();
            a.setNome("Mago");
            a.setMatricula(2);
            a.setDtmatricula("25/10/2016");
            a.setAltura((float) 1.80);
            a.setPeso(83);
            a.getEndereco().setLogradouro("Rua 01");
            a.getEndereco().setNumero("10");
            a.getEndereco().setComplemento("Ap 01");
            a.getEndereco().setCep("01234567");
            a.getEndereco().setBairro("Casa Forte");
            a.getEndereco().setCidade("Hellcife");
            a.getEndereco().setUf("Pernambuco");
            a.getEndereco().setPais("Brasil");
            a.setRg("123456");
            a.setCpf("01234567890");
            a.setContato("(81)9.9999-9999");
            a.setDtnascimento("01/01/2001");
            NegocioAluno n = new NegocioAluno();
            n.cadastrar(a);
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
             */
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
