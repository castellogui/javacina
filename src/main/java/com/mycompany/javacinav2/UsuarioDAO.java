package com.mycompany.javacinav2;

import com.mycompany.javacinav2.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public UsuarioDAO() {
    }

    public void AcessarSistema(Usuario user) {

        String sql = "SELECT * from tb_usuarios where BINARY usuario = ? AND senha = ?";

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getSenha());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user.setCodigo(rs.getInt("codigo"));
                user.setNome(rs.getString("nome"));
                user.setEmail(rs.getString("email"));
                user.setPermissao(rs.getString("permissao"));
                user.setPrimeiroAcesso(rs.getString("primeiro_acesso"));
                switch (user.getPrimeiroAcesso()) {
                    case "1":
                        String novaSenha = JOptionPane.showInputDialog("Digite sua nova senha:");
                        String sqlUpdate = "UPDATE tb_usuarios SET senha = ?, primeiro_acesso = 0 WHERE usuario = ?";
                        PreparedStatement pst = c.prepareStatement(sqlUpdate);
                        pst.setString(1, novaSenha);
                        pst.setString(2, user.getUsuario());
                        pst.execute();
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario/Senha incorretos.");
                //Conferir com prof.
                user.setPermissao("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar o login.");
            e.printStackTrace();
        }
    }

}
