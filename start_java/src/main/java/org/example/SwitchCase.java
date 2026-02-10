package org.example;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma fruta: ");
        String fruta = scan.nextLine();


        switch (fruta) {
            case "melancia":
                System.out.println(fruta + " é muito bom");
                break;
            case "laranja":
                System.out.println(fruta + " é muito bom");
                break;
            case "limão":
                System.out.println(fruta + " é muito bom");
                break;
            default:
                System.out.println("Nunca comi " + fruta);
        }
    }
}
