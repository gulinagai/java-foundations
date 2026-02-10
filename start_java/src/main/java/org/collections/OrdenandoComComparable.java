package org.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenandoComComparable {
    public static void main(String[] args) {
//        List<String> listOfNames = new ArrayList<>();
//
//        listOfNames.add("Guli");
//        listOfNames.add("Hanna");
//        listOfNames.add("Gabi");
//        listOfNames.add("Cristiane");
//        listOfNames.add("Sidnei");
//
//        System.out.println("Lista antes de ordenar:");
//        System.out.println(listOfNames);
//
//        Collections.sort(listOfNames);
//
//        System.out.println("Lista depois de ordenar:");
//        System.out.println(listOfNames);

        List<Laptop> pcs = new ArrayList<>();

        Laptop pc1 = new Laptop(8, 120, "Asus", "C - TUF");
        Laptop pc2 = new Laptop(32, 500, "Acer", "A - Nitro 60");
        Laptop pc3 = new Laptop(16, 240, "Gaming Computer", "B - Prism II");

        pcs.add(pc1);
        pcs.add(pc2);
        pcs.add(pc3);

        System.out.println("Lista antes de ordenar:");
        System.out.println(pcs);
        Collections.sort(pcs);
        System.out.println("Lista depois de ordenar:");
        System.out.println(pcs);
    }
}


class Laptop implements Comparable<Laptop>{
    private int ram;
    private int ssd;
    private String manufacturer;
    private String nome;

//    @Override
//    public int compareTo(Laptop outro) {
//        return Integer.compare(this.ram, outro.ram);
//    }

    @Override
    public int compareTo(Laptop outro) {
        return this.getNome().compareTo(outro.nome);         // eu poderia usar tanto this.getNome().compareTo(outro.nome) quanto this.nome.compareTo(outro.nome)  (String.compareTo(outro.nome); // ❌
                                                                                          // Porque compareTo() não é metodo estático da classe String. Ele é um metodo de instância.
    }

    public Laptop(int ram, int ssd, String manufacturer, String nome) {
        this.ram = ram;
        this.ssd = ssd;
        this.manufacturer = manufacturer;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.manufacturer + " " + this.nome + " - " + this.ram + " / " + this.ssd;
    }

    public Laptop() {
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