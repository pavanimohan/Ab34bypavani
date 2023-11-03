package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		   //driver.findElement(By.name("Mobiles")).click();
     driver.findElement(By.partialLinkText("Sellers")).click();

	}

}
