package GroTechLatest;

class DZ
{
	int add (int a,int b)
	{
		return a+b;
		
	}
	double add (int c,float d)
	{
		return c+d;
	}
}
public class OverLoadingNext {

	public static void main(String[] args) {
		DZ obj=new DZ();
		System.out.println(obj.add(23,45));
		
		System.out.println(obj.add(20,412.5f));

	}

}
