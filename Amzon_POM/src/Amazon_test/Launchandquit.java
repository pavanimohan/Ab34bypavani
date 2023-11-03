package Amazon_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class Launchandquit {
	@BeforeMethod()
	
	public void Launch()
	{	      WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]"));
	}


}
