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
    
    //cadastrar um aluno
    void cadastrar(Aluno a) throws Exception;
    //atualizar os dados de uma aluno cadastrado
    void atualizar(Aluno a) throws Exception;
    //remover um aluno previamente cadastrado
    void remover(Aluno a) throws Exception;
    //devolver os alunos que se encaixarem no filtro da pesquisa 
    ArrayList<Aluno> listar(Aluno filtro) throws Exception; 
    //verificar se uma determinada matricula já está cadastrada
    boolean verificaExistencia(Aluno a) throws Exception;
    //selecionar aluno
    Aluno selecionarAluno(Aluno a) throws Exception;
    
}
