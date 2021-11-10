
package trabalho_ds;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FuncionarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
    
    
    public void cadastrarFuncionario(FuncionarioDTO objfuncionariodto){
        
        String sql= "insert into funcionario(nome_funcionario,cargo_funcionario,cpf_funcionario,rg_funcionario,telefone_funcionario,email_funcionario,cep_funcionario,cidade_funcionario,estado_funcionario,rua_endereco_funcionario,numero_endereco_funcionario) values(?,?,?,?,?,?,?,?,?,?,?)";
    
        conn = new ConexaoDAO().conectaBD();
        
        try{
        
            pstm =conn.prepareStatement(sql);
            pstm.setString(1,objfuncionariodto.getNome());
            pstm.setString(2,objfuncionariodto.getCargo());
            pstm.setString(3,objfuncionariodto.getCpf());
            pstm.setString(4,objfuncionariodto.getRg());
            pstm.setString(5,objfuncionariodto.getTelefone());
            pstm.setString(6,objfuncionariodto.getEmail());
            pstm.setString(7,objfuncionariodto.getCep());
            pstm.setString(8,objfuncionariodto.getCidade());
            pstm.setString(9,objfuncionariodto.getEstado());
            pstm.setString(10,objfuncionariodto.getRua());
            pstm.setString(11,objfuncionariodto.getNumero());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
        
            JOptionPane.showMessageDialog(null, "FuncionarioDAO" + erro);
            
        } 
        
    }
    
 
     
     
     
     
}
