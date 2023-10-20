package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class NullPointerEception {
	@Test
	public void Exception() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs= new FileInputStream("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\Excelsheet\\PavaniSheet.xlsx");
		Workbook wb=WorkbookFactory.create(fs);//by using create method excelsheet is open
		String username=wb.getSheet("Login").getRow(4).getCell(5).getStringCellValue();

		String password=wb.getSheet("Login").getRow(4).getCell(5).getStringCellValue();
		 System.out.println(username);
		 System.out.println(password);

	}

}
