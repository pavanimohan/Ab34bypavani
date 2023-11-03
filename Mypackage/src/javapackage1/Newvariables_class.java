package javapackage1;

public class Newvariables_class {
	static int age =100; //age is global variable
	String name;
	void add ()
	{
		int a=10;
		System.out.println("a");
	}

	public static void main(String[] args) {
    
     int a=90;
     System.out.println("b");
      age=100*2;
      System.out.println("age");
     Newvariables_class m=new Newvariables_class();
     m.add();
     
     
	}

}
