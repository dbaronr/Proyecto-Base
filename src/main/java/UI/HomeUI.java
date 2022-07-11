package UI;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomeUI extends PageObject {
    public static final Target PERFIL = Target.the("nombre del usuario").located(By.xpath("/html/body/div/div[2]/div/div[1]/h2"));

}
