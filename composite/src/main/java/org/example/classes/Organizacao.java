package org.example.classes;

public class Organizacao {

    private Cargo quadroDeFuncionarios;

    public void setQuadroDeFuncionarios(Cargo quadroDeFuncionarios) {
        this.quadroDeFuncionarios = quadroDeFuncionarios;
    }

    public String getQuadroDeFuncionarios() {
        if (this.quadroDeFuncionarios == null) {
            throw new NullPointerException("Organização sem quadro de funcionários");
        }
        return this.quadroDeFuncionarios.getCargo();
    }
}
