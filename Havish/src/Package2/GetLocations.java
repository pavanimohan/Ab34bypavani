package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetLocations {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	      driver.get("https://www.amazon.in/");
WebElement d =driver.findElement(By.linkText("Canada"));
	}

}
