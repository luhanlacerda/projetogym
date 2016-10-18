/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import classesBasicas.Endereco;
import java.util.Date;

/**
 *
 * @author Luhan
 */
public class Aluno {
    
    private String nome;
    private String rg;
    private String cpf;
    private Endereco endereco;
    private Date dtnascimento;
    private int matricula;
    private Date dtmatricula;

    public Aluno(String nome, String rg, String cpf, Endereco endereco, Date dtnascimento, int matricula, Date dtmatricula) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = new Endereco();
        this.dtnascimento = dtnascimento;
        this.matricula = matricula;
        this.dtmatricula = dtmatricula;
    }

    public Aluno (){
        this.endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDtmatricula() {
        return dtmatricula;
    }

    public void setDtmatricula(Date dtmatricula) {
        this.dtmatricula = dtmatricula;
    }
    
    
}
