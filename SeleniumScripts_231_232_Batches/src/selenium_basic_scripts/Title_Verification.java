package selenium_basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Verification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.get("https://www.saucedemo.com/");
		driver.get("https://www.selenium.dev/documentation/");
		
		String ExceptedTitle="Swag Labs";
		String ActuvalTitle=driver.getTitle();
		
		System.out.println("ActuvalTitle: "+ActuvalTitle);
		
		if(ExceptedTitle.equalsIgnoreCase(ActuvalTitle))
		{
			System.out.println("Title Verification: Pass");
			
		}
		else
		{
			System.out.println("Title Verification: Fail");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
