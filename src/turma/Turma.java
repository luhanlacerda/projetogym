/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import aluno.Aluno;
import atividade.Atividade;
import instrutor.Instrutor;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author ELAINE
 */
public class Turma {

    private int codigo;
    //private int numAlunos; //TIRAR DO MINIMUNDO, VAI PAR ALUNOTURMA
    private Instrutor instrutor; //matricula
    private Time duracaoaula;
    private Time horario;
    private Date dtinicial;
    private Date dtfinal;
    private Aluno aluno; //matricula do aluno(MONITOR)
    private Atividade atividade; // código
    private ArrayList<Aluno> listaAlunos;

    public Turma() {
        this.atividade = new Atividade();
        this.instrutor = new Instrutor();
        this.aluno = new Aluno();
        this.listaAlunos = new ArrayList<>();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the instrutor
     */
    public Instrutor getInstrutor() {
        return instrutor;
    }

    /**
     * @param instrutor the instrutor to set
     */
    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    /**
     * @return the duracaoaula
     */
    public Time getDuracaoaula() {
        return duracaoaula;
    }

    /**
     * @param duracaoaula the duracaoaula to set
     */
    public void setDuracaoaula(Time duracaoaula) {
        this.duracaoaula = duracaoaula;
    }

    /**
     * @return the horario
     */
    public Time getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Time horario) {
        this.horario = horario;
    }

    /**
     * @return the dtinicial
     */
    public Date getDtinicial() {
        return dtinicial;
    }

    /**
     * @param dtinicial the dtinicial to set
     */
    public void setDtinicial(Date dtinicial) {
        this.dtinicial = dtinicial;
    }

    /**
     * @return the dtfinal
     */
    public Date getDtfinal() {
        return dtfinal;
    }

    /**
     * @param dtfinal the dtfinal to set
     */
    public void setDtfinal(Date dtfinal) {
        this.dtfinal = dtfinal;
    }

    /**
     * @return the atividade
     */
    public Atividade getAtividade() {
        return atividade;
    }

    /**
     * @param atividade the atividade to set
     */
    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public String listarTurmas() {
        String retorno = "";
        retorno = "codigo:" + this.getCodigo() + "\n";
        retorno += "Hora Aula" + this.getHorario() + "\n";
        retorno += "Duração Aula" + this.getDuracaoaula() + "\n";
        retorno += "Data Inicial" + this.getDtinicial() + "\n";
        retorno += "Data Final" + this.getDtfinal() + "\n";
        retorno += "Aluno Monitor" + this.getAluno().getMatricula() + "\n";
        retorno += "Matrícula Instrutor" + this.getInstrutor().getMatricula() + "\n";
        retorno += "Atividade Código" + this.getAtividade().getCodigo() + "\n";
        return retorno;

    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

}
