package co.com.tcs.certification.avianca.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/way2automation.feature",
        glue = "co.com.tcs.certification.avianca.stepdefinitions",
        tags = "@Sc1",
        snippets = SnippetType.CAMELCASE
)
public class ValidateSubmitMessage {
}
