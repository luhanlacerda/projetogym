/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import classesBasicas.Pessoa;
import java.sql.Date;

/**
 *
 * @author Luhan
 */

public class Aluno extends Pessoa {
    
    private int matricula;
    private Date dtmatricula;
    private float altura;
    private float peso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDtmatricula() {
        return dtmatricula;
    }

    public void setDtmatricula(String dtmatricula) {
        this.dtmatricula = (Date) new java.util.Date(dtmatricula);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }



}
