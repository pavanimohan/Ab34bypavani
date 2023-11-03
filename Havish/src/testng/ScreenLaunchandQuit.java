package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ScreenLaunchandQuit {
	EdgeDriver driver;
	@BeforeMethod
	public void Launch()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchfield =driver.findElement(By.name("q"));
		
	}
	@AfterMethod
	public void Quit() throws IOException
	{
        TakesScreenshot ts = driver;
        File source =ts.getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\admin\\Desktop\\eclipse work\\Havish\\scrrenshots\\pavani"+Math.random()+".png");
        FileUtils.copyFile(source,destination);
        driver.quit();

	}

}
