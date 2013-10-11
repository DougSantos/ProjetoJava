/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho.Dados;

import java.sql.SQLException;
import java.sql.Statement;
import mercadinho.CamandaBanco;
import mercadinho.ClassesBasicas.Funcionario;
import mercadinho.ClassesBasicas.FuncionarioException;

/**
 *
 * @author NeGo
 */
public class DadosFuncionario {

    private CamandaBanco banco = new CamandaBanco();

    public void cadastrar(Funcionario s) throws FuncionarioException {

        try {

            Statement conex = banco.conectar();
            String sql = "insert into Funcionario values";
            sql += "('" + s.getMatricula() + "','" + s.getNome() + "','" + s.getCpf() + "','" + s.getRG() + "','" + s.getEndfun().getBairro() + "'";
            sql += ",'" + s.getEndfun().getCep() + "', '" + s.getEndfun().getCidade() + "', '" + s.getEndfun().getLogradouro() + "', '" + s.getEndfun().getRua() + "'";
            conex.execute(sql);

        } catch (Exception ex) {
            throw new FuncionarioException(ex.getMessage());
        }
    }
}
