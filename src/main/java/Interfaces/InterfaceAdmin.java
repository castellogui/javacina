
package Interfaces;

import Interfaces.InterfaceAdicionarVacinacao;
import Interfaces.InterfaceCRUD;
import Interfaces.InterfaceLogin;
import Interfaces.InterfaceRelatorio;
import com.mycompany.javacinav2.Usuario;
import javax.swing.ImageIcon;



public class InterfaceAdmin extends javax.swing.JFrame {
    Usuario user;
           
    public InterfaceAdmin(Usuario user) {
        
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Javacina");
        ImageIcon img = new ImageIcon("E:\\Documentos\\Javacina\\Codigo\\JavacinaV2\\images\\icon.jpg");
        this.setIconImage(img.getImage());
        this.user = user;
        lblBemvindo.setText("Olá " + user.getNome() + ", bem vindo ao seu dashboard!");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnControleAcessos = new javax.swing.JButton();
        btnFilaVac = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        lblBemvindo = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(577, 355));

        btnControleAcessos.setBackground(new java.awt.Color(36, 119, 185));
        btnControleAcessos.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnControleAcessos.setText("Controle de Acessos");
        btnControleAcessos.setBorder(null);
        btnControleAcessos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControleAcessosActionPerformed(evt);
            }
        });

        btnFilaVac.setBackground(new java.awt.Color(0, 153, 51));
        btnFilaVac.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnFilaVac.setText("Cadastrar Pessoas a Fila de Vacinação");
        btnFilaVac.setBorder(null);
        btnFilaVac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilaVacActionPerformed(evt);
            }
        });

        btnRelatorio.setBackground(new java.awt.Color(254, 155, 0));
        btnRelatorio.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnRelatorio.setText("Gerar Relatorios");
        btnRelatorio.setBorder(null);
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        lblBemvindo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblBemvindo.setText("textoDeBemVindo");

        btnLogout.setBackground(new java.awt.Color(204, 0, 51));
        btnLogout.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBemvindo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnControleAcessos, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFilaVac, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblBemvindo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnControleAcessos, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(btnFilaVac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnControleAcessosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControleAcessosActionPerformed
        dispose();        
        new InterfaceCRUD(user).setVisible(true);
    }//GEN-LAST:event_btnControleAcessosActionPerformed

    private void btnFilaVacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilaVacActionPerformed
        dispose();
        new InterfaceAdicionarVacinacao(user).setVisible(true);
    }//GEN-LAST:event_btnFilaVacActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        dispose();
        new InterfaceLogin().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        dispose();
        new InterfaceRelatorio(user).setVisible(true);
    }//GEN-LAST:event_btnRelatorioActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnControleAcessos;
    private javax.swing.JButton btnFilaVac;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JLabel lblBemvindo;
    // End of variables declaration//GEN-END:variables
}
