package testng;

import org.testng.annotations.Test;

//
public class Math_class {
	@Test
	public void testcase1()
	{
		double r =Math.PI;
	System.out.println(r);//print pi value
	System.out.println(Math.addExact(12, 03));//addition with direct giving values
	System.out.println(Math.subtractExact(56, 45));//subtraction also same
	System.out.println(Math.max(12, 4));//div also same
	System.out.println(Math.multiplyExact(12,6));//mul also same
	//double data type stores up to deciamal values 15.0 
	//math.random will give unique values from 0.0 to 1.0 when we are running it will keep on change values
	System.out.println(Math.random());
	System.out.println(Math.addExact(23, 450));
	}

}
