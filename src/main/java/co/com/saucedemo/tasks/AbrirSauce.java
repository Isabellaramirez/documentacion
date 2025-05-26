package co.com.saucedemo.tasks;

import co.com.saucedemo.userinterface.EnlaceLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirSauce implements Task {
    EnlaceLogin enlaceLogin;
    public static AbrirSauce lapagina(){ return Tasks.instrumented(AbrirSauce.class);}

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(enlaceLogin));
    }
}
