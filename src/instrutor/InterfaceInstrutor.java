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
public interface InterfaceInstrutor {
    
    //cadastrar instrutor na tabela
    void cadastrar(Instrutor i) throws Exception;
    //atualizar dados do instrutor na tabela
    void atualizar(Instrutor i) throws Exception;
    //remover instrutor da tabela
    void remover(Instrutor i) throws Exception;
    //listar os instrutores cadastrados na tabela de acordo com o filtro
    ArrayList<Instrutor> listar(Instrutor filtro) throws Exception;
    //verificar se uma determinada matricula já esta cadastrada
    boolean verificarExistenciaMatricula(Instrutor i) throws Exception;
    //verificar se um determinado cpf já esta cadastrado
    boolean verificarExistenciaCpf(Instrutor i) throws Exception;
    //selecionar matricula de um instrutor
    int selecionarMatInstrutor(Instrutor i) throws Exception;
     //pegar a próxima matricula caso o campo seja identity
    int pegarMatricula(Instrutor i) throws Exception;
    
}
