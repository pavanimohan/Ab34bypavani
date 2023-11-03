package Testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbUsingDataProvider {
	@Test(dataProvider="logindetails")
	public void test1(String un,String password)
	{
		System.out.println(un);
		System.out.println(password);

	}
	@DataProvider(name="logindetails")
	public Object[][] numberof5students()
	{
		//creating object of the object class below
		Object data[][]=new Object[2][2];
		//1st row
		data[0][0]="ram@gmail.com";
		data[0][1]="ram@123";
		//2nd row
		data[1][0]="sita@gmail.com";
		data[1][1]="sita@123";
		return data;
//here how many testcase execute it depends on input which is given example ram sit login
//[2] 1st one no.of testcases[2]2nd one indicates no.of rows present in line 18
	}
}
