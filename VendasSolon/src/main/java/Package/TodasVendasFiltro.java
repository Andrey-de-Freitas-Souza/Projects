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
public class TodasVendasFiltro extends AbstractTableModel{
    private List <Vendas> vendas;
    private String [] colunas = {"id_venda", "Nome", "Nome_Produto","qtd_Produto","Total","Forma_pagamento","data_pagamento","falta_pagar"};

    public TodasVendasFiltro() throws Exception{
       
        
    }
    public TodasVendasFiltro(int tipo) throws Exception{
        DAO dao = new DAO ();
        if(tipo == 0){
            this.vendas = dao.pegaVendaDinheiro();
        }
        else if(tipo == 1){
            this.vendas = dao.pegaVendaPix();
        }                
    }
    @Override
    public int getRowCount() {
        return vendas.size();
    }
    @Override
    public int getColumnCount() {
        return 6;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.vendas.get(rowIndex).getNomeComprador();
            case 1:
                return this.vendas.get(rowIndex).getNomeProduto();
            case 2:
                return this.vendas.get(rowIndex).getQtd_Produto();
            case 3:
                return this.vendas.get(rowIndex).getTotal();
            case 4:
                return this.vendas.get(rowIndex).getForma_pagamento();
            case 5:
                return this.vendas.get(rowIndex).getFalta_pagar();
                        
            default:                
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
    
}
