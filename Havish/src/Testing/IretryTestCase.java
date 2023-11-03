package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
//iretry analyzer is a interface in nature
//it is used to run the retry any testcases multiple times in acse of any failure
public class IretryTestCase {
	@Test(retryAnalyzer=Testing.ConIRetry.class)
	public void login()
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.in/");
		driver.manage().window().maximize();
		//WebElement wb=driver.findElement(By.id("twotabsearchtextbox"));
		//wb.sendKeys("shoes");
		WebElement wb=driver.findElement(By.name("manish"));
		wb.sendKeys("manish");
		wb.sendKeys(Keys.ENTER);
	}

}//note:retry analyzer is used to fectch the failed testcases again and again by using
//iretryanalyzer.
