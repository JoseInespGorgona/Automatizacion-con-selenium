package com.dekosas.Steps;


import com.dekosas.PageObjects.VistaDecoracionInfantilPageObject;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;

public class VistaDecoracionInfantilStep{
    Scroll scroll = new Scroll();
    VistaDecoracionInfantilPageObject decoracionInfantil = new VistaDecoracionInfantilPageObject();

    @Step
    public void seleccionarProducto() {
        scroll.scrollElemento(decoracionInfantil.getDriver(), decoracionInfantil.getMsjDestacado());
        scroll.scrollElemento(decoracionInfantil.getDriver(), decoracionInfantil.getMsjCategoria());
        scroll.scrollElemento(decoracionInfantil.getDriver(), decoracionInfantil.getMjsPrecio());
        decoracionInfantil.getDriver().findElement(decoracionInfantil.getImgProducto()).click();
    }
}
