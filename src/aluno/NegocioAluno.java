/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import java.util.ArrayList;

/**
 *
 * @author ELAINE
 */
public class NegocioAluno implements InterfaceAluno {

    @Override
    public void cadastrar(Aluno a) throws Exception {
//        if (a.getMatricula() < 0) {
//            throw new Exception("Informar a matricula do aluno");
//        }
    }

    @Override
    public void atualizar(Aluno a) throws Exception {

    }

    @Override
    public void remover(Aluno a) throws Exception {
    
    }

    @Override
    public ArrayList<Aluno> listar(Aluno filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
