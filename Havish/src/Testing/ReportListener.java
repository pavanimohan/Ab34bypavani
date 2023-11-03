package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListener.class) //it is the connection between between two classes
public class ReportListener  {
	WebDriver driver;
	@Test
	public void add()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement wb=driver.findElement(By.id("twotabsearchtextbox"));
	wb.sendKeys("Books");
	wb.sendKeys(Keys.ENTER);
	
		
		
		
		
		
	}

}
