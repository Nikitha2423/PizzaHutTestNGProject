package Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class LibExcel{
	WebDriver driver;

	public static final String getURL()
	{
		
		String fPath = "D:\\SimplyLearnAssessments\\TestNGProject\\pizzaHut.xlsx";
		String sName = "PizzaHut";
		String url = null ;
		
	
		
		File file = new File(fPath);
		try {
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet(sName);
			
				Row ROW = sheet.getRow(0);
				Cell cellURL = ROW.getCell(0);
				
				String strURL = cellURL.getStringCellValue();
				url = strURL;
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return url;
			}
	}



