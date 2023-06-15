
package telas;


public class Administrador {
    private int id;
    private String nome;
    private String senha;
    private String email;
    
    public Administrador(String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    public Administrador(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
    

    Administrador() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
