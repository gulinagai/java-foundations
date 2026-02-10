package org.example;

public class Mundo {
    public static void main(String[] args) {
        Animal golfinho = new Animal();
        golfinho.comer();
        golfinho.dormir();
        golfinho.namorar();

        System.out.println(golfinho.cerebro);
        System.out.println(golfinho.vida);

        golfinho.nome = "Garibaldo";

        System.out.println(golfinho.nome + " tem 1 " + golfinho.parteDoCorpo);
        System.out.println(golfinho.nome);



    }
}
