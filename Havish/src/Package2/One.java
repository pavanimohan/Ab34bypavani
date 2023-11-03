package Package2;

import org.openqa.selenium.edge.EdgeDriver;

public class One {

	public static void main(String[] args) throws InterruptedException 
	{
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);//one of the class in java and measured in milliseconds
		driver.close();
		

	}

}
