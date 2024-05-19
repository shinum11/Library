package library.business;

import library.dao.BookDAO;
import library.model.Book;

public class BookBS {
    BookDAO bookDAO;

    public BookBS() {bookDAO = new BookDAO();}

    private void validarDados(Book book) throws Exception {
        if (book.getTitle() == null || book.getTitle().equals(""))
        {
            throw new Exception("Campo titulo obrigatório!!");
        }
        if (book.getGenre() == null || book.getGenre().equals(""))
        {
            throw new Exception("Campo titulo obrigatório!!");
        }
        if (book.getIbsn() == null || book.getIbsn().equals("")  )
        {
            throw new Exception("Campo IBSN obrigatório!!");
        } else if (book.getIbsn().toString().length() != 13) {
            throw new Exception("Campo IBSN deve conter 13 digitos!!");
        }
        if (book.getAuthor() == null || book.getAuthor().equals(""))
        {
            throw new Exception("Campo Autor obrigatório!!");
        }
        if(book.getPages() < 0)
        {
            throw new Exception("Valor de páginas invalido!!");
        }
        if(book.getAmount() < 0)
        {
            throw new Exception("A quantidade não pode ser menor que zero!!");
        }
    }

    public void adicionar(Book book) throws Exception
    {
        validarDados(book);
        bookDAO.adicionar(book);
    }
}
