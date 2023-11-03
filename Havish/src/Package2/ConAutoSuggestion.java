package Package2;
//video43

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ConAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
WebElement searchfield =driver.findElement(By.name("q"));
searchfield.sendKeys("India");
Thread.sleep(2000);


	}

}
