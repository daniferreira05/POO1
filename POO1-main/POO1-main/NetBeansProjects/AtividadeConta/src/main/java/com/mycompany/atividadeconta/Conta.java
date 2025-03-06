
package com.mycompany.atividadeconta;


public class Conta {
    
    int numero;
    String nome;
    double saldo;
    double limite;
    
    
    boolean sacar(double v){
        if( v > saldo){
            System.err.println("\tSaldo insuficiente!");
            return false;
        }else{
            saldo -= v;
            System.out.println("\tSaque realizado! Novo saldo: " + saldo);
            return true;
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

/*
    void sacar(double v){
        if(v > 0 && v <= limite && saldo >= v){
            saldo -= v;
            System.out.println("\tSaque realizado! Novo saldo: " + saldo);
        }else{
            System.err.println("\tSaldo insuficiente!");
        }
    }*/