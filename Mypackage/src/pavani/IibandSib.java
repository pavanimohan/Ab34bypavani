package pavani;

public class IibandSib {
	
	static
	{
		System.out.println("i am sib1");
	}
	static {
		System.out.println("I am sib2");
	}
	
	{
		System.out.println("i am iib");
	}
	
	{
		System.out.println("i am iib2");
	}
	IibandSib()
	{
		System.out.println("I am constructor");
	}
	IibandSib(int a)
	{
		System.out.println("I am constructor2");
	}
	
	public static void main(String[] args) {

     System.out.println("Main method");
     new IibandSib();
     new IibandSib(1);
	}
	{
		System.out.println("i am iib3");
	}

}
