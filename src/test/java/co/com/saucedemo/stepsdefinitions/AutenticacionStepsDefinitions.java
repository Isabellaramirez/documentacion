package co.com.saucedemo.stepsdefinitions;
import co.com.saucedemo.models.CredencialesSauce;
import co.com.saucedemo.tasks.AbrirSauce;
import co.com.saucedemo.tasks.Autenticarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepsDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de Saucedemo$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDeSaucedemo() {
        theActorInTheSpotlight().wasAbleTo(AbrirSauce.lapagina());
    }


    @Cuando("^ingrese las credenciales correctas \\(username y password\\)$")
    public void ingreseLasCredencialesCorrectasUsernameYPassword(List<CredencialesSauce> credencialesSauces) {
        theActorInTheSpotlight().attemptsTo(Autenticarse.autenticarse(credencialesSauces));

    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de inicio de Saucedemo$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPaginaDeInicioDeSaucedemo() {


    }


}
