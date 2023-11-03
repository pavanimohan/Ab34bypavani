package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestionprinting {
	
	public static void main(String[] args) throws InterruptedException  {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		Thread.sleep(5000);
List<WebElement> ls=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
//the above x path comes from GF FATHER AND child
		int count =ls.size();//size method returns the count of elements present in this list container in selectbar
		System.out.println(count);
		for(int i=0;i<count;i++) 
		{
		WebElement suggestion=ls.get(i);//get index will print i value the return type is int
		String s1=suggestion.getText();//get text is used to print the text RT is string
		System.out.println(s1);
			
		}


}
}
