/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho.Dados;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import mercadinho.CamandaBanco;
import mercadinho.ClassesBasicas.Cliente;
import mercadinho.ClassesBasicas.ClienteException;



/**
 *
 * @author NeGo
 */
public class DadosCliente {
    
    private CamandaBanco banco = new CamandaBanco();
    
     public void cadastrarCliente (Cliente c) throws ClienteException {

        try {

            Statement conex = banco.conectar();
            String sql = "insert into Cliente values";
            sql += "('" + c.getNome() + "','" + c.getCpf() + "','" + c.getRG() + "','" + c.getEndcli().getBairro() + "'";
            sql += ",'" + c.getEndcli().getCep() + "', '" + c.getEndcli().getCidade() + "', '" + c.getEndcli().getLogradouro() + "', '" + c.getEndcli().getRua() + "'";
            conex.execute(sql);

        } catch (Exception ex) {
            throw new ClienteException(ex.getMessage());
        }finally{
            try {
                banco.desconectar();
            } catch (SQLException ex) {
                throw new ClienteException(ex.getMessage());
            }
        }
    }
}
    
    

