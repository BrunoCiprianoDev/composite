package org.example.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganizacaoTest {
    @Test
    void deveRetornarQuadroDeFuncionarios() {
        Setor setorVendas = new Setor("Vendas");
        Funcao funcaoVendedorPresencial = new Funcao("Vendedor Presencial", 2);
        setorVendas.addCargo(funcaoVendedorPresencial);

        Setor setorTI = new Setor("TI");
        Funcao funcaoDesenvolvedor = new Funcao("Desenvolvedor", 3);
        Funcao funcaoAnalistaDeSistemas = new Funcao("Analista de Sistemas", 4);
        setorTI.addCargo(funcaoDesenvolvedor);
        setorTI.addCargo(funcaoAnalistaDeSistemas);

        Setor setorOrganizacao = new Setor("Organização");
        setorOrganizacao.addCargo(setorVendas);
        setorOrganizacao.addCargo(setorTI);

        Organizacao organizacao = new Organizacao();
        organizacao.setQuadroDeFuncionarios(setorOrganizacao);

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
    }
}