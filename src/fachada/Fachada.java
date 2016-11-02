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

/**
 *
 * @author Luhan
 */
public class Fachada implements InterfaceAluno, InterfaceAtividade, InterfaceInstrutor {

    @Override
    public void cadastrar(Aluno a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Aluno a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Aluno a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Aluno> listar(Aluno filtro) throws Exception {
        NegocioAluno n = new NegocioAluno();
        return n.listar(filtro);
    }

    @Override
    public boolean verificaExistencia(Aluno a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int selecionarMatAluno(Aluno a) throws Exception {
        NegocioAluno n = new NegocioAluno();
        return n.selecionarMatAluno(a);
    }

    @Override
    public void cadastrar(Atividade a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Atividade a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Atividade a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int listar(Atividade filtro) throws Exception {
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
    public boolean verificarExistenciaCpf(Instrutor i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int selecionarMatInstrutor(Instrutor i) throws Exception {
        NegocioInstrutor n = new NegocioInstrutor();
        return n.selecionarMatInstrutor(i);
    }

    @Override
    public int pegarMatricula(Instrutor i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
