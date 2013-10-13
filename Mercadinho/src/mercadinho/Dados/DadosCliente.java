/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho.Dados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import mercadinho.CamandaBanco;
import mercadinho.ClassesBasicas.Cliente;
import mercadinho.ClassesBasicas.ClienteException;

/**
 *
 * @author NeGo
 */
public class DadosCliente {

    private CamandaBanco banco = new CamandaBanco();
    private Statement conex;
    private String sql;

    public void cadastrarCliente(Cliente c) throws ClienteException {

        try {

            conex = banco.conectar();
            sql = "insert into Cliente values";
            sql += "('" + c.getNome() + "','" + c.getCpf() + "','" + c.getRG() + "','" + c.getEndcli().getBairro() + "'";
            sql += ",'" + c.getEndcli().getCep() + "', '" + c.getEndcli().getCidade() + "', '" + c.getEndcli().getLogradouro() + "'";
            conex.execute(sql);

        } catch (Exception ex) {
            throw new ClienteException(ex.getMessage());
        } finally {
            try {
                banco.desconectar();
            } catch (SQLException ex) {
                throw new ClienteException(ex.getMessage());
            }
        }
    }

    public void removerCliente(String cpf) throws ClienteException {
        try {
            this.conex = this.banco.conectar();
            sql = "DELETE FROM clientes WHERE cpf = " + cpf + ";";
            conex.executeQuery(sql);
        } catch (ClassNotFoundException ex) {
            throw new ClienteException(ex.getMessage());
        } catch (SQLException ex) {
            throw new ClienteException(ex.getMessage());
        } finally {
            try {
                banco.desconectar();
            } catch (SQLException ex) {
                throw new ClienteException(ex.getMessage());
            }
        }
    }

    public void alterarCliente(Cliente c) throws ClienteException {
        try {
            conex = banco.conectar();
            Cliente Comparador = new Cliente();
            sql = "SELECT * FROM clientes WHERE cpf = '" + c.getCpf() + "'";
            ResultSet Result = conex.executeQuery(sql);
            Comparador.setNome(Result.getString("nome"));
            Comparador.setCpf(Result.getString("cpf"));
            Comparador.setRG(Result.getString("rg"));
            Comparador.getEndcli().setBairro(Result.getString("bairro"));
            Comparador.getEndcli().setCep(Result.getString("cep"));
            Comparador.getEndcli().setCidade(Result.getString("cidade"));
            Comparador.getEndcli().setLogradouro(Result.getString("logradouro"));
            Comparador.getEndcli().setNumero(Result.getString("numero"));

            if (Comparador.getNome().equals(c.getNome()) == false) {
                sql = "UPDATE funcionarios SET nome = '" + c.getNome() + "' WHERE cpf = " + c.getCpf() + ";";
                conex.executeQuery(sql);
            }
            if (Comparador.getRG().equals(c.getRG()) == false) {
                sql = "UPDATE funcionarios SET rg = '" + c.getNome() + "' WHERE cpf = " + c.getCpf() + ";";
                conex.executeQuery(sql);
            }
            if (Comparador.getEndcli().getBairro().equals(c.getEndcli().getBairro()) == false) {
                sql = "UPDATE funcionarios SET bairro = '" + c.getNome() + "' WHERE cpf = " + c.getCpf() + ";";
                conex.executeQuery(sql);
            }
            if (Comparador.getEndcli().getCep().equals(c.getEndcli().getCep()) == false) {
                sql = "UPDATE funcionarios SET cep = '" + c.getNome() + "' WHERE cpf = " + c.getCpf() + ";";
                conex.executeQuery(sql);
            }
            if (Comparador.getEndcli().getCidade().equals(c.getEndcli().getCidade()) == false) {
                sql = "UPDATE funcionarios SET cidade = '" + c.getNome() + "' WHERE cpf = " + c.getCpf() + ";";
                conex.executeQuery(sql);
            }
            if (Comparador.getEndcli().getLogradouro().equals(c.getEndcli().getLogradouro()) == false) {
                sql = "UPDATE funcionarios SET logradouro = '" + c.getNome() + "' WHERE cpf = " + c.getCpf() + ";";
                conex.executeQuery(sql);
            }
            if (Comparador.getEndcli().getNumero().equals(c.getEndcli().getNumero()) == false) {
                sql = "UPDATE funcionarios SET numero = '" + c.getNome() + "' WHERE cpf = " + c.getCpf() + ";";
                conex.executeQuery(sql);
            }


        } catch (ClassNotFoundException ex) {
            throw new ClienteException(ex.getMessage());
        } catch (SQLException ex) {
            throw new ClienteException(ex.getMessage());
        } finally {
            try {
                banco.desconectar();
            } catch (Exception ex) {
                throw new ClienteException(ex.getMessage());
            }
        }




    }
}
