package library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connect {

        Connection con;

        public void connect(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Driver JDBC carregado");
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Driver JDBC não encontrado : " +
                        cnfe.getMessage());
            }

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root", "Pmfm1234.");
                System.out.println("Conexão estabelecida!!");
                PreparedStatement ps = null;
            } catch (SQLException sqle) {
                System.out.println("Erro na conexão: " +
                        sqle.getMessage());
            }
        }



        public void disconnect(){
        try {
            con.close();
            System.out.println("Conexão finalizada");

        } catch (SQLException sqle) {
            System.out.println("Erro na finalização do banco de dados: " + sqle);
        }
    }
    }
