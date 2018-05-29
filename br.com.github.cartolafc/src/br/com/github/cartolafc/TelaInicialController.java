/*
 * Tela inicial do sistema
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
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
