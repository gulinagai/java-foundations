package org.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoComComparator {
    public static void main(String[] args) {
//
        List<Laptopp> pcs = new ArrayList<>();

        Laptopp pc1 = new Laptopp(8, 120, "Asus", "C - TUF");
        Laptopp pc2 = new Laptopp(32, 500, "Acer", "A - Nitro 60");
        Laptopp pc3 = new Laptopp(16, 240, "Gaming Computer", "B - Prism II");

        pcs.add(pc1);
        pcs.add(pc2);
        pcs.add(pc3);

        System.out.println("Lista antes de ordenar:");
        System.out.println(pcs);


//        Collections.sort(pcs, new OrdenandoComComparatorNome());

        // existe uma forma mais moderna atual, sem usar Collections, direto na lista:

        pcs.sort(new OrdenandoComComparatorNome());


        System.out.println("Lista depois de ordenar:");
        System.out.println(pcs);
    }
}

class OrdenandoComComparatorNome implements Comparator<Laptopp> {
    @Override
    public int compare(Laptopp o1, Laptopp o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
    // PRECISA SER OBRIGATORIAMENTE O COMPARE() QUANDO USAMOS COMPARATOR
}


class Laptopp {
    private int ram;
    private int ssd;
    private String manufacturer;
    private String nome;


    public Laptopp(int ram, int ssd, String manufacturer, String nome) {
        this.ram = ram;
        this.ssd = ssd;
        this.manufacturer = manufacturer;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.manufacturer + " " + this.nome + " - " + this.ram + " / " + this.ssd;
    }

    public Laptopp() {
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getNome() {
        return nome;
    }
}

