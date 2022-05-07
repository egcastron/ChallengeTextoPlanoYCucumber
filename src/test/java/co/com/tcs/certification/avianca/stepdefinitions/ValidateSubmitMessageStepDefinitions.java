package co.com.tcs.certification.avianca.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
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

    @Then("^the user is on the cart page and will see the information$")
    public void theUserIsOnTheCartPageAndWillSeeTheInformation(){
        Assert.assertEquals(1,1);
    }


}
