
package library.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author sidneigoes
 */
public class Loan {
    private User user;
    private Book book;
    private LocalDate data_emprestimo;
    private LocalDate data_devolvido;
    private LocalDate data_estimada;
    private int renews = 0;
    private int fine = 50;

    public Loan(
            User user,
            Book book)
    {
        this.user = user;
        this.book = book;
        this.data_emprestimo = LocalDate.now();
        this.data_devolvido = null;
        this.data_estimada = this.data_emprestimo.plusDays(7);
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(LocalDate data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public LocalDate getData_devolvido() {
        return data_devolvido;
    }

    public void setData_devolvido(LocalDate data_devolvido) {
        this.data_devolvido = data_devolvido;
    }

    public LocalDate getData_estimada() {
        return data_estimada;
    }

    public void setData_estimada(LocalDate data_estimada) {
        this.data_estimada = data_estimada;
    }
    
    public void renew(){
        if (this.renews < 3){
            this.renews += 1;
            this.data_estimada.plusDays(7);
        }
        else
            System.out.println("O Usuário excedeu seu limite de renovações");
    }
    
    public void return_book(){
        this.data_devolvido = LocalDate.now();
        if(this.data_devolvido.isAfter(this.data_estimada))
            fine();
        this.book.retornar();
    }
    public void fine(){System.out.println("Emprestimo atrasado, necessario cobrar " + fine + " de multa");}
}
