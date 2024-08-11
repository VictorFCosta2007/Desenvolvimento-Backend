package com.programandoseufuturo.exercicioHttp;

public class Pokemon {
    private int id;
    private String nome;

    public Pokemon(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
