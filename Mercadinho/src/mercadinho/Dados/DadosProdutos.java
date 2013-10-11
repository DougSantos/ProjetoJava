/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho.Dados;

import java.sql.SQLException;
import java.sql.Statement;
import mercadinho.CamandaBanco;
import mercadinho.ClassesBasicas.Produtos;
import mercadinho.ClassesBasicas.ProdutosException;

/**
 *
 * @author NeGo
 */
public class DadosProdutos {
    
     private CamandaBanco banco = new CamandaBanco();
    
     public void cadastrarProduto (Produtos p) throws ProdutosException {

        try {
            
            Statement conex = banco.conectar();
            String sql = "INSERT INTO Produtos VALUES";
            sql += "('"+p.getCodigoProduto()+"', '"+p.getNomeProduto()+"')";
            conex.execute(sql);

        } catch (Exception ex) {
            throw new ProdutosException(ex.getMessage());
        }finally{
            try {
                banco.desconectar();
            } catch (SQLException ex) {
                throw new ProdutosException(ex.getMessage());
            }
        }
    }
}
    
    
