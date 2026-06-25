package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_SwagLogin_AllTestData_ScenarioOutLine 
{
	@When("The user enters {string} and {string}")
	public void the_user_enters_and(String string, String string2) throws InterruptedException {
		WebElement username = Hooks.driver.findElement(By.id("user-name"));
		username.sendKeys(string);
		Thread.sleep(2000);
		WebElement password = Hooks.driver.findElement(By.id("password"));
		password.sendKeys(string2);
		Thread.sleep(2000);

	}

	@And("The clicks the login")
	public void the_clicks_the_login() throws InterruptedException {
		WebElement login = Hooks.driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(2000);
	}

	@Then("The user should see the actuval result")
	public void the_user_should_see_the_actuval_result() throws InterruptedException 
	{
		String currentUrl = Hooks.driver.getCurrentUrl();

		if (currentUrl.contains("inventory"))
		{
			WebElement product = Hooks.driver.findElement(By.xpath("//span[text()='Products']"));
			product.isDisplayed();
			Assert.assertEquals(product.getText(), "Products");
			Thread.sleep(2000);

			WebElement Threelines = Hooks.driver.findElement(By.id("react-burger-menu-btn"));
			Threelines.click();
			Thread.sleep(2000);
			WebElement logout = Hooks.driver.findElement(By.id("logout_sidebar_link"));
			logout.click();
			Thread.sleep(2000);
		} 
		else 
		{
			WebElement error = Hooks.driver.findElement(By.xpath("//h3[@data-test='error']"));
			Assert.assertTrue(error.getText().contains("Epic sadface:"));
			Thread.sleep(2000);

		}
	}
}
