package com.mycompany.javacinav2;

import Interfaces.InterfaceAtend;
import Interfaces.InterfaceValidar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioAtendenteDAO {

    public static void GerarFilaVacinação() {

        String sql = "SELECT * from tb_pessoas WHERE data_vacinacao is null order by prioridade";

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.executeQuery(sql);
            DefaultTableModel tabela = (DefaultTableModel) InterfaceAtend.tabelaFila.getModel();
            tabela.setNumRows(0);
            while (rs.next()) {
                tabela.addRow(new Object[]{
                    rs.getString("codigo"),
                    rs.getString("nome"),
                    rs.getString("data_nasc"),
                    rs.getString("endereco"),
                    rs.getString("profissao"),
                    rs.getString("data_vacinacao")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar fila de vacinação.");
        }

    }

    public static void GerarFilaValidacao() {

        String sql = "SELECT * from tb_pessoas WHERE data_vacinacao is not null order by nome";

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.executeQuery(sql);
            DefaultTableModel tabela = (DefaultTableModel) InterfaceValidar.tabelaValidar.getModel();
            tabela.setNumRows(0);
            while (rs.next()) {
                tabela.addRow(new Object[]{
                    rs.getString("codigo"),
                    rs.getString("nome"),
                    rs.getString("data_nasc"),
                    rs.getString("endereco"),
                    rs.getString("profissao"),
                    rs.getString("data_vacinacao")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar fila de validação.");
        }

    }

    public void Vacinar(Pessoa pessoa) {
        String sql = "UPDATE tb_pessoas SET data_vacinacao = ?  WHERE codigo = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, pessoa.getDataVacinacao().toString());
            ps.setInt(2, pessoa.getCodigo());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Pessoa vacinada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao salvar nova vacinacao.");
        }

    }
}
