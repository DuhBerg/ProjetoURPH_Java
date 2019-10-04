/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import model.DAO.clienteDAO;
import model.DAO.produtoDAO;
import model.produto;

/**
 *
 * @author eduar
 */
public class controlaProduto {
    
    
    public boolean insereProduto(String nome, String descricao, int codigo, String tamanho, double preço, int unidade)
                throws SQLException,ClassNotFoundException
        {
        produto produto = new produto(nome,descricao,codigo,tamanho,preço,unidade);
        produtoDAO p1DAO = new produtoDAO();
        
        boolean inseriu = p1DAO.inserir(produto);
        return inseriu;
        }
    
    
    
    
            
   public boolean excluiProduto(int codigo)
                throws SQLException,ClassNotFoundException
        {
            boolean excluiu;
            produtoDAO p1DAO = new produtoDAO();
            excluiu =  p1DAO.excluir(codigo);
            
        return excluiu;
        }  
   
   
   
   
           public boolean alteraProduto(String nome, String descricao, int codigo, String tamanho, double preço, int unidade)
                throws SQLException,ClassNotFoundException
        {
        produto produto = new produto(nome,descricao,codigo,tamanho,preço,unidade);
        produtoDAO p1DAO = new produtoDAO();
        
        boolean alterar = p1DAO.alterar(produto);
        return alterar;
        }

    
}
