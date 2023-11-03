package Package2;

import org.openqa.selenium.edge.EdgeDriver;

public class Assignment68 {

	public static void main(String[] args) throws InterruptedException {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
  Thread.sleep(1000);
  driver.close();
	}
	

}
