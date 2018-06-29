/**
 * Classe para guardar o nome do concurso e a categoria, caso o filme tenha rtecebido
 * premiação em algum festival
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
