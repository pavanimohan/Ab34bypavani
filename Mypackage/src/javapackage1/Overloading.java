package javapackage1;

public class Overloading {
	static void add()
	{
		System.out.println("Add 1");
	}
	static void add(int a)
	{
		System.out.println("Add 2");
		
	}
	static void add(char a,String b)
	{
		System.out.println("Add 3");
		
	}
	static void add(int a,int b)
	{
		System.out.println("Add 4");
	}


	public static void main(String[] args) {
		add ();
		add(3);
		add('e',"pavani");
		add(23,54);
		

	}

}
