package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Robort_class {
	@Test
	public void rightclick() throws AWTException, InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mob = driver.findElement(By.linkText("Mobiles"));
		Actions a1=new Actions(driver);//when we are using right click or double click we can use actiikns class
		a1.contextClick(mob).perform();//contextclick is method present in action class
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);//key event is a class which accepects virtual keys functions
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);//to capture the action we will use thread.sleep
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
         r1.keyPress(KeyEvent.VK_ENTER);

		
		
		
	}

}
