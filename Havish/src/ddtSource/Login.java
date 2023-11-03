package ddtSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ddt.ExcelSheet1;
import Ddttest.LaunchandQuit;

public class Login extends ExcelSheet1 {

WebDriver driver;

			//source file did not run because changes will made if need is there
			//step 1: locating the elements using find by annotations
			
			@FindBy(id="ap_email")
			
			//each elemnet have return type here also webelement is the rt webelement is a interface
				WebElement uname;	
			@FindBy(id="continue")
			WebElement continue_button;
			@FindBy(name="password")
			WebElement pwd;
			@FindBy(id="signInSubmit")
			WebElement login;
			//step:2 creating methods
				public void un() 
				{
					uname.sendKeys("pavani.dsasari92@gmail.com");
				}
				public void conbutton()
				{
					continue_button.click();
				}
				public void pd()
				{
					pwd.sendKeys("havish@92");
					
				}
				public void sigin()
				{
					login.click();
				}
			//step:3 initilization of elements iside the constructor
			//creating a constructor to initilize the values	
					public Login(WebDriver driver)
					{
						PageFactory.initElements(driver,this);
					}
			

		}





