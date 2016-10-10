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
public class Aluno extends Pessoa {
    
    private int matricula;
    private Date dtmatricula;

    public Aluno(String nome, String rg, String cpf, Endereco endereco, String contato, Date dtnascimento, int matricula, Date dtmatricula) {
        super(nome, rg, cpf, endereco, contato, dtnascimento);
        this.matricula = matricula;
        this.dtmatricula = dtmatricula;
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
