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
 * @author Luhan
 */
public class Turma { // ver tipos para data e hora, pois esta descrito como Date e Time no banco 
                     //ver quantidade de alunos se será arrayList ou int
                     // ver matricula de instrutor e matricula de aluno 
    
    private int codigo; 
    private ArrayList<Aluno> alunos; //Contar alunos
    private Instrutor instrutor; // ver se fica assim como esta ou assim: Instrutor matricula
    private String duracaoaula;
    private String horario;
    private String dtinicial, dtfinal;
    private Aluno aluno; //ver se fica assim como esta ou assim: aluno matricula
    private Atividade atividade; // ver se fica assim como esta ou assim: Atividade codigo

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
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
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
    public String getDuracaoaula() {
        return duracaoaula;
    }

    /**
     * @param duracaoaula the duracaoaula to set
     */
    public void setDuracaoaula(String duracaoaula) {
        this.duracaoaula = duracaoaula;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the dtinicial
     */
    public String getDtinicial() {
        return dtinicial;
    }

    /**
     * @param dtinicial the dtinicial to set
     */
    public void setDtinicial(String dtinicial) {
        this.dtinicial = dtinicial;
    }

    /**
     * @return the dtfinal
     */
    public String getDtfinal() {
        return dtfinal;
    }

    /**
     * @param dtfinal the dtfinal to set
     */
    public void setDtfinal(String dtfinal) {
        this.dtfinal = dtfinal;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
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
    /**
     * @return the codigo
     */
    
    /**
     * @return the codigo
     */
    
   
}
