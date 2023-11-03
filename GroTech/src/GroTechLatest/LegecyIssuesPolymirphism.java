package GroTechLatest;

class DQ
{
	static int add( int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class LegecyIssuesPolymirphism {

	public static void main(String[] args) {
		System.out.println(DQ.add(4, 5));
		System.out.println(DQ.add(54, 12));

	}

}
