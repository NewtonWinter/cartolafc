/**
 * Classe para guardar o país, caso o filme tenha recebido uma premiação internacional
 */
package br.com.github.model;

/**
 *
 * @author user
 */
public class PremiacaoInternacional extends Premiacao{
    
    private String pais;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
