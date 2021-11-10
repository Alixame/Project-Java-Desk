
package trabalho_ds;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
        
        conn = new ConexaoDAO().conectaBD();
    
        
    
        try{
        
            String sql= "select * from usuario where nome_usuario = ? and senha_usuario = ? ";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,objusuariodto.getNome_usuario());
            pstm.setString(2,objusuariodto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null,  "Usuario DAO: " + erro);
            return null;
        }
    
    }
    
    public void  cadastrarUsuario(UsuarioDTO objusuariodto){
    
         conn = new ConexaoDAO().conectaBD();
         String sql = "insert into usuario (nome_usuario,senha_usuario,data_registro) values (?,?,?)";
       
        try{
        
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte messageDigest[] = md.digest(objusuariodto.getSenha_usuario().getBytes("UTF-8"));
        
        StringBuilder sb = new StringBuilder();
        
        for(byte b : messageDigest){
            sb.append(String.format("%02X", 0xFF & b));
        
        }
        
        String senhaHex = sb.toString();
            
        pstm = conn.prepareStatement(sql);
        pstm.setString(1,objusuariodto.getNome_usuario());
        pstm.setString(2,senhaHex);
        pstm.setString(3,objusuariodto.getData_registro());
        
        pstm.execute();
        pstm.close();
        
        JOptionPane.showMessageDialog(null,  "Usuario e senha Cadastrados com sucesso!");
        
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null,  "Usuario DAO Cadastra: " + erro);
            
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
    }
    
    
    
    
}
