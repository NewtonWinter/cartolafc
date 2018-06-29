/**
 * Dados do est´dio que gravou o filme
 */
package br.com.github.model;

/**
 *
 * @author user
 */
public class Estudio {
    private String nome;
    private String pais;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
