
package com.mycompany.library;

import java.time.LocalDateTime;

/**
 *
 * @author sidneigoes
 */
public class Loan {
    private User user;
    private Book book;
    private LocalDateTime data_emprestimo;
    private LocalDateTime data_devolvido;
    private LocalDateTime data_estimada;
    private int renews = 0;

    public Loan(
            User user,
            Book book)
    {
        this.user = user;
        this.book = book;
        this.data_emprestimo = LocalDateTime.now();
        this.data_devolvido = null;
        this.data_estimada = this.data_emprestimo.plusDays(7);
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public LocalDateTime getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(LocalDateTime data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public LocalDateTime getData_devolvido() {
        return data_devolvido;
    }

    public void setData_devolvido(LocalDateTime data_devolvido) {
        this.data_devolvido = data_devolvido;
    }

    public LocalDateTime getData_estimada() {
        return data_estimada;
    }

    public void setData_estimada(LocalDateTime data_estimada) {
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
        this.data_devolvido = LocalDateTime.now();
        if(this.data_devolvido.isAfter(this.data_estimada))
        {
            System.out.println("Emprestimo atrasado, necessario cobrar 1000 de "
                    + "multa");            
        }
        this.book.retornar();
    }
    
}
