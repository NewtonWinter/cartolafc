/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.github.cartolafc;

import br.com.github.model.FilmeParaCinema;
import br.com.github.model.FilmeParaTv;
import br.com.github.model.Filmes;
import br.com.github.model.Usuario;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private void filmeParaTv() {
        textoEmissoraTvQueEstreou.setVisible(true);
        textoDataEstreia.setVisible(true);
        labelEmissoraTvQueEstreou.setVisible(true);
        labelDataEstreia.setVisible(true);
    }

    @FXML
    private void filmeParaCinema() {
        textoPaisDeEstreia.setVisible(true);
        textoFaturamento.setVisible(true);
        labelPaisDeEstreia.setVisible(true);
        labelFaturamento.setVisible(true);
    }

    public void voltarParaTelaDeAbertura() {

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
    private void cadastrarUmFilme(ActionEvent ev1) {
        Usuario us = ControleDeFilmes.getUsuario();

        Filmes f = new Filmes();
        f.setNomeFilme(textoNomeFilme.getText());
        f.setTempoDeDuracao(Integer.parseInt(textoDuracaoFilme.getText()));//convertendo String em texto
        f.setAnoDeLancamento(Integer.parseInt(textoLancamentoFilme.getText()));//convertendo String em texto
        f.setPais(textoPaisFilme.getText());
        f.setSinopse(textoSinopseFilme.getText());
        f.setEstaNoAcervo(textoEstaNoAcervoFilmes.getText());

        FilmeParaCinema fpc = new FilmeParaCinema();
        fpc.setPaisesExibidosEstreia(textoPaisDeEstreia.getText());
        fpc.setFaturamento(textoFaturamento.getText());

        FilmeParaTv fpt = new FilmeParaTv();
        fpt.setDataExibicao(textoDataEstreia.getText());
        fpt.setEmissorasEstreia(textoEmissoraTvQueEstreou.getText());

        //Conectar com o Banco de Dados para guardar as informações
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

        //Insere os dados
        String insertTableSQL = "INSERT INTO filmes_java"
                + "(nome, lancamento, duracao, pais, sinopse, estanoacervo) VALUES"
                + "(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(insertTableSQL);
            ps.setString(1, f.getNomeFilme());
            ps.setInt(2, f.getAnoDeLancamento());
            ps.setInt(3, f.getTempoDeDuracao());
            ps.setString(4, f.getPais());
            ps.setString(5, f.getSinopse());
            ps.setString(6, f.getEstaNoAcervo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }

        String insertTableSQL2 = "INSERT INTO usuario_filmes_java"
                + "(nomeusuario, nomefilmes) VALUES"
                + "(?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(insertTableSQL2);
            ps.setString(1, us.getNome());
            ps.setString(2, f.getNomeFilme());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }

//        String insertTableSQL3 = "INSERT INTO paracinema_java"
//                + "(nomefilmes, paisesexibidosestreia, faturamento) VALUES"
//                + "(?,?,?)";
//        try {
//            PreparedStatement ps = connection.prepareStatement(insertTableSQL);
//            ps.setString(1, f.getNomeFilme());
//            ps.setString(2, fpc.getPaisesExibidosEstreia());
//            ps.setString(3, fpc.getFaturamento());
//            ps.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(TelaDeCadastroController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        String insertTableSQL4 = "INSERT INTO paratv_java"
//                + "(nomefilmes, dataexibicao, emissorasestreia) VALUES"
//                + "(?,?,?)";
//        try {
//            PreparedStatement ps = connection.prepareStatement(insertTableSQL);
//            ps.setString(1, f.getNomeFilme());
//            ps.setString(2, fpt.getDataExibicao());
//            ps.setString(3, fpt.getEmissorasEstreia());
//            ps.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(TelaDeCadastroController.class.getName()).log(Level.SEVERE, null, ex);
//        }

        //Desconecta do Banco de dados
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        voltarParaTelaDeAbertura();
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
