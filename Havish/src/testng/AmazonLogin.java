package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AmazonLogin {
	EdgeDriver driver;
	@BeforeMethod
	public void testcase1()
	{
		 driver=new EdgeDriver();
		 driver.get("https://www.amazon.in/"); 
		 driver.manage().window().maximize();
		WebElement login=driver.findElement(By.linkText("Sign in"));
		login.sendKeys(Keys.ENTER);
	
		//login.username();
	}
	@AfterMethod
	public void testcase2() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
