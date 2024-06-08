package library.dao;

import library.model.Loan;
import library.model.User;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LoanDAO extends Connect{

    public void adicionar(Loan loan) throws SQLException
    {
        String sql = "insert into user values (?,?,?,?,?)";

        this.connect(sql);

        ps.setLong(1, loan.getCpf());
        ps.setLong(2,loan.getIbsn());
        ps.setDate(3, Date.valueOf(LocalDate.now()));



        ps.executeUpdate();

        this.disconnect();

    }

}
