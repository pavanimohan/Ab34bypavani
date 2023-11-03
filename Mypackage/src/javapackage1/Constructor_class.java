package javapackage1;

public class Constructor_class {
	Constructor_class()
	{
		System.out.println("1");
		
	}
	Constructor_class(int a)
	{
		System.out.println("23");
		
	}
	Constructor_class( int a , int b)
	{
		System.out.println("5");
	}

	public static void main(String[] args) {
		Constructor_class n=new Constructor_class(12); //object create in type 1
		
    new Constructor_class(); //object creation in type2
    new Constructor_class(13,41);
	}

}
