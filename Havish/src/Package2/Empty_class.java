package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Empty_class {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("India");
driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

	}

}
