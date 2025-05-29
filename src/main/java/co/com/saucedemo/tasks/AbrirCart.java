package co.com.saucedemo.tasks;

import co.com.saucedemo.userinterface.EnlaceProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.saucedemo.userinterface.CamposSauce.*;

public class AbrirCart implements Task {

    public static AbrirCart abrirCarrito(){return Tasks.instrumented(AbrirCart.class);
    };
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_cart),
                Click.on(BTN_remove)
        );
    }
}
