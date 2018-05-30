/*
 * Tela inicial do sistema
 */
package br.com.github.cartolafc;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Tela inicial
 *
 * @author Newton Winter
 */
public class TelaInicialController implements Initializable {

    @FXML
    private TextField usuario;
    @FXML
    private TextField senha;
    @FXML
    private Button btEntrar;
    @FXML
    private Button btNaoPossuiCadastro;
    @FXML
    private Label labelDadosIncorretos;
    
    @FXML
    private void irParaTelaDeCadastro(ActionEvent event) {
        
        Parent root;
        try {

            //modo 2
            Stage stage = ControleDeFilmes.stage;

            root = FXMLLoader.load(getClass().getResource("TelaDeCadastro.fxml"));
            Scene scene = new Scene(root);

            stage.setScene(scene);

        } catch (NullPointerException | IOException ex) {
            System.out.println("Senhor programador verifique o nome do arquivo FXML");
        }
    }
    
    @FXML
    private void entrar(ActionEvent event1){
        //labelDadosIncorretos.setVisible(true);
        
        //Fazendo conexao com o Banco de Dados
        Connection connection = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.canoas.ifrs.edu.br:1521:XE","ads_bd16","ads_bd16");       
        }catch (ClassNotFoundException ex){
            System.out.println("ops" + ex);
        }catch (SQLException ex){
            System.out.println("ops 2" + ex);
        }
        if(connection != null){
            System.out.println("You have a new power!");
        }else{
            System.out.println("Noooooooooooo!");
        }
        
        //Selecionando um dados da tabela
        String selectSQL = "SELECT ? FROM usuario_java where nome = ";
        
        Statement st;
        try {
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectSQL);
            while(rs.next()) {
                Usuario p = new Usuario();
                p.setNome(rs.getString(selectSQL));
                p.setSenha(rs.getString(selectSQL));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
