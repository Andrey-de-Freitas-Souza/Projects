/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

public class Vendas {
    private int id_Venda;
    private String nomeComprador;
    private String nomeProduto;
    private int qtd_Produto;
    String forma_pagamento;
    String data_pagamento;
    double Falta_pagar;
    double Total;

    public Vendas() {
    }

    public Vendas(int id_Venda, String nomeComprador, String nomeProduto, int qtd_Produto, String forma_pagamento, String data_pagamento, double Falta_pagar,double total) {
        this.id_Venda = id_Venda;
        this.nomeComprador = nomeComprador;
        this.nomeProduto = nomeProduto;
        this.qtd_Produto = qtd_Produto;
        this.forma_pagamento = forma_pagamento;
        this.data_pagamento = data_pagamento;
        this.Falta_pagar = Falta_pagar;
        this.Total = total;
    }

    public int getId_Venda() {
        return id_Venda;
    }

    public void setId_Venda(int id_Venda) {
        this.id_Venda = id_Venda;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public int getQtd_Produto() {
        return qtd_Produto;
    }

    public void setQtd_Produto(int qtd_Produto) {
        this.qtd_Produto = qtd_Produto;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public double getFalta_pagar() {
        return Falta_pagar;
    }

    public void setFalta_pagar(double Falta_pagar) {
        this.Falta_pagar = Falta_pagar;
    }

    
    


}
