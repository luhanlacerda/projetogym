/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import java.util.ArrayList;

/**
 *
 * @author ELAINE
 */
public class NegocioAluno implements InterfaceAluno {

    @Override
    public void cadastrar(Aluno a) throws Exception {

        //Validações
        if (a.getMatricula() <= 0) {
            throw new Exception("A matricula deverá ser superior a zero");
        }
        if (a.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome do aluno");
        }
        if (a.getNome() == null) {
            throw new Exception("Informar o nome do aluno");
        }
        if (a.getNome().trim().length() > 100) {
            throw new Exception("O nome do aluno não poderá ter mais de 100 caracteres");
        }
        if (a.getAltura() <= 0) {
            throw new Exception("A altura é inválida");
        }
        if (a.getCpf().trim().length() < 11) {
            throw new Exception("Número de CPF inválido");
        }
        if (a.getCpf().trim().length() > 11) {
            throw new Exception("Número de CPF inválido");
        }
        if (a.getContato().trim().length() < 14) {
            throw new Exception("Número de telefone inválido");
        }
        if (a.getDtmatricula().trim().equals("")) {
            throw new Exception("Informar data da matrícula");
        }
        if (a.getDtmatricula() == null) {
            throw new Exception("Informar data da matrícula");
        }
        if (a.getDtmatricula().trim().length() <= 0){
            throw new Exception("Informar data da matrícula");
        }
        if (a.getDtnascimento().trim().equals("")) {
            throw new Exception("Informar data de nascimento");
        }
        if (a.getDtnascimento() == null) {
            throw new Exception("Informar data de nascimento");
        }
        if(a.getDtnascimento().trim().length() <= 0){
            throw new Exception("Informar data de nascimento");
        }
        if (a.getEndereco().trim().equals("")) {
            throw new Exception("Informar endereço");
        }
        if (a.getEndereco() == null) {
            throw new Exception("Informar endereço");
        }
        if (a.getPeso() <= 0) {
            throw new Exception("Informar peso");
        }
        if (a.getRg().trim().equals("")) {
            throw new Exception("Informar RG");
        }
        if (a.getRg() == null) {
            throw new Exception("Informar RG");
        }
        //Cadastrando
        DadosAluno d = new DadosAluno();
        d.cadastrar(a);
    }

    @Override
    public void atualizar(Aluno a) throws Exception {
        DadosAluno d = new DadosAluno();
        d.atualizar(a);
    }

    @Override
    public void remover(Aluno a) throws Exception {
        DadosAluno d = new DadosAluno();
        d.remover(a);
    }

    @Override
    public ArrayList<Aluno> listar(Aluno filtro) throws Exception {
        DadosAluno d = new DadosAluno();
        return d.listar(filtro);
    }

}
