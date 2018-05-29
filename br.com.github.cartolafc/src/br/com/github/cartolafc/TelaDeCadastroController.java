/*
 * Tela para cadastrar novos usuários
 */
package br.com.github.cartolafc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
