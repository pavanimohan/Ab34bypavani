package Package2;

public class ConSibandiib {
	static
	{
		System.out.println("i am sib");//sib
	}
	{
		System.out.println("i am iib");//iib
	}
	ConSibandiib()
	{
		System.out.println("i am constructor");//

	}
	ConSibandiib(int a)
	{
		System.out.println("i am constructor 2");//if u use constructor overloading iib will also call multiple times
	}
	void add()
	{
		System.out.println("nonstaticmethod");
	}
	static void sub()
	{
		System.out.println("i am static method");
	}
	public static void main(String[] args) {
		sub();
		ConSibandiib a1=new ConSibandiib();
		a1.add();
		//sub();
		
		//new ConSibandiib();
new ConSibandiib(12);

	}

}
