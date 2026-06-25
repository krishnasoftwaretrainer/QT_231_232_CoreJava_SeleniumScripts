package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		//features = "src/test/resources/Features/SwagInvalidLogin.feature",
		features = "src/test/resources/Features/SwagLoginAllTestData_ScenarioOutLine.feature",
		glue = "stepdefinitions",
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		monochrome = true
)
public class TestRunner_TestNG extends AbstractTestNGCucumberTests
{

}
