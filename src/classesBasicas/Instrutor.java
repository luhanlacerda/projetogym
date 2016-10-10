/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesBasicas;

import java.util.Date;

/**
 *
 * @author Luhan
 */
public class Instrutor extends Pessoa {
    
    private int matricula;
    private String titulacao;
    private Atividade atividade;

    public Instrutor(String nome, String rg, String cpf, Endereco endereco, String contato, Date dtnascimento, int matricula, String titulacao, Atividade atividade) {
        super(nome, rg, cpf, endereco, contato, dtnascimento);
        this.matricula = matricula;
        this.titulacao = titulacao;
        this.atividade = atividade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
}
