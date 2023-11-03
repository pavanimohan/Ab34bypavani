package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAtoZ {

	public static void main(String[] args) {
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ref_%3Dnav_em_hd_clc_signin_0_1_1_32");
   driver.manage().window().maximize();
   driver.findElement(By.name("email")).sendKeys("+919542601343");
   driver.findElement(By.id("continue")).click();
   driver.findElement(By.name("password")).sendKeys("pavani@92");
   driver.findElement(By.name("signInSubmit")).click();

	}

}
