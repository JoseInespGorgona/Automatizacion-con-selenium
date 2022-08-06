package com.dekosas.Steps;

import com.dekosas.PageObjects.PaginaPrincipalPageObject;
import com.dekosas.Utils.EsperaImplicita;
import com.dekosas.Utils.Excel;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class PaginaPrincipalStep {
    Scroll scroll = new Scroll();
    Excel excel = new Excel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();


    @Step
    public void abrirNavegador() {
        paginaPrincipalPageObject.open();
    }

    @Step
    public void clickIniciarSesion() {
        esperaImplicita.esperaImplicita(7);
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnMiCuenta()).click();
    }

    @Step
    public void ingesarUsuario() throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtUsuario())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "Sesion", 1, 0));
    }

    @Step
    public void ingresarClave() throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtClave())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "Sesion", 1, 1));
    }

    @Step
    public void clickIngresar() {
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnEntrar()).click();
    }

    @Step
    public void ValidarCuentaIniciada() {
        Assert.assertThat(paginaPrincipalPageObject.getDriver().
                findElement(paginaPrincipalPageObject.getBtnValidacionLogin()).isDisplayed(), Matchers.is(true));
    }

    //
    @Step
    public void clicMenu() {
        esperaImplicita.esperaImplicita(3);
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getLstMenu()).click();
    }

    @Step
    public void clicCategoriaInfantil() {
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getLstInfantil()).click();
    }

    //Compras por busquedas----------------------------------------------------
    @Step
    public void validacionCampoBusqueda() {
        Assert.assertThat(paginaPrincipalPageObject.getDriver()
                .findElement(paginaPrincipalPageObject.getTxtCampoBuscar())
                .isDisplayed(), Matchers.is(true));
    }

    @Step
    public void escribirProductoUno() throws IOException {
        esperaImplicita.esperaImplicita(5);
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtCampoBuscar())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "BuscarProducto", 1, 0));
    }

    @Step
    public void buscarProducto() throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnBuscar())
                .click();
    }

    @Step
    public void seleccionarProductoUno() {
        scroll.scrollElemento(paginaPrincipalPageObject.getDriver(), paginaPrincipalPageObject.getMsjMensajeBusquedaUno());
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getImgProductoUno()).click();
    }

    @Step
    public void escribirProductoDos() throws IOException {
        esperaImplicita.esperaImplicita(5);
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtCampoBuscar())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "BuscarProducto", 2, 0));
    }

    @Step
    public void seleccionarProductoDos() {
        scroll.scrollElemento(paginaPrincipalPageObject.getDriver(), paginaPrincipalPageObject.getMsjMensajeBusquedaDos());
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getImgProductoDos()).click();
    }

    @Step
    public void escribirProductoTres() throws IOException {
        esperaImplicita.esperaImplicita(5);
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtCampoBuscar())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "BuscarProducto", 3, 0));
    }

    @Step
    public void buscarProductoTres() throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnBuscar())
                .click();
    }

    @Step
    public void seleccionarProductoTres() {
        scroll.scrollElemento(paginaPrincipalPageObject.getDriver(), paginaPrincipalPageObject.getMsjMensajeBusquedaTres());
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getImgProductoTres()).click();
    }


}
