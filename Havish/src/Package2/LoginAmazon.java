package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginAmazon {

	public static void main(String[] args) {
		
		
	      EdgeDriver driver = new EdgeDriver();
		 
	    driver.manage().window ().maximize();
       driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
       driver.findElement(By.id("ap_email")).sendKeys("+919542601343");

       driver.findElement(By.id("continue")).click();
       
       driver.findElement(By.id("password")).sendKeys("pavani@92");
       driver.findElement(By.id("signInSubmit")).click();

	}

}
