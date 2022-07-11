package question;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UI.HomeUI.*;
import static java.lang.Thread.sleep;


public class LoginQuestion implements Question {
    private final String nombrePerfil;

    public LoginQuestion(String NOMBREPERFIL) {
        this.nombrePerfil = NOMBREPERFIL;
    }

    @Override
    public Object answeredBy(Actor actor) {

        if (Text.of(PERFIL).viewedBy(actor).asString().equals(nombrePerfil.toString()))
            return true;
        else
            System.out.println("Datos incorrecta");
        return false;
    }

    public static LoginQuestion ValidaTexto (String nombrePerfil ){
        return new LoginQuestion(nombrePerfil);

    }
}
