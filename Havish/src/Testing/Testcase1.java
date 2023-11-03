package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Reporting.class)// we are creating connection between two class by this line it is a classname.class listener
public class Testcase1 {
	@Test
	public void scnerio1()
	{
			      EdgeDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	    WebElement wb=driver.findElement(By.name("q"));

		wb.sendKeys("India");
		wb.sendKeys(Keys.ENTER);
		
	}
	
}
