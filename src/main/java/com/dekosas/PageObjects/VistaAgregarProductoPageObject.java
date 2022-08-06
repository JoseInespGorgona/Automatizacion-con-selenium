package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VistaAgregarProductoPageObject extends PageObject {
    By btnAgregarAlCarrito = By.xpath("//button[@id='product-addtocart-button']");
    By btnAumentarNumeroProducto = By.xpath("//a[@class='qty-inc']");
    By lstAtributoProducto = By.xpath("//option[@value='2230']");
    By msjReferenciaProducto = By.xpath("//span[@data-ui-id='page-title-wrapper']");


    public By getBtnAgregarAlCarrito() {
        return btnAgregarAlCarrito;
    }

    public By getBtnAumentarNumeroProducto() {
        return btnAumentarNumeroProducto;
    }

    public By getLstAtributoProducto() {
        return lstAtributoProducto;
    }

    public By getMsjReferenciaProducto() {
        return msjReferenciaProducto;
    }

}
