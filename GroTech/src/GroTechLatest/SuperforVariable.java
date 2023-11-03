package GroTechLatest;

class EA
{
	String colour="white";
}
class EB extends EA
{
	String colour="black";
	void display()
	{
		System.out.println(super.colour);
		System.out.println(colour);

	}
}
public class SuperforVariable {

	public static void main(String[] args) {
 EB obj=new EB();
 obj.display();
	}

}
