/**
 * Caso o filme esteja gravado em uma mídia física e tenha sido emprestada,
 * guardam-se os dados de quem fez o empréstimo
 */
package br.com.github.model;

/**
 *
 * @author user
 */
public class Emprestimo {
    
    private String nome;
    private String endereco;
    private String dataInicio;
    private String dataDevolucao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
