/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.github.model;

/**
 *
 * @author user
 */
public class Premiacao {
    protected String nomeConcurso;
    protected String categoria;

    public String getNomeConcurso() {
        return nomeConcurso;
    }

    public void setNomeConcurso(String nomeConcurso) {
        this.nomeConcurso = nomeConcurso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
