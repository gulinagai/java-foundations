package org.example;

import java.util.Scanner;

public class ExceptionsEmJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 2 números:");
        int first = scan.nextInt();
        int second = scan.nextInt();

        new CalcularDivisao().divide(first, second);
    }
}

class CalcularDivisao {
    void divide(int first, int second) {
        try {
            int result = first / second;
            System.out.println(result);
        } catch (ArithmeticException exc) {
            System.out.println("Divisão aritmética inviável. " + exc.getMessage());
        } finally {
            System.out.println("Aplicação finalizada.");
        }

    }
}