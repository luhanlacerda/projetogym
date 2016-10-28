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
            
            instrutor.setMatricula(3);
            instrutor.setRg("6543210");
            instrutor.setCpf("333.333.333-33");
            instrutor.setNome("Juriscleide");
            instrutor.setDtnascimento("02/02/2002");
            instrutor.setContato("(81)9.9999-9999");
            NegocioInstrutor n = new NegocioInstrutor();
            n.cadastrar(instrutor);
            JOptionPane.showMessageDialog(null, "Instrutor atualizado com sucesso!");
            
            
            /*
            Instrutor instrutor = new Instrutor();
            instrutor.setMatricula(1);
            instrutor.setRg("6543210");
            instrutor.setCpf("987.654.321-00");
            instrutor.setNome("Juriscleide");
            instrutor.setDtnascimento("02/02/2002");
            instrutor.setContato("(81)9.9999-9999");
            NegocioInstrutor n = new NegocioInstrutor();
            n.atualizar(instrutor);
            JOptionPane.showMessageDialog(null, "Instrutor atualizado com sucesso!");
            */
                         
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
