package com.mycompany.aula20250310encapsulamentoteste;

public class Teste {
    public int a;
    public int b;
    private int c;
    private static int quantidade = 0 ;

    public Teste(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        quantidade++;
    }

    public Teste() {
        quantidade++;
    }

    public static int getQuantidade() {
        return quantidade;
    }

  
    
    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

            
    public void ImprimeA(){
        System.out.println("Valor de A: "+a);
    }
    public void ImprimeB(){
        System.out.println("Valor de B: "+b);
    }
    public void ImprimeC(){
        System.out.println("Valor de C: "+c);
    }
}
