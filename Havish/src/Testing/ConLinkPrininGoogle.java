package Testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ConLinkPrininGoogle {
	
	WebDriver driver;
	@Test
	public void links() throws IOException
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement>links =driver.findElements(By.tagName(("a")));
		int count=links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement w1=links.get(i);
			String url1=w1.getAttribute("href");
			System.out.println(url1);
			verfi_links(url1);
		}
		
	}
	public static void verfi_links(String url1) throws IOException
	{
		URL u1=new URL(url1);
		HttpURLConnection rv=(HttpURLConnection)u1.openConnection();
		rv.connect();
		if(rv.getResponseCode()==200)
		{
			System.out.println(url1+"It is valid link");
		}
		else
		{
			System.out.println(url1+"it is invalid link");
		}
		
	}

	
}
