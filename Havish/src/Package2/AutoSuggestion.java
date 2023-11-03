package Package2;

import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		 EdgeDriver driver = new EdgeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
	}

}
