package Ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelSheet1 {
	
	public static  String username;
	public static String password;
	public static String searchiteam;
	@Test
	public static void add() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs= new FileInputStream("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\Excelsheet\\PavaniSheet.xlsx");
		Workbook wb=WorkbookFactory.create(fs);//by using create method excelsheet is open
		//Sheet s=wb.getSheet("Login");//get sheet RT is sheet
		 username=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		 password=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		searchiteam=wb.getSheet("Login").getRow(1).getCell(2).getStringCellValue();
System.out.println(username);
System.out.println(password);
System.out.println(searchiteam);

		
	}	}

	


