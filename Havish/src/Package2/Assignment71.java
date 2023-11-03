package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment71 {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window ().maximize();
	      driver.get("https://www.facebook.com");
//driver.findElement(By.id("email")).sendKeys("pavani.dasari92@gmail.com");
//driver.findElement(By.id("pass")).sendKeys("Passwor@d1");
	      driver.findElement(By.name("email")).sendKeys("pavani.dasari92@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("Passwor@d1");
driver.findElement(By.name("login")).click();


	}

}
