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

        if (i.getMatricula() <= 0) {
            throw new Exception("Matrícula inválida");
        }
        if(verificarExistenciaMatricula(i) != false){
            throw new Exception("A matrícula informada já está cadastrada no sistema.");
        }
        if (i.getRg() == null || i.getRg().trim().equals("")) {
            throw new Exception("Número de RG inválido");
        }
        if (i.getCpf() == null || i.getCpf().trim().equals("") || i.getCpf().trim().length() < 13) {
            throw new Exception("Número de CPF inválido");
        }
        if (i.getNome() == null || i.getNome().trim().equals("")) {
            throw new Exception("Informar nome");
        }
        if (i.getDtnascimento() == null) {
            throw new Exception("Informar data de nascimento");
        }
        if (i.getContato().trim().equals("") || i.getContato() == null || i.getContato().trim().length() < 14) {
            throw new Exception("Informar número de contato");
        }
        /*
        if(verificarExistenciaCpf(i) != false){
            throw new Exception("O Cpf informado já está cadastrado no sistema.");
        }
        */
        //Cadastrando
        DadosInstrutor d = new DadosInstrutor();
        d.cadastrar(i);
    }

    @Override
    public void atualizar(Instrutor i) throws Exception {
        DadosInstrutor d = new DadosInstrutor();
        d.atualizar(i);
    }

    @Override
    public void remover(Instrutor i) throws Exception {
        DadosInstrutor d = new DadosInstrutor();
        d.remover(i);
    }

    @Override
    public ArrayList<Instrutor> listar(Instrutor filtro) throws Exception {
        DadosInstrutor d = new DadosInstrutor();
        return d.listar(filtro);
    }

    @Override
    public boolean verificarExistenciaMatricula(Instrutor i) throws Exception {
        DadosInstrutor d = new DadosInstrutor();
        return d.verificarExistenciaMatricula(i);
    }

    
       
    public int pegarMatricula() throws Exception {
        DadosInstrutor d = new DadosInstrutor();
        return d.pegarMatricula();
    }

    @Override
    public boolean verificarExistenciaCpf(Instrutor i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
