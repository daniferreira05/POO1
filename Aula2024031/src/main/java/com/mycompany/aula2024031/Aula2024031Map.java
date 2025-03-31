

package com.mycompany.aula2024031;


public class Aula2024031Map {

    public static void main(String[] args) {
        System.out.println("Agenda");
        
        AgendaTelefonica ag = new AgendaTelefonica();
        ag.inserir("Cassio", "3213561435");
        ag.inserir("Pedro", "786578");
        ag.inserir("Joao", "364534563");
        ag.inserir("Maria", "876754656546");
        
        ag.imprimirAgenda();
    }
}
