package Ddttest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Ddt.ExcelSheet1;
import ddtSource.Login;

public class Testcase1 extends LaunchandQuit {
@Test
public void test1() throws EncryptedDocumentException, IOException
{
	Login l1=new Login(driver);

		ExcelSheet1 e1=new ExcelSheet1();
		e1.add();
	
		
	//Login l1=new Login(driver);
	//ExcelSheet1.add();

	l1.un();
	l1.conbutton();
	
	l1.pd();
	l1.sigin();
	
	
	
	
	}


}