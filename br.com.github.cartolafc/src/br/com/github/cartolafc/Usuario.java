/*
 * Classe que contém os dados do usuário
 */
package br.com.github.cartolafc;

/**
 *
 * @author Newton Winter
 */
public class Usuario {

    private String senha;
    private String email;
    private String nome;
    
    /**
     * @param nomeInformado - nome informado na tela inicial
     * @param senhaInformada - senha informada na tela inicial
     *
     * @return boolean - se senha e nome informados são iguais aos contidos no
     * banco de dados
     */
    public boolean verificaNome(String nomeInformado, String senhaInformada) {
        if (nomeInformado.equals(nomeInformado)) {
            return true;
        } else {
            return false;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
