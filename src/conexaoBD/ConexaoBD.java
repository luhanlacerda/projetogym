/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoBD;

import aluno.Aluno;
import aluno.NegocioAluno;
import dados.Dados;
import instrutor.Instrutor;
import instrutor.NegocioInstrutor;
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
            
            Instrutor instrutor = new Instrutor();
            instrutor.setMatricula(1);
            instrutor.setRg("123456");
            instrutor.setCpf("012.345.678-90");
            instrutor.setNome("Anderson");
            instrutor.setDtnascimento("02/02/1991");
            instrutor.setContato("(81)9.8888-8888");
            NegocioInstrutor negocioinstrutor = new NegocioInstrutor();
            negocioinstrutor.cadastrar(instrutor);
            JOptionPane.showMessageDialog(null, "Instutor cadastrado com sucesso!");
            
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
