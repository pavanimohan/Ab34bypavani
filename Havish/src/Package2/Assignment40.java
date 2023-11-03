package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment40 {

	public static void main(String[] args) {
	    ChromeDriver driver = new  ChromeDriver();
	    driver.manage().window ().maximize();
       driver.get("https://www.google.com/");
       //driver.findElement(By.partialLinkText("Images")).click();
       
		 WebElement textarea = driver.findElement(By.id("APjFqb"));
		 textarea.sendKeys("India");
		 textarea.sendKeys(Keys.ENTER);
		 WebElement arrow =driver.findElement(By.xpath("//a[@class='LatpMc nPDzT T3FoJb'][3]/div/span[@jsname='pIvPIe']"));
		 arrow.click();

	}

}
