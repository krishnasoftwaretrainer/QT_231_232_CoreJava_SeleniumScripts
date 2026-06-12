package excelOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_SingleCell {

	public static void main(String[] args) throws IOException
	{
	
		File fileaddress = new File("D:\\QT\\Selenium 231 & 232 Batch\\ExcelData\\WriteDataSingleCell.xlsx");
		FileOutputStream outputstream = new FileOutputStream(fileaddress);
				
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet Sheet1=workbook.createSheet("Single Cell Data");
		
		XSSFRow row1=Sheet1.createRow(10); //Row 3 Index:0 1 2
		
		XSSFCell cell1=row1.createCell(10);  //Column D Index:A B C D
		
		cell1.setCellValue("Krishna");  //Writing data into the cell
		
		System.out.println("Data Entered Successfully");
		
		workbook.write(outputstream);
		
		workbook.close();
	
	
	}

}
