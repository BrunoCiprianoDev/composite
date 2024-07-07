package org.example.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganizacaoTest {
    @Test
    void deveRetornarQuadroDeFuncionarios() {
        Setor setor1 = new Setor("Vendas");
        Funcao funcao11 = new Funcao("Vendedor Presencial", 2);
        setor1.addCargo(funcao11);

        Setor setor2 = new Setor("TI");
        Funcao funcao21 = new Funcao("Desenvolvedor", 3);
        Funcao funcao22 = new Funcao("Analista de Sistemas", 4);
        setor2.addCargo(funcao21);
        setor2.addCargo(funcao22);

        Setor quadroDeFuncionarios = new Setor("Organização");
        quadroDeFuncionarios.addCargo(setor1);
        quadroDeFuncionarios.addCargo(setor2);

        Organizacao organizacao = new Organizacao();
        organizacao.setQuadroDeFuncionarios(quadroDeFuncionarios);

        assertEquals("Setor: Organização\n" +
                "Setor: Vendas\n" +
                "Função: Vendedor Presencial - carga horária: 2\n" +
                "Setor: TI\n" +
                "Função: Desenvolvedor - carga horária: 3\n" +
                "Função: Analista de Sistemas - carga horária: 4\n", organizacao.getQuadroDeFuncionarios());
    }

    @Test
    void deveRetornarExcecaoOrganizacaoSemQuadroDeFuncionarios() {
        try {
            Organizacao organizacao = new Organizacao();
            organizacao.getQuadroDeFuncionarios();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Organização sem quadro de funcionários", e.getMessage());
        }
    }}