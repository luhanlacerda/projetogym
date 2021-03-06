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
        //return this.conectarSqlServer();
        return this.conectarSqlServer();
    }

    public void desconectar() throws SQLException {
        conn.close();
    }

    private Statement conectarSqlServer() throws ClassNotFoundException, SQLException {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=ProjetoAcademia";
        String usuario = "sa";
        String senha = "123";
        Class.forName(driver);
        //obtem uma conexao com o sgbd
        conn = DriverManager.getConnection(url, usuario, senha);
        stmt = conn.createStatement();
        return stmt;
    }

        private Statement conectarMySql() throws ClassNotFoundException, SQLException {
        try {

            
            String driver = "com.mysql.jdbc.Driver";
            String dataBaseName = "ProjetoAcademia";
            String url = "jdbc:mysql://localhost:3306/";
            String usuario = "root";
            String senha = "";
            Class.forName(driver).newInstance();
            conn = (Connection) DriverManager.getConnection(url + dataBaseName, usuario, senha);
            stmt = conn.createStatement();
            return stmt;
        } catch (InstantiationException ex) {
            throw new SQLException(ex.getMessage());
        } catch (IllegalAccessException ex) {
            throw new SQLException(ex.getMessage());
        }
    }
}