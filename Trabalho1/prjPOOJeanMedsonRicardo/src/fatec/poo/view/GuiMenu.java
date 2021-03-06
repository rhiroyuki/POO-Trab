/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatec.poo.view;

/**
 *
 * @author ricardo
 */
public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenu
     */
    public GuiMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemFiscal = new javax.swing.JMenuItem();
        jMenuItemCandidato = new javax.swing.JMenuItem();
        jMenuItemMontarProva = new javax.swing.JMenuItem();
        jMenuItemConcurso = new javax.swing.JMenuItem();
        jMenuItemAlocarFiscal = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jMenu1.setText("Cadastro");

        jMenuItemFiscal.setText("Fiscal");
        jMenuItemFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFiscalActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemFiscal);

        jMenuItemCandidato.setText("Candidato");
        jMenuItemCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCandidatoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCandidato);

        jMenuItemMontarProva.setText("Montar Prova");
        jMenuItemMontarProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMontarProvaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMontarProva);

        jMenuItemConcurso.setText("Concurso");
        jMenuItemConcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConcursoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemConcurso);

        jMenuItemAlocarFiscal.setText("Alocar Fiscal");
        jMenuItemAlocarFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlocarFiscalActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAlocarFiscal);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed
    private void jMenuItemMontarProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMontarProvaActionPerformed
        new GuiMontarProva().setVisible(true);
    }//GEN-LAST:event_jMenuItemMontarProvaActionPerformed

    private void jMenuItemFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFiscalActionPerformed
        new GuiFiscal().setVisible(true);
    }//GEN-LAST:event_jMenuItemFiscalActionPerformed

    private void jMenuItemCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCandidatoActionPerformed
        new GuiCandidato().setVisible(true);
    }//GEN-LAST:event_jMenuItemCandidatoActionPerformed

    private void jMenuItemConcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConcursoActionPerformed
        new GuiConcurso().setVisible(true);
    }//GEN-LAST:event_jMenuItemConcursoActionPerformed

    private void jMenuItemAlocarFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlocarFiscalActionPerformed
        new GuiAlocarFiscal().setVisible(true);
    }//GEN-LAST:event_jMenuItemAlocarFiscalActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAlocarFiscal;
    private javax.swing.JMenuItem jMenuItemCandidato;
    private javax.swing.JMenuItem jMenuItemConcurso;
    private javax.swing.JMenuItem jMenuItemFiscal;
    private javax.swing.JMenuItem jMenuItemMontarProva;
    private javax.swing.JMenuItem jMenuItemSair;
    // End of variables declaration//GEN-END:variables
}
