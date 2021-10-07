package com.mycompany.javacinav2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "@Usuario10.";
    private String host = "localhost";
    private String porta = "3306";
    private String db = "db_javacina";
    

    
    public Connection getConexao(){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", usuario, senha);
            return c;
        }   
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro de conexão.");
            e.printStackTrace();
            return null;
        }
    }
    
}