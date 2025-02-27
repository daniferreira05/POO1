
package com.mycompany.aula20250227;

public class Aula20250227 {
 
    public static void main(String[] args) {
        System.out.println("EXEMPLOS");
        
        SoDados sd; /*ou: SoDados sd = new SoDados();*/
        sd = new SoDados();
        
        sd.i = 10;
        sd.f = 100;
        sd.b = true;
        
        SoDados x = new SoDados();
        x.i = 20;
        x.f = 200;
        x.b = false;
        
        System.out.println("Teste SD I: " + sd.i);
        
        sd.Imprimir();
        
      
       
        
    }
  
}
