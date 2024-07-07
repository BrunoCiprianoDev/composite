package org.example.classes;

public class Funcao extends Cargo {

    private int cargaHoraria;

    public Funcao(String descricao, int cargaHoraria) {
        super(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCargo() {
        return "Função: " + this.getDescricao() + " - carga horária: " + this.cargaHoraria + "\n";
    }

}