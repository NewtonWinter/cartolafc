/*
 * Classe de conexão que serve apenas para conectar no Oracle do campus Canoas.
 */
package br.com.github.cartolafc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Newton Winter
 */
public class Conexao {
    private String usuario = "ads_bd16";
    private String senha = "ads_bd16";
    private String servidor = "oracle.canoas.ifrs.edu.br";
    private int porta = 1521;

    private Connection conexao = null;

    public Conexao() {
    }//inicia com os valores padrões

    public Conexao(
            String usuario,
            String senha) {
        this.senha = senha;
        this.usuario = usuario;
    }

    public Connection getConexao() {
        if (conexao == null) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conexao = DriverManager.getConnection(
                        "jdbc:oracle:thin:@" + this.servidor + ":" + this.porta + ":XE",
                        this.usuario,
                        this.senha);

            } catch (ClassNotFoundException e) {
                System.out.println("Senhor programador! Importe o pacote do DB antes de chingar o java");
            } catch(SQLException e){
                e.printStackTrace(); //Sei lá que diabos tu fez então olhe com calma as coisas.
            }

        }
        return conexao;
    }

    public void desconecta() {
        try {
            conexao.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    PreparedStatement prepareStatement(String insertTableSQL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
