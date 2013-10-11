/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NeGo
 */
public class CamandaBanco {
    public Statement stmt;
    public Connection conn;
    
    public Statement conectar() throws ClassNotFoundException,SQLException{
        return this.CconectarPostGreSql();
    }
     public void desconectar() throws SQLException {
        conn.close();
     }

    private Statement CconectarPostGreSql() throws ClassNotFoundException,SQLException {
        
        Class.forName("org.postgresql.Driver");
        String local = "localhost";
        String banco = "Mercado";
        String usuario = "postgres";
        String senha = "34262672";
        conn = (Connection) (Conection) DriverManager.getConnection("jdbc:postgresql://"
                + local + "/" + banco
                + "?charSet=LATIN1", usuario,
                senha);
        //stmt = conn.createStatement();
        return conn.createStatement();
        
    }

    private static class Conection {

        public Conection() {
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
