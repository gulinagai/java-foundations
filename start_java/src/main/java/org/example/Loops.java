package org.example;

public class Loops {

    public static void main(String[] args) {
        for(int value = 1; value <= 10; value++) {
            System.out.println(value);
        }

        int teste = 0;

        while(teste <= 10) {
            System.out.println(++teste);

        }

        int seila = 5;
        do {
            System.out.println(seila);
            seila += 5;
        } while (seila <= 25);
    }

}
