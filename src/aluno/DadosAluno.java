/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import dados.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luhan
 */
public class DadosAluno extends Dados implements InterfaceAluno {

    @Override
    public void cadastrar(Aluno a) throws Exception {
        //abrindo a conexao
        conectar();
        //instruçãoo sql correspondente a inserção do aluno
        String sql = "INSERT INTO aluno (Alu_Matricula, Alu_DataMatricula, Alu_Nome, Alu_Nascimento, Alu_Altura, Alu_Peso, Alu_Endereco, Alu_Telefone, Alu_Rg, Alu_Cpf)";
        sql += "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getMatricula());
            cmd.setString(2, a.getDtmatricula());
            cmd.setString(3, a.getNome());
            cmd.setString(4, a.getDtnascimento());
            cmd.setFloat(5, a.getAltura());
            cmd.setFloat(6, a.getPeso());
            cmd.setString(7, a.getEndereco());
            cmd.setString(8, a.getContato());
            cmd.setString(9, a.getRg());
            cmd.setString(10, a.getCpf());
            cmd.execute();
        } catch (SQLException e) {
            //caso haja algum erro neste método será¡ levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void atualizar(Aluno a) throws Exception {
        //abrindo a conexao
        conectar();
        //instruçãoo sql correspondente a inserção do aluno
        String sql = "UPDATE aluno SET nome = ? WHERE matricula = ? ;";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getMatricula());
            cmd.setString(2, a.getNome());
            cmd.execute();
        } catch (SQLException e) {
            //caso haja algum erro neste método será¡ levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void remover(Aluno a) throws Exception {
        //abrindo a conexao
        conectar();
        //instruçãoo sql correspondente a inserção do aluno
        String sql = "DELETE FROM aluno WHERE matricula = ? ;";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getMatricula());
            cmd.execute();
        } catch (SQLException e) {
            //caso haja algum erro neste método será¡ levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public ArrayList<Aluno> listar(Aluno filtro) throws Exception {
     ArrayList<Aluno> retorno = new ArrayList<>();
        //abrindo a conexão
        conectar();
        //instruçãoo sql correspondente a inserção do aluno
        String sql = " SELECT matricula, nome ";
        sql += " FROM aluno WHERE matricula > 0 ";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            //
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {                
                Aluno a = new Aluno();
                a.setMatricula(leitor.getInt("matricula"));
                a.setNome(leitor.getString("nome"));
                retorno.add(a);
            }
        } catch (SQLException e) {
            //caso haja algum erro neste método será¡ levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }

}
