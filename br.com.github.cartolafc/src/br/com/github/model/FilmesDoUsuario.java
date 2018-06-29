/**
 * Classe para facilitar o funcionamento do programa
 */
package br.com.github.model;

import java.util.List;

/**
 *
 * @author user
 */
public class FilmesDoUsuario {
    
    private Usuario usuario;
    private Filmes filmes;
    private int nota;
    private String obs;
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Filmes getFilmes() {
        return filmes;
    }

    public void setFilmes(Filmes filmes) {
        this.filmes = filmes;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
}
