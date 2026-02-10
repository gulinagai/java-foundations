package org.example;

public class testJavaBean {
    public static void main(String[] args) {
        UsuarioJavaBean userOne = new UsuarioJavaBean();
//      userOne.idade = 1;  vai dar erro pq agora é private
        userOne.setIdade(54);
        System.out.println("Nova Idade: " + userOne.getIdade());

    }
}
