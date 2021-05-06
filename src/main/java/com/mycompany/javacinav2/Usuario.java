package com.mycompany.javacinav2;

public class Usuario {
    
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private String administrador;
    
    private void AcessarSistema(){
        
    }

    public Usuario() {
    }    
    
    //Gets
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

    public String getTipoUsuario() {
        return administrador;
    }

    
    //Sets
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

    public void setTipoUsuario(String tipoUsuario) {
        this.administrador = tipoUsuario;
    }
    
    
    
    
    
}
