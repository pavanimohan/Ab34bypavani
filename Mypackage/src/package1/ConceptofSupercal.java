package package1;
class State
{
	State()
	{
		System.out.println("i am state constructor");
	}
	
}
class country extends State
{
	country()
	{    // super calling statement is used to call parent class constructor in from child class
		// super calling present implicit we can not see
		System.out.println("i am country constructor");
	}
}
public class ConceptofSupercal extends country
{
	ConceptofSupercal()
	{
		System.out.println("i am child class constructor");
	}

	public static void main(String[] args) 
	{
System.out.println("i am main method");
		
  new ConceptofSupercal();
	}

}
