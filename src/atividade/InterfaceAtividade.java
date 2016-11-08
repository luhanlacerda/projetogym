/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.util.ArrayList;


/**
 *
 * @author ELAINE
 */

public interface InterfaceAtividade {
    
    //cadastrar uma atividade
    void cadastrar(Atividade a) throws Exception;
    //atualizar dados de uma atividade cadastrada
    void atualizar(Atividade a) throws Exception;
    //remover uma atividade cadastrada
    void remover(Atividade a) throws Exception;
    //listar as atividades de acordo com o filtro 
    Atividade listar(Atividade a) throws Exception;
     
    ArrayList<Atividade> listar() throws Exception;
}
