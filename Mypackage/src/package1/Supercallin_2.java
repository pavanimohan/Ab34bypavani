package package1;
class states
{
	states(String nameofstate)
	{
		System.out.println("Telanagana");
	}
}
class countries extends states
{
	countries(String nameofcountry)
	{
	super("Hb");           //super calling with parameter will not present we have write to call
		System.out.println("India");
	}
}

public class Supercallin_2  extends countries
{
	Supercallin_2(String urban)
	{
	super("KA");
		System.out.println("America");
	
	}
	public static void main(String[] args) {
    System.out.println("i am main method");
    new Supercallin_2("village");
    
	}
}



