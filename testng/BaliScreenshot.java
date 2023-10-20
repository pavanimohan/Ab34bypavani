package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BaliScreenshot extends ScreenLaunchandQuit {
	@Test
	public void Screenshot3()
	{
		WebElement searchfield =driver.findElement(By.name("q"));
		searchfield.sendKeys("Bali");
		searchfield.sendKeys(Keys.ENTER);

	}

}
