package org.fourhats.empleartec.tenis;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fourhats.empleartec.Tablero;
import org.junit.Assert;


public class MyStepdefs {

    private Tablero tablero = null;
    private String actual = null;

    @Given("^un nuevo tablero$")
    public void unNuevoTablero() throws Throwable {
        tablero = new Tablero();
    }

    @When("^chequeo el marcador$")
    public void chequeoElMarcador() throws Throwable {
        actual = tablero.marcador();
    }

    @Then("^dice \"([^\"]*)\"$")
    public void dice(String valor) throws Throwable {
        Assert.assertEquals(valor, actual);
    }
}
