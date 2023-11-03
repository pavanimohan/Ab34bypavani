package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Down_Key {

	public static void main(String[] args) {

		 EdgeDriver driver = new EdgeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		  WebElement d=driver.findElement(By.name("q"));
		  
		  d.sendKeys("India");
		  
		  d.sendKeys(Keys.ARROW_DOWN);
		  d.sendKeys(Keys.ARROW_DOWN);
		  d.sendKeys(Keys.ARROW_DOWN);
		  d.sendKeys(Keys.ARROW_DOWN);
		  d.sendKeys(Keys.ARROW_DOWN);
           d.sendKeys(Keys.ENTER);
	}

}
