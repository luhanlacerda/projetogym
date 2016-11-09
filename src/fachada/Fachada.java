/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import aluno.Aluno;
import aluno.InterfaceAluno;
import aluno.NegocioAluno;
import atividade.Atividade;
import atividade.InterfaceAtividade;
import atividade.NegocioAtividade;
import instrutor.Instrutor;
import instrutor.InterfaceInstrutor;
import instrutor.NegocioInstrutor;
import java.util.ArrayList;
import turma.DadosTurma;
import turma.InterfaceTurma;
import turma.Turma;

/**
 *
 * @author Luhan
 */
public class Fachada implements InterfaceAluno, InterfaceAtividade, InterfaceInstrutor, InterfaceTurma {

    @Override
    //não utilizado
    public void cadastrar(Aluno a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //não utilizado
    public void atualizar(Aluno a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //não utilizado
    public void remover(Aluno a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Aluno> listar(Aluno filtro) throws Exception {
        NegocioAluno n = new NegocioAluno();
        return n.listar(filtro);
    }

    @Override
    //não utilizado
    public boolean verificaExistencia(Aluno a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno selecionarAluno(Aluno a) throws Exception {
        NegocioAluno n = new NegocioAluno();
        return n.selecionarAluno(a);
    }

    @Override
    //não utilizado
    public void cadastrar(Atividade a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //não utilizado
    public void atualizar(Atividade a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //não utilizado
    public void remover(Atividade a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Atividade listar(Atividade filtro) throws Exception {
        NegocioAtividade n = new NegocioAtividade();
        return n.listar(filtro);
    }

    @Override
    public void cadastrar(Instrutor i) throws Exception {
        NegocioInstrutor n = new NegocioInstrutor();
        n.cadastrar(i);
    }

    @Override
    public void atualizar(Instrutor i) throws Exception {
        NegocioInstrutor n = new NegocioInstrutor();
        n.atualizar(i);
    }

    @Override
    public void remover(Instrutor i) throws Exception {
        NegocioInstrutor n = new NegocioInstrutor();
        n.remover(i);
    }

    @Override
    public ArrayList<Instrutor> listar(Instrutor filtro) throws Exception {
        NegocioInstrutor n = new NegocioInstrutor();
        return n.listar(filtro);
    }

    @Override
    public boolean verificarExistenciaMatricula(Instrutor i) throws Exception {
        NegocioInstrutor n = new NegocioInstrutor();
        return n.verificarExistenciaMatricula(i);
    }

    @Override
    //não utilizado
    public boolean verificarExistenciaCpf(Instrutor i) throws Exception {
        NegocioInstrutor n = new NegocioInstrutor();
        return n.verificarExistenciaCpf(i);
    }

    @Override
    public Instrutor selecionarInstrutor(Instrutor i) throws Exception {
        NegocioInstrutor n = new NegocioInstrutor();
        return n.selecionarInstrutor(i);
    }

    @Override
    public int pegarMatricula(Instrutor i) throws Exception {
        NegocioInstrutor n = new NegocioInstrutor();
        return n.pegarMatricula(i);
    }

    @Override
    public void cadastrar(Turma t) throws Exception {
        DadosTurma d = new DadosTurma();
        d.cadastrar(t);
    }

    @Override
    public void atualizar(Turma t) throws Exception {
        DadosTurma d = new DadosTurma();
        d.atualizar(t);
    }

    @Override
    public void remover(Turma t) throws Exception {
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
        DadosTurma d = new DadosTurma();
        return d.verificaExistencia(t);
    }

    @Override
    public Aluno pegarMonitor(Turma t) throws Exception {
        DadosTurma d = new DadosTurma();
        return d.pegarMonitor(t);
    }

    @Override
    public ArrayList<Aluno> listarAlunos(Turma filtro) throws Exception {
        DadosTurma d = new DadosTurma();
        return d.listarAlunos(filtro);
    }

    @Override
    public ArrayList<Atividade> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
       DadosTurma d = new DadosTurma();
       d.inserirAlunoTurma(t);
    }

    @Override
    public ArrayList<Turma> listarTurmaAtividade(Turma filtro) throws Exception {
      DadosTurma d = new DadosTurma();
      return d.listarTurmaAtividade(filtro);
    }

    

}
