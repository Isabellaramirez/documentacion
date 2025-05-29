package co.com.saucedemo.tasks;

import co.com.saucedemo.userinterface.PrincipalProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.saucedemo.userinterface.CamposSauce.BTN_addToCart;
import static co.com.saucedemo.userinterface.CamposSauce.BTN_product;

public class SeleccionarProduct implements Task {
    PrincipalProducts principalProducts;
    public static SeleccionarProduct seleccionar(){return Tasks.instrumented(SeleccionarProduct.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_product)

        );
    }
}
