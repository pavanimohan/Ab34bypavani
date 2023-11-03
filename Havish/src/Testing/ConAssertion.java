package Testing;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.Assertion;

//assertion is used to compare the actual and expected values 
//if both are same testcase is passed othertwise it is failed
//assertion is only used for testng not used in selenium
//wrong write username password 4 possibities are give testcase pass that is why assertion used for write one
public class ConAssertion {
	@Test
	public void pass()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Assertion a1=new Assertion();
		a1.assertEquals("Google", driver.getTitle());//1st is actual 2nd is expected
//actual one written by us by using driver.getTitle we will get the tiltle of the page		
		WebElement wb=driver.findElement(By.name("q"));
		wb.sendKeys("India");
		wb.sendKeys(Keys.ENTER);
	}

}
