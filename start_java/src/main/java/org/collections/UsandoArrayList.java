package org.collections;

import java.util.ArrayList;
import java.util.List;

public class UsandoArrayList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        lista.add("pão");
        lista.add("camarão");
        lista.add("uva");
        lista.add("pão");   // permite adicionar duplicado
        lista.add("limão");
        lista.add("pão");

        System.out.println(lista); // organiza exatamente na mesma ordem que foi adicionado.

        lista.remove("pão");   // aqui no remove, se eu passar um numero, ele passa como o index a ser removido, se eu passa string, ele remove a primeira string que da match

        lista.remove(1);
        System.out.println(lista);

        for(String comida : lista) {
            System.out.println(comida);
        }

        System.out.println(" ");

        lista.forEach(System.out::println);
    }
}
