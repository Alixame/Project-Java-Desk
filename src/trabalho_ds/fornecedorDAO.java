
package trabalho_ds;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class fornecedorDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<fornecedorDTO> lista = new ArrayList<>();
    
    public void cadastrarFornecedor(fornecedorDTO objfornecedordto){
        String sql= "insert into fornecedor(nome_ou_rs, cpf_ou_cnpj, rg_ou_is, email_fornecedor, telefone_fornecedor, cep_fornecedor, estado_fornecedor, cidade_fornecedor, rua_endereco_fornecedor, numero_endereco_fornecedor) values(?,?,?,?,?,?,?,?,?,?)";
    
        conn = new ConexaoDAO().conectaBD();
        
        try{
        
            pstm =conn.prepareStatement(sql);
            pstm.setString(1,objfornecedordto.getNome());
            pstm.setString(2,objfornecedordto.getCpf());
            pstm.setString(3,objfornecedordto.getRg());
            pstm.setString(4,objfornecedordto.getEmail());
            pstm.setString(5,objfornecedordto.getTelefone());
            pstm.setString(6,objfornecedordto.getCep());
            pstm.setString(7,objfornecedordto.getEstado());
            pstm.setString(8,objfornecedordto.getCidade());
            pstm.setString(9,objfornecedordto.getRua());
            pstm.setString(10,objfornecedordto.getNumero());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null, "FuncionarioDAO" + erro);
            
        }



}
    
     public ArrayList<fornecedorDTO> PesquisarFornecedor() throws SQLException{
        
      conn = new ConexaoDAO().conectaBD();
      String sql = "select * from fornecedor";
      
      try  {  
        
        pstm = conn.prepareStatement(sql);
        rs = pstm.executeQuery(sql);
        
        while(rs.next()){
            fornecedorDTO objfornecedorDTO = new fornecedorDTO();
            objfornecedorDTO.setId(rs.getInt("id_fornecedor"));
            objfornecedorDTO.setNome(rs.getString("nome_ou_rs"));
            objfornecedorDTO.setCpf(rs.getString("cpf_ou_cnpj"));
            objfornecedorDTO.setRg(rs.getString("rg_ou_is"));
            objfornecedorDTO.setEmail(rs.getString("email_fornecedor"));
            objfornecedorDTO.setTelefone(rs.getString("telefone_fornecedor"));
            objfornecedorDTO.setCep(rs.getString("cep_fornecedor"));
            objfornecedorDTO.setEstado(rs.getString("estado_fornecedor"));
            objfornecedorDTO.setCidade(rs.getString("cidade_fornecedor"));
            objfornecedorDTO.setRua(rs.getString("rua_endereco_fornecedor"));
            objfornecedorDTO.setNumero(rs.getString("numero_endereco_fornecedor"));
            
            lista.add(objfornecedorDTO);
                         }    
            
            } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "clienteDTO listar" + erro);
            
            }
        
      return lista;
    }
    
    
     public void alterarFornecedor(fornecedorDTO objfornecedordto){
        String sql= "update fornecedor set nome_ou_rs = ?, cpf_ou_cnpj = ?, rg_ou_is = ?, email_fornecedor = ?, telefone_fornecedor = ?, cep_fornecedor = ?, estado_fornecedor = ?, cidade_fornecedor = ?, rua_endereco_fornecedor = ?, numero_endereco_fornecedor = ? where id_fornecedor = ?";
    
        conn = new ConexaoDAO().conectaBD();
        
        try{
        
            pstm =conn.prepareStatement(sql);
            pstm.setString(1,objfornecedordto.getNome());
            pstm.setString(2,objfornecedordto.getCpf());
            pstm.setString(3,objfornecedordto.getRg());
            pstm.setString(4,objfornecedordto.getEmail());
            pstm.setString(5,objfornecedordto.getTelefone());
            pstm.setString(6,objfornecedordto.getCep());
            pstm.setString(7,objfornecedordto.getEstado());
            pstm.setString(8,objfornecedordto.getCidade());
            pstm.setString(9,objfornecedordto.getRua());
            pstm.setString(10,objfornecedordto.getNumero());
            pstm.setInt(11,objfornecedordto.getId());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null, "FuncionarioDAO" + erro);
            
        }



}
    
    public void excluirFornecedor(fornecedorDTO objfornecedordto){
    
    conn = new ConexaoDAO().conectaBD();
    String sql = "delete from fornecedor where id_fornecedor = ? ";
    
       try{
        
            pstm =conn.prepareStatement(sql);
            pstm.setInt(1,objfornecedordto.getId());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null, "FornecedorDAO Excluir" + erro);
            
        }
    
     }
    
    
    
    
    
    
    
}