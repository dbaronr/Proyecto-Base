package runner;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        /*
         * Clase Runner donde se indican los features a ejecutar
         */


        plugin = {"pretty"},
        //En esta parte indicar que feauture vamos a ejecutar
        features = "src/test/resources/features/Login_OpenCart.feature",
        glue= "steps",
        tags= "@CASO1"

)

public class LoginRunner {
}
