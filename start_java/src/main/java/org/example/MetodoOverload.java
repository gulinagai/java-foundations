package org.example;


import java.util.Scanner;

public class MetodoOverload {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calcular calculo = new Calcular();
        System.out.println("Digite os números:");
        System.out.println("Resultado: " + calculo.multiplicar(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
    }
}

class Calcular {
    int total = 1;
    int multiplicar(int teste, int... values) {
        for(int value : values) {
            total *= value;
        }
        return total;
    }

//    int multiplicar(int first, int second, int third) {
//        return first * second * third;
//    }
//
//    int multiplicar(int first, int second, int third, int fourth) {
//        return first * second * third * fourth;
//    }
}