/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import aluno.Aluno;
import java.util.ArrayList;

/**
 *
 * @author ELAINE
 */
public class NegocioTurma implements InferfaceTurma {

    @Override
    public void cadastrar(Turma t) throws Exception {

        // VALIDAÇÕES
        // Validando códio da turma
        if (t.getCodigo() <= 0) {
            throw new Exception("Informar código.");
        }

        // Validando quantidade de alunos na turma
        // Validando matrícicula do instrutor em turma
        if (t.getInstrutor() == null) {
            throw new Exception("Informar a matrícula do Instrutor");
        }

        //Validando matrícula do aluno monitor em turma
        //Validando código da atividade
        if (t.getAtividade() == null) {
            throw new Exception("Informar o código da Atividade");
        }

        //Validando data inicial da aula 
        if (t.getDtinicial() == null) {
            throw new Exception("Informar a data inicial");
        }

        //Validando data final da aula 
        if (t.getDtfinal() == null) {
            throw new Exception("Informar a data final");
        }
        // Validando horário da aula
        if (t.getHorario() == null) {
            throw new Exception("Informar o horário da aula");
        }

        // Validando duração da aula
        if (t.getDuracaoaula() == null) {
            throw new Exception("Informar a duração da aula");
        }
        
        //cadastrando
        DadosTurma d = new DadosTurma();
        d.cadastrar(t);

    }

    @Override

    //VALIDAÇÕES
    // Validando dados da atualização
    public void atualizar(Turma t) throws Exception {
        if (t.getCodigo() <= 0) {
            throw new Exception("Informar código.");
        }
        // Validando matrícicula do instrutor em turma
        if (t.getInstrutor().getMatricula() <= 0) {
            throw new Exception("Informar a matrícula do Instrutor");
        }
        //Validando matrícula do aluno monitor em turma
        if (t.getAluno().getMatricula() <= 0){
            throw new Exception("Informar a matrícula do aluno monitor");
        }
        //Validando código da atividade
        if (t.getAtividade() == null) {
            throw new Exception("Informar o código da Atividade");
        }
        //Validando data inicial da aula 
        if (t.getDtinicial() == null) {
            throw new Exception("Informar a data inicial");
        }
        //Validando data final da aula  
        if (t.getDtfinal() == null) {
            throw new Exception("Informar a data final");
        }
        // Validando horário da aula
        if (t.getHorario() == null) {
            throw new Exception("Informar o horário da aula");
        }
        // Validando duração da aula
        if (t.getDuracaoaula() == null) {
            throw new Exception("Informar a duração da aula");
        }
        //cadastrando
        DadosTurma d = new DadosTurma();
        d.atualizar(t);
    }

    @Override
    public void remover(Turma t) throws Exception {

    }

    @Override
    public ArrayList<Turma> listar(Turma filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificaExistencia(Turma a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Aluno> pegarAlunos(Turma t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
