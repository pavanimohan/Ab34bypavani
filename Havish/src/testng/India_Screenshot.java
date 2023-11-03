package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class India_Screenshot extends ScreenLaunchandQuit {
	@Test
	public void Screenshot1()
	{
		WebElement searchfield =driver.findElement(By.name("q"));
		searchfield.sendKeys("India");
		searchfield.sendKeys(Keys.ENTER);

	}

}
