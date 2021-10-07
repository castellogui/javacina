package com.mycompany.javacinav2;

import Interfaces.InterfaceCRUD;
import Interfaces.InterfaceRelatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioAdministradorDAO {

    public UsuarioAdministradorDAO() {
    }

    public void CriarUsuario(UsuarioAdministrador user) {
        //Criacao da string que sera utilizada no metodo prepareStatement para precompilacao de dados para Query do banco.
        String sql = "INSERT INTO tb_usuarios (primeiro_acesso, nome, email, usuario, senha, permissao) VALUES (1, ?, ?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getUsuario());
            ps.setString(4, user.getSenha());
            ps.setString(5, user.getPermissao());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar novo usuario.");
        }
    }

    public void RemoverUsuario(DefaultTableModel tabela, int linha) {

        int codigo = Integer.parseInt(tabela.getValueAt(linha, 0).toString());

        String sql = "DELETE FROM tb_usuarios WHERE codigo = ?";

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover novo usuario.");
        }
    }

    public void AtualizarUsuario(Usuario user, boolean check) {
        String sql = "";

        if (check) {
            sql = "UPDATE tb_usuarios SET nome = ?, email = ?, usuario = ?, senha = ?, permissao = ? WHERE codigo = ?";
        } else {
            sql = "UPDATE tb_usuarios SET nome = ?, email = ?, usuario = ?, permissao = ? WHERE codigo = ?";
        }

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getUsuario());
            if (check) {
                ps.setString(4, user.getSenha());
                ps.setString(5, user.getPermissao());
                ps.setInt(6, user.getCodigo());
            }else{
                ps.setString(4, user.getPermissao());
                ps.setInt(5, user.getCodigo());
            }
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuario modificado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao modificar usuario.");
        }
    }

    public void CadastrarPessoasFila(Pessoa pessoa) {
        //Criacao da string que sera utilizada no metodo prepareStatement para precompilacao de dados para Query do banco.
        String sql = "INSERT INTO tb_pessoas (nome, data_nasc, profissao, endereco, prioridade) VALUES (?, ?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao()) {

            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, pessoa.getNomePessoa());
            pst.setString(2, pessoa.getDataNascPessoa());
            pst.setString(3, pessoa.getTrabalhaSaudePessoa());
            pst.setString(4, pessoa.getEndereçoPessoa());
            pst.setInt(5, pessoa.getPrioridade());
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar pessoa a fila de vacinação.");
        }
    }

    public void GerarListaRelatorio(String dataInicial, String dataFinal) {

        String sql = "SELECT * FROM tb_pessoas WHERE data_vacinacao BETWEEN '" + dataInicial + "' AND '" + dataFinal + "'";

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.executeQuery(sql);
            DefaultTableModel tabela = (DefaultTableModel) InterfaceRelatorio.tabelaRelatorio.getModel();
            tabela.setNumRows(0);
            rs.last();
            int nLinha = rs.getRow();
            InterfaceRelatorio.txtRelatorio.setText("Total de pessoas vacinadas: " + String.valueOf(nLinha));
            rs.close();
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
                tabela.addRow(new Object[]{
                    rst.getString("codigo"),
                    rst.getString("nome"),
                    rst.getString("data_nasc"),
                    rst.getString("endereco"),
                    rst.getString("profissao"),
                    rst.getString("data_vacinacao")
                });

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar lista de vacinados.");
        }

    }

    public static void GerarListaUsuario(String index, String indexPermissao, String textoDigitado) {
        String sql = null;

        switch (index) {
            
            default: {
                sql = "SELECT * from tb_usuarios order by nome";
                break;
            }
            case "Id": {
                sql = "SELECT * FROM tb_usuarios WHERE codigo LIKE '%" + textoDigitado + "%' ORDER BY codigo";
                break;
            }
            case "Nome": {
                sql = "SELECT * FROM tb_usuarios WHERE nome LIKE '%" + textoDigitado + "%' ORDER BY nome";
                break;
            }
            case "Email": {
                sql = "SELECT * FROM tb_usuarios WHERE email LIKE '%" + textoDigitado + "%' ORDER BY email";
                break;
            }
            case "Usuario": {
                sql = "SELECT * FROM tb_usuarios WHERE usuario LIKE '%" + textoDigitado + "%' ORDER BY usuario";
                break;
            }
            case "Permissão": {
                switch (indexPermissao) {
                    case "Administrador": {
                        sql = "SELECT * FROM tb_usuarios WHERE permissao = '" + indexPermissao + "' AND nome LIKE '%" + textoDigitado + "%' ORDER BY nome";
                        break;
                    }
                    case "Atendente": {
                        sql = "SELECT * FROM tb_usuarios WHERE permissao = '" + indexPermissao + "' AND nome LIKE '%" + textoDigitado + "%' ORDER BY nome";
                        break;
                    }
                }
            }
        }

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.executeQuery(sql);
            DefaultTableModel tabela = (DefaultTableModel) InterfaceCRUD.tabelaUsuarios.getModel();
            tabela.setNumRows(0);
            while (rs.next()) {
                tabela.addRow(new Object[]{
                    rs.getString("codigo"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("usuario"),
                    rs.getString("permissao")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar lista de usuarios.");
        }

    }
}
