package practice.com;

public class Inheritone 
{
	static void method1()
	{
		System.out.println("My output one");
	}
	void method2()
	{
		System.out.println("My output two");
	}
}

class brown extends Inheritone
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

public static void main(String[] args) {
		brown n=new brown();
		n.method2();
		method1();
		n.method5();
		method6();
		method8();
	}

}
