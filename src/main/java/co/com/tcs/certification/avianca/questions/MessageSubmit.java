package co.com.tcs.certification.avianca.questions;

import co.com.tcs.certification.avianca.userinterfaces.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MessageSubmit implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FormPage.P_MESSAGE).viewedBy(actor).asString();
    }

    public static MessageSubmit msg(){
        return new MessageSubmit();
    }
}
