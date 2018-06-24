/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.github.cartolafc;

import br.com.github.model.Usuario;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Aluno
 */
public class ControleDeFilmes extends Application {

    //instancia singleton ou StaticSubstitution
    public static Stage stage;
    private static  Usuario usuario;


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TelaInicial.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        //Setando o Singleton la de cima
        ControleDeFilmes.stage = stage;
    }


    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        ControleDeFilmes.usuario = usuario;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

}
