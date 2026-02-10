package org.collections;

import java.util.TreeSet;

public class UsandoTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> listaTreeSet = new TreeSet<Integer>();

        listaTreeSet.add(23);
        listaTreeSet.add(2);
        listaTreeSet.add(515);
        listaTreeSet.add(152134);
        listaTreeSet.add(13);

        System.out.println(listaTreeSet);

        listaTreeSet.forEach(System.out::println);
    }
}
