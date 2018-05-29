/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.github.cartolafc;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField email;
    @FXML
    private TextField senha;
    @FXML
    private Button entrar;
    @FXML
    private Button naoPossuiConta;
    
    //arraylist de instancias
    ArrayList<Usuario> cadastros = new ArrayList();
    
    @FXML
    private void entrar(ActionEvent ev) {
        Usuario u = new Usuario();
        u.setEmail(email.getText());
        u.setSenha(senha.getText());
        
        if(cadastros.contains(u.getEmail())){
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
