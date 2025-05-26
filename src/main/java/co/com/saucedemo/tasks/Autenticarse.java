package co.com.saucedemo.tasks;
import co.com.saucedemo.models.CredencialesSauce;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;
import static co.com.saucedemo.userinterface.CamposSauce.*;

public class Autenticarse implements Task {
    private List<CredencialesSauce> credencialesSauces;

    public Autenticarse(List<CredencialesSauce> credencialesSauces) {this.credencialesSauces = credencialesSauces;}

    public static Autenticarse autenticarse(List<CredencialesSauce> credencialesSauces){
        return Instrumented.instanceOf(Autenticarse.class).withProperties(credencialesSauces);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credencialesSauces.get(0).getUsername()).into(INPUT_username),
                Click.on(INPUT_username),
                Enter.theValue(credencialesSauces.get(0).getPassword()).into(INPUT_password),
                Click.on(INPUT_password),
                Click.on(BTN_login)
        );
    }
}
