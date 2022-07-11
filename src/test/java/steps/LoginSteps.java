package steps;

import UI.LoginUI;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import question.LoginQuestion;

import task.LoginTask;



public class LoginSteps  {
        Actor Usuario;

    @Before
        public void prepararElEscenario() {
        OnStage.setTheStage(new OnlineCast());
        Usuario = Actor.named("KeoWorld");
        Usuario.can(BrowseTheWeb.with(Navegador));

    }
    @Managed
    WebDriver Navegador;

    @Dado("Que el usuario entra a la pagina del login")
    public void que_el_usuario_entra_a_la_pagina_del_login() {
        Usuario.attemptsTo(Open.browserOn().the(LoginUI.class));
        }
    @Cuando("El usuario ingresa sus credenciales:{string} , {string}")
    public void elUsuarioIngresaSusCredenciales(String usuario, String clave) {
        Usuario.attemptsTo(LoginTask.inicioSesio(usuario,clave));

    }
    @Entonces("El usuario verifica el acceso: {string}")
    public void elUsuarioVerificaElAcceso(String nombrePerfil) {
        Usuario.should(GivenWhenThen.seeThat(LoginQuestion.ValidaTexto(nombrePerfil)));
    }

}
