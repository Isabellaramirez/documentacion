package co.com.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CamposSauce {

    public static Target INPUT_username = Target.the("username").located(By.xpath("//*[@id=\"user-name\"]"));
    public static Target INPUT_password = Target.the("password").located(By.xpath("//*[@id=\"password\"]"));
    public static Target BTN_login = Target.the("login").located(By.xpath("//*[@id=\"login-button\"]"));
    public static Target BTN_product = Target.the("product").located(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
    public static Target BTN_addToCart = Target.the("add to cart").located(By.xpath("//*[@id=\"add-to-cart\"]"));
    public static Target BTN_cart = Target.the("cart").located(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
    public static Target BTN_remove = Target.the("remove").located(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
    public static Target BTN_continue = Target.the("continue").located(By.xpath("//*[@id=\"continue-shopping\"]"));
    public static Target BTN_filter = Target.the("filter a-z").located(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));

}
