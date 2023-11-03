package GroTechLatest;
class DT
{
	DT()
	{
		System.out.println("Hello");
		
	}
}
class ET extends DT
{
	ET()
	{
		super();
		System.out.println("i am child class");
		
	}
}


public class Superforparentclassconstructor {

	public static void main(String[] args) {
		ET obj=new ET();
		

	}

}
