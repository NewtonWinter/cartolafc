/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.github.model;

import br.com.github.model.Filmes;

/**
 *
 * @author user
 */
public class FilmeParaTv extends Filmes{
    private String emissorasEstreia;
    private String dataExibicao;

    public String getEmissorasEstreia() {
        return emissorasEstreia;
    }

    public void setEmissorasEstreia(String emissorasEstreia) {
        this.emissorasEstreia = emissorasEstreia;
    }

    public String getDataExibicao() {
        return dataExibicao;
    }

    public void setDataExibicao(String dataExibicao) {
        this.dataExibicao = dataExibicao;
    }
    
}
