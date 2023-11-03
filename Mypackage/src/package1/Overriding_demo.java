package package1;
abstract class Mummy //abstract class
{
	abstract void username(); //abstract method
	
	
}
public class Overriding_demo extends Mummy
{

	public static void main(String[] args) 
	{
		Overriding_demo n=new Overriding_demo();
		n.username();
	}
	void username()   //concrete class
	{
		System.out.println("loading");
	}

}
