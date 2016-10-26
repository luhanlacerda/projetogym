/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrutor;

import java.util.ArrayList;

/**
 *
 * @author Luhan
 */
public class NegocioInstrutor implements InterfaceInstrutor {

    @Override
    public void cadastrar(Instrutor i) throws Exception {
        if(i.getMatricula() <= 0){
        throw new Exception("Matrícula inválida");
        }
        if(i.getRg() == null || i.getRg().trim().equals("")){
            throw new Exception("Número de RG inválido");
        }
        if(i.getCpf() == null || i.getCpf().trim().equals("") || i.getCpf().trim().length() < 13){
            throw new Exception("Número de CPF inválido");
        }
        if(i.getNome() == null || i.getNome().trim().equals("")){
            throw new Exception("Informar nome");
        }
        if(i.getDtnascimento() == null){
            throw new Exception("Informar data de nascimento");
        }
        if(i.getContato().trim().equals("") || i.getContato() == null || i.getContato().trim().length() < 14){
            throw new Exception("Informar número de contato");
        }
        //Cadastrando
        DadosInstrutor dadosinstrutor = new DadosInstrutor();
        dadosinstrutor.cadastrar(i);
    }

    @Override
    public void atualizar(Instrutor i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Instrutor i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Instrutor> listar(Instrutor filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarExistencia(Instrutor i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}