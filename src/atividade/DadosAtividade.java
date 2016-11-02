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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Atividade a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Atividade a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int listar(Atividade filtro) throws Exception {
        int codigo = 0;
        //conectando no banco
        conectar();
        //instrução para selecionar um codigo
        String sql = " SELECT Atv_Codigo AS 'Código', Atv_Descricao AS 'Descricao'";
        sql += " FROM Atividade WHERE Atv_Descricao LIKE ?";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, filtro.getDescricao() + "%");
            ResultSet result = cmd.executeQuery();
            if (result.next()) {
                codigo = result.getInt("Código");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao executar seleção: " + e.getMessage());
        }
        //fechando conexão
        desconectar();
        //retornando o codigo da atividade
        return codigo;
    }

}
