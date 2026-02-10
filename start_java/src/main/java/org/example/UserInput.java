package org.example;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        int idade = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite seu nome completo: ");

        String nome = scan.nextLine();

        System.out.println("Digite o nome do seu cachorro: ");

        String cachorro = scan.next();

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nNome Cachorro: " + cachorro);
    }
}
