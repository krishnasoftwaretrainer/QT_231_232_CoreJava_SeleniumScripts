package actionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragMe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/dragabble");
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		
		WebElement dragMe = driver.findElement(By.id("dragBox"));
		actions.dragAndDropBy(dragMe, 0, 50).build().perform(); //Up to Down
		Thread.sleep(2000);
		
		actions.dragAndDropBy(dragMe, 0, -90).build().perform(); //Down to Up
		Thread.sleep(2000);
		
		actions.dragAndDropBy(dragMe, 150, 0).build().perform(); //Left to Right
		Thread.sleep(2000);
		actions.dragAndDropBy(dragMe, -150, 0).build().perform(); //Right to Left
	
	}

}
