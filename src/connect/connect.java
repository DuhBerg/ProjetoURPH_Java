package connect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class connect {
    
    public Connection getConnection()throws SQLException,ClassNotFoundException{
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://143.106.241.1:3306/cl18460";
        String usuario = "cl18460";
        String senha = "cl*26022002";
        try{
            Class.forName(driver);  
            return (Connection) DriverManager.getConnection(url,usuario,senha);
        }catch(SQLException ex){
            throw new RuntimeException("Erro de conexão",ex);
        }
    }
    
}
