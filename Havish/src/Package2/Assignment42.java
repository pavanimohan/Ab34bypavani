package Package2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment42 {

	public static void main(String[] args) {

		ChromeDriver driver = new  ChromeDriver();
	    driver.manage().window ().maximize();
        driver.get("https://www.amazon.in");
        
	}

}
