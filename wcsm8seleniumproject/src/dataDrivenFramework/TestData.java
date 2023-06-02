package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData {
	
	public static void main(String[] args)throws EncryptedDocumentException, IOException  {

		
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");// To set the path of fileExecutable file
		
		Workbook wb = WorkbookFactory.create(fis); // to create the class 
		
		Sheet sheet = wb.getSheet("IPL");  // TO GET the sheet data 
		
		Row row = sheet.getRow(2);   // to get the row data
		
	    Cell cell = row.getCell(1); //to get the cell data(column)
	    
	    String data = cell.getStringCellValue();  // to take the data from the excel sheet 
	    
	    System.out.println(data);  // to retrive the data from data base or print y
}
}





