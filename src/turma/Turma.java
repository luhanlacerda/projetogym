/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import aluno.Aluno;
import instrutor.Instrutor;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luhan
 */
public class Turma {
    
    private int codigo;
    private String dtinicial, dtfinal;
    private ArrayList<Aluno> alunos; //conferir se é isso mesmo
    private Instrutor instrutor;
    private String duracaoaula;
    private String horario;

    public Turma() {
       this.alunos = new ArrayList<Aluno>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDtinicial() {
        return dtinicial;
    }

    public void setDtinicial(String dtinicial) {
        this.dtinicial = dtinicial;
    }

    public String getDtfinal() {
        return dtfinal;
    }

    public void setDtfinal(String dtfinal) {
        this.dtfinal = dtfinal;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getDuracaoaula() {
        return duracaoaula;
    }

    public void setDuracaoaula(String duracaoaula) {
        this.duracaoaula = duracaoaula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
