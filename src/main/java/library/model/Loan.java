
package library.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author sidneigoes
 */
public class Loan {
    private Long cpf;
    private Long ibsn;;
    private LocalDate data_emprestimo;
    private LocalDate data_devolvido;
    private LocalDate data_estimada;
    private int renews = 0;
    private int fine = 50;

    public Loan(Long cpf, Long ibsn)
    {
        this.cpf = cpf;
        this.ibsn = ibsn;
        this.data_emprestimo = LocalDate.now();
        this.data_devolvido = null;
        this.data_estimada = this.data_emprestimo.plusDays(7);
    }

    public Long getCpf() {return cpf;}

    public Long getIbsn() {return ibsn;}

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
        //Essa função tem que ir para o Business
       /* if (this.renews < 3){
            this.renews += 1;
            this.data_estimada.plusDays(7);
        }
        else
            System.out.println("O Usuário excedeu seu limite de renovações");*/
    }
    
    public void return_book(){
       //Essa função tem que ir para o Business
    }
    public void fine(){// Essa função tem que ir para o Business
        /*System.out.println("Emprestimo atrasado, necessario cobrar " + fine + " de multa");*/}
}
