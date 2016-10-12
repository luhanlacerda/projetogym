/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import classesBasicas.Endereco;
import classesBasicas.Pessoa;
import java.util.Date;

/**
 *
 * @author Luhan
 */
public class Aluno extends Pessoa {
    
    private int matricula;
    private Date dtmatricula;

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
