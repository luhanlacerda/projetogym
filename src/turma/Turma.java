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
import java.util.ArrayList;

/**
 *
 * @author Elaine
 */
public class Turma { // ver tipos para data e hora, pois esta descrito como Date e Time no banco 
                     //ver quantidade de alunos se será arrayList ou int
                    
    
    private int codigo; 
    private int numAlunos;
//    private ArrayList<Aluno> alunos; //Contar alunos
    private Instrutor instrutor; //matricula
    private String duracaoaula; // é pra ser TIME, coloquei String temporariamente
    private String horario;     // é pra ser TIME, coloquei String temporariamente
    private Date dtinicial, dtfinal; //ver se fica Date
    private Aluno aluno; //matricula
    private Atividade atividade; // código

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
     * @return the numAlunos
     */
    public int getnumAlunos() {
        return numAlunos;
    }

    /**
     * @param numAlunos the alunos to set
     */
    public void setnumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
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
    public Date getDtinicial() {
        return dtinicial;
    }

    /**
     * @param dtinicial the dtinicial to set
     */
    public void setDtinicial(String dtinicial) {
        this.dtinicial = new Date (new java.util.Date(dtinicial).getTime());

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
    public void setDtfinal(String dtfinal) {
        this.dtfinal = new Date (new java.util.Date(dtfinal).getTime());
    }

    /**
     * @return the matricula
     */
    public Aluno getaluno() {
        return aluno;
    }

    /**
     * @param aluno the matricula to set
     */
    public void setMatricula(Aluno aluno) {
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

    int getMatricula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMatricula(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    /**
     * @return the codigo
     */
   
    
   
}
