package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.opencart.com/index.php?route=account/login") //URL de la pagina WEB

//Clase UI DEL LOGIN
public class LoginUI extends PageObject {

    public static final Target CAJA_USUARIO = Target.the("Caja de texto para el nombre de usuario").located(By.id("input-email"));
    public static final Target CAJA_CLAVE = Target.the("Caja de texto para el la clave de usuario").located(By.id("input-password"));
    public static final Target BOTON_INGRESO = Target.the("Boton para el ingreso al portal").located(By.xpath("//body/div[@id='account-login']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]"));

}
