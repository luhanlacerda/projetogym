/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrutor;

import atividade.Atividade;
import classesBasicas.Endereco;
import classesBasicas.Pessoa;
import java.util.Date;

/**
 *
 * @author Luhan
 */
public class Instrutor extends Pessoa {
    
    private int matricula;
    private String titulacao;
    private Atividade atividade;

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
