package org.example;

public class StringTeste {
    public static void main(String[] args) {
        String nome = "guli";


        nome.concat(" namora a Hanna"); // não muda nada na variável nome
        nome = nome.concat(" namora a Hanna"); // só irá alterar a referência do objeto na String Pool da memória se a variável for reatribuída.

        System.out.println(nome);

        nome += " namora a Hanna";

        System.out.println(nome);

        // outos métodos:

        System.out.println(nome.toUpperCase());

        System.out.println(nome.charAt(3));

        System.out.println(nome.substring(0, 19));

        String[] nomeSeparado = nome.substring(0, 19).split(" ");

        for(String palavra : nomeSeparado) {
            System.out.println(palavra);
        }



    }
}
