

package com.mycompany.atividadeconta;


public class AtividadeConta {

    public static void main(String[] args) {
        Conta c = new Conta();
        c.saldo = 1000;
        c.limite = 2000;
        
        c.nome = "Joao";
        System.out.println();
        
        Conta y = new Conta ();
        y.saldo = 3000;
        y.limite = 1000;
        
        c.Sacar(500);
    }
}
