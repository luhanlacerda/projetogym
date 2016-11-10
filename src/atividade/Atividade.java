/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

/**
 *
 * @author Luhan
 */
public class Atividade {
    
    private int codigo;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String listarAtividade(){
        String retorno = "";
        retorno = "Código: " + this.getCodigo() + "\n";
        retorno += "Descrição: " + this.getDescricao();
        return retorno;
     
    }

  
    
}
