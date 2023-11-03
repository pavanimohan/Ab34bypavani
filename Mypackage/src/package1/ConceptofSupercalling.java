package package1;
class Ship
{
	Ship()
	{
		System.out.println("it is running water");
	}
}
class Mentor extends Ship
{         // super calling statement is present but we can"t see
	Mentor()
	{
		System.out.println("i am division");
	}
	
}
class Teacher extends Mentor
{             //each constructor on top super calling statement is present
	Teacher()    //parent class constructor
	{
		System.out.println("i am addiding");
	}
}
public class ConceptofSupercalling extends Teacher
{
	ConceptofSupercalling()      //child class constructor super calling statement present
	{
		
		System.out.println("i am sutracting");
	}
	

	public static void main(String[] args)
	{
		
		new ConceptofSupercalling();
		//new Teacher(); //again teacher constructor will call
		
		
		


	}

}
