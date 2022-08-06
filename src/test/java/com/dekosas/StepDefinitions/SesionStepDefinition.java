package com.dekosas.StepDefinitions;

import com.dekosas.Steps.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class SesionStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Dado("^que el usuario se encuentra en la pagina$")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        paginaPrincipalStep.abrirNavegador();
    }


    @Cuando("^ingrese usuario y clave$")
    public void ingreseUsuarioYClave() throws IOException {
        paginaPrincipalStep.clickIniciarSesion();
        paginaPrincipalStep.ingesarUsuario();
        paginaPrincipalStep.ingresarClave();
        paginaPrincipalStep.clickIngresar();
    }

    @Entonces("^se visualizara la pagina logueada$")
    public void seVisualizaraLaPaginaLogueada() {
        paginaPrincipalStep.ValidarCuentaIniciada();
    }
}
