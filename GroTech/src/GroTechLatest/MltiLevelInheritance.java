package GroTechLatest;

class DU //grand parent class
{
	public static int subtraction(int x,int y,int z)
	{
		return x+y-z;
	}
}
class DI extends DU //parent

{
	void display()
	{
		System.out.println("My self ROBO");
	}
}
class GU extends DI //child class
{
	void test()
	{
	System.out.println("Hello");
	}
}
public class MltiLevelInheritance {

	public static void main(String[] args) {
		GU obj =new GU();
		System.out.println(obj.subtraction(52, 50, 4));
		obj.display();
        obj.test();
	}

}
