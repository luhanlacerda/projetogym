/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesBasicas;

import java.sql.Date;


/**
 *
 * @author Luhan
 */
public abstract class Pessoa {
   private String nome;
   private String rg;
   private String cpf;
   private String contato;
   private Date dtnascimento;

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
    
    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(long dtnascimento) {
        this.dtnascimento = new Date(dtnascimento);
    }

}
