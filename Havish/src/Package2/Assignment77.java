package Package2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment77 {

	public static void main(String[] args) throws InterruptedException {
EdgeDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
//driver.findElement(By.xpath("//div[@class='_22Dgdy _29BEA8']")).sendKeys("9542601343");
driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("9542601343");
driver.findElement(By.xpath("//button[@class='_1wGnMD rX1XT4 _2nD2xJ']")).sendKeys(Keys.ENTER);	
	driver.findElement(By.xpath("//span[@role='button']")).click();
	Thread.sleep(1000);
	driver.quit();
	}

}
