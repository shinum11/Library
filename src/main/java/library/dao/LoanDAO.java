package library.dao;

import library.model.Loan;
import library.model.User;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LoanDAO extends Connect{

    public void adicionar(Loan loan) throws SQLException {
        String sql = "insert into user values (?,?,?,?,?)";

        this.connect(sql);
        Date data = Date.valueOf(LocalDate.now());

        ps.setObject(1,loan.getUser());
        ps.setObject(2,loan.getBook());
        ps.setDate(3,loan.getData_emprestimo());
    }

}
