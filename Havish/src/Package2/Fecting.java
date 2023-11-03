package Package2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//using robot class which is used to synchronization between mouse and keyboard the excel sheet values are fecting

public class Fecting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\Excelsheet\\PavaniSheet.xlsx");
         Workbook wb = WorkbookFactory.create(f1);
        Sheet s1=  wb.getSheet("Login");
		    Row r1 = s1.getRow(0);
		    Cell c1 = r1.getCell(0);
		    String p1 =c1.getStringCellValue();
		    System.out.println(p1);
	}

}
