/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author andre
 */
public class TodasVendas extends AbstractTableModel{
    private List <Vendas> vendas;
    private String [] colunas = {"id_venda", "Nome", "Nome_Produto","qtd_Produto","Total","Forma_pagamento","data_pagamento","falta_pagar"};
    public TodasVendas() throws Exception{
        DAO dao = new DAO ();
        this.vendas = dao.buscaVendas();
    }
    public TodasVendas(String nome, String formapag) throws Exception{
        DAO dao = new DAO ();
        if(nome.equals("Sem Filtro")&&formapag.equals("Sem Filtro")){
            this.vendas = dao.buscaVendas();
        }
        else if(!nome.equals("Sem Filtro") && formapag.equals("Sem Filtro")){
            this.vendas = dao.pegaVendaFiltroUm(nome);  
        }
        else if(nome.equals("Sem Filtro") && !formapag.equals("Sem Filtro")){
            this.vendas = dao.pegaVendaFiltroDois(formapag);  
        }
        else if(!nome.equals("Sem Filtro") && !formapag.equals("Sem Filtro")){
            this.vendas = dao.pegaVendaFiltroDuplo(nome,formapag);  
        }
              
    }
    @Override
    public int getRowCount() {
        return vendas.size();
    }
    @Override
    public int getColumnCount() {
        return 8;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.vendas.get(rowIndex).getId_Venda();
            case 1:
                return this.vendas.get(rowIndex).getNomeComprador();
            case 2:
                return this.vendas.get(rowIndex).getNomeProduto();
            case 3:
                return this.vendas.get(rowIndex).getQtd_Produto();
            case 4:
                return this.vendas.get(rowIndex).getTotal();
            case 5:
                return this.vendas.get(rowIndex).getForma_pagamento();
            case 6:
                return this.vendas.get(rowIndex).getFalta_pagar();
            case 7:
                return this.vendas.get(rowIndex).getData_pagamento();
                
            
            default:                
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
    
}
