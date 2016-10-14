/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoBD;

import dados.Dados;
import java.sql.*; // * importa tudo da biblioteca
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ELAINE
 */
public class BdadosConexaoTeste {
    // Deu erro de conexão, pediu para adicionar o Drive do sql Server na biblioteca
    
    // Tem que importar a biblioteca para realizar a conexão 
    // Esta é uma classe que precisa ser invocada para poder realizar a conexão, por si só ela não faz nada 
    
        Statement stm; // Responsável por preparar e realizar pesquisas no banco, código sql
        ResultSet rs;  // Responsavel por armazenar o resultado de uma pesquisa passada para o Statement
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // Identificador do servidor
        String caminho = "jdbc:sqlserver://localhost:1433;DatabaseName= ProjetoAcademia"; // Identificador do banco 
        String usuario = "elainearaujo"; // usuário do sqlServer
        String senha = "123"; // senha do sqlServer
        Connection con; // Responsavel pela conexão com o banco de dados 
        
        public void conexao (){ // Método responsável por conectar com o banco
            
            // SETRAR A PROPRIETADE DO SISTEMA
             
            try { // Tentativa Inicial
                System.setProperty("jbdc:Drivers", driver);  // seta a propriedade do driver com a conexão
                con = DriverManager.getConnection(caminho, usuario, senha ); // Responsavel por realizar conexão entre 
                                                                             // Armazena boolean
                JOptionPane.showMessageDialog(null, "Banco de Dados Conectado!"); 
            } catch (SQLException ex) { // Excessão     // Pede para circundar com try catch, gerou automaticamente
                JOptionPane.showMessageDialog(null, "Erro ao conectar Banco de Dados!\n erro" + ex.getMessage());
            }
            
        }
        
   public void desconectar(){ // Método responsável por fechar a conexão com o Banco de Dados
       
            try {
                con.close(); // Quando cria isto pede p circundar com try catch
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o Banco de Dados\n erro" + ex.getMessage());
            }
   }
}
