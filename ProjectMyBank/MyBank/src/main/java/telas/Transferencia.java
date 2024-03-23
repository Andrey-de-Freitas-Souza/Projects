/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;


public class Transferencia {
private int id;
private String dia;
private double valor;
private String tipo;
private String descricao;
private int destinatario;
private int codConta;

    public Transferencia(int id, String dia, double valor, String tipo, String descricao, int destinatario, int codConta) {
        this.id = id;
        this.dia = dia;
        this.valor = valor;
        this.tipo = tipo;
        this.descricao = descricao;
        this.destinatario = destinatario;
        this.codConta = codConta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(int destinatario) {
        this.destinatario = destinatario;
    }

    public int getCodConta() {
        return codConta;
    }

    public void setCodConta(int codConta) {
        this.codConta = codConta;
    }
    

}
