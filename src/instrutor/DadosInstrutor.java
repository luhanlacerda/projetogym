/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrutor;

import dados.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luhan
 */
public class DadosInstrutor extends Dados implements InterfaceInstrutor {

    @Override
    public void cadastrar(Instrutor instrutor) throws Exception {
      //abrindo a conexao
        conectar();
        //instruçãoo sql correspondente a inserção do aluno
        String sql = "INSERT INTO instrutor (ins_matricula, ins_rg, ins_cpf, ins_nome, ins_nascimento, ins_telefone)";
        sql += "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, instrutor.getMatricula());
            cmd.setString(2, instrutor.getRg());
            cmd.setString(3, instrutor.getCpf());
            cmd.setString(4, instrutor.getNome());
            cmd.setString(5, instrutor.getDtnascimento());
            cmd.setString(6, instrutor.getContato());
            cmd.execute();
        } catch (SQLException e) {
            //caso haja algum erro neste método será¡ levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar(); 
    }

    @Override
    public void atualizar(Instrutor instrutor) throws Exception {
          //abrindo a conexao
        conectar();
        //instruçãoo sql correspondente a inserção do aluno
        String sql = "UPDATE instrutor SET nome = ? WHERE matricula = ?;";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, instrutor.getNome());
            cmd.setInt(2, instrutor.getMatricula());
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
    
}
