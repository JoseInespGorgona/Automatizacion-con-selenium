package com.dekosas.Steps;

import com.dekosas.PageObjects.VistaRevisionPagoPageObject;
import com.dekosas.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class VistaRevisionPagoStep {
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    VistaRevisionPagoPageObject vistaRevisionPagoPageObject = new VistaRevisionPagoPageObject();

    @Step
    public void clickCarritoCompra() {
        esperaImplicita.esperaImplicita(5);
        vistaRevisionPagoPageObject.getDriver().findElement(vistaRevisionPagoPageObject.getBtnCarritoCompra()).click();
    }

    @Step
    public void cancelarProductos() {
        esperaImplicita.esperaImplicita(1);
        vistaRevisionPagoPageObject.getDriver().findElement(vistaRevisionPagoPageObject.getBtnCancelarCompra()).click();
    }

    @Step
    public void aceptarCancelacionProductos() {
        vistaRevisionPagoPageObject.getDriver().findElement(vistaRevisionPagoPageObject.getBtnAceptarCancelacion()).click();
    }

    @Step
    public void validacionCarritoVacio() {
        Assert.assertThat(vistaRevisionPagoPageObject.getDriver()
                .findElement(vistaRevisionPagoPageObject.getMsjValidacionCarritoVacio()).isDisplayed(), Matchers.is(false));
    }
}
