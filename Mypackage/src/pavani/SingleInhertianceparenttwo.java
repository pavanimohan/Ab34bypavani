package pavani;

class SingleInhertianceparenttwo 
{
	static void method1()
	{
		System.out.println("one");
	}
	void method2()
	{
		System.out.println("two");
	}
}
class apple extends SingleInhertianceparenttwo
{
	void method5()
	{
		System.out.println("5");
	}
	static void method6()
	{
		System.out.println("6");	
	}
	static void method8()
	{
		System.out.println("8");
	}

	public static void main(String[] args)
	{
		apple n=new apple();
		n.method2();
		method1();
	}
}

