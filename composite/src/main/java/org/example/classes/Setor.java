package org.example.classes;

import java.util.ArrayList;
import java.util.List;

public class Setor extends Cargo {

    private List<Cargo> cargos;

    public Setor(String descricao) {
        super(descricao);
        this.cargos = new ArrayList<Cargo>();
    }

    public void addCargo(Cargo cargo) {
        this.cargos.add(cargo);
    }

    public String getCargo() {
        String saida = "";
        saida = "Setor: " + this.getDescricao() + "\n";
        for (Cargo cargo : cargos) {
            saida += cargo.getCargo();
        }
        return saida;
    }
}