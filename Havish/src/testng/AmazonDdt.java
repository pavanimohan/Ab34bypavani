package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonDdt extends AmazonLogin{
@Test
public void username() throws EncryptedDocumentException, IOException, InterruptedException

{
//FileInputStream fs= new FileInputStream("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\Excelsheet\\PavaniSheet.xlsx");
	//Workbook wb=WorkbookFactory.create(fs);
	//driver.findElement(By.id("ap_email")).sendKeys(Keys.ENTER);
 //String username=wb.getSheet("Login").getRow(4).getCell(0).getStringCellValue();
//System.out.println(username);
//WebElement user=driver.findElement(By.id("ap_email"));
//user.sendKeys(Keys.ENTER);

FileInputStream fs= new FileInputStream("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\Excelsheet\\PavaniSheet.xlsx");
Workbook wb=WorkbookFactory.create(fs);
String username=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
String password=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
System.out.println(username);
System.out.println(password);
WebElement w1=	driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
Actions a1=new Actions(driver);
a1.moveToElement(w1).perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[.='Sign in']")).click();
driver.findElement(By.id("ap_email")).sendKeys(username);
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys(password);
driver.findElement(By.id("signInSubmit")).click();


}

}
