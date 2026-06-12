package excelOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WroteData_MultipleRowsCells {

	public static void main(String[] args) throws IOException {
		File fileaddress = new File("D:\\QT\\Selenium 231 & 232 Batch\\ExcelData\\WriteDataMultipleRowsCells.xlsx");
		FileOutputStream outputstream = new FileOutputStream(fileaddress);
				
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet Sheet1=workbook.createSheet("Multiple Rows Cells Data");
		
		XSSFRow row0=Sheet1.createRow(0); //Row 5
		
		row0.createCell(0).setCellValue("Name");
		row0.createCell(1).setCellValue("Course");
		row0.createCell(2).setCellValue("Batch");
		row0.createCell(3).setCellValue("Address");
		row0.createCell(4).setCellValue("Fee");
		
		XSSFRow row1=Sheet1.createRow(1); //Row 6
		
		row1.createCell(0).setCellValue("Krishna");
		row1.createCell(1).setCellValue("Selenium");
		row1.createCell(2).setCellValue("231 Batch");
		row1.createCell(3).setCellValue("Ameerpet");
		row1.createCell(4).setCellValue(45000);
		
		XSSFRow row2=Sheet1.createRow(2); //Row 7
		row2.createCell(0).setCellValue("Rohit");
		row2.createCell(1).setCellValue("Playwright");
		row2.createCell(2).setCellValue("232 Batch");
		row2.createCell(3).setCellValue("Madhapur");
		row2.createCell(4).setCellValue(45000);
		
		XSSFRow row3=Sheet1.createRow(3); //Row 8
		row3.createCell(0).setCellValue("Suresh");
		row3.createCell(1).setCellValue("API Testing");
		row3.createCell(2).setCellValue("231 Batch");
		row3.createCell(3).setCellValue("Kukatpally");
		row3.createCell(4).setCellValue(45000);
		
		XSSFRow row4=Sheet1.createRow(4); //Row 9
		row4.createCell(0).setCellValue("Ramesh");
		row4.createCell(1).setCellValue("Manual Testing");
		row4.createCell(2).setCellValue("232 Batch");
		row4.createCell(3).setCellValue("Gachibowli");
		row4.createCell(4).setCellValue(45000);
		
		//Sheet2 
		XSSFSheet Sheet2=workbook.createSheet("New Sheet Data");
		
		XSSFRow row00=Sheet2.createRow(0); //Row 5
		
		row00.createCell(0).setCellValue("Name");
		row00.createCell(1).setCellValue("Course");
		row00.createCell(2).setCellValue("Batch");
		row00.createCell(3).setCellValue("Address");
		row00.createCell(4).setCellValue("Fee");
		
		XSSFRow row11=Sheet2.createRow(1); //Row 6
		
		row11.createCell(0).setCellValue("Krishna");
		row11.createCell(1).setCellValue("Selenium");
		row11.createCell(2).setCellValue("231 Batch");
		row11.createCell(3).setCellValue("Ameerpet");
		row11.createCell(4).setCellValue(45000);
		
		XSSFRow row22=Sheet2.createRow(2); //Row 7
		row22.createCell(0).setCellValue("Rohit");
		row22.createCell(1).setCellValue("Playwright");
		row22.createCell(2).setCellValue("232 Batch");
		row22.createCell(3).setCellValue("Madhapur");
		row22.createCell(4).setCellValue(45000);
		
		XSSFRow row33=Sheet2.createRow(3); //Row 8
		row33.createCell(0).setCellValue("Suresh");
		row33.createCell(1).setCellValue("API Testing");
		row33.createCell(2).setCellValue("231 Batch");
		row33.createCell(3).setCellValue("Kukatpally");
		row33.createCell(4).setCellValue(45000);
		
		XSSFRow row44=Sheet2.createRow(4); //Row 9
		row44.createCell(0).setCellValue("Ramesh");
		row44.createCell(1).setCellValue("Manual Testing");
		row44.createCell(2).setCellValue("232 Batch");
		row44.createCell(3).setCellValue("Gachibowli");
		row44.createCell(4).setCellValue(45000);
		
		
		System.out.println("Data Entered Successfully");
		
		workbook.write(outputstream);
		
		workbook.close();

	}

}
