package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VistaLlenarInformacionCompraPageObject extends PageObject {
    By txtNombre  = By.xpath("//input[@name='firstname']");
    By txtApellido  = By.xpath("//input[@name='lastname']");
    By txtDireccion  = By.xpath("//input[@name='street[0]']");
    By lstPais  = By.xpath("//select[@name='country_id']");
    By lstEstado  = By.xpath("//select[@name='region_id']");
    By txtCiudad  = By.xpath("//select[@title='City']");
    By txtNumeroTelefono  = By.xpath("//input[@name='telephone']");
    By lstTipoIdentidad  = By.xpath("//select[@name='bss_custom_field[tipo_identidad]']");
    By txtNumeroIdentidad  = By.xpath("//input[@name='bss_custom_field[cedula_o_nit]']");
    By btnSiguinete = By.xpath("//span[text()='Siguiente']");



    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtDireccion() {
        return txtDireccion;
    }

    public By getLstPais() {
        return lstPais;
    }

    public By getLstEstado() {
        return lstEstado;
    }

    public By getTxtCiudad() {
        return txtCiudad;
    }

    public By getTxtNumeroTelefono() {
        return txtNumeroTelefono;
    }

    public By getLstTipoIdentidad() {
        return lstTipoIdentidad;
    }

    public By getTxtNumeroIdentidad() {
        return txtNumeroIdentidad;
    }

    public By getBtnSiguinete() {
        return btnSiguinete;
    }
}
