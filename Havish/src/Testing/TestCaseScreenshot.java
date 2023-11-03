package Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ReportingScreenshot.class)
public class TestCaseScreenshot {
	EdgeDriver driver;
	@Test
	public void passtestcase() throws IOException
	{
		driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	    WebElement wb=driver.findElement(By.name("q"));

		wb.sendKeys("India");
		wb.sendKeys(Keys.ENTER);
        TakesScreenshot ts = driver;
        File source =ts.getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\scrrenshots\\pavani"+Math.random()+".png");
        FileUtils.copyFile(source,destination);

	}
	@Test(timeOut=1000)
	public void failtestcase() throws IOException
	{
		driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	    WebElement wb=driver.findElement(By.name("q"));

		wb.sendKeys("USA");
		wb.sendKeys(Keys.ENTER);
        TakesScreenshot ts = driver;
        File source =ts.getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\Screenshotfailes\\siva"+Math.random()+".png");
        FileUtils.copyFile(source,destination);


		
	}

}
