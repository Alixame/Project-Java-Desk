
package trabalho_ds;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class produtoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<produtoDTO> lista = new ArrayList<>();
    ArrayList<fornecedorDTO> listaContinuacao = new ArrayList<>();
    
    public void cadastrarProduto(produtoDTO objprodutodto){
        
        String sql= "insert into produto(nome_produto,quantidade,preco_produto,tipo_produto,id_fornecedor) values(?,?,?,?,?)";
    
        conn = new ConexaoDAO().conectaBD();
        
        try{
        
            pstm =conn.prepareStatement(sql);
            pstm.setString(1,objprodutodto.getNome());
            pstm.setString(2,objprodutodto.getQuantidade());
            pstm.setString(3,objprodutodto.getPreco());
            pstm.setString(4,objprodutodto.getTipoProduto());
            pstm.setInt(5,objprodutodto.getIdFornecedor());
            
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null, "produtoDAO cadastar" + erro);
            
        }
    
}
   public ArrayList<fornecedorDTO> PesquisarDescricao() throws SQLException{
        
      conn = new ConexaoDAO().conectaBD();
      String sql = "SELECT `nome_ou_rs` FROM `fornecedor` INNER JOIN `produto` ON produto.id_fornecedor = fornecedor.id_fornecedor ORDER BY produto.id_produto";
      
      try  {  
        
        pstm = conn.prepareStatement(sql);
        rs = pstm.executeQuery(sql);
        
        while(rs.next()){
            fornecedorDTO objfornecedorDTO = new fornecedorDTO();
            objfornecedorDTO.setNome(rs.getString("fornecedor.nome_ou_rs"));
            
            listaContinuacao.add(objfornecedorDTO);
                         }    
            
            } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "produtoDAO listar descricao" + erro);
            
            }
        
      return listaContinuacao;
    } 
    
   public ArrayList<produtoDTO> PesquisarProduto() throws SQLException{
        
      conn = new ConexaoDAO().conectaBD();
      String sql = "select * FROM `fornecedor` INNER JOIN `produto` ON produto.id_fornecedor = fornecedor.id_fornecedor";
      
      try  {  
        
        pstm = conn.prepareStatement(sql);
        rs = pstm.executeQuery(sql);
        
        while(rs.next()){
            produtoDTO objprodutoDTO = new produtoDTO();
            objprodutoDTO.setId(rs.getInt("produto.id_produto"));
            objprodutoDTO.setNome(rs.getString("produto.nome_produto"));
            objprodutoDTO.setQuantidade(rs.getString("produto.quantidade"));
            objprodutoDTO.setPreco(rs.getString("produto.preco_produto"));
            objprodutoDTO.setTipoProduto(rs.getString("produto.tipo_produto"));
            
            lista.add(objprodutoDTO);
                         }    
            
            } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "produtoDAO listar" + erro);
            
            }
        
      return lista;
    } 
    
    public void alterarProduto(produtoDTO objprodutodto){
    
    String sql= "update produto set nome_produto = ?, quantidade = ?, preco_produto = ?, tipo_produto = ?, id_fornecedor = ? where id_produto = ? ";
    
        conn = new ConexaoDAO().conectaBD();
        
        try{
        
            pstm =conn.prepareStatement(sql);
            
            pstm.setString(1,objprodutodto.getNome());
            pstm.setString(2,objprodutodto.getQuantidade());
            pstm.setString(3,objprodutodto.getPreco());
            pstm.setString(4,objprodutodto.getTipoProduto());
            pstm.setInt(5, objprodutodto.getIdFornecedor());
            pstm.setInt(6,objprodutodto.getId());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null, "produtoDAO alterar" + erro);
            
        }

    }
    
    
     public void excluirProduto(produtoDTO objprodutodto){
    
    conn = new ConexaoDAO().conectaBD();
    String sql = "delete from produto where id_produto = ? ";
    
       try{
        
            pstm =conn.prepareStatement(sql);
            pstm.setInt(1,objprodutodto.getId());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null, "ProdutoDAO Excluir" + erro);
            
        }
    
     }
    
    public ResultSet listarFuncionario(){
   
    conn = new ConexaoDAO().conectaBD();
    String sql = "select * from fornecedor order by nome_ou_rs";
    
    
    try{
     
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
            
            
        }catch(SQLException erro){
            System.out.println(erro.getMessage());
            return null;
            
        }
    }
    
    
    
    
    
    
    
    
}