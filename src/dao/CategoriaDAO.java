package dao;

import database.Conexao;
import database.Utilitarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Categoria;

public class CategoriaDAO {

    public int inserir(Categoria categoria) {
        int codigoInserido = Utilitarios.NAO_FOI_POSSIVEL_INSERIR;
        String sql = "INSERT INTO categorias (nome,descricao)";
        sql += "\nValue (?,?";
        try{
            
        /**    
        * Classe utilizada para criar o sql substituindo as interrogações
        * RETURN_GENERATED_KEYS -> utilizado para informar para o
        * PreparedStatement que deve ser retornado o id
        *  gerado pelo bd
        */
                
        PreparedStatement ps = Conexao.conectar().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        // Substitui as interrogações
        ps.setString(1, categoria.getNome());
        ps.setString(2, categoria.getDescricao());
        // executa o comando no bd
        ps.execute();
        
        /* 
        * classe utilizada para trabalhar com as informações que o
        * bd retorna
        */
        ResultSet resultado = ps.getGeneratedKeys();
        if(resultado.next()){
            codigoInserido = resultado.getInt(1);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erro ao inserir CategoriaDAO",
                    JOptionPane.ERROR_MESSAGE);
        }finally{
            Conexao.desconectar();
        }    
        return codigoInserido;
    }

    public int alterar(Categoria categoria) {
        int codigoAlterado = Utilitarios.NAO_FOI_POSSIVEL_ALTERAR;
        String sql = "UPDATE categorias SET";
        sql += "\nnome =?,";
        sql += "\ndescricao = ?";
        sql += "\nWHERE id = ?";
        try{
           PreparedStatement ps =  Conexao.conectar().prepareStatement(sql);
           ps.setString(1, categoria.getNome());
           ps.setString(2, categoria.getDescricao());
           ps.setInt(3, categoria.getId());
           codigoAlterado = ps.executeUpdate();      
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, sqle.getMessage(),"Erro ao Alterar CategoriaDAO",JOptionPane.ERROR_MESSAGE);  
        }finally{
            Conexao.desconectar();
        }
  
        return codigoAlterado;
    }

    public int excluir(int id) {
        int codigoExcluido = Utilitarios.NAO_FOI_POSSIVEL_EXCLUIR;
        String sql = "DELETE FROM categorias WHERE id = ?";
        
        try{
            PreparedStatement ps = Conexao.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            codigoExcluido = ps.executeUpdate();
        
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, sqle.getMessage(),"Erro ao excluir CategoriaDAO",JOptionPane.ERROR_MESSAGE);
            
            
        }finally{
            Conexao.desconectar();
        }
        
        return codigoExcluido;

    }

    public ArrayList<Categoria> retornarListaCategorias() {
        ArrayList<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT id, nome, descricao, ativo \nFROM categorias";
        try{
          Statement stmt = Conexao.conectar().createStatement();
          stmt.execute(sql);
          ResultSet rs = stmt.getResultSet();
          while(rs.next()){
              Categoria c = new Categoria();
              c.setId(rs.getInt("id"));
              c.setNome(rs.getString("nome"));
              c.setDescricao(rs.getString("Descricao"));
              c.setAtivo(rs.getBoolean("ativo"));
              categorias.add(c);
          }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Erro ao retornar lista CategoriaDAO",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
        } 
      
        return categorias;
    }

    public Categoria buscarCategoriaPorId(int codigo) {
        Categoria categoria = null;
        String sql = "Select nome, descricao, ativo FROM categorias";
        sql += "WHERE id = ?";
        try{
            PreparedStatement ps = Conexao.conectar().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultado = ps.getResultSet();
            if(resultado.next()){
                categoria = new Categoria();
                categoria.setId(codigo);
                categoria.setNome(resultado.getString("nome"));
                categoria.setDescricao(resultado.getString("descricao"));
                categoria.setAtivo(resultado.getBoolean("ativo"));
            }
            
            
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, sqle.getMessage(),"Não foi possivel retornar categoria da CategoriaDAO",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            Conexao.desconectar();   
        }
        return categoria;
    }

    public Categoria buscarCategoriaPorNome(String nome) {
        Categoria categoria = null;
        return categoria;
    }

    public ArrayList<Categoria> buscarCategoriasPorStatus(boolean status) {
        ArrayList<Categoria> categorias = new ArrayList<>();
        return categorias;
    }

}
