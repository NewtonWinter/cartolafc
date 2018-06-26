/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.github.cartolafc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class DiretorController implements Initializable {

    @FXML
    private TextField textoNomeDiretor;
    @FXML
    private Button btCadastrarDiretor;

    @FXML
    public void voltarParaTelaCadastrarFilmes() {
        Parent root;
        try {
            //modo 2
            Stage stage = ControleDeFilmes.stage;
            root = FXMLLoader.load(getClass().getResource("TelaCadastrarFilmes.fxml"));
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
