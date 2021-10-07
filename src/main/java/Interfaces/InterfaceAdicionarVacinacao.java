package Interfaces;

import com.mycompany.javacinav2.Pessoa;
import com.mycompany.javacinav2.Usuario;
import com.mycompany.javacinav2.UsuarioAdministradorDAO;
import Interfaces.InterfaceAdmin;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InterfaceAdicionarVacinacao extends javax.swing.JFrame {

    Usuario user;

    public InterfaceAdicionarVacinacao(Usuario user) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Javacina");
        ImageIcon img = new ImageIcon("E:\\Documentos\\Javacina\\Codigo\\JavacinaV2\\images\\icon.jpg");
        this.setIconImage(img.getImage());
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        checkTrabalhaSaude = new javax.swing.JCheckBox();
        btnCadastrarPessoaFila = new javax.swing.JButton();
        boxDia = new javax.swing.JComboBox<>();
        boxMes = new javax.swing.JComboBox<>();
        boxAno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomePessoa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtEnderecoPessoa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Pessoas à Fila de Vacinação."));

        checkTrabalhaSaude.setText("Trabalha na área da Saúde.");

        btnCadastrarPessoaFila.setEnabled(false);
        btnCadastrarPessoaFila.setText("Cadastrar Pessoa a Fila de Vacinação");
        btnCadastrarPessoaFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPessoaFilaActionPerformed(evt);
            }
        });

        boxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        boxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        boxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));
        boxAno.setToolTipText("");

        jLabel2.setText("Dia");

        jLabel3.setText("Ano");

        jLabel4.setText("Mês");

        txtNomePessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtEnderecoPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        txtEnderecoPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnderecoPessoaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkTrabalhaSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(boxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCadastrarPessoaFila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txtEnderecoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtEnderecoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkTrabalhaSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnCadastrarPessoaFila))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarPessoaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPessoaFilaActionPerformed

        String nomePessoa = txtNomePessoa.getText();
        String enderecoPessoa = txtEnderecoPessoa.getText();

        //Datas
        String diaPessoa = boxDia.getSelectedItem().toString();
        String mesPessoa = boxMes.getSelectedItem().toString();
        String anoPessoa = boxAno.getSelectedItem().toString();
        String dataNasc = anoPessoa + "-" + mesPessoa + "-" + diaPessoa;
        LocalDate dataHoje = LocalDate.now();
        LocalDate dataNasc2 = LocalDate.parse(dataNasc);
        int idade = Period.between(dataNasc2, dataHoje).getYears();
        int prioridade = 3;

        //Area da Saude
        String trabalhaSaude = "Não";
        if (checkTrabalhaSaude.isSelected()) {
            trabalhaSaude = "Sim";
            prioridade = 2;
        }
        //Prioridade
        if (idade >= 70) {
            prioridade = 1;
        }

        if (txtNomePessoa.getText().equals("") || txtEnderecoPessoa.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha todos os campos.");
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Favor confimar os dados:\n" + "Nome: " + nomePessoa + "\nEndereço: " + enderecoPessoa + "\nData de Nasc.: " + diaPessoa + "/" + mesPessoa + "/" + anoPessoa + "\nTrabalha na Area da Saude? " + "\n" + trabalhaSaude, "Confirmar os Dados", 2);
            switch (confirm) {
                case 0:
                    Pessoa pessoa = new Pessoa(nomePessoa, enderecoPessoa, dataNasc, trabalhaSaude, prioridade);
                    UsuarioAdministradorDAO userAdmDAO = new UsuarioAdministradorDAO();
                    userAdmDAO.CadastrarPessoasFila(pessoa);
                    break;
            }
        }

    }//GEN-LAST:event_btnCadastrarPessoaFilaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new InterfaceAdmin(user).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEnderecoPessoaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoPessoaKeyTyped
        btnCadastrarPessoaFila.setEnabled(false);
        if (!txtNomePessoa.getText().equals("") && !txtEnderecoPessoa.getText().equals("")) {
            btnCadastrarPessoaFila.setEnabled(true);
        }
    }//GEN-LAST:event_txtEnderecoPessoaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAno;
    private javax.swing.JComboBox<String> boxDia;
    private javax.swing.JComboBox<String> boxMes;
    private javax.swing.JButton btnCadastrarPessoaFila;
    private javax.swing.JCheckBox checkTrabalhaSaude;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEnderecoPessoa;
    private javax.swing.JTextField txtNomePessoa;
    // End of variables declaration//GEN-END:variables
}
