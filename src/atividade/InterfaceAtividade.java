/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.util.ArrayList;

/**
 *
 * @author ELAINE
 */

public interface InterfaceAtividade {
    
        //cadastrar o aluno na tabela aluno
    void cadastrar(Atividade a) throws Exception;
    //atualizar os dados de uma aluno 
    //previamente cadastrado
    void atualizar(Atividade a) throws Exception;
    //remover um aluno previamente cadastrado
    void remover(Atividade a) throws Exception;
    //devolver os alunos que se encaixarem no filtro da pesquisa 
    ArrayList<Atividade> listar(Atividade filtro) throws Exception;
    //demais acoes...
    
    
}
