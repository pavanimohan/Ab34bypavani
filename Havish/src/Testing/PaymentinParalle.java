package Testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class PaymentinParalle {
	
	@Test
	public void creditcard()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement wb =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(wb).perform();
		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("pavani.dasari92@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys                                                     ("havishK@92");    
driver.findElement(By.id("signInSubmit")).click();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
driver.findElement(By.className("s-image")).click();
Set<String> ae=driver.getWindowHandles();
Iterator<String> s1=ae.iterator();
String parent=s1.next();
String child=s1.next();
driver.switchTo().window(child);
driver.findElement(By.id("add-to-cart-button")).click();
driver.findElement(By.name("proceedToRetailCheckout")).click();
driver.findElement(By.name("submissionURL")).click();
driver.findElement(By.id("shipToThisAddressButton")).click();
		//driver.findElement(By.className("a-radio")).click();
driver.findElement(By.name("ppw-instrumentRowSelection")).click();
	}

}
