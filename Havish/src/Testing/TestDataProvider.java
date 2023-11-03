package Testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//dataprovider is one the annotation which is used to test same testcase
//with multiple inputs

public class TestDataProvider {
	
	@Test(dataProvider="data")
	//here we are trying to fetch the dataprovider name which given in condataprovider
	public void test1(String a)
	{
		System.out.println(a);
	}
	@Test(dataProvider="data1")
	//here we are trying to fetch the dataprovider name which given in condataprovider
	public void test2(String b)
	{
		System.out.println(b);
	}

	@DataProvider(name="data")
	public Object[][] numbers()
	{
		//object is the super most class
		//creating obj of the obj pass the values using return keyword
		return new Object[][] {{"80"},{"98"}};
		
	}


	@DataProvider(name="data1")
	public Object[][] numbersofstudent()
	{
		//creating obj of the obj pass the values using return keyword
		return new Object[][] {{"80"},{"98"},{"46"},{"34"},{"40"}};
		
	}



}
