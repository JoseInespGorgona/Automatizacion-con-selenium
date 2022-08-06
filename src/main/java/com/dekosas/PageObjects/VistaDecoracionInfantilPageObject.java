package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VistaDecoracionInfantilPageObject extends PageObject {
    By imgProducto = By.xpath("//li[@class='item product product-item nth-child-2n nth-child-4n nth-child-7np1 nth-child-8n']");
    //Localizadores para el SCROLL
    By msjDestacado = By.xpath("//strong[@id='titulo-widget']");
    By msjCategoria = By.xpath("//div[.='Categoría']");
    By mjsPrecio = By.xpath("//div[.='Precio']");

    public By getImgProducto() {
        return imgProducto;
    }

    public By getMsjDestacado() {
        return msjDestacado;
    }

    public By getMsjCategoria() {
        return msjCategoria;
    }

    public By getMjsPrecio() {
        return mjsPrecio;
    }
}
