/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package library.view;

import library.business.UserBS;
import library.dao.LoanDAO;
import library.model.Book;
import library.model.Loan;
import library.model.User;

import javax.swing.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Shinum
 */
public class LibraryApp {

    public static void main(String[] args) throws Exception {
        Boolean flag = true;


        Date data = Date.valueOf(LocalDate.now());
        System.out.println(data);
        while (flag) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Escolha uma das opções:\n1 - Cadrastrar Usuário\n2 - Cadastrar Livro\n3 - Emprestar" +
                    "Livro\n4 - Desvolver Livro\n0 - Sair Do Programa\nDigite sua escolha: ");

            int escolha = 0;

            escolha = ler.nextInt();

            /*Limpa o buffer*/
            ler.nextLine();


            switch (escolha) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    try {

                        System.out.println("\nDigite o nome do Usuário: ");
                        String nome = ler.nextLine();

                        System.out.println("\nDigite o e-mail do Usuário: ");
                        String email = ler.nextLine();

                        System.out.println("\nDigite o CPF do Usuário: ");
                        long cpf = ler.nextLong();
                        ler.nextLine();

                        System.out.println("\nDigite o endereço do Usuário: ");
                        String endereco = ler.nextLine();

                        System.out.println("\nDigite o número do Usuário: ");
                        String numero = ler.nextLine();

                        User user = new User(nome, email, cpf, endereco, numero);

                        UserBS userBS = new UserBS();
                        userBS.adicionarUser(user);

                        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
                    }

                    catch (Exception e){
                        JOptionPane.showMessageDialog(null,e.getMessage());
                    }

                    break;

                case 2:

                    break;
                case 3:

                    /*Loan loan = new Loan();
                    LoanDAO loanDao;
                    loanDao = new LoanDAO();

                    loanDao.adicionar(loan);

                    JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");*/


                    break;
                case 4:
                    System.out.println("4");
                    break;
                default:
                    System.out.println("Digite um valor válido!!");
            }

        }

    }
}