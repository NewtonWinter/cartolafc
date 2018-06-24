/*
 * Tela inicial do sistema
 */
package br.com.github.cartolafc;

import br.com.github.model.Usuario;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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
    private PasswordField senha;
    @FXML
    private Button btEntrar;
    @FXML
    private Button btNaoPossuiCadastro;
    @FXML
    private Label labelUsuarioInexistente;
    @FXML
    private Label labelDadosCorretos;
    @FXML
    private Label labelSenhaIncorreta;
    
    
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
    
    //@FXML
    private void irParaTelaDeAbertura() {
        Parent root;
        try {
            //modo 2
            Stage stage = ControleDeFilmes.stage;
            root = FXMLLoader.load(getClass().getResource("TelaDeAbertura.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (NullPointerException | IOException ex) {
            System.out.println("Senhor programador verifique o nome do arquivo FXML");
        }
    }

    @FXML
    private void entrar(ActionEvent event1) throws SQLException {

        String validarUsuario = null;
        String testName = null;
        Usuario us = new Usuario();
        us.setNome(usuario.getText());
        
        //Fazendo conexao com o Banco de Dados
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.canoas.ifrs.edu.br:1521:XE", "ads_bd16", "ads_bd16");
        } catch (ClassNotFoundException ex) {
            System.out.println("ops" + ex);
        } catch (SQLException ex) {
            System.out.println("ops 2" + ex);
        }
        if (connection != null) {
            System.out.println("You have a new power!");
        } else {
            System.out.println("Noooooooooooo!");
        }

        //arraylist de instancias
        ArrayList<String> listaDeNomes = new ArrayList();

        //Selecionando dados do Banco de Dados
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM usuario_java");
        ResultSet resultado = ps.executeQuery();

        while (resultado.next()) {
            listaDeNomes.add(resultado.getString("nome"));//guardo os nomes existentes em uma lista
            //System.out.println(listaDeNomes);
        }

        //Verificar se o nome informado existe, verificando a lista de nomes
        if (listaDeNomes.contains(us.getNome())) {
        } else {
            labelUsuarioInexistente.setVisible(true);
        }

        PreparedStatement ps1 = connection.prepareStatement("SELECT * FROM usuario_java WHERE nome = ?");
        ps1.setString(1, us.getNome());
        ResultSet resultado1 = ps1.executeQuery();

        while (resultado1.next()) {
            testName = resultado1.getString("senha");
            //System.out.println(testName);
        }

        if (senha.getText().equals(testName)) {
            irParaTelaDeAbertura();
        } else {
            labelSenhaIncorreta.setVisible(true);
        }

        //Fechando a conexão com o Banco de Dados
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
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
