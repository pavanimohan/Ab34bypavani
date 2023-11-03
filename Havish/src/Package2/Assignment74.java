package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment74 {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
      driver.findElement( By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']")).click();

	}

}
