package com.dekosas.Steps;

import com.dekosas.PageObjects.VistaAgregarProductoPageObject;
import com.dekosas.Utils.EsperaImplicita;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;

public class VistaAgregarProductoStep {
    Scroll scroll = new Scroll();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    VistaAgregarProductoPageObject agregarProducto = new VistaAgregarProductoPageObject();

    @Step
    public void cantidadDeUnProducto() {
        esperaImplicita.esperaImplicita(7);
        scroll.scrollElemento(agregarProducto.getDriver(), agregarProducto.getMsjReferenciaProducto());
        int numeroClic = 0;
        do {
            agregarProducto.getDriver().findElement(agregarProducto.getBtnAumentarNumeroProducto()).click();
            numeroClic++;
        } while (numeroClic < 2);
    }

    @Step
    public void agregarProductoCarrito() {
        esperaImplicita.esperaImplicita(5);
        agregarProducto.getDriver().findElement(agregarProducto.getBtnAgregarAlCarrito()).click();
    }

    @Step
    public void seleccionarAtributoProducto(){
        agregarProducto.getDriver().findElement(agregarProducto.getLstAtributoProducto()).click();
    }
    @Step
    public void agregarProductoBusqueda() {
        esperaImplicita.esperaImplicita(5);
        scroll.scrollElemento(agregarProducto.getDriver(), agregarProducto.getMsjReferenciaProducto());
        agregarProducto.getDriver().findElement(agregarProducto.getBtnAgregarAlCarrito()).click();
    }

}
