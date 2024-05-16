package library.business;

import library.dao.UserDAO;
import library.model.User;

public class UserBS {
    UserDAO userDAO;

    public UserBS(){
        userDAO = new UserDAO();
    }

    private void validarDados(User user) throws Exception
    {
        if(user.getName() == null || user.getName().equals(""))
        {
            throw new Exception("O campo nome é obrigatório!!");
        }

        if(user.getCpf() == null || user.getCpf().equals(""))
        {
            throw new Exception("O campo CPF é obrigatório!!");
        } else if (user.getCpf() < 0 || user.getCpf().toString().length() > 11 )  {
            throw new Exception("O CPF informado é invalido!!");
        }

        if(user.getAddress() == null || user.getAddress().equals(""))
        {
            throw new Exception("O campo Endereço é obrigatório!!");
        }

        if(user.getNumber() == null || user.getNumber().equals(""))
        {
            throw new Exception("O campo número é obrigatório!!");
        }

        if(user.getEmail() == null || user.getEmail().equals(""))
        {
            throw new Exception("O campo e-mail é obrigatório!!");
        }
    }

    public void adicionarUser(User user) throws Exception
    {
        validarDados(user);
        userDAO.adicionar(user);
    }
}
