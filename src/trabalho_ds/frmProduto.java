/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_ds;


import static trabalho_ds.frmFornecedor.txtCod;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.util.Vector;
/**
 *
 * @author USUARIO
 */
public class frmProduto extends javax.swing.JFrame {

    /**
     * Creates new form frmProduto
     */
    public frmProduto() {
        initComponents();
        restaurarDadosComboBoxCargo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTipoProduto = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        btnListarProdutos = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        cbxFornecedor = new javax.swing.JComboBox<>();
        txtPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Etec\\Modulo 2\\Desenvolvimento de Sistemas\\icon\\cadastro.png")); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Produto:");

        btnLimpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Etec\\Modulo 2\\Desenvolvimento de Sistemas\\icon\\limpar.png")); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo do Produto:");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Etec\\Modulo 2\\Desenvolvimento de Sistemas\\icon\\cadastrar-produto.png")); // NOI18N

        jLabel3.setText("Codigo do Produto:");

        jLabel4.setText("Fornecedor:");

        txtCod.setEditable(false);

        jLabel5.setText("Quantidade:");

        jLabel6.setText("Preço:");

        btnListarProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Etec\\Modulo 2\\Desenvolvimento de Sistemas\\icon\\lista.png")); // NOI18N
        btnListarProdutos.setText("Listar Produtos");
        btnListarProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnListarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProdutosActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Etec\\Modulo 2\\Desenvolvimento de Sistemas\\icon\\alterar.png")); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Etec\\Modulo 2\\Desenvolvimento de Sistemas\\icon\\excluir.png")); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        cbxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel7)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnListarProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtQuantidade)
                        .addComponent(txtTipoProduto)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(txtTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       
        cadastraProduto();
         limparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnListarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProdutosActionPerformed


        frmListarProduto objproduto = new frmListarProduto();
        objproduto.setVisible(true);

  
    }//GEN-LAST:event_btnListarProdutosActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        alterarProduto();
        limparCampos();
     
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
      
        
       excluirProduto();
       limparCampos();
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void cbxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListarProdutos;
    public static javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtNome;
    public static javax.swing.JTextField txtPreco;
    public static javax.swing.JTextField txtQuantidade;
    public static javax.swing.JTextField txtTipoProduto;
    // End of variables declaration//GEN-END:variables
           
    
    private void limparCampos(){
            txtCod.setText(""); 
            txtNome.setText("");
            txtQuantidade.setText("");
            txtPreco.setText("");
            txtTipoProduto.setText("");
            cbxFornecedor.setSelectedItem("Selecione");
            txtNome.requestFocus();
    }
    
    private void cadastraProduto(){
        
         String nome,quantidade,preco,tipoProduto;
         int idFornecedor;
            
            nome=txtNome.getText();
            quantidade=txtQuantidade.getText();
            preco=txtPreco.getText().replace(",", ".");
            tipoProduto=txtTipoProduto.getText();
            idFornecedor=id_funcionario.get(cbxFornecedor.getSelectedIndex() - 1);
        
        produtoDTO objprodutodto = new produtoDTO();
            objprodutodto.setNome(nome);
            objprodutodto.setQuantidade(quantidade);
            objprodutodto.setPreco(preco);
            objprodutodto.setTipoProduto(tipoProduto);
            objprodutodto.setIdFornecedor(idFornecedor);
        
        produtoDAO objprodutodao = new produtoDAO();
        objprodutodao.cadastrarProduto(objprodutodto);
        
    
    
    }
    
    private void alterarProduto(){
    
        String nome,quantidade,preco,tipoProduto;
        int id,idFornecedor;
        
        id = Integer.parseInt(txtCod.getText());
        nome = txtNome.getText();
        quantidade = txtQuantidade.getText();
        preco = txtPreco.getText();
        tipoProduto = txtTipoProduto.getText();
        idFornecedor=id_funcionario.get(cbxFornecedor.getSelectedIndex() - 1);
        
        produtoDTO objprodutodto = new produtoDTO();
            objprodutodto.setId(id);
            objprodutodto.setNome(nome);
            objprodutodto.setQuantidade(quantidade);
            objprodutodto.setPreco(preco);
            objprodutodto.setTipoProduto(tipoProduto);
            objprodutodto.setIdFornecedor(idFornecedor);
        
        produtoDAO objprodutodao = new produtoDAO();
           objprodutodao.alterarProduto(objprodutodto);  
    
    }
    
    private void excluirProduto(){
    
        int id_produto;
        
        id_produto = Integer.parseInt(txtCod.getText());
    
        produtoDTO objprodutodto = new produtoDTO();
        objprodutodto.setId(id_produto);
        
        produtoDAO objprodutodao = new produtoDAO();
        objprodutodao.excluirProduto(objprodutodto);
    
    
       }
    
    Vector<Integer> id_funcionario = new Vector<Integer>();
    
    public void restaurarDadosComboBoxCargo(){
    
        try {
            
            produtoDAO objprodutodao = new produtoDAO();
            ResultSet rs = objprodutodao.listarFuncionario();
            
            while(rs.next()){
                id_funcionario.addElement(rs.getInt(1));
                cbxFornecedor.addItem(rs.getString(11));
            }
            
        } catch (SQLException e) {
       
            JOptionPane.showMessageDialog(null, "Carregar Dados ComboBox " + e);
     
        }
    
    
    
    
    
    
    }
    
    
    
    
    
}
