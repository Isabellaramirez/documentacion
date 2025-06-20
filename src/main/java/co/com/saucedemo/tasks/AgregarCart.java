package co.com.saucedemo.tasks;

import co.com.saucedemo.userinterface.EnlaceProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.saucedemo.userinterface.CamposSauce.*;

public class AgregarCart implements Task {
    EnlaceProduct enlaceProduct;
    public static AgregarCart agregarproducto(){return Tasks.instrumented(AgregarCart.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_addToCart)
        );
    }
}
