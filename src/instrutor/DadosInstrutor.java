/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrutor;

import dados.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luhan
 */
public class DadosInstrutor extends Dados implements InterfaceInstrutor {

    @Override
    public void cadastrar(Instrutor i) throws Exception {
        //abrindo a conexao
        conectar();
        //instruçãoo sql correspondente a inserção do aluno
        String sql = "INSERT INTO Instrutor (Ins_Rg, Ins_Cpf, Ins_Nome, Ins_Nascimento, Ins_Telefone)";
        sql += "VALUES (?, ?, ?, ?, ?)";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            //cmd.setInt(1, i.getMatricula());
            cmd.setString(1, i.getRg());
            cmd.setString(2, i.getCpf());
            cmd.setString(3, i.getNome());
            cmd.setDate(4, i.getDtnascimento());
            cmd.setString(5, i.getContato());
            cmd.execute();
        } catch (SQLException e) {
            //caso haja algum erro neste método será levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void atualizar(Instrutor i) throws Exception {
        //abrindo a conexao
        conectar();
        //instrução sql correspondente a inserção do aluno
        String sql = "UPDATE Instrutor SET Ins_Rg = ?, Ins_Cpf = ?, Ins_Nome = ?, Ins_Nascimento = ?, Ins_Telefone = ? WHERE Ins_Matricula = ?;";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, i.getRg());
            cmd.setString(2, i.getCpf());
            cmd.setString(3, i.getNome());
            cmd.setDate(4, i.getDtnascimento());
            cmd.setString(5, i.getContato());
            cmd.setInt(6, i.getMatricula());
            cmd.execute();
        } catch (SQLException e) {
            //caso haja algum erro neste método será levantada esta execeção
            throw new Exception("Erro ao executar atualização: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void remover(Instrutor i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Instrutor> listar(Instrutor filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarExistencia(Instrutor i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int pegarMatricula() throws Exception {
        int matricula = 0;
        
        //abrindo a conexao
        conectar();
        //instrução sql correspondente a inserção do aluno
        String sql = "SELECT MAX(Ins_Matricula) + 1 AS 'Matricula' FROM Instrutor;";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            ResultSet result = cmd.executeQuery();
            if (result.next()) {
                matricula = result.getInt("Matricula");
            }

        } catch (SQLException e) {
            //caso haja algum erro neste método será levantada esta execeção
            throw new Exception("Erro ao ...: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
        
        return matricula;
    } 

}
