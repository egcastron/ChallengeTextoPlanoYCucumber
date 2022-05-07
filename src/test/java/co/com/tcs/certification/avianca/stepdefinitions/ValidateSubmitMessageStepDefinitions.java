package co.com.tcs.certification.avianca.stepdefinitions;

import co.com.tcs.certification.avianca.questions.MessageSubmit;
import co.com.tcs.certification.avianca.tasks.FormInformation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ValidateSubmitMessageStepDefinitions {

    @Managed
    private WebDriver theBrowser;
    public ChromeOptions options = new ChromeOptions();
    public DesiredCapabilities caps= new DesiredCapabilities();

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(theBrowser)));
        OnStage.theActorCalled("user");
        options.addArguments("--start-maximized");
    }

    @Given("^the user is on the main page$")
    public void theUserIsOnTheMainPage(){
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.way2automation.com/way2auto_jquery/index.php"));
    }

    @When("^the user fill the form with random associate info$")
    public void theUserFillTheFormWithRandomAssociateInfo(){
        OnStage.theActorInTheSpotlight().attemptsTo(FormInformation.info());
    }

    @Then("^the user will see the message (.*)$")
    public void theUserWillSeeTheMessage(String message){
//        Assert.assertEquals(message, MessageSubmit.msg());     //investigar cómo hacer uso de assertEquals
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageSubmit.msg(), Matchers.containsString(message)));
    }


}
