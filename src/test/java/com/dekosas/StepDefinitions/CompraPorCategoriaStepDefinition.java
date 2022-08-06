package com.dekosas.StepDefinitions;

import com.dekosas.Steps.PaginaPrincipalStep;
import com.dekosas.Steps.VistaAgregarProductoStep;
import com.dekosas.Steps.VistaCarritoCompraStep;
import com.dekosas.Steps.VistaDecoracionInfantilStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CompraPorCategoriaStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    VistaDecoracionInfantilStep vistaDecoracionInfantilStep;
    @Steps
    VistaAgregarProductoStep vistaAgregarProductoStep;
    @Steps
    VistaCarritoCompraStep vistaCarritoCompraStep;

    @Dado("^que el usuario se encuentra en la categoria infantil$")
    public void queElUsuarioSeEncuentraEnLaCategoriaInfantil() {
        paginaPrincipalStep.abrirNavegador();
        paginaPrincipalStep.clicMenu();
        paginaPrincipalStep.clicCategoriaInfantil();
    }


    @Cuando("^seleccione el producto$")
    public void seleccioneElProducto() {
        vistaDecoracionInfantilStep.seleccionarProducto();
    }

    @Cuando("^agregue la cantidad del producto$")
    public void agregueLaCantidadDelProducto() {
        vistaAgregarProductoStep.cantidadDeUnProducto();

    }

    @Cuando("^agregar al carrito de compras$")
    public void agregarAlCarritoDeCompras() {
        vistaAgregarProductoStep.agregarProductoCarrito();
    }

    @Entonces("^se visualizara el producto en el carrito de compras$")
    public void seVisualizaraElProductoEnElCarritoDeCompras() {
        vistaCarritoCompraStep.validadcionCarritoCompra();
    }

    @Entonces("^volvera a la pantalla de inicio$")
    public void volveraALaPantallaDeInicio() {
        vistaCarritoCompraStep.clicPaginaInicial();

    }

}
