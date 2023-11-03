package GroTechLatest;

class CT
{
	void display()
	{
		System.out.println("Hello");
		
	}
	void test()
	{
		System.out.println("How are you");
		this.display();
		
	} 
	
}

public class Invokecurrentclassmethod {

	public static void main(String[] args) {

		CT obj=new CT();
		obj.test();
	}

}
