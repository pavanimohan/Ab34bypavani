package GroTechLatest;
class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Cat extends Animal
{
	void run()
	{
		System.out.println("Cat is running");
	}
	
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog id barking");
	}
}
public class HierarchicalInhertance {

	public static void main(String[] args) {

		Cat obj= new Cat();
		obj.eat();
		obj.run();
		 
		Dog obj1 =new Dog();
		obj1.bark();
		obj1.eat();
	}

}
