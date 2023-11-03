package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//print the no.of links which are present in website
public class ConLinkprinting {

@Test
public void add()
{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
List<WebElement>ls=driver.findElements(By.tagName("a"));
int count =ls.size();
System.out.println(count);
		
		

	}

}
