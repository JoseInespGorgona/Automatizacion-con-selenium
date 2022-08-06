package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VistaCarritoCompraPageObjet extends PageObject {
    By msjCarritoCompra = By.xpath("//span[.='Carrito de Compras']");
    By btnIncioPagina = By.xpath("//a[@title='DEKOSAS']");
    By msjResumeProducto = By.xpath("//strong[.='Resumen']");
    By btnPasarPorCaja = By.xpath("//span[.='Pasar por caja']");

    public By getMsjCarritoCompra() {
        return msjCarritoCompra;
    }

    public By getBtnIncioPagina() {
        return btnIncioPagina;
    }

    public By getMsjResumeProducto() {
        return msjResumeProducto;
    }

    public By getBtnPasarPorCaja() {
        return btnPasarPorCaja;
    }

}
