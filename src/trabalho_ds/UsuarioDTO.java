
package trabalho_ds;


public class UsuarioDTO {
    
        
    private int id_usuario;
    private String nome_usuario,senha_usuario,data_registro;
    
    /**
     * @return the data_registro
     */
    public String getData_registro() {
        return data_registro;
    }

    /**
     * @param data_registro the data_registro to set
     */
    public void setData_registro(String data_registro) {
        this.data_registro = data_registro;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the nome_uruario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_uruario the nome_uruario to set
     */
    public void setNome_usuario(String nome_uruario) {
        this.nome_usuario = nome_uruario;
    }

    /**
     * @return the senha_usuario
     */
    public String getSenha_usuario() {
        return senha_usuario;
    }

    /**
     * @param senha_usuario the senha_usuario to set
     */
    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

 
    
}
