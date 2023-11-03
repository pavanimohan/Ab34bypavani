package GroTechLatest;
class Animal2
{
	void eat()
	{
		System.out.println("i am eating");
	}
}
class Dog2 extends Animal2
{
	void eat()
	{
		System.out.println("i am going");

	}
	void bark()
	{
		System.out.println("i am leaving");

	}
	void workforall()
	{
		super.eat();
		bark();
		eat();
	}
}

public class SuperforMethod {

	public static void main(String[] args) {

		Dog2 obj=new Dog2();
		obj.workforall();
	}

}
