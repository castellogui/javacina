package Interfaces;

import Interfaces.InterfaceLogin;
import Interfaces.InterfaceAdmin;
import com.mycompany.javacinav2.Usuario;
import com.mycompany.javacinav2.UsuarioAdministradorDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfaceCRUD extends javax.swing.JFrame {

    Usuario user;
    DefaultTableModel tabela;

    public InterfaceCRUD(Usuario user) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Javacina");
        ImageIcon img = new ImageIcon("E:\\Documentos\\Javacina\\Codigo\\JavacinaV2\\images\\icon.jpg");
        this.setIconImage(img.getImage());
        this.user = user;
        comboPermissao.setVisible(false);
        DefaultTableModel tabela = (DefaultTableModel) tabelaUsuarios.getModel();
        this.tabela = tabela;
        String index = "";
        String indexPermissao = "";
        String textoDigitado = "";
        UsuarioAdministradorDAO.GerarListaUsuario(index, indexPermissao, textoDigitado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAdicionarUsuario = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        comboPermissao = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        btnAtualizarTabela = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnExcluir.setText("Excluir Usuario");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAdicionarUsuario.setText("Adicionar Usuario");
        btnAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarUsuarioActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar Dados");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSair.setText("Logout");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Usuario", "Permissão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaUsuarios);
        if (tabelaUsuarios.getColumnModel().getColumnCount() > 0) {
            tabelaUsuarios.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nome", "Email", "Usuario", "Permissão" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar por:");

        comboPermissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Atendente" }));

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyTyped(evt);
            }
        });

        btnAtualizarTabela.setIcon(new javax.swing.ImageIcon("E:\\Documentos\\Javacina\\Codigo\\JavacinaV2\\images\\refresh.png")); // NOI18N
        btnAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(19, 19, 19)
                        .addComponent(btnVoltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtPesquisa))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtualizarTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSair)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(comboPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarUsuario)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnVoltar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
        new InterfaceLogin().setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarUsuarioActionPerformed
        new InterfaceInserir(user).setVisible(true);
    }//GEN-LAST:event_btnAdicionarUsuarioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        new InterfaceAdmin(user).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tabelaUsuarios.getSelectedRow();
        if (linha >= 0) {
            new InterfaceAlterar(tabela, linha).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um usuario para alterar seus dados.");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaActionPerformed
        String index = "";
        String indexPermissao = "";
        String textoDigitado = "";
        UsuarioAdministradorDAO.GerarListaUsuario(index, indexPermissao, textoDigitado);
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabelaUsuarios.getSelectedRow();

        if (user.getCodigo() == Integer.parseInt(tabela.getValueAt(linha, 0).toString())) {
            JOptionPane.showMessageDialog(rootPane, "Você não pode excluir a sí mesmo.");
        } else {
            if (linha >= 0) {
                String nome = tabela.getValueAt(linha, 1).toString();
                String email = tabela.getValueAt(linha, 2).toString();
                String usuario = tabela.getValueAt(linha, 3).toString();
                String permissao = tabela.getValueAt(linha, 4).toString();
                int confirm = JOptionPane.showConfirmDialog(this, "Deseja alterar as seguintes informações?" + "\nNome: " + nome
                        + "\nEmail: " + email + "\nUsuario: " + usuario + "\nPermissao: " + permissao, "Confirmar Informações!", 2);
                switch (confirm) {
                    case 0:
                        UsuarioAdministradorDAO useradmDAO = new UsuarioAdministradorDAO();
                        useradmDAO.RemoverUsuario(tabela, linha);
                        String index = "";
                        String indexPermissao = "";
                        String textoDigitado = "";
                        UsuarioAdministradorDAO.GerarListaUsuario(index, indexPermissao, textoDigitado);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, selecione um usuario para excluir seus dados.");
            }
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed

        if (comboBox.getSelectedItem().equals("Permissão")) {
            comboPermissao.setVisible(true);
        } else {
            comboPermissao.setVisible(false);
        }
    }//GEN-LAST:event_comboBoxActionPerformed

    private void txtPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyTyped
        String index = comboBox.getSelectedItem().toString();
        String indexPermissao = comboPermissao.getSelectedItem().toString();
        String textoDigitado = txtPesquisa.getText();
        UsuarioAdministradorDAO.GerarListaUsuario(index, indexPermissao, textoDigitado);
    }//GEN-LAST:event_txtPesquisaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarUsuario;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizarTabela;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JComboBox<String> comboPermissao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabelaUsuarios;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
