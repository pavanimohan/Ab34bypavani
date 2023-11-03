package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {

	public static void main(String[] args) {
	    ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		 WebElement googlesearchtextfield =driver.findElement(By.name("q"));
		 googlesearchtextfield.sendKeys("India");
		 googlesearchtextfield.sendKeys(Keys.ENTER);

	
	}

}
