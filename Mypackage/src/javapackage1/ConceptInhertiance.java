package javapackage1;

//single inheritance with all static methods
class Parentfamily
{
	
	static void method1()
	{
	System.out.println("1");	
	}
	static void method2()
	{
		System.out.println("2");	

	}
}


public class ConceptInhertiance extends Parentfamily
  {
	static void method3()
	{
		System.out.println("3");	

	}
	static void method4()
	{
		System.out.println("4");	

	}
	public static void main(String[] args) {
		
		
		method1();
		method2();
		method3();
		method4();

	}

}
