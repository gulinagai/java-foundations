package org.collections;

import java.util.HashSet;

public class UsandoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> listaHashSet = new HashSet<Integer>();

        listaHashSet.add(32);
        listaHashSet.add(41);
        listaHashSet.add(5);
        listaHashSet.add(2);
        listaHashSet.add(32);

        System.out.println(listaHashSet);

    }
}
