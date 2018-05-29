/*
 * Tela para cadastrar novos usuários
 */
package br.com.github.cartolafc;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML TelaDeCadastro
 *
 * @author Newton Winter
 */
public class TelaDeCadastroController implements Initializable {

    @FXML
    private TextField textoNome;
    @FXML
    private TextField textoSenha;
    @FXML
    private TextField textoEmail;
    @FXML
    private Button botaoCadastrar;

    @FXML
    private void cadastrar(ActionEvent ev) {
        Usuario u = new Usuario();
        u.setNome(textoNome.getText());
        u.setEmail(textoEmail.getText());
        u.setSenha(textoSenha.getText());
        
        //Conectar com o Banco de Dados para guardar as informações
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
        
        //Insere os dados
        String insertTableSQL = "INSERT INTO usuario_java"
                + "(nome, email, senha) VALUES"
                + "(?,?,?)";
        try {   
            PreparedStatement ps = connection.prepareStatement(insertTableSQL);
            ps.setString(1, u.getNome());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getSenha());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Desconecta do Banco de dados
        try{
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        //Volta para a tela inicial
        Parent root;
        try {

            //modo 2
            Stage stage = ControleDeFilmes.stage;

            root = FXMLLoader.load(getClass().getResource("TelaInicial.fxml"));
            Scene scene = new Scene(root);

            stage.setScene(scene);

        } catch (NullPointerException | IOException ex) {
            System.out.println("Senhor programador verifique o nome do arquivo FXML");
        }
    }
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
