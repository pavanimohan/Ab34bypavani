package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Usa extends ScreenLaunchandQuit {
	@Test
	public void America()
	{
		WebElement searchfield =driver.findElement(By.name("q"));
		searchfield.sendKeys("USA");
		searchfield.sendKeys(Keys.ENTER);

	}

}
