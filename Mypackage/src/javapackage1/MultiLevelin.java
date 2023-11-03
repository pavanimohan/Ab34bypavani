package javapackage1;

 class Grandparentes
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
class parents extends Grandparentes
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
	public class MultiLevelin extends parents
	{
		void method9()
		{
			System.out.println("9");
		}
		void method10()
		{
			System.out.println("10");
		}
	

		public static void main(String[] args)
		{
			MultiLevelin k=new MultiLevelin();
			k.method9();
			k.method10();
			k.method1();
			k.method2();
			k.method5();
			k.method6();
			method3();
			method4();
		    method7(); //parent
			method8();
		}

	
	
	}





