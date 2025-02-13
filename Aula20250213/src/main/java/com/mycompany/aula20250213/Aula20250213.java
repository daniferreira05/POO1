
package com.mycompany.aula20250213;

import java.util.Scanner;

public class Aula20250213 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opcao;
        
        System.out.println("\t=====================================");
        System.out.println("\t\t\tMENU: ");
        System.out.println("\t=====================================");
        System.out.println("\t(1) ADIÇÃO (+)");
        System.out.println("\t(2) SUBTRAÇÃO (-)");
        System.out.println("\t(3) MULTIPLICAÇÃO (*)");
        System.out.println("\t(4) DIVISÃO (/)");
        System.out.println("\t(0) SAIR");
        
        System.out.printf("\n\tDigite a opção desejada: ");
        opcao = scan.nextInt();
        
        System.out.printf("\nO número selecionado é: %d", opcao);
        
    }
}

