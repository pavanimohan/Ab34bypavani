package DataSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Project_data {
	
	public static String username;
	public static String password;

@Test
public
		
	static void data() throws IOException  
	{
	FileInputStream fs= new FileInputStream("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\Excelsheet\\PavaniSheet.xlsx");
		Workbook wb=WorkbookFactory.create(fs);//by using create method excelsheet is open
		Sheet s=wb.getSheet("Login");//get sheet RT is sheet
		String username=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();

		String password=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(password);

	}

}
