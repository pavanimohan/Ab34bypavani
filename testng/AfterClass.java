package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AfterClass 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("@BeforeSuite");
	}
	
	
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
public void testcase1()
{
	System.out.println("@Test");
}
}
