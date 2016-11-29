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
 * @author Elaine
 */
public class NegocioTurma implements InterfaceTurma {

    @Override
    public void cadastrar(Turma t) throws Exception {
        // Validando códio da turma
        if (t.getCodigo() <= 0) {
            throw new Exception("Informar código.");
        }
        if (verificaExistencia(t) != false) {
            throw new Exception("O código da turma já está cadastrado");
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
        if (t.getMonitor().getMatricula() <= 0) {
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
        //Validando matrícula do monitor(aluno)
        if (t.getMonitor().getMatricula() <= 0) {
            throw new Exception("Informar a matrícula do aluno!");
        }
        if (verificarExistenciaMonitor(t) == false) {
            throw new Exception("Monitor(Aluno) não cadastrado no sistema");
        }
        if (verificarExistenciaInstrutor(t) == false) {
            throw new Exception("Instrutor não cadastrado no sistema");
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

        if (t.getMonitor() == null) {
            throw new Exception("Aluno inválido!");
        }

        DadosTurma d = new DadosTurma();
        return d.pegarMonitor(t);
    }

    @Override
    public ArrayList<Instrutor> listarInstrutores(Turma filtro) throws Exception {
        DadosTurma d = new DadosTurma();
        return d.listarInstrutores(filtro);
    }

    @Override
    public ArrayList<Atividade> listarAtividades(Turma filtro) throws Exception {
        DadosTurma d = new DadosTurma();
        return d.listarAtividades(filtro);
    }

    @Override
    public void inserirAlunoTurma(Turma t) throws Exception {
        if (t.getCodigo() <= 0) {
            throw new Exception("Código Inválido!");
        }
        if (t.getMonitor().getMatricula() <= 0) {
            throw new Exception("Código Inválido!");
        }
        if (verificarExistenciaAlunoTurma(t) != false) {
            throw new Exception("Aluno já cadastrado na turma informada");
        }
        DadosTurma d = new DadosTurma();
        d.inserirAlunoTurma(t);
    }

    @Override
    public ArrayList<Turma> listarTurmaAtividade(Turma filtro) throws Exception {
        DadosTurma d = new DadosTurma();
        return d.listarTurmaAtividade(filtro);
    }

    @Override
    public boolean verificarExistenciaAlunoTurma(Turma t) throws Exception {
        if (t.getCodigo() <= 0) {
            throw new Exception("Turma inválida!");
        }
        DadosTurma d = new DadosTurma();
        return d.verificarExistenciaAlunoTurma(t);
    }

    @Override
    public boolean verificarExistenciaMonitor(Turma t) throws Exception {
        if (t.getMonitor().getMatricula() <= 0) {
            throw new Exception("Matrícula inválida!");
        }
        DadosTurma d = new DadosTurma();
        return d.verificarExistenciaMonitor(t);
    }

    @Override
    public boolean verificarExistenciaInstrutor(Turma t) throws Exception {
        if (t.getInstrutor().getMatricula() <= 0) {
            throw new Exception("Matrícula inválida!");
        }
        DadosTurma d = new DadosTurma();
        return d.verificarExistenciaInstrutor(t);
    }
}
