package org.example;

import java.util.Scanner;

public class ExpectionPropagacao {
    public static void main(String[] args) {

        try {   // se usar try/catch + throw, não precisa colocar throws no metodo

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite a sua idade:");
            int idade = scan.nextInt();

            if (idade < 18) {
                throw new IdadeInvalidaException("Idade deve ser 18 ou maior.");
            }

            System.out.println("Cadastro permitido.");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa encerrado.");
        }

    }
}

class IdadeInvalidaException extends Exception { // Ela estende Exception, então é checked.

    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}