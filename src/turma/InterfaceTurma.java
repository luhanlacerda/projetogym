/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import aluno.Aluno;
import atividade.Atividade;
import instrutor.Instrutor;
import java.util.ArrayList;

/**
 *
 * @author ELAINE
 */
public interface InterfaceTurma {
    
    //cadastrar o turma
    void cadastrar(Turma t) throws Exception;
    //atualizar os dados de uma turma previamente cadastrado
    void atualizar(Turma t) throws Exception;
    //remover uma turma previamente cadastrado
    void remover(Turma t) throws Exception;
    //devolver as turmas que se encaixarem no filtro da pesquisa 
    ArrayList<Turma> listar(Turma filtro) throws Exception; 
    //verificar se uma determinada matricula está contida na tabela aluno
    boolean verificaExistencia(Turma t) throws Exception;
    //pegar aluno cadastrado no banco de dados
    Aluno pegarMonitor(Turma t) throws Exception;
    //listar alunos cadastrados
    ArrayList<Aluno> listarAlunos(Turma filtro) throws Exception;
    //listar instrutores cadastrados
    ArrayList<Instrutor> listarInstrutores(Turma filtro) throws Exception;
    //listar atividades cadastradas
    ArrayList<Atividade> listarAtividades(Turma filtro) throws Exception;
    //inserir aluno na turma
    void inserirAlunoTurma(Turma t) throws Exception;
    //lista a turma para mostrar cod turma, cod atividade e descricao da atividade
    ArrayList<Turma> listarTurmaAtividade(Turma filtro) throws Exception;
    //verifica se um aluno já esta cadastrado em uma determinada turma
    boolean verificarExistenciaAlunoTurma (Turma t) throws Exception;
    //verifica se um monitor(aluno) já esta cadastrado no sistema
    boolean verificarExistenciaMonitor(Turma t) throws Exception;
    //verificia se um instrutor já esta cadastrado no sistema
    boolean verificarExistenciaInstrutor(Turma t) throws Exception;
}
