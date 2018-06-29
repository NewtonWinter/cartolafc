/**
 * Classe para guardar a cidade, caso o filme tenha recebido uma premiação nacional
 */
package br.com.github.model;

/**
 *
 * @author user
 */
public class PremiacaoNacional extends Premiacao{

    private String cidade;
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
