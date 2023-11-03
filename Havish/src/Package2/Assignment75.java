package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment75 {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window().maximize();
driver.get("https://grotechminds.com/registration/");
driver.findElement(By.name("your-name")).sendKeys("siva pavani");
driver.findElement(By.id("2")).sendKeys("first");
driver.findElement(By.name("Password")).sendKeys("@pavani");
driver.findElement(By.name("text-397")).sendKeys("siva");
driver.findElement(By.id("5")).sendKeys("pavani");
driver.findElement(By.name("radio-45"));
driver.findElement(By.name("radio-45"));
driver.findElement(By.xpath("//span[@class='wpcf7-list-item-label']")).click();
driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-submit has-spinner btn btn-default']")).click();


	}

}
