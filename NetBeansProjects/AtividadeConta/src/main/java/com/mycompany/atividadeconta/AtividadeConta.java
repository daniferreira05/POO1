

package com.mycompany.atividadeconta;


public class AtividadeConta {

    public static void main(String[] args) {
        Conta c = new Conta();
        c.numero = 123;
        c.nome = "Joaquim";
        c.saldo = 20000;
        c.limite = 5000;
        
        System.out.println(c.nome);
        System.out.println("Número de conta: " + c.numero);
        c.sacar(8000);
        c.depositar(5000);
        
        Conta y = new Conta();
        y.numero = 456;
        y.nome = "Suelen";
        y.saldo = 500000;
        y.limite = 10000;
        
        System.out.println(y.nome);
        System.out.println("Número de conta: " + y.numero);
        y.sacar(3000);
        y.depositar(6000);
      
    }
}
