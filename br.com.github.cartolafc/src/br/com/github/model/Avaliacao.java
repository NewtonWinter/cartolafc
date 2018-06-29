/**
 * Classe para avaliação de um filme, com observações e 
 * e uma nota dada pelo usuário
 */
package br.com.github.model;

/**
 *
 * @author user
 */
public class Avaliacao {
    private int nota;
    private String observacao;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
