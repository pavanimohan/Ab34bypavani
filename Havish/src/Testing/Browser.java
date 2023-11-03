package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//lauch different types of browser using webdriver search something in google
public class Browser {
static WebDriver driver;
	public static void main(String[] args) {
		
driver= new EdgeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
WebElement wb=driver.findElement(By.name("q"));
wb.sendKeys("India");
wb.click();
	
	
	}

}
