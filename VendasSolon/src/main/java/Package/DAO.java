/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author andre
 */
public class DAO {
    
    public void cadastrarProduto(String nome, double valorCompra, double valorVenda, int estoque,int qtd_comprada) throws Exception{
        
        String sql = "INSERT INTO Produtos(Nome_Produto,Valor_Compra,Valor_Venda, Estoque, Qtd_Comprada)Values(?,?,?,?,?)";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setDouble(2, valorCompra);
            ps.setDouble(3, valorVenda);
            ps.setInt(4, estoque);
            ps.setInt(5, estoque);
            ps.execute();                                   
        }
                    
    }    
    public List <Produtos> buscaProdutos() throws Exception{
        String sql = "SELECT * FROM Produtos";
        List <Produtos> Produtos = new ArrayList <> ();
        try (Connection conexao = ConnectionDB.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id= rs.getInt("Id");
                String nome = rs.getString ("Nome_Produto");
                double valorCompra = rs.getDouble ("Valor_Compra");
                double valorVenda = rs.getDouble ("Valor_Venda");
                int quantidadeDisp = rs.getInt ("Estoque");
    
                Produtos.add(new Produtos(id, nome, valorCompra,valorVenda,quantidadeDisp,0));
                }
            }
        }
        return Produtos;
    }
    public void removerProduto(int id) throws Exception{
        
        String sql2 = "DELETE FROM Produtos WHERE id = ?;";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql2);
            ps.setInt(1, id);
            ps.execute();                                   
        }
    }    
    public Produtos pegaProduto(int id) throws Exception{  
        String sql = "SELECT * FROM Produtos WHERE ID = ?";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            Produtos produto = new Produtos();
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                String nome = rs.getString("Nome_Produto");
                double Valor_Compra = rs.getDouble("Valor_Compra");
                double Valor_Venda = rs.getDouble("Valor_Venda");
                int Estoque = rs.getInt("Estoque");
                produto.setId(id);
                produto.setNome(nome);
                produto.setValorCompra(Valor_Compra);
                produto.setValorVenda(Valor_Venda);
                produto.setEstoque(Estoque);

                }                               
            }
            return produto;
        }            
    }    
    public Produtos pegaProdutoNome(String nome) throws Exception{  
        String sql = "SELECT * FROM Produtos WHERE Nome_Produto = ?";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);
            Produtos produto = new Produtos();
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id = rs.getInt("ID");
                double Valor_Compra = rs.getDouble("Valor_Compra");
                double Valor_Venda = rs.getDouble("Valor_Venda");
                int Estoque = rs.getInt("Estoque");
                produto.setId(id);
                produto.setNome(nome);
                produto.setValorCompra(Valor_Compra);
                produto.setValorVenda(Valor_Venda);
                produto.setEstoque(Estoque);

                }                               
            }
            return produto;
        }            
    }    
    public void editaProduto(int id, String nome, double valorCompra, double valorVenda, int estoque,int qtd_comprada) throws Exception{  
        String sql = "UPDATE Produtos SET Nome_Produto = ?, Valor_Compra = ?,Valor_Venda= ?, Estoque = ?, Qtd_Comprada = ? WHERE ID = ?";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setDouble(2, valorCompra);
            ps.setDouble(3, valorVenda);
            ps.setInt(4, estoque);
            ps.setInt(5, estoque);
            ps.setInt(6, id);
            ps.execute();                                   
        }
                    
    }  
    public String[] obterProdutos() throws Exception {
        String sql = "SELECT Nome_Produto FROM Produtos";
        List<String> listaDeProdutos = new ArrayList<>();

        try (Connection conexao = ConnectionDB.conectar();
             PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            // Itera sobre o ResultSet e adiciona os nomes à lista
            while (rs.next()) {
                listaDeProdutos.add(rs.getString("Nome_Produto"));
            }
        }

        // Converte a lista em um array e retorna
                
         String[] produtosArray = new String[listaDeProdutos.size()];
        produtosArray = listaDeProdutos.toArray(produtosArray);

        // Ordena o array em ordem alfabética
        Arrays.sort(produtosArray);
        return produtosArray;
    }
    public String[] obterClientes() throws Exception {
        String sql = "SELECT Nome FROM Clientes";
        List<String> listaDeProdutos = new ArrayList<>();

        try (Connection conexao = ConnectionDB.conectar();
             PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            // Itera sobre o ResultSet e adiciona os nomes à lista
            while (rs.next()) {
                listaDeProdutos.add(rs.getString("Nome"));
            }
        }
                
         String[] produtosArray = new String[listaDeProdutos.size()];
        produtosArray = listaDeProdutos.toArray(produtosArray);

        // Ordena o array em ordem alfabética
        Arrays.sort(produtosArray);
        return produtosArray;
    }
     public Clientes pegaCliente(String nome) throws Exception{  
        String sql = "SELECT * FROM Clientes WHERE Nome = ?";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);
            Clientes cliente = new Clientes();
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id = rs.getInt("cod");
                cliente.setCodCliente(id);
                cliente.setNome(nome);
                }                               
            }
            return cliente;
        }            
    }    
    public void cadastrarCliente(String Nome) throws Exception{
        String sql = "INSERT INTO Clientes(Nome)Values(?)";
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, Nome);
            ps.execute();                                   
        }
                    
    }  
    public void cadastrarVenda(int id_comprador,int id_produto,int qtd, String pagamento, String data, double FaltaPagar) throws Exception{
        
        String sql = "INSERT INTO Vendas(id_comprador,id_produto,qtd_Produto, forma_pagamento, data_pagamento,Falta_Pagar)Values(?,?,?,?,?,?)";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id_comprador);
            ps.setInt(2, id_produto);
            ps.setInt(3, qtd);
            ps.setString(4, pagamento);
            ps.setString(5, data);
            ps.setDouble(6, FaltaPagar);
            ps.execute();                                   
        }  
        String sql2 = "UPDATE Produtos SET ESTOQUE = ESTOQUE - ? WHERE ID = ?";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql2);
            ps.setInt(1, qtd);
            ps.setInt(2, id_produto);
            ps.execute();                                   
        }   
    }
    public String obtemLucro() throws Exception{
        String sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id where Forma_pagamento != 'Pendente'";
        Double lucro = 0.0;
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int qtd_Produto = rs.getInt("qtd_Produto");
                double Valor_Venda =  rs.getDouble("Valor_Venda");     
                double Valor_Compra =  rs.getDouble("Valor_Compra");
                double FaltaPagar =  rs.getDouble("Falta_pagar");
                lucro = lucro + (((qtd_Produto*Valor_Venda)-(qtd_Produto*Valor_Compra)-FaltaPagar));
                }                               
            }
            return lucro.toString().replace(".", ",");     
    } 
    }
    public List <Vendas> buscaVendas() throws Exception{
        String sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod";
        List <Vendas> vendas = new ArrayList <> ();
        try (Connection conexao = ConnectionDB.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id_venda= rs.getInt("id_venda");
                String nomeComprador = rs.getString ("Nome");
                String nomeProduto = rs.getString ("Nome_Produto");
                int qtd_Produto = rs.getInt("qtd_Produto");
                String formaPagamento = rs.getString ("Forma_pagamento");
                String data_SemFormat = rs.getString ("data_pagamento");
                String data_pagamento = data_SemFormat.substring(8, 10) +"/" + 
                        data_SemFormat.substring(5, 7)+"/" +
                        data_SemFormat.substring(2, 4);
                double falta_pagar = rs.getDouble("falta_pagar");
                double total = qtd_Produto*rs.getDouble("Valor_Venda");
    
                vendas.add(new Vendas(id_venda, nomeComprador, nomeProduto,qtd_Produto,formaPagamento,data_pagamento,falta_pagar,total));
                }
            }
        }
        return vendas;

    }
    public void removerVenda(int id) throws Exception{
        String sql = "SELECT * FROM Vendas WHERE id_venda = ?";
        int qtd = 0;
        int idProduto = 0;
        try (Connection conexao = ConnectionDB.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                  qtd = rs.getInt("qtd_Produto");
                  idProduto = rs.getInt("id_Produto");
                }
            }   
        }
        String sql3 = "UPDATE PRODUTOS SET ESTOQUE = ESTOQUE + ? where id = ?";
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql3);
            ps.setInt(1, qtd);
            ps.setInt(2, idProduto);
            ps.execute();                                   
        }
        
        
        
        String sql2 = "DELETE FROM Vendas WHERE id_venda = ?";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql2);
            ps.setInt(1, id);
            ps.execute();                                   
        }
    }  
    public Vendas pegaVenda(int id) throws Exception{  
        String sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod WHERE ID_venda = ?";
        Vendas venda = new Vendas();
        try (Connection conexao = ConnectionDB.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id_venda= rs.getInt("id_venda");
                String nomeComprador = rs.getString ("Nome");
                String nomeProduto = rs.getString ("Nome_Produto");
                int qtd_Produto = rs.getInt("qtd_Produto");
                String formaPagamento = rs.getString ("Forma_pagamento");
                String data_SemFormat = rs.getString ("data_pagamento");
                String data_pagamento = data_SemFormat.substring(8, 10) +"/" + 
                        data_SemFormat.substring(5, 7)+"/" +
                        data_SemFormat.substring(2, 4);
                double falta_pagar = rs.getDouble("falta_pagar");
                double total = qtd_Produto*rs.getDouble("Valor_Venda");
                venda.setId_Venda(id_venda);
                venda.setNomeComprador(nomeComprador);
                venda.setNomeProduto(nomeProduto);
                venda.setQtd_Produto(qtd_Produto);
                venda.setForma_pagamento(formaPagamento);
                venda.setData_pagamento(data_pagamento);
                venda.setFalta_pagar(falta_pagar);
                venda.setTotal(total);                
                }
            }
        }
        return venda;
    }   
    public void editaVenda(int qtdAntiga, int id_venda, int id_comprador,int id_produto,int qtd, String pagamento, double FaltaPagar) throws Exception{  
        String sql = "UPDATE Vendas SET id_comprador = ?, id_produto = ?,qtd_Produto= ?, forma_pagamento = ?,Falta_Pagar=?  WHERE ID_venda = ?";
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id_comprador);
            ps.setInt(2, id_produto);
            ps.setInt(3, qtd);
            ps.setString(4, pagamento);
            ps.setDouble(5, FaltaPagar);
            ps.setInt(6, id_venda);
            ps.execute();                                   
        }
        String sql2 = "UPDATE PRODUTOS SET ESTOQUE = ESTOQUE + (?) where id = ?";
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql2);
            ps.setInt(1, qtdAntiga-qtd);
            ps.setInt(2, id_produto);
            ps.execute();                                   
        }
                    
    }  
     public List <Vendas> pegaVendaFiltroDuplo(String nome, String formapag) throws Exception{  
         String sql;
         if(formapag.equals("Pendente")){
           sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod WHERE (Nome = ? AND Forma_pagamento = ?)  OR (Nome = ? AND Falta_pagar != 0)";
           List <Vendas> vendas = new ArrayList <> ();
        try (Connection conexao = ConnectionDB.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1,nome);
            ps.setString(2,formapag);
            ps.setString(3,nome);
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id_venda= rs.getInt("id_venda");
                String nomeComprador = rs.getString ("Nome");
                String nomeProduto = rs.getString ("Nome_Produto");
                int qtd_Produto = rs.getInt("qtd_Produto");
                String formaPagamento = rs.getString ("Forma_pagamento");
                String data_SemFormat = rs.getString ("data_pagamento");
                String data_pagamento = data_SemFormat.substring(8, 10) +"/" + 
                        data_SemFormat.substring(5, 7)+"/" +
                        data_SemFormat.substring(2, 4);
                double falta_pagar = rs.getDouble("falta_pagar");
                double total = qtd_Produto*rs.getDouble("Valor_Venda");
    
                vendas.add(new Vendas(id_venda, nomeComprador, nomeProduto,qtd_Produto,formaPagamento,data_pagamento,falta_pagar,total));
                }
            }
        }
        return vendas;
        }
        else{ 
         sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod WHERE Nome = ? AND Forma_pagamento = ?";
         List <Vendas> vendas = new ArrayList <> ();
        try (Connection conexao = ConnectionDB.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1,nome);
            ps.setString(2,formapag);
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id_venda= rs.getInt("id_venda");
                String nomeComprador = rs.getString ("Nome");
                String nomeProduto = rs.getString ("Nome_Produto");
                int qtd_Produto = rs.getInt("qtd_Produto");
                String formaPagamento = rs.getString ("Forma_pagamento");
                String data_SemFormat = rs.getString ("data_pagamento");
                String data_pagamento = data_SemFormat.substring(8, 10) +"/" + 
                        data_SemFormat.substring(5, 7)+"/" +
                        data_SemFormat.substring(2, 4);
                double falta_pagar = rs.getDouble("falta_pagar");
                double total = qtd_Produto*rs.getDouble("Valor_Venda");
    
                vendas.add(new Vendas(id_venda, nomeComprador, nomeProduto,qtd_Produto,formaPagamento,data_pagamento,falta_pagar,total));
                }
            }
        }
        return vendas;
         }
         
    }
    public List <Vendas> pegaVendaFiltroUm(String nome) throws Exception{  
        String sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod WHERE Nome = ?";
        List <Vendas> vendas = new ArrayList <> ();
        try (Connection conexao = ConnectionDB.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1,nome);
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id_venda= rs.getInt("id_venda");
                String nomeComprador = rs.getString ("Nome");
                String nomeProduto = rs.getString ("Nome_Produto");
                int qtd_Produto = rs.getInt("qtd_Produto");
                String formaPagamento = rs.getString ("Forma_pagamento");
                String data_SemFormat = rs.getString ("data_pagamento");
                String data_pagamento = data_SemFormat.substring(8, 10) +"/" + 
                        data_SemFormat.substring(5, 7)+"/" +
                        data_SemFormat.substring(2, 4);
                double falta_pagar = rs.getDouble("falta_pagar");
                double total = qtd_Produto*rs.getDouble("Valor_Venda");
    
                vendas.add(new Vendas(id_venda, nomeComprador, nomeProduto,qtd_Produto,formaPagamento,data_pagamento,falta_pagar,total));
                }
            }
        }
        return vendas;
    }
    public List <Vendas> pegaVendaFiltroDois( String formapag) throws Exception{ 
        String sql;
        if(formapag.equals("Pendente")){
           sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod WHERE Forma_pagamento = ?  OR Falta_pagar != 0";
        }
        else{
           sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod WHERE Forma_pagamento = ?";
        }

        List <Vendas> vendas = new ArrayList <> ();
        try (Connection conexao = ConnectionDB.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1,formapag);
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id_venda= rs.getInt("id_venda");
                String nomeComprador = rs.getString ("Nome");
                String nomeProduto = rs.getString ("Nome_Produto");
                int qtd_Produto = rs.getInt("qtd_Produto");
                String formaPagamento = rs.getString ("Forma_pagamento");
                String data_SemFormat = rs.getString ("data_pagamento");
                String data_pagamento = data_SemFormat.substring(8, 10) +"/" + 
                        data_SemFormat.substring(5, 7)+"/" +
                        data_SemFormat.substring(2, 4);
                double falta_pagar = rs.getDouble("falta_pagar");
                double total = qtd_Produto*rs.getDouble("Valor_Venda");
    
                vendas.add(new Vendas(id_venda, nomeComprador, nomeProduto,qtd_Produto,formaPagamento,data_pagamento,falta_pagar,total));
                }
            }
        }
        return vendas;
    }
    public List <Vendas> pegaVendaDinheiro() throws Exception{  
        String sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod WHERE forma_pagamento = 'Dinheiro' or(forma_pagamento like '%D-%' and falta_pagar >0)";
        List <Vendas> vendas = new ArrayList <> ();
        try (Connection conexao = ConnectionDB.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id_venda= rs.getInt("id_venda");
                String nomeComprador = rs.getString ("Nome");
                String nomeProduto = rs.getString ("Nome_Produto");
                int qtd_Produto = rs.getInt("qtd_Produto");
                String formaPagamento = rs.getString ("Forma_pagamento");
                String data_SemFormat = rs.getString ("data_pagamento");
                String data_pagamento = data_SemFormat.substring(8, 10) +"/" + 
                        data_SemFormat.substring(5, 7)+"/" +
                        data_SemFormat.substring(2, 4);
                double falta_pagar = rs.getDouble("falta_pagar");
                double total = qtd_Produto*rs.getDouble("Valor_Venda");
    
                vendas.add(new Vendas(id_venda, nomeComprador, nomeProduto,qtd_Produto,formaPagamento,data_pagamento,falta_pagar,total));
                }
            }
        }
        return vendas;
    }
    public List <Vendas> pegaVendaPix() throws Exception{  
        String sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id left join Clientes on Vendas.id_Comprador = Clientes.cod WHERE forma_Pagamento = 'Pix' or(forma_pagamento like '%P-%' and falta_pagar >0)";
        List <Vendas> vendas = new ArrayList <> ();
        try (Connection conexao = ConnectionDB.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id_venda= rs.getInt("id_venda");
                String nomeComprador = rs.getString ("Nome");
                String nomeProduto = rs.getString ("Nome_Produto");
                int qtd_Produto = rs.getInt("qtd_Produto");
                String formaPagamento = rs.getString ("Forma_pagamento");
                String data_SemFormat = rs.getString ("data_pagamento");
                String data_pagamento = data_SemFormat.substring(8, 10) +"/" + 
                        data_SemFormat.substring(5, 7)+"/" +
                        data_SemFormat.substring(2, 4);
                double falta_pagar = rs.getDouble("falta_pagar");
                double total = qtd_Produto*rs.getDouble("Valor_Venda");
                
    
                vendas.add(new Vendas(id_venda, nomeComprador, nomeProduto,qtd_Produto,formaPagamento,data_pagamento,falta_pagar,total));
                }
            }
        }
        return vendas;
    }
    public String obtemValorPix() throws Exception{
        String sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id WHERE forma_Pagamento = 'Pix'";
        Double lucro = 0.0;
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int qtd_Produto = rs.getInt("qtd_Produto");
                double Valor_Venda =  rs.getDouble("Valor_Venda");     
                double Falta_pagar =  rs.getDouble("Falta_pagar");
                double retirado = rs.getDouble("Retirado");
                lucro = lucro + (((qtd_Produto*Valor_Venda)-Falta_pagar)- retirado);
                }                               
            }
            return lucro.toString().replace(".", ",");     
    } 
    }
    public String obtemValorDinheiro() throws Exception{
        String sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id WHERE forma_Pagamento = 'Dinheiro'";
        Double lucro = 0.0;
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int qtd_Produto = rs.getInt("qtd_Produto");
                double Valor_Venda =  rs.getDouble("Valor_Venda");     
                double Falta_pagar =  rs.getDouble("Falta_pagar");
                double retirado = rs.getDouble("Retirado");
                lucro = lucro + (((qtd_Produto*Valor_Venda)-Falta_pagar)- retirado);
                }                               
            }
            return lucro.toString().replace(".", ",");     
    } 
    }
    public double obtemValorCusto() throws Exception{  
        String sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id"; 
        double valorCusto = 0;
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            Produtos produto = new Produtos();
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                double Valor_Compra = rs.getDouble("Valor_Compra");
                double qtd_produto = rs.getDouble("qtd_Produto");
                valorCusto += (Valor_Compra*qtd_produto);
                }                               
            }
            return valorCusto;
        }            
    }   
    public double obtemValorVenda() throws Exception{  
        String sql = "select * from Vendas left join Produtos on Vendas.id_produto = Produtos.id"; 
        double valorCusto = 0;
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            Produtos produto = new Produtos();
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                double Valor_Compra = rs.getDouble("Valor_Venda");
                double qtd_produto = rs.getDouble("qtd_Produto");
                valorCusto += (Valor_Compra*qtd_produto);
                }                               
            }
            return valorCusto;
        }            
    } 
}
