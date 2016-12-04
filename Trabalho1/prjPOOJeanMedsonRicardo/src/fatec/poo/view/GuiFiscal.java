package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoFiscal;
import fatec.poo.model.Fiscal;
import fatec.poo.model.ValidaCpf;
import javax.swing.JOptionPane;

public class GuiFiscal extends javax.swing.JFrame {

    public GuiFiscal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        txtEndereco = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        lblEndereco = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtFormatCpf = new javax.swing.JFormattedTextField();
        lblCpf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Fiscal");
        setName("guiFiscal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.setName("btnConsultar"); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtEndereco.setEnabled(false);
        txtEndereco.setName("txtEndereco"); // NOI18N

        txtCodigo.setName("txtCodigo"); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtTelefone.setEnabled(false);
        txtTelefone.setName("txtTelefone"); // NOI18N

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

        lblEndereco.setText("Endereço:");
        lblEndereco.setName("lblEndereco"); // NOI18N

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.setName("btnExcluir"); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");
        lblNome.setName("lblNome"); // NOI18N

        lblTelefone.setText("Telefone:");
        lblTelefone.setName("lblTelefone"); // NOI18N

        btnSair.setText("Sair");
        btnSair.setName("btnSair"); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblEmail.setText("E-mail:");
        lblEmail.setName("lblEmail"); // NOI18N

        lblCodigo.setText("Código:");
        lblCodigo.setName("lblCodigo"); // NOI18N

        lblLocal.setText("Local:");
        lblLocal.setName("lblLocal"); // NOI18N

        txtLocal.setEnabled(false);
        txtLocal.setName("txtLocal"); // NOI18N

        txtNome.setEnabled(false);
        txtNome.setName("txtNome"); // NOI18N

        try {
            txtFormatCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatCpf.setEnabled(false);
        txtFormatCpf.setName("txtFormatCpf"); // NOI18N

        lblCpf.setText("Cpf:");
        lblCpf.setName("lblCpf"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblCodigo))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(lblEndereco)
                            .addComponent(lblTelefone)
                            .addComponent(lblLocal)
                            .addComponent(lblEmail)
                            .addComponent(lblCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFormatCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(txtTelefone)
                            .addComponent(txtLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtEndereco))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFormatCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocal)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("system", "123456789");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoFiscal = new DaoFiscal(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        fiscal = null;
        fiscal = daoFiscal.consultar(txtCodigo.getText());

        if (fiscal == null) {
            txtCodigo.setEnabled(false);
            txtNome.setEnabled(true);
            txtNome.requestFocus();
            txtEmail.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtFormatCpf.setEnabled(true);
            txtLocal.setEnabled(true);
            txtTelefone.setEnabled(true);
            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

        } else {
            txtCodigo.setEnabled(false);

            txtEmail.setText(fiscal.getEmail());
            txtEndereco.setText(fiscal.getEndereco());
            txtFormatCpf.setText(fiscal.getCpf());
            txtLocal.setText(fiscal.getLocal());
            txtNome.setText(fiscal.getNome());
            txtTelefone.setText(fiscal.getTelefone());

            txtCodigo.setEnabled(false);
            txtEmail.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtFormatCpf.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtLocal.setEnabled(true);
            txtNome.setEnabled(true);

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Inclusão?") == 0) {
            
            if (ValidaCpf.isCPF(txtFormatCpf.getText().replace(".", "").replace("-", "").trim()) == true){
                fiscal = new Fiscal(txtCodigo.getText(),txtFormatCpf.getText().replace(".", "").replace("-", "").trim() , txtNome.getText(), txtEndereco.getText());
                fiscal.setEmail(txtEmail.getText());
                fiscal.setLocal(txtLocal.getText());
                fiscal.setTelefone(txtTelefone.getText());
                daoFiscal.inserir(fiscal);
            }else{
                JOptionPane.showMessageDialog(null,"CPF INVALIDO");
            }
            
        }
        txtCodigo.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtFormatCpf.setText("");
        txtLocal.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtCodigo.setEnabled(true);
        txtEmail.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtFormatCpf.setEnabled(false);
        txtLocal.setEnabled(false);
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0) {
            daoFiscal.excluir(fiscal);
            txtCodigo.setText("");
            txtEmail.setText("");
            txtEndereco.setText("");
            txtFormatCpf.setText("");
            txtLocal.setText("");
            txtNome.setText("");
            txtTelefone.setText("");
            txtCodigo.setEnabled(true);
            txtEmail.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtFormatCpf.setEnabled(false);
            txtLocal.setEnabled(false);
            txtNome.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtCodigo.requestFocus();
            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            
            if (ValidaCpf.isCPF(txtFormatCpf.getText().replace(".", "").replace("-", "").trim()) == true){
                fiscal = new Fiscal(txtCodigo.getText(),txtFormatCpf.getText().replace(".", "").replace("-", "").trim() , txtNome.getText(), txtEndereco.getText());
                fiscal.setEmail(txtEmail.getText());
                fiscal.setLocal(txtLocal.getText());
                fiscal.setTelefone(txtTelefone.getText());
                daoFiscal.alterar(fiscal);
            }else{
                JOptionPane.showMessageDialog(null,"CPF INVALIDO");
            }
            
        }

        txtCodigo.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtFormatCpf.setText("");
        txtLocal.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtCodigo.setEnabled(true);
        txtEmail.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtFormatCpf.setEnabled(false);
        txtLocal.setEnabled(false);
        txtLocal.setEnabled(false);
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFiscal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtFormatCpf;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private DaoFiscal daoFiscal = null;
    private Fiscal fiscal = null;
    private Conexao conexao = null;

}
