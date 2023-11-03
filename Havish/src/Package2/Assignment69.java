package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment69 {

	public static void main(String[] args) throws InterruptedException {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("India");
driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
Thread.sleep(3000);
driver.quit();
	}

}
