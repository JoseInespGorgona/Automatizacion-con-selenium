package com.dekosas.StepDefinitions;

import com.dekosas.Steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class compraPorBusquedaStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    VistaAgregarProductoStep vistaAgregarProductoStep;
    @Steps
    VistaCarritoCompraStep vistaCarritoCompraStep;
    @Steps
    VistaLlenarInformacionCompraStep vistaLlenarInformacionCompraStep;
    @Steps
    VistaRevisionPagoStep vistaRevisionPagoStep;

    @Dado("^que el usuario se encuntre en la barra de busqueda$")
    public void queElUsuarioSeEncuntreEnLaBarraDeBusqueda() {
        paginaPrincipalStep.validacionCampoBusqueda();
    }

    @Cuando("^seleccione tres productos al carrito de compra buscado por el navegador$")
    public void seleccioneTresProductosAlCarritoDeCompraBuscadoPorElNavegador() throws IOException {
        paginaPrincipalStep.escribirProductoUno();
        paginaPrincipalStep.buscarProducto();
        paginaPrincipalStep.seleccionarProductoUno();
        vistaAgregarProductoStep.agregarProductoBusqueda();
        vistaCarritoCompraStep.clicPaginaInicial();

        paginaPrincipalStep.escribirProductoDos();
        paginaPrincipalStep.buscarProducto();
        paginaPrincipalStep.seleccionarProductoDos();
        vistaAgregarProductoStep.agregarProductoBusqueda();
        vistaCarritoCompraStep.clicPaginaInicial();

        paginaPrincipalStep.escribirProductoTres();
        paginaPrincipalStep.buscarProductoTres();
        paginaPrincipalStep.seleccionarProductoTres();
        vistaAgregarProductoStep.seleccionarAtributoProducto();
        vistaAgregarProductoStep.agregarProductoBusqueda();
        vistaCarritoCompraStep.clicPasarPorCaja();
    }

    @Cuando("^llene los datos de compra$")
    public void lleneLosDatosDeCompra() throws IOException {
        vistaLlenarInformacionCompraStep.digitarNombres();
        vistaLlenarInformacionCompraStep.digitarApellidos();
        vistaLlenarInformacionCompraStep.digitarDireccion();
        vistaLlenarInformacionCompraStep.seleccionarPais();
        vistaLlenarInformacionCompraStep.seleccionarEstado();
        vistaLlenarInformacionCompraStep.seleccionarCiudad();
        vistaLlenarInformacionCompraStep.digitarTelefono();
        vistaLlenarInformacionCompraStep.seleccionarTipoIdentidad();
        vistaLlenarInformacionCompraStep.digitarNumeroIdentidad();
        vistaLlenarInformacionCompraStep.clickSiguiente();
    }

    @Cuando("^cancele la compra$")
    public void canceleLaCompra() {
        vistaRevisionPagoStep.clickCarritoCompra();
        vistaRevisionPagoStep.cancelarProductos();
        vistaRevisionPagoStep.aceptarCancelacionProductos();
        vistaRevisionPagoStep.cancelarProductos();
        vistaRevisionPagoStep.aceptarCancelacionProductos();
        vistaRevisionPagoStep.cancelarProductos();
        vistaRevisionPagoStep.aceptarCancelacionProductos();
        vistaRevisionPagoStep.cancelarProductos();
        vistaRevisionPagoStep.aceptarCancelacionProductos();

    }

    @Entonces("^se visualizara el carrito de compras vacio$")
    public void seVisualizaraElCarritoDeComprasVacio() {
        vistaRevisionPagoStep.clickCarritoCompra();
        vistaRevisionPagoStep.validacionCarritoVacio();
    }
}
