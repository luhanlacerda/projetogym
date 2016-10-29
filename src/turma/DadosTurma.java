/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import aluno.Aluno;
import dados.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ELAINE
 */
public class DadosTurma extends Dados implements InferfaceTurma {

    // Métodos abstratos. 
    @Override
    public void cadastrar(Turma t) throws Exception {
        //abrindo a conexao
        conectar();
        //instrução sql correspondente a inserção da turma
        String sql = "INSERT INTO turma (tur_codigo, tur_horarioaulas, tur_duracaoaulas, tur_datainicial, tur_datafinal, alu_matricula, ins_matricula, atv_codigo)";
        sql += " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            //executando a instrução sql            
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, t.getCodigo());
            cmd.setTime(2, t.getHorario());       
            cmd.setTime(3, t.getDuracaoaula());   
            cmd.setDate(4, t.getDtinicial());
            cmd.setDate(5, t.getDtfinal());
            cmd.setInt(6, t.getAluno().getMatricula()); 
            cmd.setInt(7, t.getInstrutor().getMatricula());
            cmd.setInt(8, t.getAtividade().getCodigo());
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
       //abrindo a conexao
        conectar();
        //instrução sql correspondente a inserção da turma
        String sql = "UPDATE Turma SET  tur_horarioaulas = ?, tur_duracaoaulas = ?, tur_datainicial = ?, tur_datafinal= ?, alu_matricula = ?, ins_matricula = ?, atv_codigo= ? WHERE Tur_Codigo = ?;";
        
        try {
            //executando a instrução sql            
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1,  t.getCodigo());
            cmd.setTime(2, t.getHorario());       
            cmd.setTime(3, t.getDuracaoaula());   
            cmd.setDate(4, t.getDtinicial());
            cmd.setDate(5, t.getDtfinal());
            cmd.setInt(6,  t.getAluno().getMatricula()); 
            cmd.setInt(7,  t.getInstrutor().getMatricula());
            cmd.setInt(8,  t.getAtividade().getCodigo());
            cmd.execute();
        } catch (SQLException e) {
//         
            //caso haja algum erro 
            throw new Exception("Erro ao executar a atualização: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();

    }

    @Override
    public void remover(Turma t) throws Exception {

         conectar();
        String sql = "DELETE FROM turma WHERE Tur_Codigo = ?";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, t.getCodigo());
            cmd.execute();
        } catch (SQLException e) {
            throw new Exception("Erro ao executar remoção: " + e.getMessage());
        }
        //fechando a conexÃ£o com o banco de dados
        desconectar();
        
        
    }

    @Override
    public ArrayList<Turma> listar(Turma filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificaExistencia(Turma a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Aluno> pegarAlunos(Turma t) throws Exception {
        return new ArrayList<>();
    }

}
