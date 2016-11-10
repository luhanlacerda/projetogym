/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import dados.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luhan
 */
public class DadosAtividade extends Dados implements InterfaceAtividade {

    @Override
    public void cadastrar(Atividade a) throws Exception {
       
        //abrindo a conexão
        conectar();
        //instrução para cadastro de uma atividade
        String sql = "INSERT INTO Atividade ( Atv_Codigo,   Atv_Descricao )";
        sql += " VALUES  (?, ?)";
        try {
            //executando i énstrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt   (1, a.getCodigo());
            cmd.setString(2, a.getDescricao());
            cmd.execute();
        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
        
    }

    @Override
    public void atualizar(Atividade a) throws Exception {
          
        //abrindo a conexão
        conectar();
        //instrução para cadastro de uma atividade
        String sql = "UPDATE Atividade  SET  Atv_Descricao  = ? WHERE Atv_Codigo= ?;";
        try {
            //executando instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, a.getDescricao());
            cmd.setInt   (2, a.getCodigo());
            cmd.execute();
        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void remover(Atividade a) throws Exception {
        //abrindo conexão
        conectar();
        //instrução para remover uma atividade
        String sql = " DELETE FROM Atividade WHERE Atv_Codigo = ?";
        try {
            //executando instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getCodigo());
            cmd.execute();
        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao remover: " + e.getMessage());
        }
        //fechando conexão com o banco de dados
        desconectar();
    }

    @Override
    public boolean verificarExistenciaAtividade(Atividade a) throws Exception {
        boolean retorno = false;
        //abrindo a conexão
        conectar();
        //instrução para verificação de existencia de um código já cadastrado, caso o campo não seja unique
        String sql = " SELECT Atv_Descricao, Atv_Codigo ";
        sql += " FROM Atividade WHERE Atv_Codigo = ? ";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getCodigo());
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                retorno = true;
                break;
            }
        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }

    @Override
    public int pegarCodigoAtividade(Atividade a) throws Exception {
         int codigo = 0;

        //abrindo a conexao
        conectar();
        //instrução sql para pegar a próximo código caso o campo seja identity
        String sql = "SELECT MAX(Atv_codigo + 1 AS 'Código' FROM Atividade;";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            ResultSet result = cmd.executeQuery();
            if (result.next()) {
                codigo= result.getInt("Código");
            }

        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao ...: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();

        return codigo;
    }

    @Override
    public ArrayList<Atividade> listar(Atividade filtro) throws Exception {
        int posPar = 1;
        ArrayList<Atividade> retorno = new ArrayList<>();
        //conectando no banco
        conectar();
        //instrução para selecionar um codigo de atividade
        String sql = " SELECT Atv_Codigo AS 'Código', Atv_Descricao AS 'Descrição'";
        sql += " FROM Atividade WHERE Atv_Codigo > 0";
        if (filtro.getCodigo()> 0) {
            sql += " AND Atv_Codigo = ?";
        }

        try {
            
            PreparedStatement cmd = conn.prepareStatement(sql);
            if (filtro.getCodigo() > 0) {
                cmd.setInt(posPar, filtro.getCodigo());
                posPar++;
            }
            
             ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                Atividade a = new Atividade();
                a.setCodigo(leitor.getInt("Código"));
                a.setDescricao(leitor.getString("Descrição"));
                retorno.add(a);
            }
            
        } catch (SQLException e) {
            throw new Exception("Erro ao executar seleção: " + e.getMessage());
        }
        //fechando conexão
        desconectar();
        //retornando o codigo da atividade
        return retorno; 
    }

    @Override
    public Atividade selecionarAtividade(Atividade a) throws Exception {
         Atividade retorno = new Atividade();
        //conectando no banco
        conectar();
        //instrução para selecionar um código
        String sql = " SELECT Atv_Codigo AS 'Código', Atv_Descricao AS 'Descrição'";
        sql += " FROM Atividade WHERE Atv_Codigo = ?";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getCodigo());
            ResultSet result = cmd.executeQuery();
            if (result.next()) {
                retorno.setCodigo(result.getInt("Código"));
                retorno.setDescricao(result.getString("Descrição"));
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao selecionar código da turma: " + e.getMessage());
        }
        //fechando conexão
        desconectar();
        //retornando o código
        return retorno;
    }
    }
  
    
            
    
 
    


