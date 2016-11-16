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
        String sql = "INSERT INTO Aluno (Alu_Matricula, Alu_DataMatricula, Alu_Nome, Alu_Rg, Alu_Cpf, Alu_Nascimento, Alu_Altura, "
                + "Alu_Peso, Alu_Logradouro, Alu_Numero, Alu_Complemento, Alu_Bairro, Alu_Cep, Alu_Cidade, Alu_Uf, Alu_Pais, Alu_Telefone)";
        sql += " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getMatricula());
            cmd.setDate(2, a.getDtmatricula());
            cmd.setString(3, a.getNome());
            cmd.setString(4, a.getRg());
            cmd.setString(5, a.getCpf());
            cmd.setDate(6, a.getDtnascimento());
            cmd.setFloat(7, a.getAltura());
            cmd.setFloat(8, a.getPeso());
            cmd.setString(9, a.getEndereco().getLogradouro());
            cmd.setString(10, a.getEndereco().getNumero());
            cmd.setString(11, a.getEndereco().getComplemento());
            cmd.setString(12, a.getEndereco().getBairro());
            cmd.setString(13, a.getEndereco().getCep());
            cmd.setString(14, a.getEndereco().getCidade());
            cmd.setString(15, a.getEndereco().getUf());
            cmd.setString(16, a.getEndereco().getPais());
            cmd.setString(17, a.getContato());
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
        String sql = "UPDATE Aluno SET Alu_DataMatricula = ?, Alu_Nome = ?, Alu_Altura = ?, "
                + "Alu_Peso = ?, Alu_Logradouro = ?, Alu_Numero = ?, Alu_Complemento = ?, Alu_Bairro = ?, Alu_Cep = ?, Alu_Cidade = ?, Alu_Uf = ?, Alu_Telefone = ?"
                + " WHERE Alu_Matricula = ? ;";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setDate(1, a.getDtmatricula());
            cmd.setString(2, a.getNome());
            cmd.setFloat(3, a.getAltura());
            cmd.setFloat(4, a.getPeso());
            cmd.setString(5, a.getEndereco().getLogradouro());
            cmd.setString(6, a.getEndereco().getNumero());
            cmd.setString(7, a.getEndereco().getComplemento());
            cmd.setString(8, a.getEndereco().getBairro());
            cmd.setString(9, a.getEndereco().getCep());
            cmd.setString(10, a.getEndereco().getCidade());
            cmd.setString(11, a.getEndereco().getUf());
            cmd.setString(12, a.getContato());
            cmd.setInt(13, a.getMatricula());
            cmd.execute();
        } catch (SQLException e) {
            //caso haja algum erro neste método será levantada esta execeção
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
        String sql = "DELETE FROM Aluno WHERE Alu_Matricula = ? ;";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, a.getMatricula());
            cmd.execute();
        } catch (SQLException e) {
            //caso haja algum erro neste método será levantada esta execeção
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
        String sql = " SELECT Alu_Matricula AS 'Matrícula', Alu_Datamatricula AS 'Data Matrícula', Alu_Nome AS 'Nome', Alu_Nascimento AS 'Data Nascimento',"
                + " Alu_Altura AS 'Altura', Alu_Peso AS 'Peso', Alu_Logradouro AS 'Logradouro', Alu_Numero AS 'Número', Alu_Complemento AS 'Complemento',"
                + " Alu_Bairro AS 'Bairro', Alu_Cep AS 'CEP', Alu_Cidade AS 'Cidade', Alu_Uf AS 'UF', Alu_Pais AS 'País', Alu_Telefone AS 'Telefone', "
                + " Alu_Rg AS 'RG', Alu_Cpf AS 'CPF'";
        sql += " FROM Aluno WHERE Alu_Matricula > 0 ";
        if (filtro.getMatricula() > 0) {
            sql += " AND Alu_Matricula = ?";
        }
        if (filtro.getNome() != null && filtro.getNome().trim().equals("") == false) {
            sql += " AND Alu_Nome LIKE ? ";
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
                a.setMatricula(leitor.getInt("Matrícula"));
                a.setDtmatricula(leitor.getDate("Data Matrícula"));
                a.setNome(leitor.getString("Nome"));
                a.setDtnascimento(leitor.getDate("Data Nascimento"));
                a.setAltura(leitor.getFloat("Altura"));
                a.setPeso(leitor.getFloat("Peso"));
                a.getEndereco().setLogradouro(leitor.getString("Logradouro"));
                a.getEndereco().setNumero(leitor.getString("Número"));
                a.getEndereco().setComplemento(leitor.getString("Complemento"));
                a.getEndereco().setBairro(leitor.getString("Bairro"));
                a.getEndereco().setCep(leitor.getString("CEP"));
                a.getEndereco().setCidade(leitor.getString("Cidade"));
                a.getEndereco().setUf(leitor.getString("UF"));
                a.getEndereco().setPais(leitor.getString("País"));
                a.setContato(leitor.getString("Telefone"));
                a.setRg(leitor.getString("RG"));
                a.setCpf(leitor.getString("CPF"));
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
        String sql = "SELECT Alu_Matricula, Alu_DataMatricula, Alu_Nome, Alu_Rg, Alu_Cpf, Alu_Nascimento, Alu_Altura,"
                + " Alu_Peso, Alu_Logradouro, Alu_Numero, Alu_Complemento, Alu_Bairro, Alu_Cep, Alu_Cidade, Alu_Uf, Alu_Pais, Alu_Telefone ";
        sql += " FROM ALUNO WHERE Alu_Matricula = ? ";
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
        //fechando a conexão com o banco de dados
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
                e.setBairro(result.getString("Bairro"));
                e.setCidade(result.getString("Cidade"));
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
