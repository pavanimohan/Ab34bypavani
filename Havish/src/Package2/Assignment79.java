package Package2;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Assignment79 {
@Test
public void nakuri() throws InterruptedException
 {
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
driver.get("https://www.naukri.com/");
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.xpath("//span[text()='Google']")).click();
System.out.println(driver.getWindowHandles());
Set<String> parentandchild =driver.getWindowHandles();
	
Iterator<String> i1 =parentandchild.iterator();//iterator have next method to separete the parent and child ids
	String parent =i1.next();//it will give parent id return type of next is string
	String child =i1.next();//it will give child id return type of next is string
	driver.switchTo().window(child);//control move to child from parent
driver.findElement(By.id("identifierId")).sendKeys("9542601343");
Thread.sleep(2000);
driver.close();//child will close

driver.switchTo().window(parent);//control move to parent from child
driver.close();//parent will close

	}
}
