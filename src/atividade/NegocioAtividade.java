/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.util.ArrayList;

/**
 *
 * @author Luhan
 */
public class NegocioAtividade implements InterfaceAtividade {

    @Override
    public void cadastrar(Atividade a) throws Exception {
        if (a.getCodigo() <= 0) {
            throw new Exception("Informar um código válido(Maior que zero)");
        }
        if (a.getDescricao() == null || a.getDescricao().trim().equals("")) {
            throw new Exception("Informar a descrição da atividade");
        }
    }

    @Override
    public void atualizar(Atividade a) throws Exception {
        if (a.getCodigo() <= 0) {
            throw new Exception("Informar um código válido(Maior que zero)");
        }
        if (a.getDescricao() == null || a.getDescricao().trim().equals("")) {
            throw new Exception("Informar a descrição da atividade");
        }
    }

    @Override
    public void remover(Atividade a) throws Exception {
        if (a.getCodigo() <= 0) {
            throw new Exception("Informar um código válido(Maior que zero)");
        }
        if (a.getDescricao() == null || a.getDescricao().trim().equals("")) {
            throw new Exception("Informar a descrição da atividade");
        }
    }

    @Override
    public Atividade listar(Atividade a) throws Exception {
        DadosAtividade d = new DadosAtividade();
        return d.listar(a);
    }

    @Override
    public ArrayList<Atividade> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
