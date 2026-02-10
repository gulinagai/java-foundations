package org.collections;

import java.util.TreeMap;

public class UsandoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();

        map.put("Cidade", "Santo Anastácio");
        map.put("Cidade", "Piquerobi");    // sobrescreve o ultimo que tinha a mesma key.

        map.put("Estado", "São Paulo");
        map.put("País", "Brasil");

        System.out.println(map);  // fica ordenado de acordo com a key.
    }
}
