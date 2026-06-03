package selenium_basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_getText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		WebElement FirstName=driver.findElement(By.tagName("input"));
		FirstName.sendKeys("Krishna");
		Thread.sleep(2000);
		
		String text1=FirstName.getAttribute("value");
		System.out.println("Old Text is: "+text1);
		Thread.sleep(2000);
		
		FirstName.clear();
		Thread.sleep(2000);
		
		FirstName.sendKeys("Suresh");
		
		String text2=FirstName.getAttribute("value");
		System.out.println("New Text is: "+text2);
		*/
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		WebElement error=driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
		String errortext=error.getText();
		System.out.println("Error Text is: "+errortext);
	}

}
