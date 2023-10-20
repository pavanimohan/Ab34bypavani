package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Screen_shot
{


	@Test
	public void testcase1() throws IOException
	{
	 EdgeDriver driver = new EdgeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
WebElement t1 =driver.findElement(By.name("q"));
t1.sendKeys("India");
t1.sendKeys(Keys.ENTER);
//step1 upcasting the driver to take screenshot
           TakesScreenshot ts = driver;
   //step2 using getscreenshot method screenshot is taken from the source
           File source =ts.getScreenshotAs(OutputType.FILE);
    //step3 create an object of file and pass the parameter of screenshot is present in the location
File destination=new File("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\scrrenshots\\pavani"+Math.random()+".png");
//step4 fileutils use a method called copyfiles to copy file from source to destination 
          FileUtils.copyFile(source,destination);
           
           
           
           
           
}
}