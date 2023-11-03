package practice.com;

import org.openqa.selenium.edge.EdgeDriver;

public class Firstone {

	public static void main(String[] args) {

EdgeDriver driver=new EdgeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();

	}

}
