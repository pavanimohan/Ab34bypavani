package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment41 {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("litb-canvas-click-wrapper")).sendKeys(Keys.ENTER);
        WebElement firstBookLink = driver.findElement(By.id("litb-canvas-click-wrapper"));
        firstBookLink.click();
      //driver.findElement(By.xpath("//span[contains(text(),' For Personal Growth & Wealth (Set of 4 ')]")).click();


	}

}
