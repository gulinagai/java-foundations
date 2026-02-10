package org.example;

public class Arrays {
    public static void main(String[] args) {

        // existem 3 formas de criar array em java:

        long []values = new long[5];

        values[0] = 32;
        values[1] = 41;
        values[2] = 45;

        for(int i = 0; i < values.length ; i++) {
            System.out.println(values[i]);
        }

        System.out.println(values.length);

        System.out.println("forma 2:");

        for(long value : values) {
            System.out.println(value);
        }



    }
}
