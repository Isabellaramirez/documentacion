package co.com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.saucedemo.userinterface.CamposSauce.BTN_addToCart;
import static co.com.saucedemo.userinterface.CamposSauce.BTN_product;

public class SeleccionarProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_product)
        );
    }
}
