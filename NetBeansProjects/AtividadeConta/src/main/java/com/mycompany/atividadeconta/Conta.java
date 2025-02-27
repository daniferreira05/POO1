
package com.mycompany.atividadeconta;

public class Conta {
    
    int numero;
    String nome;
    double saldo;
    double limite;
    
    void Sacar(double v){
      System.out.println("Saldo: " + saldo);
      System.out.println("Digite o valor para o saque: " + numero);
      v = numero - saldo;
      System.out.println("Limite: " + limite);
      System.out.println("Saque: " + v);
    }
    
    void Depositar(double v){
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }
    

}
