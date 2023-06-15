
package telas;


public class Cursos {
   private int id;
   private String nome;
   private String tipo;
   private int qtdAulas;
   private String descricao;

    public Cursos(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Cursos(String nome, String tipo, int qtdAulas, String descricao) {
        this.nome = nome;
        this.tipo = tipo;
        this.qtdAulas = qtdAulas;
        this.descricao = descricao;
    }
    
    public Cursos(int id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    } 


    Cursos(int id) {
        this.id = id;
    }

    Cursos(int id, String nome, String tipo, int qtdAulas, String descricao) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.qtdAulas = qtdAulas;
        this.descricao = descricao;
    }

    Cursos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
    return this.nome;
    }
    
    
   
}
