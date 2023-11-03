package practice.com;

public class SuperKey {
	int num=100;
}
	class subclass extends SuperKey
	{
		int num=110;
		void printnumber()
		{
			System.out.println("subclass num"+num);
			System.out.println("SuperKey num"+super.num);
		}
	public static void main(String[] args) {
		subclass a=new subclass();
		a.printnumber();
	}
}
