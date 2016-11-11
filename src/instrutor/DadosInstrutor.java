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

    //cadastra um instrutor
    @Override
    public void cadastrar(Instrutor i) throws Exception {
        //abrindo a conexão
        conectar();
        //instrução para cadastro de um instrutor
        String sql = "INSERT INTO instrutor (ins_matricula, ins_rg, ins_cpf, ins_nome, ins_nascimento, ins_telefone)";
        sql += " VALUES  (?, ?, ?, ?, ?, ?)";
        try {
            //executando instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, i.getMatricula());
            cmd.setString(2, i.getRg());
            cmd.setString(3, i.getCpf());
            cmd.setString(4, i.getNome());
            cmd.setDate(5, i.getDtnascimento());
            cmd.setString(6, i.getContato());
            cmd.execute();
        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    //atualiza dados de um determinado instrutor cadastrado
    @Override
    public void atualizar(Instrutor i) throws Exception {
        //abrindo a conexao
        conectar();
        //instrução para atualizar dados do instrutor
        String sql = "UPDATE Instrutor SET Ins_Rg = ?, Ins_Nome = ?, Ins_Telefone = ? WHERE Ins_Matricula = ?;";
        try {
            //executando instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, i.getRg());
            cmd.setString(2, i.getNome());
            cmd.setString(3, i.getContato());
            cmd.setInt(4, i.getMatricula());
            cmd.execute();
        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao executar atualização: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    //remove um determinado instrutor cadastrado
    @Override
    public void remover(Instrutor i) throws Exception {
        //abrindo conexão
        conectar();
        //instrução para remover um instrutor
        String sql = " DELETE FROM Instrutor WHERE Ins_Matricula = ?";
        try {
            //executando instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, i.getMatricula());
            cmd.execute();
        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao remover: " + e.getMessage());
        }
        //fechando conexão com o banco de dados
        desconectar();
    }

    //faz uma listagem de todos os instrutores de acordo com o filtro desejado
    @Override
    public ArrayList<Instrutor> listar(Instrutor filtro) throws Exception {
        int posPar = 1;
        ArrayList<Instrutor> retorno = new ArrayList<>();
        //abrindo conexão
        conectar();
        //instrução para listagem dos instrutores de acordo com o filtro de pesquisa
        String sql = " SELECT Ins_Matricula AS 'Matrícula', Ins_Rg AS 'RG', Ins_Cpf AS 'CPF', Ins_Nome AS 'Nome', Ins_Nascimento AS 'Data Nascimento', Ins_Telefone AS 'Contato'";
        sql += " FROM Instrutor WHERE Ins_Matricula > 0 ";
        if (filtro.getMatricula() > 0) {
            sql += " AND Ins_Matricula = ?";
        }
        if (filtro.getNome() != null && filtro.getNome().trim().equals("") == false) {
            sql += " AND Ins_Nome LIKE ? ";
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
                Instrutor i = new Instrutor();
                i.setMatricula(leitor.getInt("Matrícula"));
                i.setRg(leitor.getString("Rg"));
                i.setCpf(leitor.getString("CPF"));
                i.setNome(leitor.getString("Nome"));
                i.setDtnascimento(leitor.getDate("Data Nascimento"));
                i.setContato(leitor.getString("Contato"));
                retorno.add(i);
            }
        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }

    //verifica se uma determinada matrícula ja foi cadastrada no sistema
    @Override
    public boolean verificarExistenciaMatricula(Instrutor i) throws Exception {
        boolean retorno = false;
        //abrindo a conexão
        conectar();
        //instrução para verificar se uma determinada matricula já contem no banco de dados
        String sql = " SELECT Ins_Matricula, Ins_Nome ";
        sql += " FROM instrutor WHERE Ins_Matricula = ? ";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, i.getMatricula());
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                retorno = true;
                break;
            }
        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao pesquisar existencia: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }

    //verificação de existencia de um cpf já cadastrado caso o campo não seja unique
    @Override
    public boolean verificarExistenciaCpf(Instrutor i) throws Exception {
        boolean retorno = false;
        //abrindo a conexão
        conectar();
        //instrução para verificação de existencia de um cpf já cadastrado, caso o campo não seja unique
        String sql = " SELECT Ins_Matricula, Ins_Nome, Ins_Cpf ";
        sql += " FROM instrutor WHERE Ins_Cpf = ? ";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, i.getCpf());
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

    //selecionar a matrícula do instrutor atraves do nome
    @Override
    public Instrutor selecionarInstrutor(Instrutor i) throws Exception {
        Instrutor retorno = new Instrutor();
        //conectando no banco
        conectar();
        //instrução para selecionar uma matricula
        String sql = " SELECT Ins_Matricula AS 'Matricula', Ins_Nome AS 'Nome'";
        sql += " FROM Instrutor WHERE Ins_Matricula = ?";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, i.getMatricula());
            ResultSet result = cmd.executeQuery();
            if (result.next()) {
                retorno.setMatricula(result.getInt("Matrícula"));
                retorno.setNome(result.getString("Nome"));
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao selecionar matrícula do instrutor: " + e.getMessage());
        }
        //fechando conexão
        desconectar();
        //retornando a matricula
        return retorno;
    }

    //pegar a próxima matricula caso o campo seja identity
    @Override
    public int pegarMatricula(Instrutor i) throws Exception {
        int matricula = 0;

        //abrindo a conexao
        conectar();
        //instrução sql para pegar a próxima matricula caso o campo seja identity
        String sql = "SELECT MAX(Ins_Matricula) + 1 AS 'Matricula' FROM Instrutor;";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            ResultSet result = cmd.executeQuery();
            if (result.next()) {
                matricula = result.getInt("Matricula");
            }

        } catch (SQLException e) {
            //caso ocorra algum erro será executada essa execeção
            throw new Exception("Erro ao ...: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();

        return matricula;
    }

}
