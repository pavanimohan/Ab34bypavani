package package1;
abstract class black
{
	abstract void apple();
	static void orange()
	{
		System.out.println("1");
	}
	void banana()
	{
	System.out.println("2");	
	}
}
public class Abstract_Method extends black
{
     static void pear()
     {
    	System.out.println("3"); 
     }
     void grapes()
     {
    	System.out.println("4"); 
     }
	public static void main(String[] args)
	{
		Abstract_Method m=new Abstract_Method();
		m.banana();
		m.grapes();
		orange();
		pear();
		m.apple();
	}
	
	void apple()
	{
		System.out.println("5");
	}

}
