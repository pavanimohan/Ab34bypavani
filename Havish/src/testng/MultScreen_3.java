package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MultScreen_3 extends LaunchandQuit {
	@Test
	public void testcase3()
	{	     // EdgeDriver driver = new EdgeDriver();
   // driver.manage().window().maximize();
//driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
driver.findElement( By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']")).click();

		
	}

}
