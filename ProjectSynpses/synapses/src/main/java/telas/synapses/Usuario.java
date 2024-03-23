
package telas;

public class Usuario {
    private int id;
    private String nome;
    private String senha;
    private String email;
    private String fone;
    private String curso1;
    private String curso2;
    private String curso3;
    private String curso4;

    public Usuario(int id, String nome, String senha, String email, String fone, String curso1, String curso2, String curso3, String curso4) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.fone = fone;
        this.curso1 = curso1;
        this.curso2 = curso2;
        this.curso3 = curso3;
        this.curso4 = curso4;
    }
    
    public Usuario(int id ,String nome, String senha,String email, String fone){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.fone = fone;
    }
    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
        
    }
    public Usuario(int id,String nome,String email, String fone){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

    Usuario() {
        
    }

    public String getCurso1() {
        return curso1;
    }

    public void setCurso1(String curso1) {
        this.curso1 = curso1;
    }

    public String getCurso2() {
        return curso2;
    }

    public void setCurso2(String curso2) {
        this.curso2 = curso2;
    }

    public String getCurso3() {
        return curso3;
    }

    public void setCurso3(String curso3) {
        this.curso3 = curso3;
    }

    public String getCurso4() {
        return curso4;
    }

    public void setCurso4(String curso4) {
        this.curso4 = curso4;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
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
    
    
}
