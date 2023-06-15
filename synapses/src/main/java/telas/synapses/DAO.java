
package telas;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
    public Usuario existeUser(Usuario usuario) throws Exception{
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        try(Connection conexao = ConnectionDB.obterConexao()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,usuario.getNome());
            ps.setString(2, usuario.getSenha());
            Usuario logado = new Usuario();
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                String email = rs.getString("email");
                String fone = rs.getString("telefone");
                String curso1 = rs.getString("curso1");
                String curso2 = rs.getString("curso2");
                String curso3 = rs.getString("curso3");
                String curso4 = rs.getString("curso4");
                logado.setId(id);
                logado.setNome(nome);
                logado.setSenha(senha);
                logado.setEmail(email);
                logado.setFone(fone);
                logado.setCurso1(curso1);
                logado.setCurso2(curso2);
                logado.setCurso3(curso3);
                logado.setCurso4(curso4);
                
                }
            }
            return logado;
        }
    }
    
    public Administrador existeAdm (Administrador adm) throws Exception{
        String sql = "SELECT * FROM tb_Administrador WHERE email = ? AND senha = ?";
        try (Connection conexao = ConnectionDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, adm.getEmail());
            ps.setString(2, adm.getSenha());
            Administrador admlogado = new Administrador();
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                String email = rs.getString("email");                
                admlogado.setId(id);
                admlogado.setNome(nome);
                admlogado.setSenha(senha);
                admlogado.setEmail(email);               
                }
            }
            return admlogado;
            }
        }
    

    public void cadastraUsuario(String nome, String senha, String email, String telefone){
        String sql = "INSERT INTO tb_usuario(nome,senha,email,telefone) VALUES(?,?,?,?);";
        try(Connection conexao = ConnectionDB.obterConexao()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,nome);
            ps.setString(2,senha);
            ps.setString(3,email);
            ps.setString(4,telefone);            
            ps.execute();
            
        }
        catch(Exception e){
            e.printStackTrace();
            
        }    
        
    }
    public void inserirCurso(Cursos curso) throws Exception{
        String sql = "INSERT INTO tb_cursos (nome, categoria,qtdAulas,descricao) VALUES (?, ?,?,?);";
        try (Connection conexao = ConnectionDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getTipo());
            ps.setInt(3, curso.getQtdAulas());
            ps.setString(4, curso.getDescricao());
            ps.execute();
        }
    }
  public Cursos [] obterCursos () throws Exception{
        String sql = "SELECT * FROM tb_cursos";
        try (Connection conn = ConnectionDB.obterConexao();
        PreparedStatement ps =
        conn.prepareStatement(sql,
ResultSet.TYPE_SCROLL_INSENSITIVE,
ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery()){
        int totalDeCursos = rs.last () ? rs.getRow() : 0;
        Cursos [] cursos = new Cursos[totalDeCursos];
        rs.beforeFirst();
        int contador = 0;
        while (rs.next()){
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String tipo = rs.getString ("categoria");
            int qtdAulas = rs.getInt("qtdAulas");
            String descricao = rs.getString("descricao");
            cursos[contador++] = new Cursos(id, nome, tipo,qtdAulas,descricao);
        }
        return cursos;
        }
    }
   public void atualizarCurso (Cursos curso) throws Exception{
        String sql = "UPDATE tb_cursos SET nome = ?, categoria = ?, qtdAulas = ?, descricao = ? WHERE id = ?";
        try (Connection conexao = ConnectionDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString (1, curso.getNome());
            ps.setString (2, curso.getTipo());
            ps.setInt (3, curso.getQtdAulas());
            ps.setString(4, curso.getDescricao());
            ps.setInt (5, curso.getId());
            ps.execute();
        }
    }
   public void removerCurso (Cursos curso) throws Exception{
        String sql = "DELETE FROM tb_cursos WHERE id = ?";
        try (Connection conexao = ConnectionDB.obterConexao();
        PreparedStatement ps = conexao.prepareStatement(sql);){
        ps.setInt (1, curso.getId());
        ps.execute();
        }
    }
   public List <Usuario> buscaAlunosPorCurso() throws Exception{
        String sql = "SELECT * FROM tb_usuario";
        List <Usuario> usuarios = new ArrayList <> ();
        try (Connection conexao = ConnectionDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                int id= rs.getInt("id");
                String nome = rs.getString ("nome");
                String email = rs.getString ("email");
                String fone = rs.getString ("telefone");
                
                usuarios.add(new Usuario (id, nome, email,fone));
                }
            }
        }
        return usuarios;
    }
    public void addMeuCurso(Usuario logado)throws Exception{       
        String sql = "UPDATE tb_usuario SET curso1 = ? , curso2 = ? , curso3 = ?, curso4 = ? WHERE id = ?";
        try (Connection conexao = ConnectionDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, logado.getCurso1());
            ps.setString(2, logado.getCurso2());
            ps.setString(3, logado.getCurso3());
            ps.setString(4, logado.getCurso4());
            ps.setInt(5, logado.getId());
            ps.execute();           
            }
    }

}
