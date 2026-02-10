package org.example;

import java.util.Scanner;

public class StaticKeyword {
    static String nome;
    public static void main(String[] args) {
        StaticKeyword.nome = "guli";
        System.out.println(StaticKeyword.nome);
        System.out.println("Qual o nome?");
        Scanner scan = new Scanner(System.in);
        String novoNome = scan.next();
        mudarNome(novoNome);
        System.out.println(StaticKeyword.nome);

    }

    static void mudarNome(String nomeParam) {
        nome = nomeParam;
    }
}
