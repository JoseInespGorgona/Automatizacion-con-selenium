package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VistaRevisionPagoPageObject extends PageObject {
    By btnCarritoCompra = By.xpath("//i[@class='minicart-icon porto-icon-shopping-cart']");
    By btnCancelarCompra = By.xpath("//div//following-sibling::a[@title='Eliminar artículo']");
    By btnAceptarCancelacion = By.xpath("//span[.='Aceptar']");

    By msjValidacionCarritoVacio = By.xpath("//span[.='0']");

    public By getBtnCarritoCompra() {
        return btnCarritoCompra;
    }

    public By getBtnCancelarCompra() {
        return btnCancelarCompra;
    }

    public By getBtnAceptarCancelacion() {
        return btnAceptarCancelacion;
    }

    public By getMsjValidacionCarritoVacio() {
        return msjValidacionCarritoVacio;
    }
}
