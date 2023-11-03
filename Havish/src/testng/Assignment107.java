package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class Assignment107 {
	@Test
	public void Numbertotextconverter() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs= new FileInputStream("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\Excelsheet\\PavaniSheet.xlsx");
		Workbook wb=WorkbookFactory.create(fs);//by using create method excelsheet is open
Sheet s =wb.getSheet("Login");
	String username=NumberToTextConverter.toText(s.getRow(2).getCell(0).getNumericCellValue());
	//String password=NumberToTextConverter.toText(s.getRow(2).getCell(1).getNumericCellValue());

	 System.out.println(username);
	 //System.out.println(password);
	}
}
