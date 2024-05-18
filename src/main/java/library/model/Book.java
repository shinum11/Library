
package library.model;

import javax.management.InvalidAttributeValueException;

/**
 *
 * @author Shinum
 */
public class Book {
    
    private String title;
    private String genre;
    private Long ibsn;
    private String author;
    private int pages;
    private int amount;
    
    public Book(
            String title, 
            String gender, 
            Long ibsn,
            String author, 
            int pages,
            int amount) throws Exception 
    {
        this.title = title;
        this.genre = gender;
        this.ibsn = ibsn;
        this.author = author;
        this.pages = pages;
        this.amount = amount;

    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getIbsn() {
        return ibsn;
    }

    public void setIbsn(Long ibsn) {
        this.ibsn = ibsn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getAmount() {
        return amount;
    }

    public void emprestar(){
        this.amount -= 1;
    }
    
    public void retornar(){
        this.amount += 1;
    }
    
    public void receber(int unidades) throws InvalidAttributeValueException{
        if(unidades > 0)
            this.amount += unidades;
        else
            throw new InvalidAttributeValueException("Valor invalido");
    }
}
