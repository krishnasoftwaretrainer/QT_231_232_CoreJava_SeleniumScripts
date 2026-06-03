package selenium_basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLess_Browsers {

	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver;
			//Head Less
			//ChromeOptions options=new ChromeOptions();
			//EdgeOptions options=new EdgeOptions();
			//FirefoxOptions options=new FirefoxOptions();
			
		//	options.addArguments("--headless");
			
			
			//driver=new ChromeDriver(options);
			//driver=new EdgeDriver(options);
			driver=new FirefoxDriver();
			
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.saucedemo.com/");
			//driver.get("https://www.selenium.dev/documentation/");
			
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

