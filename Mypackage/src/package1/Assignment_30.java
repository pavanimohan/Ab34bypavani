package package1;
interface Apple
{
	void Fruits();
	
}
abstract  class Parent implements Apple
{
	static void veg()
	{
		System.out.println("vegtraian");
	}
}
 class Mom extends Parent
{
	
	 static void resetpassword()
	 {
		System.out.println("i am parent static method");
	 }

	@Override
	public void Fruits() {
		System.out.println("i am concrete  method");


	}

}

	public class Assignment_30 extends Mom
	{
		static void add()
		{
			System.out.println("i am child class");
		}
		

	public static void main(String[] args) {
		Assignment_30 f=new Assignment_30();
		f.Fruits();
		add();
		veg();
		resetpassword();
		
	}

}
