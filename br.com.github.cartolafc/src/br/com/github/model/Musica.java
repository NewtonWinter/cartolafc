/**
 * Classe para guardar os nomes das bandas e das principais músicas do filme
 */
package br.com.github.model;

/**
 *
 * @author user
 */
public class Musica {
    private String banda;
    private String nomeMusica;

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }
}
