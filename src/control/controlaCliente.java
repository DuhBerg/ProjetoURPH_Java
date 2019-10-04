package control;

import java.sql.SQLException;
import model.DAO.clienteDAO;
import model.DAO.produtoDAO;
import model.cliente;


/**
 *
 * @author eduar
 */
public class controlaCliente 
{

        public boolean insereAluno(String nome, String cpf, String email, String telefone, String rua, String cidade, String bairro, int numero, int cep)
                throws SQLException,ClassNotFoundException
        {
        cliente cliente = new cliente(nome,cpf,email,telefone,rua,cidade,bairro,numero,cep);
        clienteDAO c1DAO = new clienteDAO();
        
        boolean inseriu = c1DAO.inserir(cliente);
        return inseriu;
        }
        
        
        
        
        
        public boolean excluiAluno(String cpf)
                throws SQLException,ClassNotFoundException
        {
            boolean excluiu;
            clienteDAO c1DAO = new clienteDAO();
            excluiu =  c1DAO.excluir(cpf);
            
        return excluiu;
        }    
        
        
        
        
        
        
        public boolean alteraAluno(String nome, String cpf, String email, String telefone, String rua, String cidade, String bairro, int numero, int cep)
                throws SQLException,ClassNotFoundException
        {
        cliente cliente = new cliente(nome,cpf,email,telefone,rua,cidade,bairro,numero,cep);
        clienteDAO c1DAO = new clienteDAO();
        
        boolean alterar = c1DAO.alterar(cliente);
        return alterar;
        }
        
    
}
