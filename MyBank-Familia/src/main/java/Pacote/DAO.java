/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Pacote;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class DAO {
    
    public void cadastrarTransacao(String tipo, String nome, String categoria, double valor, String fixa_variavel,String ativo_passivo, String Data_Transacao, String tipo_invest) throws Exception{
        
        String sql = "INSERT INTO MB_TRANSACOES(Entrada_saida,nome,Categoria, Valor, Fixa_Variavel,Ativo_Passivo,Data_Transacao,Tipo_Investimento)Values(?,?,?,?,?,?,?,?)";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, tipo);
            ps.setString(2, nome);
            ps.setString(3, categoria);
            ps.setDouble(4, valor);
            ps.setString(5, fixa_variavel);
            ps.setString(6, ativo_passivo);
            ps.setString(7, Data_Transacao);
            ps.setString(8, tipo_invest);
            ps.execute();                                   
        }
                    
    }
    public void atualizaTransacao(int id ,String tipo, String nome, String categoria, double valor, String fixa_variavel,String ativo_passivo, String Data_Transacao, String tipo_invest) throws Exception{
        
        String sql = "UPDATE MB_TRANSACOES set Entrada_saida = ?, nome = ?,Categoria = ?, Valor = ?, Fixa_Variavel = ?,Ativo_Passivo = ?,Data_Transacao = ?,Tipo_Investimento = ? WHERE ID = ?";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, tipo);
            ps.setString(2, nome);
            ps.setString(3, categoria);
            ps.setDouble(4, valor);
            ps.setString(5, fixa_variavel);
            ps.setString(6, ativo_passivo);
            ps.setString(7, Data_Transacao);
            ps.setString(8, tipo_invest);
            ps.setInt(9, id);
            ps.execute();                                   
        }
                    
    }
    public String obtemPatimonio() throws Exception{
        String sql = "select * from MB_Transacoes";
        Double patrimonio = 0.0;
        String patrimoniotxt = "";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                    if(rs.getString("Entrada_saida").equals("Entrada") || rs.getString("Categoria").equals("Investimento")){
                        patrimonio += rs.getDouble("valor");
                        
                    }
                    else if(rs.getString("Entrada_saida").equals("Saída") ){
                        patrimonio -= rs.getDouble("valor");
                    }

                    
                  
                }
                patrimoniotxt = String.format("%.2f", patrimonio);
                
                }                               
            }
            return patrimoniotxt.replace(".", ",");     
    } 
        public String pegarUltimaData() throws Exception{
        String sql = "select * from MB_Transacoes ORDER BY data_transacao DESC LIMIT 1;";
        String data = "";   
            try(Connection conexao = ConnectionDB.conectar()){
                PreparedStatement ps = conexao.prepareStatement(sql);
                try(ResultSet rs = ps.executeQuery()){
                    while (rs.next()){
                        data = rs.getString("data_transacao").replace("-","");
                    }
                }                               
            }
            return data;     
        } 
       public void insereDespesasFixas() throws Exception{
        String sql = """
                     SELECT Nome, valor, Categoria, Ativo_Passivo, Data_transacao, Tipo_Investimento
                     FROM (
                         SELECT Nome, valor, Categoria, Ativo_Passivo, Data_transacao, Tipo_Investimento,
                                ROW_NUMBER() OVER (PARTITION BY Nome ORDER BY Data_transacao DESC) AS rn
                         FROM MB_Transacoes
                         WHERE fixa_variavel = 'Fixa' AND Entrada_saida = 'Saída'
                     ) AS subquery
                     WHERE rn = 1;"""; 
        String Entrada_saida = "Saída";
        String fixa_variavel = "Fixa";
        String nome;
        String categoria;
        double valor;
        String ativo_passivo;
        String tipo_investimento;
        String jacadastrados = "";
        String cadastrados = "";
            try(Connection conexao = ConnectionDB.conectar()){
                PreparedStatement ps = conexao.prepareStatement(sql);
                try(ResultSet rs = ps.executeQuery()){
                    while (rs.next()){
                        nome = rs.getString("Nome");
                        categoria = rs.getString("categoria");
                        valor = rs.getDouble("valor");
                        ativo_passivo = rs.getString("ativo_passivo");
                        tipo_investimento = rs.getString("tipo_investimento");
                        String dataTabela = rs.getString("Data_transacao").replace("-", "").substring(0,6);              
                        LocalDate dataAtual3 = LocalDate.now(); 
                        System.out.println("data atual: " + dataAtual3.toString().replace("-", "").substring(0,6));
                        System.out.println("data tabela:" + (Integer.parseInt(dataTabela)));
                        int contador = 0;
                        
                        if(Integer.parseInt(dataAtual3.toString().replace("-", "").substring(0,6)) > (Integer.parseInt(dataTabela))){
                        cadastrados += "-" +nome + "\n";     
                        dataTabela = rs.getString("Data_transacao").substring(8,10);  
                        String dataAtual1 =  LocalDate.now().toString().substring(0, 8) + dataTabela;
                        cadastrarTransacao(Entrada_saida,nome,categoria, valor, fixa_variavel,
                                                  ativo_passivo,dataAtual1,tipo_investimento);    
                        }
                        else{
                          jacadastrados += "-" + nome + "\n";                                 
                        }
                    }
                    if(!jacadastrados.equals("")){
                        JOptionPane.showMessageDialog(null, "As despesas: \n" + jacadastrados + "desse mês, já estão cadastradas");
                    }
                    if(!cadastrados.equals("")){
                        JOptionPane.showMessageDialog(null, "As despesas: \n" + cadastrados + "desse mês, foram cadastradas!");
                    }
                }                               
            }
        }
        
        public ArrayList <Transferencia> todastTransfeUsuario()throws Exception{
        String sql = "select * from MB_Transacoes order by Data_Transacao";
        ArrayList<Transferencia> todasTransfe = new ArrayList<Transferencia>();
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();               
                while (rs.next()){
                    int id = rs.getInt("id");
                    String Entrada_saida = rs.getString("Entrada_saida");
                    String nome = rs.getString("nome");
                    String Categoria = rs.getString("Categoria"); 
                    double  Valor = rs.getDouble("Valor");
                    String  Fixa_Variavel = rs.getString("Fixa_Variavel");
                    String Ativo_Passivo = rs.getString("Ativo_Passivo");
                    String Data_Transacao = rs.getString("Data_Transacao");
                    String Tipo_Investimento = rs.getString("Tipo_Investimento");
                    Transferencia transferencia = new Transferencia(id,Entrada_saida,nome,Categoria,Valor,Fixa_Variavel,Ativo_Passivo,Data_Transacao,Tipo_Investimento);                    
                    todasTransfe.add(transferencia);
                                    
                }
                return todasTransfe;
            }        
    }
    public Transferencia getTransfe(int id)throws Exception{
        String sql = "select * from MB_Transacoes where Id = ?";
        String Entrada_saida = "";
        String nome = "";
        String Categoria = ""; 
        double  Valor = 0.0;
        String  Fixa_Variavel = "";
        String Ativo_Passivo = "";
        String Data_Transacao = "";
        String Tipo_Investimento = "";
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();               
                while (rs.next()){
                    Entrada_saida = rs.getString("Entrada_saida");
                    nome = rs.getString("nome");
                    Categoria = rs.getString("Categoria"); 
                    Valor = rs.getDouble("Valor");
                    Fixa_Variavel = rs.getString("Fixa_Variavel");
                    Ativo_Passivo = rs.getString("Ativo_Passivo");
                    Data_Transacao = rs.getString("Data_Transacao");
                    Tipo_Investimento = rs.getString("Tipo_Investimento");                                                                 
                }
                Transferencia transferencia = new Transferencia(Entrada_saida,nome,Categoria,Valor,Fixa_Variavel,Ativo_Passivo,Data_Transacao,Tipo_Investimento);
                return transferencia;
            }        
    }
}