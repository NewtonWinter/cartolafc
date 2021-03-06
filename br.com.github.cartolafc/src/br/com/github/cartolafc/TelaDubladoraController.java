/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.github.cartolafc;

import br.com.github.model.Dubladora;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class TelaDubladoraController implements Initializable {

    @FXML
    private TextField textoNomeEmpresa;
    @FXML
    private TextArea textoDubladores;
    @FXML
    private Button cadastrarDubladora;

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
