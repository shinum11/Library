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
        Date data_emp = Date.valueOf(loan.getData_emprestimo());
        Date data_dev = Date.valueOf(loan.getData_devolvido());
        Date data_est = Date.valueOf(loan.getData_estimada());
        

        ps.setObject(1,loan.getUser());
        ps.setObject(2,loan.getBook());
        ps.setDate(3,data_emp);
        ps.setDate(4,data_dev);
        ps.setDate(5,data_est);

        ps.executeUpdate();

        this.disconnect();

    }

}
