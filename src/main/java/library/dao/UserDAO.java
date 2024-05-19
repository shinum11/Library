package library.dao;

import library.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO extends Connect {

    public void adicionar(User user) throws SQLException
    {
        String sql = "insert into user values (?,?,?,?,?)";

        this.connect(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setLong(3, user.getCpf());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getNumber());

            ps.executeUpdate();



        this.disconnect();
    }
}
