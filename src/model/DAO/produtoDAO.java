
package model.DAO;

import connect.connect;
import model.cliente;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.produto;


/**
 *
 * @author eduar
 */
public class produtoDAO 
{
    
    Connection con = null;
    public boolean inserir(produto p1) throws SQLException, ClassNotFoundException
    {
        boolean inseriu = false;
        
        try
        {
          con = new connect().getConnection();
          String sql = "INSERT INTO java_produtos "
                  + "(id_produto,nome,descricao,unidade,codigo,preço,tamanho) VALUES (default,?,?,?,?,?,?)";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1,p1.getNome());
                stmt.setString(2,p1.getDescricao());
                stmt.setDouble(3,p1.getUnidade());
                stmt.setInt(4,p1.getCodigo());
                stmt.setDouble(5,p1.getPreço());
                stmt.setString(6,p1.getTamanho());

                stmt.execute();
                inseriu = true;
            }
          
          
        }
          catch(ClassNotFoundException | SQLException ex)
          {
              ex.printStackTrace(); 
          }
        finally
        {
            con.close();
        }
        return inseriu;
          
        }
    
    
    
    
    
     public boolean excluir(int codigo) throws SQLException, ClassNotFoundException
    {
     
        boolean excluiu = false;
    try
        {
          con = new connect().getConnection();
          String sql = "DELETE FROM java_produtos WHERE codigo = (?)";
          PreparedStatement stmt = con.prepareStatement(sql);
          stmt.setInt(1,codigo);
          stmt.execute();
          excluiu = true;
        }
        catch(ClassNotFoundException | SQLException erro)
        {
            erro.printStackTrace();
        }
    
        finally
    {
        con.close();
    }
    
    return excluiu;
     
    }
     
     
     
     
     
     
     
      public boolean alterar(produto p1) throws SQLException, ClassNotFoundException
    {
        boolean alterar = false;
        
        try
        {
          con = new connect().getConnection();
          String sql = "UPDATE java_produtos SET nome=?,descricao=?,unidade=?,preço=?,tamanho=? WHERE codigo = ?";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1,p1.getNome());
                stmt.setString(2,p1.getDescricao());
                stmt.setInt(3,p1.getUnidade());
                stmt.setDouble(4,p1.getPreço());
                stmt.setString(5,p1.getTamanho());
                stmt.setInt(6,p1.getCodigo());

                stmt.execute();
                alterar = true;
            }
          
          
        }
          catch(ClassNotFoundException | SQLException ex)
          {
              ex.printStackTrace(); 
          }
        finally
        {
            con.close();
        }
        return alterar;
          
        }
    
    
    
}
