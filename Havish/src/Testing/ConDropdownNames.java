package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
//printing the names which are print in dropdown in amazon
public class ConDropdownNames {
	@Test
public void dropdownnames()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> wb=driver.findElements(By.id("searchDropdownBox"));
//size belongs to list of webelement interface		
		int count=wb.size();
		System.out.println(count);
		for(int i=0;i<count;i++) 
		{
			WebElement suggestion=wb.get(i);
			String s1=suggestion.getText();
			System.out.println(s1);

		}
		
	}
}
