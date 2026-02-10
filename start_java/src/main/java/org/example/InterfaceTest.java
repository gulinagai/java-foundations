package org.example;

public class InterfaceTest {
    public static void main(String[] args) {
        Pessoa guli = new Pessoa();
        guli.nome = "Guli";
        guli.idade = 26;
        guli.raca = "humano";
        System.out.println("Oi meu nome é " + guli.nome + ", tenho " + guli.idade + " anos e sou um " + guli.raca + ".");
        System.out.println("Eu " + guli.respirar());
        System.out.println("Eu " + guli.andar());
        System.out.println("Eu " + guli.comer());
        System.out.println("Eu " + guli.deitar());
//        guli.sorrir();
    }
}

interface NecessidadesHumanas {
    String andar();
    String deitar();
    String comer();
//    default void sorrir() {
//        System.out.println("sorri" + sobrancelhaParaCima());
//    }
//    private String sobrancelhaParaCima() {                            mas só funciona a partir do Java 9!!!!
//        return ", levantando a sobrancelha!";
//    }
}

abstract class SerVivo {
    String raca;
    int idade;

    abstract String respirar();
}

class Pessoa extends SerVivo implements NecessidadesHumanas {
        String nome;

        @Override
        String respirar() {
            return"estou respirando";
        }
        @Override
        public String andar() {
            return"estou andando";
        }
        @Override
        public String deitar() {
            return"estou deitado";
        }
        @Override
        public String comer() {
            return"estou comendo";
        }
    }