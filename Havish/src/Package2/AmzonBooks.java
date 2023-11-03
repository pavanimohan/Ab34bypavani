package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
// select class is pre defined class the dropdown is handled by select class 
public class AmzonBooks {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.amazon.in/");
	      WebElement dropdown =driver.findElement(By.id("searchDropdownBox"));
	      Select s1= new Select(dropdown);
	      //s1.selectByVisibleText("Books");
//s1.selectByIndex(4);
	      s1.selectByValue("search-alias=amazon-pharmacy");


	}

}
