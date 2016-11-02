/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import java.util.ArrayList;

/**
 *
 * @author Luhan
 */
public interface InterfaceAluno {
    
    //cadastrar o aluno na tabela aluno
    void cadastrar(Aluno a) throws Exception;
    //atualizar os dados de uma aluno 
    //previamente cadastrado
    void atualizar(Aluno a) throws Exception;
    //remover um aluno previamente cadastrado
    void remover(Aluno a) throws Exception;
    //devolver os alunos que se encaixarem no filtro da pesquisa 
    ArrayList<Aluno> listar(Aluno filtro) throws Exception; 
    //verificar se uma determinada matricula está contida na tabela aluno
    boolean verificaExistencia(Aluno a) throws Exception;
    //selecionar matrícula do aluno
    int selecionarMatAluno(Aluno a) throws Exception;
    
}
