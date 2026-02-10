package org.example;

    // Classe Java Bean:

public class UsuarioJavaBean {
    // atributos privados
    private String nome;
    private String login;
    private int idade;

    // construtor sem parâmetro (poderiam ter outros, com parâmetros)

    public UsuarioJavaBean() {
    }

    // getters e setters publicos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String geLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
