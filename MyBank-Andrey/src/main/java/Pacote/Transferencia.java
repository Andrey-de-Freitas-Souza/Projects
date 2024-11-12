/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacote;

/**
 *
 * @author andre
 */
public class Transferencia {
    private String Entrada_saida;
    private String nome ;
    private String Categoria; 
    private double  Valor ;
    private String  Fixa_Variavel ;
    private String Ativo_Passivo;
    private String Data_Transacao ;
    private String Tipo_Investimento;

    public Transferencia(String Entrada_saida, String nome, String Categoria, double Valor, String Fixa_Variavel, String Ativo_Passivo, String Data_Transacao, String Tipo_Investimento) {
        this.Entrada_saida = Entrada_saida;
        this.nome = nome;
        this.Categoria = Categoria;
        this.Valor = Valor;
        this.Fixa_Variavel = Fixa_Variavel;
        this.Ativo_Passivo = Ativo_Passivo;
        this.Data_Transacao = Data_Transacao;
        this.Tipo_Investimento = Tipo_Investimento;
    }

    public String getEntrada_saida() {
        return Entrada_saida;
    }

    public void setEntrada_saida(String Entrada_saida) {
        this.Entrada_saida = Entrada_saida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getFixa_Variavel() {
        return Fixa_Variavel;
    }

    public void setFixa_Variavel(String Fixa_Variavel) {
        this.Fixa_Variavel = Fixa_Variavel;
    }

    public String getAtivo_Passivo() {
        return Ativo_Passivo;
    }

    public void setAtivo_Passivo(String Ativo_Passivo) {
        this.Ativo_Passivo = Ativo_Passivo;
    }

    public String getData_Transacao() {
        return Data_Transacao;
    }

    public void setData_Transacao(String Data_Transacao) {
        this.Data_Transacao = Data_Transacao;
    }

    public String getTipo_Investimento() {
        return Tipo_Investimento;
    }

    public void setTipo_Investimento(String Tipo_Investimento) {
        this.Tipo_Investimento = Tipo_Investimento;
    }
    
    
}
