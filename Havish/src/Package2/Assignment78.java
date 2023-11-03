package Package2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment78 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		//WebElement flipcart= driver.findElement(By.xpath("//button[.='✕']"));
WebElement search =driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
Thread.sleep(2000);
Actions a1=new Actions(driver);//to hoverover action class is need to perform 
a1.moveToElement(search).perform();//control move from fashion to mens casuals
driver.findElement(By.linkText("Men's Casual Shirts")).click();
	}

}
