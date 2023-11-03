package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Countyclass {

	public static void main(String[] args) throws InterruptedException {
      
		 EdgeDriver driver = new EdgeDriver();
		
		 driver.get("https://www.google.com");
		
		 //driver.manage().window().maximize(); //this is used to minimize and maximize the screen
		 
		 Thread.sleep(3000);  //with parameter time in millseconds threated will work as a class
		
		 driver.findElement(By.id("APjFqb")).sendKeys("India");
	}
}
