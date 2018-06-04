/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.github.cartolafc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class TelaCadastrarFilmesController implements Initializable {

    @FXML
    private TextField textoNomeFilme;
    @FXML
    private TextField textoDuracaoFilme;
    @FXML
    private TextField textoLancamentoFilme;
    @FXML
    private TextField textoPaisFilme;
    @FXML
    private TextField textoEstaNoAcervoFilmes;
    @FXML
    private CheckBox emprestadoSim;
    @FXML
    private CheckBox emprestadoNao;
    @FXML
    private TextArea textoSinopseFilme;
    @FXML
    private Button buttonMusica;
    @FXML
    private Button buttonPremiacoes;
    @FXML
    private Button buttonSerie;
    @FXML
    private Button buttonLivro;
    @FXML
    private Button buttonHistoriaReal;
    @FXML
    private Button buttonEstudio;
    @FXML
    private Button buttonDubladora;
    @FXML
    private Button buttonDiretor;
    @FXML
    private Button buttonAtores;
    @FXML
    private Button buttonAvaliacao;
    @FXML
    private Button buttonCadastrarUmFilme;
    @FXML
    private CheckBox feitoParaTv;
    @FXML
    private CheckBox feitoParaCinema;
    @FXML
    private TextField textoEmissoraTvQueEstreou;
    @FXML
    private TextField textoDataEstreia;
    @FXML
    private TextField textoPaisDeEstreia;
    @FXML
    private TextField textoFaturamento;
    @FXML
    private Label labelEmissoraTvQueEstreou;
    @FXML
    private Label labelDataEstreia;
    @FXML
    private Label labelPaisDeEstreia;
    @FXML
    private Label labelFaturamento;

    @FXML
    private void filmeParaTv(){
        textoEmissoraTvQueEstreou.setVisible(true);
        textoDataEstreia.setVisible(true);
        labelEmissoraTvQueEstreou.setVisible(true);
        labelDataEstreia.setVisible(true);
    }
    
    @FXML
    private void filmeParaCinema(){
        textoPaisDeEstreia.setVisible(true);
        textoFaturamento.setVisible(true);
        labelPaisDeEstreia.setVisible(true);
        labelFaturamento.setVisible(true);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textoEmissoraTvQueEstreou.setVisible(false);
        textoDataEstreia.setVisible(false);
        textoPaisDeEstreia.setVisible(false);
        textoFaturamento.setVisible(false);
        labelEmissoraTvQueEstreou.setVisible(false);
        labelDataEstreia.setVisible(false);
        labelPaisDeEstreia.setVisible(false);
        labelFaturamento.setVisible(false);
    }    
    
}
