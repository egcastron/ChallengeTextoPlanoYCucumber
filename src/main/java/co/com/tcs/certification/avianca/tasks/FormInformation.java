package co.com.tcs.certification.avianca.tasks;

import co.com.tcs.certification.avianca.userinterfaces.FormPage;
import co.com.tcs.certification.avianca.utils.MainReto1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Random;

public class FormInformation implements Task {

    MainReto1 reto = new MainReto1();
    int numAsociados = reto.contadorFilas(reto.lectura());
    String[] asociados = reto.arregloAsociados(reto.lectura());

    Random rand = new Random();
    int intRamdom = rand.nextInt(5);
    String[] asociadoSeleccionado = reto.infoAsociado(asociados[intRamdom]);

    String nombre = asociadoSeleccionado[0]+" "+asociadoSeleccionado[1]+" "+asociadoSeleccionado[2]+" "+asociadoSeleccionado[3];
    String telefono = asociadoSeleccionado[4];
    String email = asociadoSeleccionado[0]+"@"+asociadoSeleccionado[2]+".com";
    String username = reto.inicialesNombres(asociadoSeleccionado[0])+reto.inicialesNombres(asociadoSeleccionado[1])+reto.inicialesNombres(asociadoSeleccionado[2])+reto.inicialesNombres(asociadoSeleccionado[3]);



    @Override
    public <T extends Actor> void performAs(T t) {

        t.attemptsTo(
                Enter.theValue(nombre).into(FormPage.INPUT_NAME),
                Enter.theValue(telefono).into(FormPage.INPUT_PHONE),
                Enter.theValue(email).into(FormPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("Colombia").from(FormPage.SELECT_COUNTRY),
                Enter.theValue("Bogota").into(FormPage.INPUT_CITY),
                Enter.theValue(username).into(FormPage.INPUT_USERNAME),
                Enter.theValue("Pass123").into(FormPage.INPUT_PASSWORD),
                Click.on(FormPage.BTN_SUBMIT)
        );
    }

    public static FormInformation info() {
        return Tasks.instrumented(FormInformation.class);
    }
}
