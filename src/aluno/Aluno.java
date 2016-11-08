/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import classesBasicas.Endereco;
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
    private Endereco endereco;

    public Aluno() {
        this.endereco = new Endereco();
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        String retorno;
        retorno = "Matrícula: " + this.getMatricula() + "\n";
        retorno += "Nome: " + this.getNome() + "\n";
        retorno += "Altura: " + this.getAltura() + "\n";
        retorno += "Peso: " + this.getPeso() + "\n";
        retorno += "Contato: " + this.getContato() + "\n";
        retorno += this.getEndereco().toString();
        return retorno;
    }

    public String retornoNecessario() {
        String retorno = "";
        retorno = "Matrícula: " + this.getMatricula();
        retorno += "Nome: " + this.getNome();
        return retorno;
    }
}
