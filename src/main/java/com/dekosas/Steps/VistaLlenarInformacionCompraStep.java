package com.dekosas.Steps;

import com.dekosas.PageObjects.VistaLlenarInformacionCompraPageObject;
import com.dekosas.Utils.EsperaImplicita;
import com.dekosas.Utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class VistaLlenarInformacionCompraStep {
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    Excel excel = new Excel();
    VistaLlenarInformacionCompraPageObject vistaLlenarInformacionCompraPageObject = new VistaLlenarInformacionCompraPageObject();

    @Step
    public void digitarNombres() throws IOException {
        esperaImplicita.esperaImplicita(5);
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getTxtNombre()).clear();
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getTxtNombre())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "DatosCompraProducto", 1, 0));
    }

    @Step
    public void digitarApellidos() throws IOException {
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getTxtApellido()).clear();
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getTxtApellido())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "DatosCompraProducto", 1, 1));
    }

    @Step
    public void digitarDireccion() throws IOException {
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getTxtDireccion())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "DatosCompraProducto", 1, 2));
    }

    @Step
    public void seleccionarPais() throws IOException {
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getLstPais())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "DatosCompraProducto", 1, 3));
    }

    @Step
    public void seleccionarEstado() throws IOException {
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getLstEstado())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "DatosCompraProducto", 1, 4));
    }

    @Step
    public void seleccionarCiudad() throws IOException {
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getTxtCiudad())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "DatosCompraProducto", 1, 5));
    }

    @Step
    public void digitarTelefono() throws IOException {
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getTxtNumeroTelefono())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "DatosCompraProducto", 1, 6));
    }

    @Step
    public void seleccionarTipoIdentidad() throws IOException {
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getLstTipoIdentidad())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "DatosCompraProducto", 1, 7));
    }

    @Step
    public void digitarNumeroIdentidad() throws IOException {
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getTxtNumeroIdentidad())
                .sendKeys(excel.leerDatosExcel("DatosDekosas.xlsx", "DatosCompraProducto", 1, 8));
    }

    @Step
    public void clickSiguiente() throws IOException {
        vistaLlenarInformacionCompraPageObject.getDriver().findElement(vistaLlenarInformacionCompraPageObject.getBtnSiguinete()).click();

    }
}
