package co.com.saucedemo.tasks;

import co.com.saucedemo.userinterface.EnlaceProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirProducto implements Task {
    EnlaceProduct enlaceProducto;
    public static AbrirProducto producto(){return Tasks.instrumented(AbrirProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(enlaceProducto));


    }
}
