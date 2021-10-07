package Interfaces;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.javacinav2.Relatorio;
import com.mycompany.javacinav2.RelatorioDAO;
import com.mycompany.javacinav2.Usuario;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfaceRelatorio extends javax.swing.JFrame {

    Usuario user;
    DefaultTableModel tabela;

    public InterfaceRelatorio(Usuario user) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Javacina");
        ImageIcon img = new ImageIcon("E:\\Documentos\\Javacina\\Codigo\\JavacinaV2\\images\\icon.jpg");
        txtRelatorio.setText("Aqui será gerado o relatório de vacinação de acordo com \nas datas iniciais e finais selecionadas.");
        this.setIconImage(img.getImage());
        this.user = user;
        DefaultTableModel tabela = (DefaultTableModel) tabelaRelatorio.getModel();
        this.tabela = tabela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        lblRelatorio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        btnSalvarPDF = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        comboDiaFinal = new javax.swing.JComboBox<>();
        comboMesFinal = new javax.swing.JComboBox<>();
        comboAnoFinal = new javax.swing.JComboBox<>();
        comboDataInicial = new javax.swing.JPanel();
        comboDiaInicio = new javax.swing.JComboBox<>();
        comboMesInicio = new javax.swing.JComboBox<>();
        comboAnoInicio = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRelatorio = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(820, 500));
        setResizable(false);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblRelatorio.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblRelatorio.setText("Relatórios");

        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Data de Nascimento", "Endereço", "Trabalha na Saúde", "Data de Vacinação"
            }
        ));
        jScrollPane1.setViewportView(tabelaRelatorio);
        if (tabelaRelatorio.getColumnModel().getColumnCount() > 0) {
            tabelaRelatorio.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        btnSalvarPDF.setText("Salvar como PDF");
        btnSalvarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPDFActionPerformed(evt);
            }
        });

        btnRelatorio.setText("Gerar Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Final"));

        comboDiaFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        comboMesFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        comboAnoFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(comboMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(comboAnoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAnoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        comboDataInicial.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Inicial"));

        comboDiaInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        comboMesInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        comboAnoInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020" }));

        javax.swing.GroupLayout comboDataInicialLayout = new javax.swing.GroupLayout(comboDataInicial);
        comboDataInicial.setLayout(comboDataInicialLayout);
        comboDataInicialLayout.setHorizontalGroup(
            comboDataInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboDataInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(comboMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(comboAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        comboDataInicialLayout.setVerticalGroup(
            comboDataInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboDataInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comboDataInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        txtRelatorio.setEditable(false);
        txtRelatorio.setColumns(20);
        txtRelatorio.setRows(5);
        jScrollPane2.setViewportView(txtRelatorio);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblRelatorio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(comboDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvarPDF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRelatorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarPDF)
                    .addComponent(btnRelatorio)
                    .addComponent(btnVoltar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed

        
        //Entrada e criação das datas.
        String dataInicial = comboAnoInicio.getSelectedItem().toString() + "-" + comboMesInicio.getSelectedItem().toString() + "-" + comboDiaInicio.getSelectedItem().toString();
        String dataFinal = comboAnoFinal.getSelectedItem().toString() + "-" + comboMesFinal.getSelectedItem().toString() + "-" + comboDiaFinal.getSelectedItem().toString();
        
        //Formatação de datas para realizar contagem de dias.
        LocalDate dataInicialFormatada = LocalDate.of(Integer.parseInt(comboAnoInicio.getSelectedItem().toString()), Integer.parseInt(comboMesInicio.getSelectedItem().toString()), Integer.parseInt(comboDiaInicio.getSelectedItem().toString()));
        LocalDate dataFinalFormatada = LocalDate.of(Integer.parseInt(comboAnoFinal.getSelectedItem().toString()), Integer.parseInt(comboMesFinal.getSelectedItem().toString()), Integer.parseInt(comboDiaFinal.getSelectedItem().toString()));
        double dias = (dataInicialFormatada.until(dataFinalFormatada, ChronoUnit.DAYS) + 1);
        
        

        //Criação de objetos que chamarão metodo para geração da tabela do relatório.
        Relatorio rel = new Relatorio();
        RelatorioDAO relDAO = new RelatorioDAO();
        relDAO.GerarListaRelatorio(dataInicial, dataFinal);
        relDAO.ContatorGeradorRelatorios(rel, dataInicial, dataFinal);
        
        //Calculo média de vacinados por dia.
        double mediaVacinacaoDiariaTotal = (rel.getTotal()/dias);
        double mediaVacinacaoDiariaMaior90 = (rel.getMaiores90()/dias);
        double mediaVacinacaoDiariaEntre7090 = (rel.getEntre70E90()/dias);
        double mediaVacinacaoDiariaEntre5070 = (rel.getEntre50E70()/dias);
        double mediaVacinacaoDiariaMenor50 = (rel.getMenores50()/dias);

        //Criação de texto do relatório.
        DecimalFormat deci = new DecimalFormat("0.00");
        txtRelatorio.setText("Total de " + rel.getTotal() + " pessoas vacinadas, com média diária de "+mediaVacinacaoDiariaTotal+" pessoas.\nNo periodo de " + comboDiaInicio.getSelectedItem().toString() + "/" + comboMesInicio.getSelectedItem().toString() + "/" + comboAnoInicio.getSelectedItem().toString()
                + " à " + comboDiaFinal.getSelectedItem().toString() + "/" + comboMesFinal.getSelectedItem().toString() + "/" + comboAnoFinal.getSelectedItem().toString() + ".\n"
                + "Sendo:\n"
                + "• " + rel.getMaiores90() + " pessoa(s) maior(es) de 90 anos. Média diária de " +mediaVacinacaoDiariaMaior90+ " pessoas. \n  Resultando em " + "" + deci.format((double) (rel.getMaiores90() * 100) / rel.getTotal()) + "% dos vacinados no periodo selecionado.\n"
                + "• " + rel.getEntre70E90() + " pessoa(s) de 70 à 89 anos. Média diária de " +mediaVacinacaoDiariaEntre7090+ " pessoas. \n  Resultando em " + "" + deci.format((double) (rel.getEntre70E90() * 100) / rel.getTotal()) + "% dos vacinados no periodo selecionado.\n"
                + "• " + rel.getEntre50E70() + " pessoa(s) de 50 à 69 anos. Média diária de " +mediaVacinacaoDiariaEntre5070+ " pessoas. \n  Resultando em " + "" + deci.format((double) (rel.getEntre50E70() * 100) / rel.getTotal()) + "% dos vacinados no periodo selecionado.\n"
                + "• " + rel.getMenores50() + " pessoa(s) menor(es) de 50 anos. Média diária de " +mediaVacinacaoDiariaMenor50+ " pessoas. \n  Resultando em " + "" + deci.format((double) (rel.getMenores50() * 100) / rel.getTotal()) + "% dos vacinados no periodo selecionado.");
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        new InterfaceAdmin(user).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPDFActionPerformed
        Document documentoPDF = new Document();
        LocalDate dataHoje = LocalDate.now();

        try {

            File caminhoSalvar = null;

            JFileChooser salvandoArquivo = new JFileChooser();

            int confirmacaoSalvar = salvandoArquivo.showSaveDialog(this);

            if (confirmacaoSalvar == JFileChooser.APPROVE_OPTION) {
                caminhoSalvar = salvandoArquivo.getSelectedFile().getAbsoluteFile();

                String caminho = caminhoSalvar.toString().concat(".pdf");
                PdfWriter.getInstance(documentoPDF, new FileOutputStream(caminho));
                documentoPDF.open();
                documentoPDF.setPageSize(PageSize.A4);
                Paragraph paragrafo = new Paragraph("Javacina: Gerenciador de Fila de Vacinação\n" + "Relatório de média de pessoas vacinadas." + txtRelatorio.getText() + "\nExtraído em: " + dataHoje);
                documentoPDF.add(paragrafo);
                JOptionPane.showMessageDialog(rootPane, "PDF salvo em " + caminhoSalvar.toString().concat(".pdf"));
                int confirm = JOptionPane.showConfirmDialog(rootPane, "Deseja abrir o relatório?", "Confirmação de Relatório", 2);
                switch (confirm) {
                    case 0: {
                        Desktop desktop = Desktop.getDesktop();
                        desktop.open(new File(caminho));
                    }
                }

            }

        } catch (DocumentException | IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao gerar PDF do relatorio.");
        } finally {
            documentoPDF.close();
        }
    }//GEN-LAST:event_btnSalvarPDFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSalvarPDF;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboAnoFinal;
    private javax.swing.JComboBox<String> comboAnoInicio;
    private javax.swing.JPanel comboDataInicial;
    private javax.swing.JComboBox<String> comboDiaFinal;
    private javax.swing.JComboBox<String> comboDiaInicio;
    private javax.swing.JComboBox<String> comboMesFinal;
    private javax.swing.JComboBox<String> comboMesInicio;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRelatorio;
    public static javax.swing.JTable tabelaRelatorio;
    public static javax.swing.JTextArea txtRelatorio;
    // End of variables declaration//GEN-END:variables
}
