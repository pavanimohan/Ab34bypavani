package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MultipleScreen_shot extends LaunchandQuit {
	@Test
	public void testcase1()
	{
	      //EdgeDriver driver = new EdgeDriver();
	      //driver.get("https://www.amazon.in/");
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	      driver.findElement( By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']")).click();

	}
	

}
