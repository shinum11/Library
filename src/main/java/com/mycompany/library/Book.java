
package com.mycompany.library;

import javax.management.InvalidAttributeValueException;

/**
 *
 * @author Shinum
 */
public class Book {
    
    private String title;
    private String gender;
    private int ibsn;
    private String author;
    private int pages;
    private int amount;
    
    public Book(
            String title, 
            String gender, 
            int ibsn, 
            String author, 
            int pages,
            int amount) throws Exception 
    {
        this.title = title;
        this.gender = gender;
        this.ibsn = ibsn;
        this.author = author;
        this.pages = pages;
        if(amount > 0)
            this.amount = amount;
        else
            throw new Exception("Valor invalido");
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIbsn() {
        return ibsn;
    }

    public void setIbsn(int ibsn) {
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
