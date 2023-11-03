package package1;

public class India 
{
	India()
	{ 
		//this();
		System.out.println("i am non parameterrized constructor");
	}
	India(String name)
	{
		this(4.5);
		System.out.println("i am from Hyderabad");	

	}
	India(double average)
	{
		this();
		System.out.println("3.456");	

	}
	India(float value)
	{
		this("Hello");
		System.out.println("35.6f");
	}
	India(int a)
	{
		this(3.5f);
	System.out.println("122");	
	}
		public static void main(String[] args) {
	
			new India(23);
	}

}
