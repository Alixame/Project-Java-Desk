package trabalho_ds;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoDAO {
    // metodo de conexao
    public  Connection conectaBD(){
       // variavel do tipo connection que recebe o valor null
        Connection  conn = null;
        
       // Tentar fazer algo ... se não entra em uma exeção
        try {
       // Criação de variavel do tipo string que recebe o a ligação com o mysql 
       // passando os seguintes dados : drive de conexao , onde esta a base de dados , o nome da base de datos , usuario e senha
            String url = "jdbc:mysql://localhost:3306/banco_trabalho?user=root&password=";
       // Variavel conn recebe o driver de conexão que recebe a variavel url    
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
       //exibe uma mensagem propria
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
       //retorna a variavel
        return conn;
    } 
}