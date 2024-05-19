package library.dao;

import library.model.Book;

import java.sql.SQLException;

public class BookDAO extends Connect {

    public void adicionar(Book book) throws SQLException
    {
        String sql = "insert into book values(?,?,?,?,?,?,?)";

        this.connect(sql);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setInt(3, book.getPages());
            ps.setString(4, book.getAuthor());
            ps.setInt(5, book.getPages());
            ps.setInt(6, book.getAmount());

            ps.executeUpdate();


        this.disconnect();
    }
}
