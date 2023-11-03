package javapackage1;
//methodoverriding with super keyword.

class Papa
{
	void add()
	{
		System.out.println("i am addiding in parent");
	}
}
public class OverriddenwithSuper extends  Papa
{
	void add()
	{
		super.add();
		System.out.println("i am addiding in child class");
	}

	public static void main(String[] args)
	{
		
		OverriddenwithSuper a1=new OverriddenwithSuper();
		a1.add();
	}

}
