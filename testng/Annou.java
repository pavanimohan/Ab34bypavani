package testng;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Annou {
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("@BeforeMethod");

	}
	@AfterMethod
	public void am()
	{
		System.out.println("@AfterMethod");
	}
@Test
public void xyz()
{
	System.out.println("@Test 1");
}
@Test
public void zam()
{
	System.out.println("@Test 2");
}
}
