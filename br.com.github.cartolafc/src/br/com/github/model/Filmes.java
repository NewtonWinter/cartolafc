/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.github.model;

import br.com.github.model.Ator;

/**
 *
 * @author user
 */
public class Filmes {
    protected String nomeFilme;
    protected int tempoDeDuracao;
    protected int anoDeLancamento;
    protected String sinopse;
    protected String pais;
    protected String estaNoAcervo;
    protected Ator ator;
    protected FilmesDoUsuario filmesDoUsuario;

    public FilmesDoUsuario getFilmesDoUsuario() {
        return filmesDoUsuario;
    }

    public void setFilmesDoUsuario(FilmesDoUsuario filmesDoUsuario) {
        this.filmesDoUsuario = filmesDoUsuario;
    }
    
    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstaNoAcervo() {
        return estaNoAcervo;
    }

    public void setEstaNoAcervo(String estaNoAcervo) {
        this.estaNoAcervo = estaNoAcervo;
    }

    
}
