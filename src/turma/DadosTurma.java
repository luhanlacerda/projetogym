/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import dados.Dados;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ELAINE
 */

    
    public class DadosTurma extends Dados implements InferfaceTurma{

        // Métodos abstratos. 
    @Override
    public void cadastrar(Turma t) throws Exception {
        //abrindo a conexao
        conectar();
        //instruçãoo sql correspondente a inserção da turma
        String sql = "INSERT INTO turma Tur_Codigo, Tur_NumeroAlunos,Tur_HorarioAulas,Tur_DuracaoAulas,Tur_DataInicial,Tur_DataFinal,Alu_Matricula";
        sql += "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            //executando a instrução sql            
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt   (1, t.getCodigo());
            cmd.setArray (2, (Array) t.getAlunos()); // OLHA AQUI ???
            cmd.setTime(3, t.getHorario());
            cmd.setTime(4, t.getHorario());
            cmd.setTime(5, t.getDuracaoaula());
            cmd.setDate(6, t.getDtinicial());
            cmd.setDate(7, t.getDtfinal());
//            cmd.setAluno(8, t.getAluno()); OLHA AQUI  ????
            cmd.execute();
        } catch (SQLException e) {
            //caso haja algum erro 
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
      
    }

    @Override
    public void atualizar(Turma t) throws Exception {
       
    }

    @Override
    public void remover(Turma t) throws Exception {
       
    }

    @Override
    public ArrayList<Turma> listar(Turma filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificaExistencia(Turma a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
    
