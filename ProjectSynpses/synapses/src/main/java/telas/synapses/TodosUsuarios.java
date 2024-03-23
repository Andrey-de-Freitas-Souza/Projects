
package telas;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TodosUsuarios extends AbstractTableModel{
    private List <Usuario> usuarios;
    private String [] colunas = {"id", "nome", "email","telefone"};
    public TodosUsuarios() throws Exception{
        DAO dao = new DAO ();
        this.usuarios = dao.buscaAlunosPorCurso();
    }
    @Override
    public int getRowCount() {
        return usuarios.size();
    }
    @Override
    public int getColumnCount() {
        return 4;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.usuarios.get(rowIndex).getId();
            case 1:
                return this.usuarios.get(rowIndex).getNome();
            case 2:
                return this.usuarios.get(rowIndex).getEmail();
            case 3:
                return this.usuarios.get(rowIndex).getFone();
            default:                
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
}
