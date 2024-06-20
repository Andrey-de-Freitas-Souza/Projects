/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author andre
 */
public class Produtos {
    private int id;
    private String  nome;
    private double valorCompra;
    private double valorVenda;
    private int Estoque;
    private int QtdComprada;

    public Produtos() {
    }
    
    public Produtos(int id, String nome, double valorCompra, double valorVenda, int Estoque, int QtdComprada) {
        this.id = id;
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.Estoque = Estoque;
        this.QtdComprada = QtdComprada;
    }

    public int getQtdComprada() {
        return QtdComprada;
    }

    public void setQtdComprada(int QtdComprada) {
        this.QtdComprada = QtdComprada;
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

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }
    
    
}
