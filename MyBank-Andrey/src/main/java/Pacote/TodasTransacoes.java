/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacote;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
/**
 *
 * @author andre
 */
public class TodasTransacoes extends AbstractTableModel {
    private final String[] colunas = {"Entrada/Saída", "Nome", "Categoria", "Valor", "Fixa/Variável", "Ativo/Passivo", "Data Transação", "Tipo Investimento"};
    private final ArrayList<Transferencia> transferencias;

    public TodasTransacoes(ArrayList<Transferencia> transferencias) {
        this.transferencias = transferencias;
    }

    @Override
    public int getRowCount() {
        return transferencias.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Transferencia transferencia = transferencias.get(rowIndex);
        switch (columnIndex) {
            case 0: return transferencia.getEntrada_saida();
            case 1: return transferencia.getNome();
            case 2: return transferencia.getCategoria();
            case 3: return transferencia.getValor();
            case 4: return transferencia.getFixa_Variavel();
            case 5: return transferencia.getAtivo_Passivo();
            case 6: return transferencia.getData_Transacao();
            case 7: return transferencia.getTipo_Investimento();
            default: return null;
        }
    }
}