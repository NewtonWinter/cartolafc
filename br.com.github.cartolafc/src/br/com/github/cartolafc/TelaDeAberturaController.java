/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class TelaDeAberturaController implements Initializable {

    @FXML
    private Button buttonCadastrarFilme;
    @FXML
    private Button buttonPesquisarFilme;
    @FXML
    private Button buttonListarFilmes;
    
    @FXML
    private void irParaTelaCadastrarFilmes(ActionEvent event2) {
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
