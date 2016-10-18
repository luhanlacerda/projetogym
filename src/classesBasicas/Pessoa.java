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
public abstract class  Pessoa {
   private String nome;
   private String rg;
   private String cpf;
   private Endereco endereco;
   private String contato;
   private Date dtnascimento;

   public Pessoa(){
       this.endereco = new Endereco();
   }
}
