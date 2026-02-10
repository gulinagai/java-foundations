package org.collections;

import java.util.HashMap;

public class UsandoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Cidade", "Santo Anastácio");
        map.put("Cidade", "Piquerobi");    // sobrescreve o ultimo que tinha a mesma key.

        map.put("Estado", "São Paulo");
        map.put("País", "Brasil");

        System.out.println(map);  // fica desordenado.
    }
}
