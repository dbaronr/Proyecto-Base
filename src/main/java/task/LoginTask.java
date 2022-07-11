package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static UI.LoginUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private final String usuario;
    private final String clave;

    public LoginTask(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(CAJA_USUARIO));
        actor.attemptsTo(Enter.theValue(clave).into(CAJA_CLAVE));
        actor.attemptsTo(Click.on(BOTON_INGRESO));
    }
    public static Performable inicioSesio(String usuario , String clave){
        return instrumented(LoginTask.class,usuario,clave);
    }

}
