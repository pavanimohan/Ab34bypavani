package javapackage1;

public class Assignment2 {
	static void add ()
	{
		System.out.println("Iam static method");
	}
      void subtract ()
      {
    	  System.out.println("I am non static method");
    	  
      }
      Assignment2 ()
      {
    	  System.out.println(" I am constructor");
      }
	public static void main(String[] args) {
		
		Assignment2 m =new Assignment2();
		m.subtract();
		add();
		

	}

}
