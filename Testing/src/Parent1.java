
public class Parent1 {
	void add()
	{
		System.out.println("I am addiding in parent class");
	}
}
class Newclass3 extends Parent1
{
	void add()
	{
		super.add();
		System.out.println(" Iam adding in child class");
	}

	public static void main(String[] args) {
		
		Newclass3 m=new Newclass3();
		m.add();
	}

}
