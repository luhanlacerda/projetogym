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
        String sql = "INSERT INTO turma (Tur_Codigo, Tur_NumeroAlunos,Tur_HorarioAulas,Tur_DuracaoAulas,Tur_DataInicial,Tur_DataFinal,Alu_Matricula)";
        sql += "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            //executando a instrução sql            
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt     (1, t.getCodigo());
            cmd.setInt     (2, t.getnumAlunos());
//            cmd.setArray   (2,(Array) t.getAlunos()); // NÃO SEI COMO FAZ P CONTAR OS ALUNOS
            cmd.setString  (3, t.getHorario());       // TIREI O TIME NO BANCO E AQUI
            cmd.setString  (4, t.getDuracaoaula());   // TIREI O TIME NO BANCO E AQUI
            cmd.setDate    (5, t.getDtinicial());
            cmd.setDate    (6, t.getDtfinal());
            cmd.setInt     (7, t.getMatricula()); // NÃO SEI COMO FAZER P PEGAR A MATRICULA
           

            cmd.execute();
        } catch (SQLException e) {
//         
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
    
