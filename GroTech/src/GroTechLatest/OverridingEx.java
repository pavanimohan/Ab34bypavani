package GroTechLatest;

class Bank
{
	int getrateofInterest (int x,int y)
	{
		return x+y;
	}
	
}

class ICICI extends Bank
{
	int getrateofInterest (int x,int y)
		{
			return x+y;
		}
	}
	
class YES extends 	Bank
{
	int getrateofInterest (int x,int y,int z)
	{
		return x+y+z;
	}

}
class HDFC extends Bank
{
	int getrateofInterest (int x)
	{
		return x;
		
	}

}
public class OverridingEx {

	public static void main(String[] args) {
		Bank obj=new Bank();
		System.out.println(obj.getrateofInterest(3,6));
		ICICI obj1=new ICICI();
		System.out.println(obj1.getrateofInterest(32,63));
		HDFC obj2=new  HDFC();
		System.out.println(obj2.getrateofInterest(5));
		YES obj3=new YES();
		System.out.println(obj3.getrateofInterest(3, 6,78));
		


	}

}
