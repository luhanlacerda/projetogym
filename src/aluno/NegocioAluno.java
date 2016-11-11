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
            throw new Exception("Número de matrícula inválido");
        }
        if (verificaExistencia(a) != false) {
            throw new Exception("Matrícula já cadastrada no sistema");
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
        if (a.getDtmatricula() == null) {
            throw new Exception("Informar data da matrícula");
        }
        if (a.getAltura() <= 0) {
            throw new Exception("A altura é inválida");
        }
        if (a.getPeso() <= 0) {
            throw new Exception("Informar peso");
        }
        if (a.getCpf().trim().length() < 14) {
            throw new Exception("Número de CPF inválido");
        }
        if (a.getRg().trim().equals("") == true) {
            throw new Exception("Informar RG");
        }
        if (a.getRg() == null) {
            throw new Exception("Informar RG");
        }
        if (a.getCpf().trim().length() > 14) {
            throw new Exception("Número de CPF inválido");
        }
        if (a.getContato().trim().length() < 14) {
            throw new Exception("Número de telefone inválido");
        }
        if (a.getDtnascimento() == null) {
            throw new Exception("Informar data de nascimento");
        }
        if (a.getEndereco().getLogradouro().trim().equals("")) {
            throw new Exception("Informar nome da rua");
        }
        if (a.getEndereco().getLogradouro() == null) {
            throw new Exception("Informar nome da rua");
        }
        if (a.getEndereco().getNumero().trim().equals("")) {
            throw new Exception("Informar número da residência");
        }
        if (a.getEndereco().getNumero() == null) {
            throw new Exception("Informar número da residência");
        }
        if (a.getEndereco().getComplemento().trim().equals("")) {
            throw new Exception("Informar número da residência");
        }
        if (a.getEndereco().getComplemento() == null) {
            throw new Exception("Informar número da residência");
        }
        if (a.getEndereco().getCep().trim().equals("")) {
            throw new Exception("Informar número do CEP");
        }
        if (a.getEndereco().getCep() == null) {
            throw new Exception("Informar número do CEP");
        }
        if (a.getEndereco().getCidade().trim().equals("")) {
            throw new Exception("Informar nome da cidade");
        }
        if (a.getEndereco().getCidade() == null) {
            throw new Exception("Informar nome da cidade");
        }
        if (a.getEndereco().getUf().trim().equals("")) {
            throw new Exception("Informar nome da UF(Estado)");
        }
        if (a.getEndereco().getUf() == null) {
            throw new Exception("Informar nome da UF(Estado)");
        }
        if (a.getEndereco().getUf().trim().length() > 2 || a.getEndereco().getUf().trim().length() < 2){
            throw new Exception("Informar UF com 2 caracteres");
        }
        if (a.getEndereco().getPais().trim().equals("")) {
            throw new Exception("Informar nome do país");
        }
        if (a.getEndereco().getPais() == null) {
            throw new Exception("Informar nome do país");
        }
        //Cadastrando
        DadosAluno d = new DadosAluno();
        d.cadastrar(a);
    }

    @Override
    public void atualizar(Aluno a) throws Exception {
        if (a.getMatricula() <= 0) {
            throw new Exception("Número de matrícula inválido");
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
        if (a.getDtmatricula() == null) {
            throw new Exception("Informar data da matrícula");
        }
        if (a.getAltura() <= 0) {
            throw new Exception("A altura é inválida");
        }
        if (a.getPeso() <= 0) {
            throw new Exception("Informar peso");
        }
        if (a.getCpf().trim().length() < 11) {
            throw new Exception("Número de CPF inválido");
        }
        if (a.getRg().trim().equals("") == true) {
            throw new Exception("Informar RG");
        }
        if (a.getRg() == null) {
            throw new Exception("Informar RG");
        }
        if (a.getCpf().trim().length() > 11) {
            throw new Exception("Número de CPF inválido");
        }
        if (a.getContato().trim().length() < 14) {
            throw new Exception("Número de telefone inválido");
        }
        if (a.getDtnascimento() == null) {
            throw new Exception("Informar data de nascimento");
        }
        if (a.getEndereco().getLogradouro().trim().equals("")) {
            throw new Exception("Informar nome da rua");
        }
        if (a.getEndereco().getLogradouro() == null) {
            throw new Exception("Informar nome da rua");
        }
        if (a.getEndereco().getNumero().trim().equals("")) {
            throw new Exception("Informar número da residência");
        }
        if (a.getEndereco().getNumero() == null) {
            throw new Exception("Informar número da residência");
        }
        if (a.getEndereco().getComplemento().trim().equals("")) {
            throw new Exception("Informar número da residência");
        }
        if (a.getEndereco().getComplemento() == null) {
            throw new Exception("Informar número da residência");
        }
        if (a.getEndereco().getCep().trim().equals("")) {
            throw new Exception("Informar número do CEP");
        }
        if (a.getEndereco().getCep() == null) {
            throw new Exception("Informar número do CEP");
        }
        if (a.getEndereco().getCidade().trim().equals("")) {
            throw new Exception("Informar nome da cidade");
        }
        if (a.getEndereco().getCidade() == null) {
            throw new Exception("Informar nome da cidade");
        }
        if (a.getEndereco().getUf().trim().equals("")) {
            throw new Exception("Informar nome da UF(Estado)");
        }
        if (a.getEndereco().getUf() == null) {
            throw new Exception("Informar nome da UF(Estado)");
        }
        if (a.getEndereco().getPais().trim().equals("")) {
            throw new Exception("Informar nome do país");
        }
        if (a.getEndereco().getPais() == null) {
            throw new Exception("Informar nome do país");
        }
        DadosAluno d = new DadosAluno();
        d.atualizar(a);
    }

    @Override
    public void remover(Aluno a) throws Exception {
        if (a.getMatricula() <= 0) {
            throw new Exception("Número de matrícula inválido");
        }
        DadosAluno d = new DadosAluno();
        d.remover(a);
    }

    @Override
    public ArrayList<Aluno> listar(Aluno filtro) throws Exception {
        DadosAluno d = new DadosAluno();
        return d.listar(filtro);
    }

    @Override
    public boolean verificaExistencia(Aluno a) throws Exception {
        if (a.getMatricula() <= 0) {
            throw new Exception("Número de matrícula inválido");
        }
        DadosAluno d = new DadosAluno();
        return d.verificaExistencia(a);
    }

    @Override
    public Aluno selecionarAluno(Aluno a) throws Exception {
        if (a.getMatricula() <= 0) {
            throw new Exception("Número de matrícula inválido");
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
        DadosAluno d = new DadosAluno();
        return d.selecionarAluno(a);
    }

}
