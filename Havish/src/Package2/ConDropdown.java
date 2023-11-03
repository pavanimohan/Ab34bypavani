package Package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ConDropdown {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window ().maximize();
	      driver.get("https://www.amazon.in/");
	      WebElement d1=driver.findElement(By.id("twotabsearchtextbox"));
	      
	      Select s1=new Select(d1);
	      s1.selectByVisibleText("shoes");
	    // s1.selectByIndex(3) ;
	    List<WebElement>count= s1.getOptions() ;
	   int rt=count.size();
	    System.out.println(rt);
	      
	}

}
