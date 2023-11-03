package javapackage1;
class GrandMother
{
	void method1()
	{
		System.out.println("1");
	}
	void method2()
	{
		System.out.println("2");
	}	
	static void method3()
	{
		System.out.println("3");
	}	
	static void method4()
	{
		System.out.println("4");
	}

}
class Mother extends GrandMother
{	
	void method5()
{
	System.out.println("5");
}

	void method6()
	{
		System.out.println("6");
	}
	static void method7()
	{
		System.out.println("7");
	}
	static void method8()
	{
		System.out.println("8");
	}


}
public class BabyChild extends Mother 
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
		BabyChild e=new BabyChild();
		e.method9();
		e.method10();
		e.method1();
		e.method2();
		e.method5();
		e.method6();
		method3();
		method4();
		method7();
		method8();

	}

}
