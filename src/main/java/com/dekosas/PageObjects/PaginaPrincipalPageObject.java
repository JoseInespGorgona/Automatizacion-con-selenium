package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://dekosas.com/co/")
public class PaginaPrincipalPageObject extends PageObject {
    By btnMiCuenta = By.xpath("//div[@class='porto-sicon-header']");
    By txtUsuario = By.xpath("//input[@id='social_login_email']");
    By txtClave = By.xpath("//input[@id='social_login_pass']");
    By btnEntrar = By.xpath("//button[@id='bnt-social-login-authentication']");
    By btnValidacionLogin = By.xpath("//h3[.='Bienvenido']");

    //Comprar por categoria
    By lstMenu = By.xpath("//div[@class='menu-title closed']");
    By lstInfantil = By.xpath("//span[.='Infantil']");

    //Compra por Busqueda
    By txtCampoBuscar = By.xpath("//input[@id='search']");
    By btnBuscar = By.xpath("//button[@title='Buscar']");
    By msjMensajeBusquedaUno = By.xpath("//p[@data-role='title']");
    By imgProductoUno = By.xpath("//li[@class='item product product-item nth-child-2n']");
    By msjMensajeBusquedaDos =By.xpath("//p[@class='amsearch-block-header amsearch-collapsible-title']");
    By imgProductoDos = By.xpath("//li[@class='item product product-item nth-child-2n']");
    By msjMensajeBusquedaTres = By.xpath("//p[@class='amsearch-block-header amsearch-collapsible-title']");
    By imgProductoTres = By.xpath("//li[@class='item product product-item nth-child-2n']");
    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnEntrar() {
        return btnEntrar;
    }

    public By getBtnValidacionLogin() {
        return btnValidacionLogin;
    }
    //

    public By getLstMenu() {
        return lstMenu;
    }

    public By getLstInfantil() {
        return lstInfantil;
    }

    //


    public By getTxtCampoBuscar() {
        return txtCampoBuscar;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getMsjMensajeBusquedaUno() {
        return msjMensajeBusquedaUno;
    }

    public By getImgProductoUno() {
        return imgProductoUno;
    }

    public By getMsjMensajeBusquedaDos() {
        return msjMensajeBusquedaDos;
    }

    public By getImgProductoDos() {
        return imgProductoDos;
    }

    public By getMsjMensajeBusquedaTres() {
        return msjMensajeBusquedaTres;
    }

    public By getImgProductoTres() {
        return imgProductoTres;
    }
}
