package org.example;

/**
 * Hello world!
 *
 */
class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hanna!" );

        boolean sinal = false;
        int altura = 900;

        System.out.println(sinal);
        System.out.println(altura);

        double f = 78.90;

        System.out.println("Valor: " + f);

        short s = (short) altura; // narrowing

        System.out.println("Valor: " + s);

        int value = s; // widening

        System.out.println("Valor: " + value);

    }

}
