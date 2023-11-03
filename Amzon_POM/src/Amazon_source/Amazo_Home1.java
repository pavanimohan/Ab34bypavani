package Amazon_source;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//oct 16 class
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazo_Home1 {
	
	//step1 inspecting serachfiled
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
//keys.enter is alternate for search button
	//step2
	public void search()
	{
		search_tf.sendKeys("shoes");
		search_tf.sendKeys(Keys.ENTER);
		}
	//step3
	public Amazo_Home1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
}
