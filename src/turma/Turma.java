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
    private Date dtinicial, dtfinal;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>(); //conferir se é isso mesmo
    private Instrutor instrutor;
    private String duracaoaula;
    private String horario;

    public Turma(int codigo, Date dtinicial, Date dtfinal, Instrutor instrutor, String duracaoaula, String horario) {
        this.codigo = codigo;
        this.dtinicial = dtinicial;
        this.dtfinal = dtfinal;
        this.instrutor = instrutor;
        this.duracaoaula = duracaoaula;
        this.horario = horario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDtinicial() {
        return dtinicial;
    }

    public void setDtinicial(Date dtinicial) {
        this.dtinicial = dtinicial;
    }

    public Date getDtfinal() {
        return dtfinal;
    }

    public void setDtfinal(Date dtfinal) {
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
