package org.example;

public class Animal {
    static String nome = "Astolfo";
    String parteDoCorpo = "Cabeça";
    boolean cerebro = true;
    boolean vida = true;
    boolean situacaoOlho = true;

    void dormir() {
        System.out.println("(Dormindo...)");
        this.situacaoOlho = false;
    }



    void comer() {
        System.out.println("(Comendo...)");
    }

    void namorar() {
        System.out.println("(Namorando...)");
    }
}
