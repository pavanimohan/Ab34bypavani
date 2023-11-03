package practice.com;

public class Assignment26 {
	
	void pavani(){
		System.out.println("My name is pavani");
	}
	
	void pavanidasari(){
		System.out.println("My full name is Pavani Dasari");
	}
}

class testcases1 extends Assignment26{
	static void method1()
	{
		System.out.println("Im the parent one");
	}
	
	static void method2()
	{
		System.out.println("Im the parent two");
	}
	
	void method3()
	{
		System.out.println("Im the parent two");
	}
	
}
class testcases2 extends Assignment26 {
	public static void method4()
	{
		System.out.println("Im the parent four a");
	}
	
	static void method5()
	{
		System.out.println("Im the parent five");
	}
	
	void method6()
	{
		System.out.println("Im the parent six");
	}

}
class testcases3 extends Assignment26 {
	
	static void method7()
	{
		System.out.println("Im the parent seven");
	}
	
	static void method8()
	{
		System.out.println("Im the parent eight");
	}
	
	void method9()
	{
		System.out.println("Im the parent nine");
	}


	public static void main(String[] args) {
		
		testcases3 t3= new testcases3();
		t3.pavani();
		t3.pavanidasari();
		t3.method9();
		/*method8();
		method7();
		method4();
		method5();
		method2();
		method1();*/
		testcases2.method4();
	}

}