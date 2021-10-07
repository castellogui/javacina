package com.mycompany.javacinav2;

import Interfaces.InterfaceRelatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioDAO {

    public void GerarListaRelatorio(String dataInicial, String dataFinal) {

        String sql = "SELECT * FROM tb_pessoas WHERE data_vacinacao BETWEEN '" + dataInicial + "' AND '" + dataFinal + "'";

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.getConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();
            DefaultTableModel tabela = (DefaultTableModel) InterfaceRelatorio.tabelaRelatorio.getModel();
            tabela.setNumRows(0);
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
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar lista de vacinados.");
        }

    }

    public void ContatorGeradorRelatorios(Relatorio r, String dataInicial, String dataFinal) {
        String sql = "";
        
        for (int x = 1; x < 6; x++) {
            switch (x) {
                case 1:
                    //Todas as pessoas.
                    sql = "SELECT * FROM tb_pessoas WHERE data_vacinacao BETWEEN '" + dataInicial + "' AND '" + dataFinal + "'";
                    break;
                case 2:
                    //Maiores que 90 anos.
                    sql = "SELECT * from tb_pessoas WHERE timestampdiff (YEAR,data_nasc,curdate()) >= 90 and data_vacinacao BETWEEN '" + dataInicial + "' AND '" + dataFinal + "'";
                    break;
                case 3:
                    //Entre 70 e 89 anos.
                    sql = "SELECT * from tb_pessoas WHERE timestampdiff (YEAR,data_nasc,curdate()) >= 70 and  timestampdiff (YEAR,data_nasc,curdate()) < 90 and data_vacinacao BETWEEN '" + dataInicial + "' AND '" + dataFinal + "'";
                    break;
                case 4:
                    //Entre 50 e 69 anos.
                    sql = "SELECT * from tb_pessoas WHERE timestampdiff (YEAR,data_nasc,curdate()) >= 50 and  timestampdiff (YEAR,data_nasc,curdate()) < 70 and data_vacinacao BETWEEN '" + dataInicial + "' AND '" + dataFinal + "'";
                    break;
                case 5:
                    //Até 50 anos.
                    sql = "SELECT * from tb_pessoas WHERE timestampdiff (YEAR,data_nasc,curdate()) < 50 and data_vacinacao BETWEEN '" + dataInicial + "' AND '" + dataFinal + "'";
                    break;
            }
            int contador = 0;
            ConnectionFactory factory = new ConnectionFactory();

            try (Connection c = factory.getConexao()) {
                PreparedStatement ps = c.prepareStatement(sql);
                ps.execute();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    contador++;
                }                
                switch (x) {
                    case 1:
                        r.setTotal(contador);
                        break;
                    case 2:
                        r.setMaiores90(contador);
                        break;
                    case 3:
                        r.setEntre70E90(contador);
                        break;
                    case 4:
                        r.setEntre50E70(contador);
                        break;
                    case 5:
                        r.setMenores50(contador);
                        break;
                }

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao gerar relatorio.");
            }
        }
    }
}
