
package com.mycompany.atividadeconta;


public class Conta {
    
    int numero;
    String nome;
    double saldo;
    double limite;
    
    void sacar(double v){
        if(v > 0 && v <= limite && saldo >= v){
            saldo -= v;
            System.out.println("\tSaque realizado com sucesso! Novo saldo: " + saldo);
        }else{
            System.err.println("\tSaldo insuficiente!");
        }
    }
    
    void depositar(double v){
        if(v > 0){
            saldo += v;
            System.out.println("\tDepósito realizado com sucesso! Novo saldo: " + saldo);
        }else{
            System.err.println("\tValor de depósito inválido!");
        }
    }
    

}
