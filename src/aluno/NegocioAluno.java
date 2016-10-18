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
if (a.getMatricula() <= 0) {
            throw new Exception("A matricula deverá ser superior a zero");
        }
        if (a.getNome() == null) {
            throw new Exception("Informar o nome do aluno");
        }
        if (a.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome do aluno");
        }
        if (a.getNome().trim().length() > 100) {
            throw new Exception("O nome do aluno não poderá ter mais de 100 caracteres");
        }
        //demais validações
        DadosAluno d = new DadosAluno();
        d.cadastrar(a);
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
