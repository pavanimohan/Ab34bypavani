package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
//print the all the links present in the website
public class Printin_links {
	@Test
	public void links()
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
List<WebElement>ls=driver.findElements(By.tagName("a"));//a tag name rt is list
int count =ls.size();
System.out.println(count);
for(int i=0;i<=count-1;i++)
{
WebElement a1= ls.get(i);	
String s1=a1.getAttribute("href");
System.out.println(s1);
}
		

		
	}

}
