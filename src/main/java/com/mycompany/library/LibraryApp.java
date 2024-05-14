/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library;

import java.util.Scanner;

/**
 *
 * @author Shinum
 */
public class LibraryApp {

    public static void main(String[] args) {
        Boolean flag = true;

        while (flag) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Escolha uma das opções:\n1 - Cadrastrar Usuário\n2 - Cadastrar Livro\n3 - Emprestar" +
                    "Livro\n4 - Desvolver Livro\n0 - Sair Do Programa\nDigite sua escolha: ");

            int escolha = 0;

            escolha = ler.nextInt();

            switch (escolha) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
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
