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
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//1.Text Box:Webelement Locater:ID 
		//1.First Name
		WebElement FirstName=driver.findElement(By.tagName("input"));
		FirstName.sendKeys("Krishna");
		//Thread.sleep(2000);
		
		//2.Last Name
		WebElement LastName=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		LastName.sendKeys("Rao");
		//Thread.sleep(2000);
		
		//3.Address
		WebElement Address=driver.findElement(By.tagName("textarea"));
		Address.sendKeys("Quality Thought,\nAmmerpet,\nHyderabad");
		//Thread.sleep(2000);
		
		//4.Email
		WebElement Email=driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
		Email.sendKeys("krishna123@gmail.com");
		//Thread.sleep(2000);
		
		//5.Phone
		WebElement Phone=driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]"));
		Phone.sendKeys("12344567890");
		//Thread.sleep(2000);
		
		//isDisplayed(),isEnabled() and isSelected()
		
		//6.Radio Button[Male]
		WebElement RadioMale=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		
		if(RadioMale.isDisplayed() && RadioMale.isEnabled() && !RadioMale.isSelected())
		{
		RadioMale.click();
		Thread.sleep(2000);
		}
		else
		{
		RadioMale.click();
		System.out.println("Male Clicked");
		}
		//7.Radio Button[Female]
	//	WebElement RadioFemale=driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		//RadioFemale.click();
		
		//8.Check Box[Cricket]
		WebElement CheckBoxCricket=driver.findElement(By.id("checkbox1"));
		
		//CheckBoxCricket.click();
		//Thread.sleep(2000);
		
		if(CheckBoxCricket.isDisplayed() && CheckBoxCricket.isEnabled() && !CheckBoxCricket.isSelected())
		{
			CheckBoxCricket.click();
			Thread.sleep(2000);
		}
		
		WebElement CheckBoxMovies=driver.findElement(By.id("checkbox2"));
		if(CheckBoxMovies.isDisplayed() && CheckBoxMovies.isEnabled() && !CheckBoxMovies.isSelected())
		{
			CheckBoxMovies.click();
			Thread.sleep(2000);
		}
		
		WebElement CheckBoxHockey=driver.findElement(By.id("checkbox3"));
		if(CheckBoxHockey.isDisplayed() && CheckBoxHockey.isEnabled() && !CheckBoxHockey.isSelected())
		{
			CheckBoxHockey.click();
			Thread.sleep(2000);
		}
		
		
		
		
		
		
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
