/**
 * Classe para filmes que foram gravados para exibição em cinema
 */
package br.com.github.model;

import br.com.github.model.Filmes;

/**
 *
 * @author user
 */
public class FilmeParaCinema extends Filmes{
    private String paisesExibidosEstreia;
    private String faturamento;

    public String getPaisesExibidosEstreia() {
        return paisesExibidosEstreia;
    }

    public void setPaisesExibidosEstreia(String paisesExibidosEstreia) {
        this.paisesExibidosEstreia = paisesExibidosEstreia;
    }

    public String getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(String faturamento) {
        this.faturamento = faturamento;
    }
}
