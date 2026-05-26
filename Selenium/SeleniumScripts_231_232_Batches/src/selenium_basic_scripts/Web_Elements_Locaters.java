package selenium_basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements_Locaters 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//1.Text Box:Webelement Locater:ID 
		WebElement FirstName=driver.findElement(By.tagName("input"));
		FirstName.sendKeys("Krishna");
		Thread.sleep(2000);
		
		WebElement LastName=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		LastName.sendKeys("Rao");
		
		
		
		//FirstName.clear();
		//Thread.sleep(2000);
		//FirstName.sendKeys("Ramesh");
		
		/*
		driver.findElement(By.tagName("input")).sendKeys("Krishna");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(2000);		
		driver.findElement(By.tagName("input")).sendKeys("Ramesh");
		*/
		
	}

}
