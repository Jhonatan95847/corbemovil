package starter;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.TheValue;
import starter.stepdefinitions.Wait;

import static starter.LoginPage.*;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.withDuration(20),
                Click.on(BUTTON_INGRESAR),
                Wait.withDuration(20),
                SendKeys.of("9011493881").into(TEXTBOX_ID),
                Click.on(CHECKBOX_AUTORIZATION),
                Click.on(BUTTON_INGRESARAPP),
                Wait.withDuration(10),
                SendKeys.of("1").into(TEXTBOX_PASSUNO),
                SendKeys.of("2").into(TEXTBOX_PASSDOS),
                SendKeys.of("3").into(TEXTBOX_PASSTRE),
                SendKeys.of("4").into(TEXTBOX_PASSCUA)
        );
    }

    //public static Login login(){return Tasks.instrumented(Login.class);
    //}
}
