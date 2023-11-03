package javapackage1;

public class SibIid {
	static
	{
		System.out.println("I am SIB"); // for sib no need to create object
	}
	SibIid()
	{
		System.out.println("I am constructor"); //
		
	}
	{
		
		System.out.println("I am IIB");
	}
	{
		System.out.println("one more iib");
	}
	
	

	public static void main(String[] args) {

    new SibIid();
    System.out.println("I am main method");
    //new SibIid();

	}
	
}