package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectclassWithjsam {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
	      driver.manage().window ().maximize();

driver.get("file:///C:/Users/admin/Downloads/learningHTML1.html");
//WebElement d1=driver.findElement(By.id("Relegion"));
WebElement d1=driver.findElement(By.name("select"));

Select s1=new Select(d1);
s1.selectByIndex(4);




	}

}
