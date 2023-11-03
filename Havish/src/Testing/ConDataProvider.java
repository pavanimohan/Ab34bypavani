package Testing;

import org.testng.annotations.DataProvider;

//dataprovider is one the annotation which is used to test same testcase
//with multiple inputs
public class ConDataProvider {
	@DataProvider(name="data")
	public Object[][] numbers()
	{
		//creating obj of the obj pass the values using return keyword
		return new Object[][] {{"80"},{"98"}};
		
	}

}
