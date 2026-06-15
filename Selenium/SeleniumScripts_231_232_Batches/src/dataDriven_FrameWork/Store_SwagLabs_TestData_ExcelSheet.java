package dataDriven_FrameWork;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Store_SwagLabs_TestData_ExcelSheet {

	public static void main(String[] args) throws IOException {
		File fileaddress = new File("D:\\QT\\Selenium 231 & 232 Batch\\ExcelData\\SwagAllTestData_Excel.xlsx");
		FileOutputStream outputstream = new FileOutputStream(fileaddress);
				
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet Sheet1=workbook.createSheet("SwagLoginData");
		
		XSSFRow row0=Sheet1.createRow(0); //Row 5
		
		//Header Row [Column Names: UserName, Password]
		row0.createCell(0).setCellValue("UserName");
		row0.createCell(1).setCellValue("Password");
		
		XSSFRow row1=Sheet1.createRow(1); //Row 6
		
		//Test Data Row 1 [Valid UserName and Valid Password]
		row1.createCell(0).setCellValue("standard_user");
		row1.createCell(1).setCellValue("secret_sauce");
		
		//Test Data Row 2 [Valid UserName and Invalid Password]
		XSSFRow row2=Sheet1.createRow(2); //Row 7
		row2.createCell(0).setCellValue("standard_user");
		row2.createCell(1).setCellValue("invalidpassword");
		
		//Test Data Row 3 [Invalid UserName and Valid Password]
		XSSFRow row3=Sheet1.createRow(3); //Row 8
		row3.createCell(0).setCellValue("invalidusername");
		row3.createCell(1).setCellValue("secret_sauce");
		
		//Test Data Row 4 [Valid UserName and Blank Password]
		XSSFRow row4=Sheet1.createRow(4); //Row 9
		row4.createCell(0).setCellValue("standard_user");
		row4.createCell(1).setCellValue("");
		
		//Test Data Row 5 [Blank UserName and Valid Password]
		XSSFRow row5=Sheet1.createRow(5); //Row 9
		row5.createCell(0).setCellValue("");
		row5.createCell(1).setCellValue("secret_sauce");
		
		//Test Data Row 6 [Blank UserName and Blank Password]
		XSSFRow row6=Sheet1.createRow(6); //Row 9
		row6.createCell(0).setCellValue("");
		row6.createCell(1).setCellValue("");
		
		//Test Data Row 7 [Invalid UserName and Invalid Password]
		XSSFRow row7=Sheet1.createRow(7); //Row 9
		row7.createCell(0).setCellValue("invalidusername");
		row7.createCell(1).setCellValue("invalidpassword");
		
		
		System.out.println("Data Entered Successfully");
		
		workbook.write(outputstream);
		
		workbook.close();

	}

}
