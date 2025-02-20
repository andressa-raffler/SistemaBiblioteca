package org.example;

import org.example.dominios.Init;
import org.example.telas.TelaLogin;

import java.util.Scanner;

public class BibliotecaMain {
    public static void main(String[] args) {
        Init.executar();
        Scanner sc = new Scanner(System.in);
        int option = 9;
        do {
            System.out.println("---------------------------------------");
            System.out.println("           Biblioteca                  ");
            System.out.println("   1 - Fazer login                     ");
            //  System.out.println("   2 - Fazer uma busca de livro        ");
            System.out.println("   0 - Sair                            ");
            System.out.println("---------------------------------------");
            try {
                String stringOption = sc.next();
                option = Integer.parseInt(stringOption);
                switch (option) {
                    case 1:
                        TelaLogin.executar(sc);
                        break;
                    case 2:
                        // TelaBusca.executar();
                        break;
                }
            }catch (Exception exception){
                System.out.println("Entrada inválida, tente novamente");
            }
        }while (option != 0);
    }
}
