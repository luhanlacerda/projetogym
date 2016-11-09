/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import aluno.Aluno;
import classesBasicas.Endereco;
import dados.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Elaine
 */
public class DadosTurma extends Dados implements InterfaceTurma {

    // MÉTODOS ABSTRATOS
    @Override
    public void cadastrar(Turma t) throws Exception {
        // CONECTANDO
        conectar();
        //instrução sql correspondente a inserção da turma
        String sql = "INSERT INTO turma (tur_codigo, tur_horarioaulas, tur_duracaoaulas, "
                    + "tur_datainicial, tur_datafinal, alu_matricula, ins_matricula, atv_codigo)";
        sql += " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            //executando a instrução sql           
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, t.getCodigo());
            cmd.setTime(2, t.getHorario());
            cmd.setTime(3, t.getDuracaoaula());
            cmd.setDate(4, t.getDtinicial());
            cmd.setDate(5, t.getDtfinal());
            cmd.setInt(6, t.getAluno().getMatricula());
            cmd.setInt(7, t.getInstrutor().getMatricula());
            cmd.setInt(8, t.getAtividade().getCodigo());
            cmd.execute();
        } catch (SQLException e) {
//         

            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        //DESCONECTANDO
        desconectar();

    }

    @Override
    public void atualizar(Turma t) throws Exception {
        // CONECTANDO
        conectar();
        //instrução sql correspondente a inserção da turma
        String sql = "UPDATE Turma SET tur_horarioaulas = ?, tur_duracaoaulas = ?, tur_datainicial = ?,"
                + " tur_datafinal= ?, alu_matricula = ?, ins_matricula = ?, atv_codigo= ? WHERE Tur_Codigo = ?;";

        try {
            //executando a instrução sql            
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setTime(1, t.getHorario());
            cmd.setTime(2, t.getDuracaoaula());
            cmd.setDate(3, t.getDtinicial());
            cmd.setDate(4, t.getDtfinal());
            cmd.setInt(5, t.getAluno().getMatricula());
            cmd.setInt(6, t.getInstrutor().getMatricula());
            cmd.setInt(7, t.getAtividade().getCodigo());
            cmd.setInt(8, t.getCodigo());
            cmd.execute();
        } catch (SQLException e) {
//         

            throw new Exception("Erro ao executar a atualização: " + e.getMessage());
        }
        //DESCONECTANDO
        desconectar();

    }

    @Override
    public void remover(Turma t) throws Exception {
        // CONECTANDO
        conectar();
        //Instrução sql para remover a turma
        String sql = "DELETE FROM turma WHERE Tur_Codigo = ?";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, t.getCodigo());
            cmd.execute();
        } catch (SQLException e) {
            throw new Exception("Erro ao executar remoção: " + e.getMessage());
        }
        //DESCONECTANDO
        desconectar();

    }

    @Override

    public ArrayList<Turma> listar(Turma filtro) throws Exception {
        int posPar = 1;
        ArrayList<Turma> retorno = new ArrayList<>();
        // CONECTANDO
        conectar();
        //INSTRUÇÃO SQL
        String sql = " SELECT tur_codigo AS 'Código', tur_horarioaulas AS 'Hora Aula', "
                + "tur_duracaoaulas AS 'Duração Aula', tur_datainicial AS 'Data Inicial', "
                + "tur_datafinal AS 'Data Final', alu_matricula AS 'Aluno Monitor', ins_matricula "
                + "AS 'Matrícula Instrutor', atv_codigo AS 'Código Atividade'";

        sql += " FROM Turma WHERE tur_codigo > 0 ";
        if (filtro.getCodigo() > 0) {
            sql += " AND tur_codigo = ?";
        }

        try {
            //EXECUTANDO A INSTRUÇÃO
            PreparedStatement cmd = conn.prepareStatement(sql);
            if (filtro.getCodigo() > 0) {
                cmd.setInt(posPar, filtro.getCodigo());
                posPar++;
            }
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                Turma t = new Turma();
                t.setCodigo(leitor.getInt("Código"));
                t.setHorario(leitor.getTime("Hora Aula"));
                t.setDuracaoaula(leitor.getTime("Duração Aula"));
                t.setDtinicial(leitor.getDate("Data Inicial"));
                t.setDtfinal(leitor.getDate("Data Final"));
                t.getAluno().setMatricula(leitor.getInt("Aluno Monitor"));
                t.getInstrutor().setMatricula(leitor.getInt("Matrícula Instrutor"));
                t.getAtividade().setCodigo(leitor.getInt("Código Atividade"));

                retorno.add(t);

            }

        } catch (SQLException e) {

            throw new Exception("Erro ao executar a listagem: " + e.getMessage());
        }
        //DESCONECTANDO
        desconectar();
        return retorno;

    }

    @Override
    public boolean verificaExistencia(Turma a) throws Exception {
        boolean retorno = false;

        conectar();
        //INSTRUÇÃO SQL
        String sql = " SELECT tur_codigo";
        sql += " FROM Turma WHERE tur_codigo = ? ";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            Turma t = new Turma();
            cmd.setInt(1, t.getCodigo());
            ResultSet leitor = cmd.executeQuery();
            while (leitor.next()) {
                retorno = true;
                break;
            }
        } catch (SQLException e) {

            throw new Exception("Erro ao pesquisar existtencia: " + e.getMessage());
        }

        desconectar();
        return retorno;
    }

    @Override
    public Aluno pegarMonitor(Turma t) throws Exception {
        Aluno retorno = new Aluno();
        conectar();
        //INSTRUÇÃO SQL
        String sql = "SELECT Alu.Alu_Matricula AS 'Matrícula', Alu.Alu_Nome AS 'Nome', Alu.Alu_Cpf AS 'CPF', Alu.Alu_Rg AS 'RG', Alu.Alu_Telefone AS 'Contato'," +
                     "Alu.Alu_datamatricula AS 'Data Matrícula', Alu.Alu_nascimento AS 'Data Nascimento', Alu.Alu_altura AS 'Altura', Alu.Alu_peso AS 'Peso', Alu.Alu_logradouro AS 'Logradouro'," +
                     "Alu.Alu_Numero AS 'Numero', Alu.Alu_Complemento AS 'Complemento', Alu.Alu_Bairro AS 'Bairro', Alu.Alu_Cep AS 'CEP', Alu.Alu_Cidade AS 'Cidade', Alu.Alu_Uf AS 'Uf', Alu.Alu_Pais AS 'País' ";
        sql += "FROM Turma AS Tur ";
        sql += "INNER JOIN Aluno AS Alu ON Tur.Alu_Matricula = Alu.Alu_Matricula ";
        sql += "WHERE Tur.Tur_Codigo = ?;";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, t.getCodigo());
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

            throw new Exception("Erro ao solicitar aluno Monitor: " + e.getMessage());
        }

        desconectar();
        return retorno;

    }

    @Override
    public ArrayList<Aluno> listarAlunos(Turma filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.   
    }

   

}
