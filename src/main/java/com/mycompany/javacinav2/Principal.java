package com.mycompany.javacinav2;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
        UsuarioAdministrador adm = new UsuarioAdministrador();
        UsuarioAtendente atendente = new UsuarioAtendente();
        
        atendente.setUsuario("atendente");
        atendente.setSenha("atendente");
        
        adm.setUsuario("admin");
        adm.setSenha("admin");
        
        String usuario = JOptionPane.showInputDialog("insira seu login:");
        String senha = JOptionPane.showInputDialog("insira sua senha:");
        
        if(adm.getUsuario().equals(usuario) && adm.getUsuario().equals(senha)){
            
            JOptionPane.showMessageDialog(null, "login efetuado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "usuario/senha incorretos.");
        }
        
        
    }
}
