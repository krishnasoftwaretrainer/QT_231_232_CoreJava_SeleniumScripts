package dataDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagLabsLogin_ExcelData_DataDriven_PropertyFile 
{
	
	@DataProvider(name="SwagLoginAllTestData")
	public Object[][] SwagLoginTestData() throws IOException  
	{
		Read_SwagLabs_TestData_Excel_DataDriven readExcel=new Read_SwagLabs_TestData_Excel_DataDriven("C:\\Users\\HP\\eclipse-workspace_232Batch\\QT_231_232_MavenProject_SeleniumScripts\\src\\test\\resources\\SwagTestDataMavenProject.xlsx");
		
		int rowcount=readExcel.getRowCount(0);
		
		Object [][] swagLoginData=new Object[rowcount-1][2]; //7 rows and 2 columns
		
		
		for(int i=1;i<rowcount;i++)//1<8 2<8 3<8 4<8 5<8 6<8 7<8 8<8F
		{
			swagLoginData[i-1][0]=readExcel.getExcelData(0, i, 0); //0 0 1 0 2 0 
			swagLoginData[i-1][1]=readExcel.getExcelData(0, i, 1); //0 1 1 1 2 1
		}
		
		
		
		/*
		 This Script Reads the Header of Excel Sheet
		Object [][] swagLoginData=new Object[rowcount][2]; //7 rows and 2 columns
		
		
		for(int i=0;i<rowcount;i++)//0<8 1<8 2<8 3<8 4<8 5<8 6<8 7<8 8<8F
		{
			swagLoginData[i][0]=readExcel.getExcelData(0, i, 0); //0 0 1 0 2 0 
			swagLoginData[i][1]=readExcel.getExcelData(0, i, 1); //0 1 1 1 2 1
		}  */
		return swagLoginData;
		
	}
	

	WebDriver driver;
	Utilty_SwagLocaters_DataDriven_Read readProp=new Utilty_SwagLocaters_DataDriven_Read();
	
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException, IOException
	{
		readProp.ConfigReader();
		 driver=new EdgeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get(readProp.getProperty("SwagURL"));
		 Thread.sleep(2000);
	}
	
	@Test(dataProvider="SwagLoginAllTestData")
	public void SwagLabsLoginTest(String username,String password) throws InterruptedException, IOException
	{
		readProp.ConfigReader();
		  WebElement usernameL=driver.findElement(By.id(readProp.getProperty("UserName_Locater")));
		 usernameL.sendKeys(username);
		 Thread.sleep(2000);
		 
		 WebElement passwordL=driver.findElement(By.id(readProp.getProperty("Password_Locater")));
		 passwordL.sendKeys(password);
		 Thread.sleep(2000);
		 
		 WebElement loginL=driver.findElement(By.xpath(readProp.getProperty("LoginButton_Locater")));
		 loginL.click();
		 Thread.sleep(2000);
		 
	}
	
	@AfterMethod
	public void BrowserTearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}


	}
}
