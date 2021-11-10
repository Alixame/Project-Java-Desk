/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_ds;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class frmListarProduto extends javax.swing.JFrame {

    /**
     * Creates new form frmListarProduto
     */
    public frmListarProduto() {
        initComponents();
        mostarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnMostarCampos = new javax.swing.JButton();
        btnCarregarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Quantidade", "Preço" , "Tipo do Produto", "Fornecedor"
            }
        ));
        jScrollPane1.setViewportView(tabelaProduto);

        btnMostarCampos.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Etec\\Modulo 2\\Desenvolvimento de Sistemas\\icon\\pesquisa.png")); // NOI18N
        btnMostarCampos.setText("Pesquisar");
        btnMostarCampos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarCamposActionPerformed(evt);
            }
        });

        btnCarregarCampos.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Etec\\Modulo 2\\Desenvolvimento de Sistemas\\icon\\carregando.png")); // NOI18N
        btnCarregarCampos.setText("Carregar no Formulario");
        btnCarregarCampos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMostarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCarregarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarregarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarCamposActionPerformed
      
        
        
        mostarValores();
        
        
        
    }//GEN-LAST:event_btnMostarCamposActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed

        
        carregarCampos();

      
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

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
            java.util.logging.Logger.getLogger(frmListarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnMostarCampos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables

  private void mostarValores() {

        try {
            produtoDAO objprodutodao = new produtoDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
            model.setNumRows(0);

            ArrayList<produtoDTO> lista = objprodutodao.PesquisarProduto();
            
            ArrayList<fornecedorDTO> listaContinuacao = objprodutodao.PesquisarDescricao();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getNome(),
                    lista.get(num).getQuantidade(),
                    lista.get(num).getPreco(),
                    lista.get(num).getTipoProduto(),
                    listaContinuacao.get(num).getNome()
                   
                });
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Listar Valores VIEW:" + erro);

        }

    }





    private void carregarCampos(){

          int setar =  tabelaProduto.getSelectedRow();
        
        frmProduto.txtCod.setText(tabelaProduto.getModel().getValueAt(setar, 0).toString());
        frmProduto.txtNome.setText(tabelaProduto.getModel().getValueAt(setar, 1).toString());
        frmProduto.txtQuantidade.setText(tabelaProduto.getModel().getValueAt(setar, 2).toString());
        frmProduto.txtPreco.setText(tabelaProduto.getModel().getValueAt(setar, 3).toString());
        frmProduto.txtTipoProduto.setText(tabelaProduto.getModel().getValueAt(setar, 4).toString());
        frmProduto.cbxFornecedor.setSelectedItem((tabelaProduto.getModel().getValueAt(setar,5)));


    }








}