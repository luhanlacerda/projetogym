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
        //abrindo a conexão
        conectar();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO instrutor (ins_matricula, ins_rg, ins_cpf, ins_nome, ins_nascimento, ins_telefone)";
        sql += " VALUES  (?, ?, ?, ?, ?, ?)";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1,    i.getMatricula());
            cmd.setString(2, i.getRg());
            cmd.setString(3, i.getCpf());
            cmd.setString(4, i.getNome());
            cmd.setDate(5,   i.getDtnascimento());
            cmd.setString(6, i.getContato());
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
        int posPar = 1;
        ArrayList<Instrutor> retorno = new ArrayList<>();
        //abrindo a conexÃ£o
        conectar();
        //instruçãoo sql correspondente a inserção do aluno
        String sql = " SELECT Ins_Matricula, Ins_Rg, Ins_Cpf, Ins_Nome, Ins_Nascimento, Ins_Telefone ";
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
                i.setDtnascimento(leitor.getDate("Data Nascimento").getTime());
                i.setContato(leitor.getString("Contato"));
                retorno.add(i);
                     }
        } catch (SQLException e) {
            //caso haja algum erro neste método será levantada esta execeção
            throw new Exception("Erro ao executar inserÃ§Ã£o: " + e.getMessage());
        }
        //fechando a conexÃ£o com o banco de dados
        desconectar();
        return retorno;
    }

    @Override
    public boolean verificarExistenciaMatricula(Instrutor i) throws Exception {
        boolean retorno = false;
        //abrindo a conexão
        conectar();
        //instruçãoo sql correspondente a inserção do aluno
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
            //caso haja algum erro neste método será levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
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

    @Override
    public boolean verificarExistenciaCpf(Instrutor i) throws Exception {
        boolean retorno = false;
        //abrindo a conexão
        conectar();
        //instruçãoo sql correspondente a inserção do aluno
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
            //caso haja algum erro neste método será levantada esta execeção
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    
    }


}
