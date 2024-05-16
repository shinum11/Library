package library.dao;

import library.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    public void adicionar(User user){

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

        PreparedStatement ps = null;
        String sql = "insert into user values (?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,user.getName());
            ps.setString(2,user.getEmail());
            ps.setLong(3,user.getCpf());
            ps.setString(4,user.getAddress());
            ps.setString(5,user.getNumber());

            ps.executeUpdate();

            System.out.println("Pronto para executar comandos SQL");
        } catch (SQLException sqle){
            System.out.println("Erro no acesso ao Bano de Dados: " + sqle.getMessage());
        }


        try {
            con.close();
            System.out.println("Conexão finalizada");

        }catch (SQLException sqle ){
            System.out.println("Erro na finalização do banco de dados: " + sqle);
        }

    }
}
