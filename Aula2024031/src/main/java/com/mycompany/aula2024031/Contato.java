
package com.mycompany.aula2024031;


public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" + "Nome = " + nome + ", telefone = " + telefone + '}';
    }
    
}
