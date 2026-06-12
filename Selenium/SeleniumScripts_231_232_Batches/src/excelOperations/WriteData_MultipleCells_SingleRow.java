package excelOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_MultipleCells_SingleRow {

	public static void main(String[] args) throws IOException {
		File fileaddress = new File("D:\\QT\\Selenium 231 & 232 Batch\\ExcelData\\WriteDataMiltipleCellsSingleRow.xlsx");
		FileOutputStream outputstream = new FileOutputStream(fileaddress);
				
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet Sheet1=workbook.createSheet("Multiple Cells Data");
		
		XSSFRow row5=Sheet1.createRow(0); //Row 5
		
		row5.createCell(0).setCellValue("Manual");
		row5.createCell(1).setCellValue("Automation");
		row5.createCell(2).setCellValue("API");
		row5.createCell(3).setCellValue("Selenium");
		row5.createCell(4).setCellValue("Playwright");	
		
		
		System.out.println("Data Entered Successfully");
		
		workbook.write(outputstream);
		
		workbook.close();
	

	}

}
