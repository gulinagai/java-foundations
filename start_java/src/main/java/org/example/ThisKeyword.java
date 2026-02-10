package org.example;

public class ThisKeyword {
    double myVal;
    public static void main(String[] args) {
        ThisKeyword teste = new ThisKeyword();
        teste.func();
    }

    void func() {
        this.myVal = 61.2;
        this.met();
    }

    void met() {
        this.myVal = 51.2;
        System.out.println(myVal);
    }
}
