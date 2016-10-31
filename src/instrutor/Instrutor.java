/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrutor;

import classesBasicas.Pessoa;

/**
 *
 * @author Luhana
 */
public class Instrutor extends Pessoa {
    
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String listarInstrutores(){
        String retorno = "";
        retorno = "Nome: " + this.getNome() + "\n";
        retorno += "Matrícula: " + this.getMatricula() + "\n";
        retorno += "Cpf: " + this.getCpf() + "\n";
        retorno += "Rg: " + this.getRg() + "\n";
        retorno += "Contato: " + this.getContato();
        return retorno;
    }
    
}
