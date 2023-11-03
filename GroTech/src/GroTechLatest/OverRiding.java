package GroTechLatest;

class Vehicle
{
	void run()
	{
		System.out.println("running");
		
	}
}
class Bike1
{
	void run()
	{
	System.out.println("swimming");
	
	}
	
}
public class OverRiding {

	public static void main(String[] args) {

		Vehicle obj=new Vehicle();
		obj.run();
		Bike1 obj1=new Bike1();
		obj1.run();
	}

}
