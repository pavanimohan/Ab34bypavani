package Ddttest;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class LaunchandQuit {
	WebDriver driver;
	@BeforeMethod
	public void launch()
	{
 driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
WebElement sigin=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
sigin.click();
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
		
	}

}
