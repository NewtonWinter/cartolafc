/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.github.cartolafc;

import br.com.github.model.Dubladora;
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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author user
 */
public class TelaDubladoraController implements Initializable {

    @FXML
    private TextField textoNomeEmpresa;
    @FXML
    private ListView<?> ListListaDubladores;
    @FXML
    private Button btCadastrarDubladora;
    @FXML
    private Button btAcrescentarDublador;
    @FXML
    private TextField textoDublador;
    
    private List<String> nomesDubladores = new ArrayList<String>();
    
    private ObservableList<String> observableListListaDubladores;
    
    Dubladora dub = new Dubladora();
    
    @FXML
    public void carregarListListaDubladores(){
        //List<String> nomesDubladores = new ArrayList<String>();
        dub.setDublador(textoDublador.getText());
        nomesDubladores.add(dub.getDublador());
        
        observableListListaDubladores = FXCollections.observableArrayList(nomesDubladores);
        ListListaDubladores.setId(dub.getDublador());
    }
    
    @FXML
    private void cadastrarDubladora(){
        //Dubladora dub = new Dubladora();
        dub.setNomeEmpresa(textoNomeEmpresa.getText());
        carregarListListaDubladores();
        
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
    }
    /*
    //Insere os dados
        String insertTableSQL = "INSERT INTO dubladora_java"
                + "(nomeEmpresa, dublador) VALUES"
                + "(?,?)";
        try {   
            PreparedStatement ps = connection.prepareStatement(insertTableSQL);
            ps.setString(1, f.getNomeFilme());
            ps.setString(4, f.getPais());
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
        */
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
