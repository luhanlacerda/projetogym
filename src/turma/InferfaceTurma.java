/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import java.util.ArrayList;

/**
 *
 * @author ELAINE
 */
interface InferfaceTurma {
    
    //cadastrar o turma
    void cadastrar(Turma t) throws Exception;
    //atualizar os dados de uma turma
    //previamente cadastrado
    void atualizar(Turma t) throws Exception;
    //remover uma turma previamente cadastrado
    void remover(Turma t) throws Exception;
    //devolver as turmas que se encaixarem no filtro da pesquisa 
    ArrayList<Turma> listar(Turma filtro) throws Exception; 
    //verificar se uma determinada matricula está contida na tabela aluno
    boolean verificaExistencia(Turma a) throws Exception;
    
}
