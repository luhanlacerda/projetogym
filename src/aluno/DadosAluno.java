/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import classesBasicas.Endereco;
import dados.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import classesBasicas.FormatacaoDataHora;

/**
 *
 * @author Luhan
 */
public class DadosAluno extends Dados implements InterfaceAluno {

    @Override
    public void cadastrar(Aluno a) throws Exception {
        //abrindo a conexao
        conectar();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO aluno (alu_matricula, alu_datamatricula, alu_nome, alu_nascimento, alu_altura, alu_peso, alu_endereco, alu_telefone, alu_Rg, alu_Cpf)";
        sql += "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getMatricula());
            cmd.setDate(2, a.getDtmatricula());
            cmd.setString(3, a.getNome());
            cmd.setDate(4, a.getDtnascimento());
            cmd.setFloat(5, a.getAltura());
            cmd.setFloat(6, a.getPeso());
            cmd.setString(7, a.getEndereco().toString());
            cmd.setString(8, a.getContato());
            cmd.setString(9, a.getRg());
            cmd.setString(10, a.getCpf());
            cmd.execute();
        } catch (SQLException e) {
            //caso haja algum erro neste método será levantada esta execeção
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
            cmd.setString(1, a.getNome());
            cmd.setInt(2, a.getMatricula());
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
        int posPar = 1;
        ArrayList<Aluno> retorno = new ArrayList<>();
        //abrindo a conexão
        conectar();
        //instrução sql correspondente a inserção do aluno
        String sql = " select alu_matricula, alu_datamatricula, alu_nome, alu_nascimento, alu_altura, alu_peso, alu_endereco, alu_telefone, alu_Rg, alu_Cpf";
        sql += " from aluno where matricula > 0 ";
        if (filtro.getMatricula() > 0) {
            sql += " and matricula = ?";
        }
        if (filtro.getNome().trim().equals("") == false) {
            sql += " and nome like ? ";
        }
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            if (filtro.getMatricula() > 0) {
                cmd.setInt(posPar, filtro.getMatricula());
                posPar++;
            }
            if (filtro.getNome() != null && filtro.getNome().trim().equals("") == false) {
                cmd.setString(posPar, filtro.getNome());
                posPar++;
            }
            //
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                Aluno a = new Aluno();
                a.setMatricula(leitor.getInt("matricula"));
                a.setNome(leitor.getString("nome"));
                retorno.add(a);
            }
        } catch (SQLException e) {
            //caso haja algum erro neste método será levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }

    @Override
    public boolean verificaExistencia(Aluno a) throws Exception {
        boolean retorno = false;
        //abrindo a conexão
        conectar();
        //instrução sql correspondente a inserção do aluno
        String sql = " select matricula, nome ";
        sql += " from aluno where matricula = ? ";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getMatricula());
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                retorno = true;
                break;
            }
        } catch (SQLException e) {
            //caso haja algum erro neste método será levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexÃ£o com o banco de dados
        desconectar();
        return retorno;
    }

    //selecionar a matrícula do aluno atraves do nome
    @Override
    public Aluno selecionarAluno(Aluno a) throws Exception {
        Aluno retorno = new Aluno();
        //conectando no banco
        conectar();
        //instrução para selecionar uma matricula
        String sql = " SELECT Alu_Matricula AS 'Matricula', Alu_Nome AS 'Nome', Alu_Cpf AS 'CPF', Alu_Rg AS 'RG', Alu_Contato AS 'Contato', + "
                + " Alu_dtmatricula AS 'Data Matrícula', Alu_nascimento AS 'Data Nascimento', Alu_altura AS 'Altura', Alu_peso AS 'Peso', Alu_logradouro AS 'Logradouro' + "
                + "Alu_Numero AS 'Numero', Alu_Complemento AS 'Complemento', Alu_Bairro AS 'Bairro', Alu_Cep AS 'CEP', Alu_Cidade AS 'Cidade' +"
                + "Alu_Uf AS 'Uf', Alu_Pais AS 'País';";
        sql += " FROM Instrutor WHERE Ins_Matricula = ?";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getMatricula());
            ResultSet result = cmd.executeQuery();
            if (result.next()) {
                retorno.setMatricula(result.getInt("Matrícula"));
                retorno.setNome(result.getString("Nome"));
                retorno.setCpf(result.getString("CPF"));
                retorno.setRg(result.getString("RG"));
                retorno.setContato(result.getString("Contato"));
                retorno.setDtmatricula(result.getDate("Data Matrícula"));
                retorno.setDtnascimento(result.getDate("Data Nascimento"));
                retorno.setAltura(result.getFloat("Altura"));
                retorno.setPeso(result.getFloat("Peso"));
                Endereco e = new Endereco();
                e.setLogradouro(result.getString("Logradouro"));
                e.setNumero(result.getString("Numero"));
                e.setComplemento(result.getString("Complemento"));
                e.setCep(result.getString("CEP"));
                e.setUf(result.getString("Uf"));
                e.setPais(result.getString("País"));
                retorno.setEndereco(e);
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao selecionar matrícula do instrutor: " + e.getMessage());
        }
        //fechando conexão
        desconectar();
        //retornando a matricula
        return retorno;
    }

}
