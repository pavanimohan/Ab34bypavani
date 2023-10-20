package testng;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
//reach amazon payment page using implicityway
import org.testng.annotations.Test;

public class ConImplicity {
	EdgeDriver driver;
	@BeforeMethod
	public void Launch()
	{
		 driver=new EdgeDriver();
		 driver.get("https://www.amazon.in/"); 
		 driver.manage().window().maximize();
		WebElement login=driver.findElement(By.linkText("Sign in"));
		login.sendKeys(Keys.ENTER);

		
	}
	@Test
	public void Amazon() throws InterruptedException
	
	{
		WebElement w1=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();
		Thread.sleep(2000);
		//driver.findElement(By.id("ap_email")).click();
		driver.findElement(By.id("ap_email")).sendKeys("pavani.dasari92@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys                                                                ("havishK@92");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//img[@class='s-image'])[2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandles());

		Set<String> p1=driver.getWindowHandles();

		Iterator<String>c1=p1.iterator();

		      String p2=c1.next();
		      String c2=c1.next();

		driver.switchTo().window(c2);
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("sw-ptc-form")).click();
		Thread.sleep(2000); 

		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]")).click();
		driver.findElement(By.name("ppw-instrumentRowSelection")).click();


		
	}

}
