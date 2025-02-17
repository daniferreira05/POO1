
package com.mycompany.aula20250213;

import java.util.Scanner;

public class Aula20250213 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opcao;
        int contador = 5;
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
        
        switch (opcao){
            case 0:
                System.out.println("\n SAIR");
                break; 
            case 1:
                System.out.println("\n ADIÇÃO");
                break;
            case 2:
                System.out.println("\n SUBTRAÇÃO");
                break;
            case 3:
                System.out.println("\n MULTIPLICAÇÃO");
                break;    
            case 4:
                System.out.println("\n DIVISÃO");
                break;
            default:
                System.out.println("\n ERRO");
                break;    
        }
        
     /*Faze a repetição do menu ao final da operação.*/  
     while (contador < 5){
         if (contador == 0){
            System.out.println("Saindo");
         }
        System.out.println("\t=====================================");
        System.out.println("\t\t\tMENU: ");
        System.out.println("\t=====================================");
        System.out.println("\t(1) ADIÇÃO (+)");
        System.out.println("\t(2) SUBTRAÇÃO (-)");
        System.out.println("\t(3) MULTIPLICAÇÃO (*)");
        System.out.println("\t(4) DIVISÃO (/)");
        System.out.println("\t(0) SAIR");
     }
    }
}

