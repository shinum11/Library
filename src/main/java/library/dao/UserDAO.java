package library.dao;

import library.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO extends Connect {
    public void adicionar(User user){

       this.connect();

        /*PreparedStatement ps = null;
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
        }*/

        this.disconect();



    }
}
