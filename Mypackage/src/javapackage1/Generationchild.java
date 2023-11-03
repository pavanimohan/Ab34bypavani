package javapackage1;
//single inheritance with static and non static methods


class Father
{
	 void method1()
	{
		System.out.println("1");
	}
	static void method2()
	{
		System.out.println("2");
	}

}
public class Generationchild extends Father
{
	 void method3()
	{
		System.out.println("3");
	}
	static void method4()
	{
		System.out.println("4");
	}

	public static void main(String[] args) {
		Generationchild m=new Generationchild();
		m.method3();
		m.method1();
		method2();
		method4();
	}

}
