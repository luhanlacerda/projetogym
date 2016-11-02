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

    //Método de cadastrar Instrutor
    @Override
    public void cadastrar(Instrutor i) throws Exception {

        if (i.getMatricula() <= 0) {
            throw new Exception("Matrícula inválida!");
        }
        if (verificarExistenciaMatricula(i) != false) {
            throw new Exception("A matrícula informada já está cadastrada no sistema!");
        }
        if (i.getRg() == null || i.getRg().trim().equals("")) {
            throw new Exception("Número de RG inválido!");
        }
        if (i.getCpf() == null || i.getCpf().trim().equals("") || i.getCpf().trim().length() < 13 || i.getCpf().trim().length() > 13)  {
            throw new Exception("Número de CPF inválido!");
        }
        if (i.getNome() == null || i.getNome().trim().equals("")) {
            throw new Exception("Informar nome!");
        }
        if (i.getDtnascimento() == null) {
            throw new Exception("Informar data de nascimento!");
        }
        if (i.getContato().trim().equals("") || i.getContato() == null || i.getContato().trim().length() < 14) {
            throw new Exception("Informar número de contato!");
        }
        //Cadastrando
        DadosInstrutor d = new DadosInstrutor();
        d.cadastrar(i);
    }

    //método de atualização de instrutor
    @Override
    public void atualizar(Instrutor i) throws Exception {
        if (i.getMatricula() <= 0) {
            throw new Exception("Matrícula inválida!");
        }
        if (verificarExistenciaMatricula(i) != false) {
            throw new Exception("A matrícula informada já está cadastrada no sistema!");
        }
        if (i.getRg() == null || i.getRg().trim().equals("")) {
            throw new Exception("Número de RG inválido!");
        }
        if (i.getCpf() == null || i.getCpf().trim().equals("") || i.getCpf().trim().length() < 13 || i.getCpf().trim().length() > 13) {
            throw new Exception("Número de CPF inválido!");
        }
        if (i.getNome() == null || i.getNome().trim().equals("")) {
            throw new Exception("Informar nome!");
        }
        if (i.getDtnascimento() == null) {
            throw new Exception("Informar data de nascimento!");
        }
        if (i.getContato().trim().equals("") || i.getContato() == null || i.getContato().trim().length() < 14) {
            throw new Exception("Informar número de contato!");
        }
        //Atualizando Instrutor
        DadosInstrutor d = new DadosInstrutor();
        d.atualizar(i);
    }

    //metodo para remover um instrutor
    @Override
    public void remover(Instrutor i) throws Exception {
         if (i.getMatricula() <= 0) {
            throw new Exception("Matrícula inválida!");
        }
        if (verificarExistenciaMatricula(i) != false) {
            throw new Exception("A matrícula informada já está cadastrada no sistema!");
        }
        if (i.getRg() == null || i.getRg().trim().equals("")) {
            throw new Exception("Número de RG inválido!");
        }
        if (i.getCpf() == null || i.getCpf().trim().equals("") || i.getCpf().trim().length() < 13 || i.getCpf().trim().length() > 13) {
            throw new Exception("Número de CPF inválido!");
        }
        if (i.getNome() == null || i.getNome().trim().equals("")) {
            throw new Exception("Informar nome!");
        }
        if (i.getDtnascimento() == null) {
            throw new Exception("Informar data de nascimento!");
        }
        if (i.getContato().trim().equals("") || i.getContato() == null || i.getContato().trim().length() < 14) {
            throw new Exception("Informar número de contato!");
        }
        //Removendo um instrutor
        DadosInstrutor d = new DadosInstrutor();
        d.remover(i);
    }

    //método para listagem de instrutores de acordo com o filtro
    @Override
    public ArrayList<Instrutor> listar(Instrutor filtro) throws Exception {
        DadosInstrutor d = new DadosInstrutor();
        return d.listar(filtro);
    }

    //metodo para verificacao de existencia de uma determinada matricula ja cadastrada no banco de dados
    @Override
    public boolean verificarExistenciaMatricula(Instrutor i) throws Exception {
        if (i.getMatricula() <= 0) {
            throw new Exception("Matrícula inválida!");
        }
        DadosInstrutor d = new DadosInstrutor();
        return d.verificarExistenciaMatricula(i);
    }

    //metodo para verificar se um determinado cpf já se encontra cadastrado no sistema, caso o campo nao seja unique
    @Override
    public boolean verificarExistenciaCpf(Instrutor i) throws Exception {
        if (i.getCpf() == null || i.getCpf().trim().equals("") || i.getCpf().trim().length() < 13 || i.getCpf().trim().length() > 13) {
            throw new Exception("Número de CPF inválido!");
        }
       DadosInstrutor d = new DadosInstrutor();
       return d.verificarExistenciaCpf(i);
    }

    @Override
    public int selecionarMatInstrutor(Instrutor i) throws Exception {
        if (i.getNome() == null || i.getNome().trim().equals("")) {
            throw new Exception("Informar nome!");
        }
       DadosInstrutor d = new DadosInstrutor();
       return d.selecionarMatInstrutor(i);
    }

    //metodo para pegar a proxima matricula a ser usada, caso o campo seja identity
    @Override
    public int pegarMatricula(Instrutor i) throws Exception {
          DadosInstrutor d = new DadosInstrutor();
        return d.pegarMatricula(i);
    }

}
