/*
 * Classe que contém atributos pertencentes ao usuário do sistema
 */
package br.com.github.cartolafc;

/**
 *
 * @author Newton Winter
 */
public class Usuario {
    protected String email;
    protected String senha;
    private boolean vip; //para sinalizar se o usuário é 'vip' ou 'normal'

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
