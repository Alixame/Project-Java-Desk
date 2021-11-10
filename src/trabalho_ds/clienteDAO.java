
package trabalho_ds;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class clienteDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<clienteDTO> lista = new ArrayList<>();
    
    
    public void cadastrarCliente(clienteDTO objclientedto){
        String sql= "insert into cliente(nome_ou_rs,cpf_ou_cnpj,rg_ou_is,email_cliente,telefone_cliente,cep_cliente,estado_cliente,cidade_cliente,rua_endereco_cliente,numero_endereco_cliente) values(?,?,?,?,?,?,?,?,?,?)";
    
        conn = new ConexaoDAO().conectaBD();
        
        try{
        
            pstm =conn.prepareStatement(sql);
            pstm.setString(1,objclientedto.getNome());
            pstm.setString(2,objclientedto.getCpf());
            pstm.setString(3,objclientedto.getRg());
            pstm.setString(4,objclientedto.getEmail());
            pstm.setString(5,objclientedto.getTelefone());
            pstm.setString(6,objclientedto.getCep());
            pstm.setString(7,objclientedto.getEstado());
            pstm.setString(8,objclientedto.getCidade());
            pstm.setString(9,objclientedto.getRua());
            pstm.setString(10,objclientedto.getNumero());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null, "clienteDTO" + erro);
            
        }
        
}
   
    
     public ArrayList<clienteDTO> PesquisarCliente() throws SQLException{
        
      conn = new ConexaoDAO().conectaBD();
      String sql = "select * from cliente";
      
      try  {  
        
        pstm = conn.prepareStatement(sql);
        rs = pstm.executeQuery(sql);
        
        while(rs.next()){
            clienteDTO objclienteDTO = new clienteDTO();
            objclienteDTO.setId(rs.getInt("id_cliente"));
            objclienteDTO.setNome(rs.getString("nome_ou_rs"));
            objclienteDTO.setCpf(rs.getString("cpf_ou_cnpj"));
            objclienteDTO.setRg(rs.getString("rg_ou_is"));
            objclienteDTO.setEmail(rs.getString("email_cliente"));
            objclienteDTO.setTelefone(rs.getString("telefone_cliente"));
            objclienteDTO.setCep(rs.getString("cep_cliente"));
            objclienteDTO.setEstado(rs.getString("estado_cliente"));
            objclienteDTO.setCidade(rs.getString("cidade_cliente"));
            objclienteDTO.setRua(rs.getString("rua_endereco_cliente"));
            objclienteDTO.setNumero(rs.getString("numero_endereco_cliente"));
            
            lista.add(objclienteDTO);
                         }    
            
            } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "clienteDTO Listar" + erro);
            
            }
        
      return lista;
    }
    
    public void alterarCliente(clienteDTO objclientedto){
    
      String sql= "update cliente set nome_ou_rs = ? ,cpf_ou_cnpj= ? ,rg_ou_is= ? ,email_cliente= ? ,telefone_cliente= ? ,cep_cliente= ? ,estado_cliente= ? ,cidade_cliente= ? ,rua_endereco_cliente= ? ,numero_endereco_cliente = ?  where id_cliente = ? ";
    
        conn = new ConexaoDAO().conectaBD();
        
        try{
        
            pstm =conn.prepareStatement(sql);
            pstm.setString(1,objclientedto.getNome());
            pstm.setString(2,objclientedto.getCpf());
            pstm.setString(3,objclientedto.getRg());
            pstm.setString(4,objclientedto.getEmail());
            pstm.setString(5,objclientedto.getTelefone());
            pstm.setString(6,objclientedto.getCep());
            pstm.setString(7,objclientedto.getEstado());
            pstm.setString(8,objclientedto.getCidade());
            pstm.setString(9,objclientedto.getRua());
            pstm.setString(10,objclientedto.getNumero());
            pstm.setInt(11,objclientedto.getId());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null, "clienteDTO Alterar" + erro);
            
        }
        
        
    
    
    
    
    }
    
    
    
      public void excluirCliente(clienteDTO objclientedto){
    
    conn = new ConexaoDAO().conectaBD();
    String sql = "delete from cliente where id_cliente = ? ";
    
       try{
        
            pstm =conn.prepareStatement(sql);
            pstm.setInt(1,objclientedto.getId());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null, "ClienteDAO Excluir" + erro);
            
        }
    
     }
    
    
    
    
    
    
    
    
    
    
}