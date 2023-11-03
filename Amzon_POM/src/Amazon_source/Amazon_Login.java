package Amazon_source;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login {
	WebDriver driver;
	//source file did not run because changes will made if need is there
	//step 1: locating the elements using find by annotations
	
	@FindBy(name="email")
	
	//each elemnet have return type here also webelement is the rt webelement is a interface
		WebElement username;	
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(name="password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signInbutton;
	//step:2 creating methods
	public void un()
	{
		username.sendKeys("pavani.dasari92@gmail.com");
	}
	public void continue_button()
	{
		continue_button.click();
	}
		public void pwd()
		{
			password.sendKeys("havishK@92");
		}
		public void signin()
		{
			signInbutton.click();
			
		}
	//step:3 initilization of elements iside the constructor
	//creating a constructor to initilize the values	
		 public Amazon_Login(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			//this is used because method parameter same as global variabless
			

		}

}
