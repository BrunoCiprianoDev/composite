package org.example.classes;

public abstract class Cargo {

    private String descricao;

    public Cargo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getCargo();
}