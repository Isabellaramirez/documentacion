package co.com.saucedemo.stepsdefinitions;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.saucedemo.tasks.AbrirCart;
import co.com.saucedemo.tasks.AbrirProducto;
import co.com.saucedemo.tasks.AgregarCart;
import co.com.saucedemo.tasks.SeleccionarProduct;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

public class ProcessStepsDefinitions {
    @Cuando("^Selecciona el producto de la lista lo agrega al carrito navega al carrito para eliminar el producto escogido$")
    public void seleccionaElProductoDeLaListaLoAgregaAlCarritoNavegaAlCarritoParaEliminarElProductoEscogido() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarProduct.seleccionar(),
                AbrirProducto.producto(),
                AgregarCart.agregarproducto(),
                AbrirCart.abrirCarrito());

    }


    @Entonces("^el usuario podra visualizar el carrito vacio$")
    public void elUsuarioPodraVisualizarElCarritoVacio() {

    }


}
