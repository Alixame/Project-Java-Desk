//DTO ( TRANSFERENCIA DE OBJETO )
package trabalho_ds;

public class FuncionarioDTO {
    
    private String nome,cargo,cpf,rg,telefone,email,cep,cidade,estado,rua,numero;
    private int id;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return cargo;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    public String getRg(){
        return rg;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    public String getCep(){
        return cep;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return cidade;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getRua(){
        return rua;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumero(){
        return numero;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
