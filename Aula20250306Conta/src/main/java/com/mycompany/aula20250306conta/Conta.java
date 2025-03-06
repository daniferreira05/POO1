package com.mycompany.aula20250306conta;

public class Conta {
    
    int numero;
    Cliente dono;
    double saldo;
    double limite;
   

    boolean Sacar(double valor){
        if(valor >saldo){
            System.out.println("Saque nao permitido.");
            return false;
        }

        saldo -= valor;
        System.out.println("Saque liberado.");
        return true;
     
            
    }
    
    void Depositar(double valor){
        saldo += valor;
    }
}
