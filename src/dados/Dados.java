/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luhan
 */
public class Dados {
    private Statement stmt;
    public Connection conn;

    public Statement conectar() throws ClassNotFoundException, SQLException {
        return this.conectarSqlServer();
    }

    public void desconectar() throws SQLException {
        conn.close();
    }

    private Statement conectarSqlServer() throws ClassNotFoundException, SQLException {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://LUHAN:1433;DatabaseName=ProjetoAcademia";
        String usuario = "luhan";
        String senha = "123456";
        Class.forName(driver);
        //obtem uma conexao com o sgbd
        conn = DriverManager.getConnection(url, usuario, senha);
        stmt = conn.createStatement();
        return stmt;
    }
        private Statement conectarPostGreSql() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String local = "localhost";
        String banco = "TeAmoProfessorMelo";
        String usuario = "postgres";
        String senha = "unibratec";
        conn = DriverManager.getConnection("jdbc:postgresql://"
                + local + "/" + banco
                + "?charSet=LATIN1", usuario,
                senha);
        //stmt = conn.createStatement();
        return conn.createStatement();
        //return stmt;
    }
}