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
 * @author Elaine
 */
public class NegocioTurma implements InterfaceTurma {

    @Override
    public void cadastrar(Turma t) throws Exception {

        // VALIDAÇÕES
        // Validando códio da turma
        if (t.getCodigo() <= 0) {
            throw new Exception("Informar código.");
        }
        // Validando horário da aula
        if (t.getHorario() == null) {
            throw new Exception("Informar o horário da aula");
        }
        // Validando duração da aula
        if (t.getDuracaoaula() == null) {
            throw new Exception("Informar a duração da aula");
        }
        // Validando matrícicula do instrutor em turma
        if (t.getInstrutor() == null) {
            throw new Exception("Informar a matrícula do Instrutor");
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
        //Validando aluno matrícula
        if (t.getAluno().getMatricula() <= 0) {
            throw new Exception("Informar a matrícula do aluno");
        }
        //MÉTODO CADASTRAR
        DadosTurma d = new DadosTurma();
        d.cadastrar(t);

    }

    @Override

    //VALIDAÇÕES
    // Validando dados da atualização
    public void atualizar(Turma t) throws Exception {
        // Validando códio da turma
        if (t.getCodigo() <= 0) {
            throw new Exception("Informar código!");
        }
        // Validando horário da aula
        if (t.getHorario() == null) {
            throw new Exception("Informar o horário da aula!");
        }
        // Validando duração da aula
        if (t.getDuracaoaula() == null) {
            throw new Exception("Informar a duração da aula!");
        }
        // Validando matrícicula do instrutor em turma
        if (t.getInstrutor() == null) {
            throw new Exception("Informar a matrícula do Instrutor!");
        }
        //Validando código da atividade
        if (t.getAtividade() == null) {
            throw new Exception("Informar o código da Atividade!");
        }
        //Validando data inicial da aula 
        if (t.getDtinicial() == null) {
            throw new Exception("Informar a data inicial!");
        }
        //Validando data final da aula 
        if (t.getDtfinal() == null) {
            throw new Exception("Informar a data final!");
        }
        //Validando aluno matrícula
        if (t.getAluno().getMatricula() <= 0) {
            throw new Exception("Informar a matrícula do aluno!");
        }
        //MÉTODO ATUALIZAR
        DadosTurma d = new DadosTurma();
        d.atualizar(t);
    }

    @Override
    public void remover(Turma t) throws Exception {
        //VALIDANDO DADOS REMOVER
        if (t.getCodigo() <= 0) {
            throw new Exception("Código Inválido!");
        }
        //Verificando existência
        if (verificaExistencia(t) != false) {
            throw new Exception("A turma informada já está cadastrada no sistema!");
        }
        /*
         // Validando horário da aula
        if (t.getHorario() == null) {
            throw new Exception("Horário Inválido!");
        }
         // Validando duração da aula
        if (t.getDuracaoaula() == null) {
            throw new Exception("Horário de duração da aula inválido!");
        }
        // Validando matrícicula do instrutor em turma
        if (t.getInstrutor() == null) {
            throw new Exception("Matrícula do Instrutor Inválida!");
        }
        //Validando código da atividade
        if (t.getAtividade() == null) {
            throw new Exception("Código da Atividade Inválido!");
        }
        //Validando data inicial da aula 
        if (t.getDtinicial() == null) {
            throw new Exception("Data inicial Inválida!");
        }
        //Validando data final da aula 
        if (t.getDtfinal() == null) {
            throw new Exception("Data final Inválida!");
        }
       //Validando aluno matrícula
       if (t.getAluno().getMatricula()<=0){
           throw new Exception("Matrícula do aluno Inválida!");
       }
         */
        // MÉTODO REMOVER
        DadosTurma d = new DadosTurma();
        d.remover(t);

    }

    @Override
    public ArrayList<Turma> listar(Turma filtro) throws Exception {
        DadosTurma d = new DadosTurma();
        return d.listar(filtro);
    }

    @Override
    public boolean verificaExistencia(Turma t) throws Exception {
        if (t.getCodigo() <= 0) {
            throw new Exception("Turma inválida!");
        }
        DadosTurma d = new DadosTurma();
        return d.verificaExistencia(t);

    }

    @Override
    public ArrayList<Aluno> listarAlunos(Turma filtro) throws Exception {
        DadosTurma d = new DadosTurma();
        return d.listarAlunos(filtro);
    }

    @Override
    public Aluno pegarMonitor(Turma t) throws Exception {
        if (t.getCodigo() <= 0) {
            throw new Exception("Turma inválida!");
        }
        
        if (t.getAluno() == null) {
            throw new Exception("Aluno inválido!");
        }

        DadosTurma d = new DadosTurma();
        return d.pegarMonitor(t);
    }

}
