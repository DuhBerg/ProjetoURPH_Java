package model.DAO;

import connect.connect;
import model.cliente;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class clienteDAO {
    Connection con = null;
    public boolean inserir(cliente c1) throws SQLException, ClassNotFoundException
    {
        boolean inseriu = false;
        
        try
        {
          con = new connect().getConnection();
          String sql = "INSERT INTO java_clientes "
                  + "(id,nome,cpf,email,telefone,Endereço_rua, Endereço_Numero,Endereço_Cidade,Endereço_Bairro,Endereço_Cep)"
                  + "VALUES (default,?,?,?,?,?,?,?,?,?)";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1,c1.getNome());
                stmt.setString(2,c1.getCpf());
                stmt.setString(3,c1.getEmail());
                stmt.setString(4,c1.getTelefone());
                stmt.setString(5,c1.getRua());
                stmt.setInt(6,c1.getNumero());
                stmt.setString(7,c1.getCidade());
                stmt.setString(8,c1.getBairro());
                stmt.setInt(9,c1.getCep());
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
    
    
    public boolean excluir(String cpf) throws SQLException, ClassNotFoundException
    {
     
        boolean excluiu = false;
    try
        {
          con = new connect().getConnection();
          String sql = "DELETE FROM java_clientes WHERE cpf = (?)";
          PreparedStatement stmt = con.prepareStatement(sql);
          stmt.setString(1,cpf);
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
    
    
    
    
        public boolean alterar(cliente c1) throws SQLException, ClassNotFoundException
    {
        boolean alterar = false;
        
        try
        {
          con = new connect().getConnection();
          String sql = "UPDATE java_clientes SET nome = ?,email = ?,telefone = ?,Endereço_rua = ?,Endereço_Numero = ?,Endereço_Cidade = ?,Endereço_Bairro = ?,Endereço_Cep = ? WHERE cpf = ?";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1,c1.getNome());
                stmt.setString(2,c1.getEmail());
                stmt.setString(3,c1.getTelefone());
                stmt.setString(4,c1.getRua());
                stmt.setInt(5,c1.getNumero());
                stmt.setString(6,c1.getCidade());
                stmt.setString(7,c1.getBairro());
                stmt.setInt(8,c1.getCep());
                stmt.setString(9,c1.getCpf());
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

