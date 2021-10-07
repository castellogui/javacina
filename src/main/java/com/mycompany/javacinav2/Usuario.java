package com.mycompany.javacinav2;

public class Usuario {

    private int codigo;
    private String primeiroAcesso;
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private String permissao;

    public Usuario() {
    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(String nome, String email, String usuario, String senha, String permissao) {
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.permissao = permissao;
    }

    public Usuario(int codigo, String nome, String email, String usuario, String senha, String permissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.permissao = permissao;
    }

    //Gets

    public int getCodigo() {
        return codigo;
    }
    
    public String getPrimeiroAcesso() {
        return primeiroAcesso;
    }
        
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getPermissao() {
        return permissao;
    }

    //Sets

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setPrimeiroAcesso(String primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

}
