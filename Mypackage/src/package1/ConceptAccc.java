package package1;


abstract class ConceptAccc_3
{
	abstract void method4();
	abstract void method5();
	static void method6()
	{
		System.out.println("grand parent class method");
	}
}
abstract class ConceptAccc_2 extends ConceptAccc_3
{ 
	abstract void method2();

	abstract void method3();
	static void method7()
	{
		System.out.println("parent class method");
	}
}
public class ConceptAccc extends ConceptAccc_2
{
	static void method1()
	{
		System.out.println("child class staticmethod");

	}
	void method8()
	{
		System.out.println("child class nonstaticmethod");

	}
    
	public static void main(String[] args) {
		ConceptAccc q=new ConceptAccc();
		q.method8();
		method7();
		method6();
		method1();
		method6();
		q.method4();
		q.method5();
		q.method2();
		q.method3();
	}
	
	void method2() {
		System.out.println("2");
		
	}
	
	void method3() {
		System.out.println("3");
		
	}
	
	void method4() {
		System.out.println("4");
		
	}
	
	void method5() {
		System.out.println("5");

	}

}
