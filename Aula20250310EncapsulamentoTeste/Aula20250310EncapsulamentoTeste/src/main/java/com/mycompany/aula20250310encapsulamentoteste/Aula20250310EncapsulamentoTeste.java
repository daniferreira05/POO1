package com.mycompany.aula20250310encapsulamentoteste;

public class Aula20250310EncapsulamentoTeste {

    public static void main(String[] args) {
        
        System.out.println("TESTE");
        
        Teste t1 = new Teste(10,20,30);
        Teste t2 = new Teste();
        Teste t3 = new Teste();
        //t1.c = 100; //ERRO
        System.out.println(t1.getQuantidade());

        
        
    }
}
