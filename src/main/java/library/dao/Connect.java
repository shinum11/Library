package library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver JDBC carregado");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Driver JDBC não encontrado : " +
                    cnfe.getMessage());
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root", "Pmfm1234.");
            System.out.println("Conexão estabelecida!!");
        } catch (SQLException sqle) {
            System.out.println("Erro na conexão: " +
                    sqle.getMessage());
        }



        try {
            con.close();
            System.out.println("Conexão finalizada");

        }catch (SQLException sqle ){
            System.out.println("Erro na finalização do banco de dados: " + sqle);
        }
    }
}