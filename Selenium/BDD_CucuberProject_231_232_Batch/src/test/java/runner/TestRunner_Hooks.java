package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		//features = "src/test/resources/Features/SwagInvalidLogin.feature",
		//features = "src/test/resources/Features",
		features = "src/test/resources/Features/Hooks_SwagLogin_ScenarioOutLine.feature",
		glue = {"stepdefinitions","hooks"},
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		monochrome = true
)
public class TestRunner_Hooks 
{

}
