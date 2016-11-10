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
        //instrução para cadastro de um instrutor
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
        //instrução para cadastro de um instrutor
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Atividade listar(Atividade a) throws Exception {
        Atividade retorno = new Atividade();
        //conectando no banco
        conectar();
        //instrução para selecionar um codigo de atividade
        String sql = " SELECT Atv_Codigo AS 'Código', Atv_Descricao AS 'Descricao'";
        sql += " FROM Atividade WHERE Atv_Codigo = ?";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getCodigo());
            ResultSet result = cmd.executeQuery();
            if (result.next()) {
                retorno.setCodigo(result.getInt("Código"));
                retorno.setDescricao(result.getString("Descricao"));
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
    public ArrayList<Atividade> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarExistenciaAtividade(Atividade a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int pegarCodigoAtividade(Atividade a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
