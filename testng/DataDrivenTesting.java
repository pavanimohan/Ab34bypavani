package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DataDrivenTesting {
public static void main(String[]args) throws EncryptedDocumentException, IOException
 {
	
FileInputStream fs= new FileInputStream("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\Excelsheet\\PavaniSheet.xlsx");
Workbook wb=WorkbookFactory.create(fs);//by using create method excelsheet is open
//number to text convert is used to convert numeric values into string values
//if u dont use we will get illegalstate exception will occur
//String username=NumberToTextConverter.toText(wb.getSheet("Login").getRow(3).getCell(0).getNumericCellValue());

//with help of getsheetmethod pass the parameter as name of the sheet
Sheet s=wb.getSheet("Login");//get sheet RT is sheet
/*//getrow method RT is Row it is used to get the inder value which one we have entered
Row r=s.getRow(2);
//getcell Rt is cell used to fetch the paretical cbox value or data
Cell c=r.getCell(0);
//getstring value is used to get the particular cell value
String username=c.getStringCellValue();
System.out.println(username);*/
//all the above steps are done in single line
String password=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
System.out.println(password);
 //System.out.println(username);
 }


}
