package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment72 {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window ().maximize();
       driver.get("https://www.amazon.in/");
       driver.findElement(By.linkText("Mobiles")).click();

	}

}
