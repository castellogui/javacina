package com.mycompany.javacinav2;

//Criacao da classe UsuarioAdministrador com heranca da classe Usuario
public class UsuarioAdministrador extends Usuario {

    public UsuarioAdministrador(String nome, String email, String usuario, String senha, String permissao) {
        super(nome, email, usuario, senha, permissao);
    }


    public UsuarioAdministrador(int codigo, String nome, String email, String usuario, String senha, String permissao){
        super(codigo, nome, email, usuario, senha, permissao);
    }
}
