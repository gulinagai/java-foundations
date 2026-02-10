package org.example;

public class GenericsTeste {
    public static void main(String[] args) {
        MinhaClasse<String> meuTeste = new MinhaClasse<>("Guli");
        MinhaClasse<Integer> meuTeste2 = new MinhaClasse<>(2006);

        // consegui criar instancias de acordo com a minha necessidade de tipo. E além disso, já acabo resolvendo a questão de precisar criar várias clases para cada tipo requerido.

        System.out.println(meuTeste.getTeste());
        System.out.println(meuTeste2.getTeste());

    }
}


class MinhaClasse<T> {
    T teste;
    int teste2;
    boolean teste3;

    MinhaClasse(T teste) {
        this.teste = teste;
    }

    public T getTeste() {
        return this.teste;
    }

    public void setTeste(T teste) {
        this.teste = teste;
    }
}
