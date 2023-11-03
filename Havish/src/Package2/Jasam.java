package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jasam {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("///C:/Users/admin/Downloads/learningHTML1.html");
    driver.manage().window().maximize();
    WebElement lastname = driver.findElement(By.id("121"));
   boolean a1= lastname.isDisplayed();
    System.out.println(a1);
    boolean a2= lastname.isEnabled();
    System.out.println(a2);
    if(a1==true)
    {
    	if(a2==true)
    	{
    		  
    		lastname.sendKeys("pavani");
    		
    	}
    }

	}

}
