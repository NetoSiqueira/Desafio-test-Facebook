package steps;

import io.cucumber.java.pt.Dado;
import org.junit.Assert;
import page.ContextoPage;

import static core.Propriedades.paginaInicial;

public class ContextoSteps  {
    private ContextoPage page = new ContextoPage();

    @Dado("que estou na pagina de login do facebook")
    public void que_estou_na_pagina_de_login_do_facebook() {
        Assert.assertEquals(paginaInicial, page.verificaoPaginaInicial());
    }


}
