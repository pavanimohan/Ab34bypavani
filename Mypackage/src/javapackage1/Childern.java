package javapackage1;
class GrandParent
{
	void method1()
	{
		System.out.println("1");
	}
	void method2()
	{
		System.out.println("2");
	}
	public static void method3()
	{
		System.out.println("3");
	}
	 public static void method4()

	{
		System.out.println("4");
	}

}
class Parent extends GrandParent
{
	void method5()
	{
		System.out.println("5");
	}

	void method6()
	{
		System.out.println("6");
	}
	public static void method7()
	{
		System.out.println("7");
	}

	public static void method8()
	{
		System.out.println("8");
	}
}
public class Childern extends Parent
 {
	void method9()
	{
		System.out.println("9");
	}
	void method10()
	{
		System.out.println("10");
	}

	public static void main(String[] args) {
		
		Childern m=new Childern();
		m.method9();
		m.method10();
		method8();
		method7();
		m.method6();
		m.method5();
		m.method1();
		m.method2();
		method3();
		method4();
	}

}
