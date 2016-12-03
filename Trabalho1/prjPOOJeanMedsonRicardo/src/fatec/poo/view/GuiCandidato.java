package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCandidato;
import fatec.poo.model.Candidato;
import javax.swing.JOptionPane;

/**
 *
 * @author Jean
 */
public class GuiCandidato extends javax.swing.JFrame {

    /**
     * Creates new form guiCandidato
     */
    public GuiCandidato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIncricao = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        txtEndereco = new javax.swing.JTextField();
        txtFormatCpf = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblMedia = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIncricao = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblMostraMedia = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Candidato");
        setName("guiCandidato"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblIncricao.setText("Inscrição:");
        lblIncricao.setName("lblInscricao"); // NOI18N

        btnConsultar.setText("Consultar");
        btnConsultar.setName("btnConsultar"); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtEndereco.setEnabled(false);
        txtEndereco.setName("txtEndereco"); // NOI18N

        try {
            txtFormatCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatCpf.setEnabled(false);
        txtFormatCpf.setName("txtFormatCpf"); // NOI18N

        lblNome.setText("Nome:");
        lblNome.setName("lblNome"); // NOI18N

        lblCpf.setText("Cpf:");
        lblCpf.setName("lblCpf"); // NOI18N

        lblEndereco.setText("Endereço:");
        lblEndereco.setName("lblEndereco"); // NOI18N

        lblEmail.setText("E-mail:");
        lblEmail.setName("lblEmail"); // NOI18N

        lblMedia.setText("Média:");
        lblMedia.setName("lblMedia"); // NOI18N

        txtNome.setEnabled(false);
        txtNome.setName("txtNome"); // NOI18N

        txtIncricao.setName("txtIncricao"); // NOI18N
        txtIncricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIncricaoActionPerformed(evt);
            }
        });

        txtEmail.setEnabled(false);
        txtEmail.setName("txtEmail"); // NOI18N

        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.setName("btnIncluir"); // NOI18N
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.setName("btnAlterar"); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.setName("btnExcluir"); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setName("btnSair"); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblMostraMedia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblMostraMedia.setEnabled(false);

        txtTelefone.setEnabled(false);
        txtTelefone.setName("txtEmail"); // NOI18N

        lblTelefone.setText("Telefone");
        lblTelefone.setName("lblEmail"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpf)
                            .addComponent(lblNome)
                            .addComponent(lblEndereco)
                            .addComponent(lblIncricao)
                            .addComponent(lblTelefone)
                            .addComponent(lblEmail)
                            .addComponent(lblMedia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMostraMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmail)
                                .addComponent(txtIncricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFormatCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIncricao)
                    .addComponent(txtIncricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtFormatCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedia)
                    .addComponent(lblMostraMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIncricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIncricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIncricaoActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        candidato = new Candidato(txtIncricao.getText(), txtFormatCpf.getText().replace(".", "").replace("-", "").trim(), txtNome.getText(), txtEndereco.getText());
        candidato.setEmail(txtEmail.getText());
        candidato.setTelefone(txtTelefone.getText());
        daoCandidato.inserir(candidato);

        txtIncricao.setText("");
        txtNome.setText("");
        txtFormatCpf.setText("");
        txtEndereco.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");

        btnIncluir.setEnabled(false);
        txtNome.setEnabled(false);
        txtFormatCpf.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtIncricao.setEnabled(true);
        txtIncricao.requestFocus();

        btnConsultar.setEnabled(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        candidato = daoCandidato.consultar(txtIncricao.getText());

        if (candidato == null) {
            txtIncricao.setEnabled(false);
            txtNome.setEnabled(true);
            txtFormatCpf.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtEmail.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtNome.requestFocus();

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } else {
            txtNome.setText(candidato.getNome());
            txtFormatCpf.setText(candidato.getCpf());
            txtEndereco.setText(candidato.getEndereco());
            txtEmail.setText(candidato.getEmail());
            txtTelefone.setText(candidato.getTelefone());

            txtIncricao.setEnabled(false);
            txtNome.setEnabled(true);
            txtFormatCpf.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtEmail.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtNome.requestFocus();

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);

        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração ?") == 0) {
            candidato = new Candidato(txtIncricao.getText(), txtFormatCpf.getText().replace(".", "").replace("-", "").trim(), txtNome.getText(), txtEndereco.getText());
            candidato.setEmail(txtEmail.getText());
            candidato.setTelefone(txtTelefone.getText());

            daoCandidato.alterar(candidato);
        }

        txtFormatCpf.getText();
        txtIncricao.setText("");
        txtNome.setText("");
        txtFormatCpf.setText("");
        txtEndereco.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");

        txtIncricao.setEnabled(true);
        txtNome.setEnabled(false);
        txtFormatCpf.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtIncricao.requestFocus();

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma exclusão ?") == 0) {
            daoCandidato.excluir(candidato);

            txtIncricao.setText("");
            txtNome.setText("");
            txtFormatCpf.setText("");
            txtEndereco.setText("");
            txtEmail.setText("");
            txtTelefone.setText("");

            txtIncricao.setEnabled(true);
            txtNome.setEnabled(false);
            txtFormatCpf.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtEmail.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtIncricao.requestFocus();

            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("system", "root");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoCandidato = new DaoCandidato(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCandidato().setVisible(true);
            }
        });
    }
    Conexao conexao = null;
    DaoCandidato daoCandidato = null;
    Candidato candidato = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblIncricao;
    private javax.swing.JLabel lblMedia;
    private javax.swing.JLabel lblMostraMedia;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtFormatCpf;
    private javax.swing.JTextField txtIncricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
