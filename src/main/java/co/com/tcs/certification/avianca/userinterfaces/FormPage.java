package co.com.tcs.certification.avianca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {

    public static final Target INPUT_NAME = Target.the("input name").located(By.xpath("//input[@name='name']"));
    public static final Target INPUT_PHONE = Target.the("input phone").located(By.xpath("//input[@name='phone']"));
    public static final Target INPUT_EMAIL = Target.the("input email").located(By.xpath("//input[@name='email']"));
    public static final Target SELECT_COUNTRY = Target.the("input country").located(By.xpath("//select[@name='country']"));
    public static final Target INPUT_CITY = Target.the("input city").located(By.xpath("//input[@name='city']"));
    public static final Target INPUT_USERNAME = Target.the("input username").located(By.xpath("(//input[@name='username'])[2]"));
    public static final Target INPUT_PASSWORD = Target.the("input password").located(By.xpath("(//input[@name='password'])[2]"));
    public static final Target BTN_SUBMIT = Target.the("btn submit").located(By.xpath("(//input[@class='button'])[2]"));
    public static final Target P_MESSAGE = Target.the("p message").located(By.xpath("//*[@id='alert']"));

}
