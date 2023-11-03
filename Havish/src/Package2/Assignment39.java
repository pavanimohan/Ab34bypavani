package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment39 {

	public static void main(String[] args) {
	    ChromeDriver driver = new  ChromeDriver();
	    driver.manage().window ().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.linkText("Mobiles")).click();

	}

}
