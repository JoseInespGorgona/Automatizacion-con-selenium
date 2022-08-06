package com.dekosas.Steps;

import com.dekosas.PageObjects.VistaCarritoCompraPageObjet;
import com.dekosas.Utils.EsperaImplicita;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class VistaCarritoCompraStep {
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    Scroll scroll = new Scroll();
    VistaCarritoCompraPageObjet CarritoCompraPageObjet = new VistaCarritoCompraPageObjet();

    @Step
    public void validadcionCarritoCompra() {
        esperaImplicita.esperaImplicita(2);
        Assert.assertThat(CarritoCompraPageObjet.getDriver()
                .findElement(CarritoCompraPageObjet.getMsjCarritoCompra()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void clicPaginaInicial() {
        CarritoCompraPageObjet.getDriver().findElement(CarritoCompraPageObjet.getBtnIncioPagina()).click();
    }

    @Step
    public void clicPasarPorCaja() {
        esperaImplicita.esperaImplicita(5);
        scroll.scrollElemento(CarritoCompraPageObjet.getDriver(), CarritoCompraPageObjet.getMsjResumeProducto());
        CarritoCompraPageObjet.getDriver().findElement(CarritoCompraPageObjet.getBtnPasarPorCaja()).click();
    }

}
