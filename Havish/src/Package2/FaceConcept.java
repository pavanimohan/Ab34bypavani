package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceConcept {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window ().maximize();
    driver.findElement(By.id("email")).sendKeys("pavani.dasari92@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("Passwor@d1");
    
    driver.findElement(By.name("login")).click();

	}

}
