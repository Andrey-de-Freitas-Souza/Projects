
package telas;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class DAO {
    public User estaCadastrado(User userLogin)throws Exception{
        String sql = "SELECT * FROM Users WHERE codConta = ? AND Senha = ?";
        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,userLogin.getCodConta());
            ps.setString(2,userLogin.getSenha());
            User logado = new User();
            
            try(ResultSet rs = ps.executeQuery()){                
                while (rs.next()){
                    int conta = rs.getInt("codConta");               
                    String senha = rs.getString("senha");
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String cpf = rs.getString("CPF");
                    String cep = rs.getString("CEP");
                    String email = rs.getString("email");
                    String telefone = rs.getString("telefone");
                    String nascimento = rs.getString("nascimento");
                    String nacionalidade = rs.getString("nacionalidade");                    
                    logado.setCodConta(conta);                
                    logado.setSenha(senha);
                    logado.setConta(id);
                    logado.setNome(nome);
                    logado.setCpf(cpf);
                    logado.setCep(cep);
                    logado.setEmail(email);
                    logado.setTelefone(telefone);
                    logado.setNascimento(nascimento);
                    logado.setNacionalidade(nacionalidade);                    
                }
            }
            return logado;
            
        }
        
        
    }
    public String cadastrar(String nome, String cpf, String cep, String email, String telefone, String nascimento, String nacionalidade, String senha, int cod) throws Exception{
        String sql = "INSERT INTO Conta(id)Values(?)";
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, cod);
             ps.execute();                                   
        }
        String sql2 = "INSERT INTO Users(nome,CPF,CEP, email,telefone,nascimento,nacionalidade,senha,codConta)Values(?,?,?,?,?,?,?,?,?)";
        
        try(Connection conexao = ConnectionDB.conectar()){
            PreparedStatement ps = conexao.prepareStatement(sql2);
            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, cep);
            ps.setString(4, email);
            ps.setString(5, telefone);
            ps.setString(6, nascimento);
            ps.setString(7, nacionalidade);
            ps.setString(8, senha);
            ps.setInt(9 ,cod);
            ps.execute();                                   
        }
        return Integer.toString(cod);
    }
    public ArrayList <Integer> todasContas()throws Exception{
        String sql = "SELECT * FROM Conta WHERE id";
        ArrayList<Integer> contas = new ArrayList<Integer>();
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();               
                while (rs.next()){
                    int conta = rs.getInt("id");
                    contas.add(conta);
                                    
                }
                return contas;
            }        
    }
    public ArrayList <Integer> todasTransferencias()throws Exception{
        String sql = "SELECT * FROM registroTransferencia WHERE id";
        ArrayList<Integer> contas = new ArrayList<Integer>();
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();               
                while (rs.next()){
                    int id = rs.getInt("id");
                    contas.add(id);
                                    
                }
                return contas;
            }        
    }
    
    public void depositar(int id ,Double valor ,String data, User logado ,double novoSaldo)throws Exception{
        
        String sql = "UPDATE Conta SET Saldo = ? WHERE id = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setDouble(1,(novoSaldo));
            ps.setInt(2,logado.getCodConta());
            ps.execute();            
        }
        
        String sql2 = "INSERT INTO registroTransferencia(id,dia, valor,tipo,descricao,destinatario,codConta) VALUES(?,?,?,'Depósito        ','Sem descrição',?,?)";
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql2);
            ps.setInt(1,id);
            ps.setString(2,data);
            ps.setDouble(3,valor);
            ps.setInt(4,logado.getCodConta());
             ps.setInt(5,logado.getCodConta());
            ps.execute();            
        }
        
        
        
    }
    public void transferir(int id ,Double valor ,String data, User logado ,double novoSaldo,int destinatario,String descricao,double saldofinaldest)throws Exception{
        
        String sql = "UPDATE Conta SET Saldo = ? WHERE id = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setDouble(1,(novoSaldo));
            ps.setInt(2,logado.getCodConta());
            ps.execute();            
        }
        String sql4 = "UPDATE Conta SET Saldo = ? WHERE id = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql4);
            ps.setDouble(1,(saldofinaldest));
            ps.setInt(2,destinatario);
            ps.execute();            
        }
        
        String sql2 = "INSERT INTO registroTransferencia(id,dia, valor,tipo,descricao,destinatario,codConta) VALUES(?,?,?,'Transferência',?,?,?)";
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql2);
            ps.setInt(1,id);
            ps.setString(2,data);
            ps.setDouble(3,valor);
            ps.setString(4,descricao);
            ps.setInt(5,destinatario);
            ps.setInt(6,logado.getCodConta());
            ps.execute();            
        }
        
        
        
        
    }
    public void fazerPix(int id,Double valor ,String data, User logado ,double novoSaldo,int destinatario,String descricao,double saldofinaldest,String chave)throws Exception{
        
        String sql = "UPDATE Conta SET Saldo = ? WHERE id = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setDouble(1,(novoSaldo));
            ps.setInt(2,logado.getCodConta());
            ps.execute();            
        }
        String sql4 = "UPDATE Conta SET Saldo = ? WHERE id = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql4);
            ps.setDouble(1,(saldofinaldest));
            ps.setInt(2,destinatario);
            ps.execute();            
        }
        
        String sql2 = "INSERT INTO registroTransferencia(id,dia, valor,tipo,descricao,destinatario,codConta) VALUES(?,?,?,'Pix                  ',?,?,?)";
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql2);
            ps.setInt(1,id);
            ps.setString(2,data);
            ps.setDouble(3,valor);
            ps.setString(4,descricao);
            ps.setInt(5,destinatario);
             ps.setInt(6,logado.getCodConta());
            ps.execute();            
        }
        
        
        
        
    }
    public double verificaSaldo(int CodConta)throws Exception{
        String sql = "SELECT u.id, u.nome, u.codConta, c.Saldo, c.Limite, c.Investido FROM Users AS u JOIN Conta AS c ON u.codConta = c.id WHERE u.codConta = ?";
        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,CodConta);
            ResultSet rs = ps.executeQuery();
            double saldo = 0;
                while (rs.next()){
                   saldo = rs.getDouble("Saldo");
                }    
            return saldo;                                            
        }
        
        
    }
    public String verificaNome(int CodConta)throws Exception{
        String sql = "SELECT nome FROM Users WHERE codConta = ?;";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,CodConta);
            ResultSet rs = ps.executeQuery();
            String nome = "";
                while (rs.next()){
                  nome = rs.getString("nome");
                }    
            return nome;                                            
        }
                
    }
    public String verificaChavePix(int CodConta)throws Exception{
        String sql = "SELECT ChavePix FROM Conta WHERE id = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,CodConta);
            ResultSet rs = ps.executeQuery();
            String chave = "";
                while (rs.next()){
                   chave = rs.getString("ChavePix");
                }    
            return chave;                                            
        }
                
    }
    public int verificaCodPix(String chave)throws Exception{
        String sql = "SELECT id FROM Conta WHERE ChavePix = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,chave);
            ResultSet rs = ps.executeQuery();
            int id = 0;
                while (rs.next()){
                  id = rs.getInt("id");
                }    
            return id;                                            
        }
                
    }
    public ArrayList <String> todasChavesPix()throws Exception{
        String sql = "SELECT ChavePix FROM Conta;";
        ArrayList<String> chavesPix = new ArrayList<String>();
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();               
                while (rs.next()){
                    String chave = rs.getString("ChavePix");
                    chavesPix.add(chave);
                                    
                }
                return chavesPix;
            }        
    }
    public void cadastrarChavePIx(User logado,String chave)throws Exception{
        
        String sql = "UPDATE Conta SET ChavePix = ? WHERE id = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,(chave));
            ps.setInt(2,logado.getCodConta());
            ps.execute();            
        }
                
    }
    public void investir(int id ,Double valor ,String data, User logado ,double novoSaldo,double novoSaldoInvestido)throws Exception{
        
        String sql = "UPDATE Conta SET Saldo = ?, investido = ?, dataInvestimento = ? WHERE id = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setDouble(1,(novoSaldo));
            ps.setDouble(2,(novoSaldoInvestido));
            ps.setString(3,data);
            ps.setInt(4,logado.getCodConta());         
            ps.execute();            
        }
   
        
        String sql2 = "INSERT INTO registroTransferencia(id,dia, valor,tipo,descricao,destinatario,codConta) VALUES(?,?,?,'Investimento      ','Sem descrição',?,?)";
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql2);
            ps.setInt(1,id);
            ps.setString(2,data);
            ps.setDouble(3,valor);
            ps.setInt(4,logado.getCodConta());
             ps.setInt(5,logado.getCodConta());
            ps.execute();            
        }
        
        
        
    }
     public double verificaSaldoInvestido(int CodConta)throws Exception{
        String sql = "SELECT * FROM Conta WHERE id = ?";
        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,CodConta);
            ResultSet rs = ps.executeQuery();
            double saldo = 0;
                while (rs.next()){
                   saldo = rs.getDouble("Investido");
                }    
            return saldo;                                            
        }
        
        
    }
     public void tirarInvestido(int id ,Double valor ,String data, User logado ,double novoSaldo,double novoSaldoInvestido)throws Exception{
        
        String sql = "UPDATE Conta SET Saldo = ?, investido = ?, dataInvestimento = ? WHERE id = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setDouble(1,(novoSaldo));
            ps.setDouble(2,(novoSaldoInvestido));
            ps.setString(3,data);
            ps.setInt(4,logado.getCodConta());         
            ps.execute();            
        }
   
        
        String sql2 = "INSERT INTO registroTransferencia(id,dia, valor,tipo,descricao,destinatario,codConta) VALUES(?,?,?,'Investimento      ','Sem descrição',?,?)";
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql2);
            ps.setInt(1,id);
            ps.setString(2,data);
            ps.setDouble(3,valor);
            ps.setInt(4,logado.getCodConta());
             ps.setInt(5,logado.getCodConta());
            ps.execute();            
        }
       
        
        
    }
     public ArrayList <Transferencia> todastTransfeUsuario(int codConta)throws Exception{
        String sql = "SELECT * FROM registroTransferencia WHERE CodConta = ? OR destinatario = ? ORDER BY dia desc,id desc";
        ArrayList<Transferencia> todasTransfe = new ArrayList<Transferencia>();
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codConta);
            ps.setInt(2, codConta);
            ResultSet rs = ps.executeQuery();               
                while (rs.next()){
                    int id = rs.getInt("id");
                    String dia = rs.getString("dia");
                    double valor = rs.getDouble("valor");
                    String tipo = rs.getString("tipo");
                    String descricao = rs.getString("descricao");
                    int destinatario = rs.getInt("destinatario");
                    int codigoConta = rs.getInt("codConta");
                    Transferencia transferencia = new Transferencia(id,dia,valor,tipo,descricao,destinatario,codigoConta);                    
                    todasTransfe.add(transferencia);
                                    
                }
                return todasTransfe;
            }        
    }
     public String verificaEmail(int CodConta)throws Exception{
        String sql = "SELECT email FROM Users WHERE codConta = ?;";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,CodConta);
            ResultSet rs = ps.executeQuery();
            String email = "";
                while (rs.next()){
                  email = rs.getString("Email");
                }    
            return email;                                            
        }
                
    }
     public boolean AumetarLimite(double limite,User logado)throws Exception{        
        String sql = "UPDATE Conta SET Limite = ? WHERE id = ?";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setDouble(1,(limite));
            ps.setInt(2,logado.getCodConta());
            ps.execute();            
        }
        return true;        
    }
     public double verificaLimite(int CodConta)throws Exception{
        String sql = "SELECT Limite FROM Conta WHERE id = ?;";        
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,CodConta);
            ResultSet rs = ps.executeQuery();
            double limite = 0;
                while (rs.next()){
                  limite = rs.getDouble("Limite");
                }    
            return limite;                                            
        }
                
    }
    public ArrayList <String> todosCpfs()throws Exception{
        String sql = "SELECT CPF FROM Users;";
        ArrayList<String> cpfs = new ArrayList<String>();
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();               
                while (rs.next()){
                    String cpf = rs.getString("CPF");
                    cpfs.add(cpf);
                                    
                }
                return cpfs;
            }        
    }
    public ArrayList <String> todosTelefones()throws Exception{
        String sql = "SELECT telefone FROM Users;";
        ArrayList<String> telefones = new ArrayList<String>();
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();               
                while (rs.next()){
                    String telefone = rs.getString("telefone");
                    telefones.add(telefone);
                                    
                }
                return telefones;
            }        
    }
    public ArrayList <String> todosEmails()throws Exception{
        String sql = "SELECT email FROM Users;";
        ArrayList<String> emails = new ArrayList<String>();
        try(Connection conexao = ConnectionDB.conectar()){            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();               
                while (rs.next()){
                    String email = rs.getString("email");
                    emails.add(email);
                                    
                }
                return emails;
            }        
    }
     
     
        
}