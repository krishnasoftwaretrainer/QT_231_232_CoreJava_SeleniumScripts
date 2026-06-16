package sampleSeleniumScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TittleVerification_TestNG 
{
	@Test
	public void tittleVerification()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String expectedTittle="Swag Labs";
	String actualTittle=driver.getTitle();
	
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(actualTittle, expectedTittle, "Tittle is incorrect");
	
	//Assert.assertEquals(actualTittle, expectedTittle, "Tittle is incorrect");
	
	/*
	if(expectedTittle.equals(actualTittle))
	{
		System.out.println("Tittle is correct");
	}
	else
	{
		System.out.println("Tittle is incorrect");
	
	} */
	driver.quit();
	soft.assertAll();
	}

}
