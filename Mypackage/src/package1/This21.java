package package1;

public class This21
{
	This21()
	{
		System.out.println("a");
	}
	This21(String name)
	{
		this();
		System.out.println("b");
	}

	public static void main(String[] args) {
     new  This21("Hyderabad");
	}

}
