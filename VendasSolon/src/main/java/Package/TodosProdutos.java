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
public class TodosProdutos extends AbstractTableModel{
    private List <Produtos> produtos;
    private String [] colunas = {"Id", "Nome", "Valor_Compra","Valor_Venda","Estoque"};
    public TodosProdutos() throws Exception{
        DAO dao = new DAO ();
        this.produtos = dao.buscaProdutos();
    }
    @Override
    public int getRowCount() {
        return produtos.size();
    }
    @Override
    public int getColumnCount() {
        return 5;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.produtos.get(rowIndex).getId();
            case 1:
                return this.produtos.get(rowIndex).getNome();
            case 2:
                return this.produtos.get(rowIndex).getValorCompra();
            case 3:
                return this.produtos.get(rowIndex).getValorVenda();
            case 4:
                return this.produtos.get(rowIndex).getEstoque();
            
            default:                
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
    
}
