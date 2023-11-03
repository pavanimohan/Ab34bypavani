package GroTechLatest;
class DX  //perent class
{
	public int addition()
	{
	
	int a=10;
	int b=23;
	int c=a+b;
	return c;
	}
}
class DY extends DX //dy is the child class
{
	void display()
	{
		System.out.println("Hello");
	}
}
public class inheritance {

	public static void main(String[] args) {

		
		DY obj =new DY();
		System.out.println(obj.addition());
		obj.display();
	}

}
