package package1;

public class TestCase3 extends PreCondition

{ 
	static void summer()
	{
	System.out.println("it is hot");
	}
  void winter()
{
	System.out.println("it is cool");
}
  void raining()
{
	 System.out.println("it is rainning");
	 
}
	public static void main(String[] args) {
		TestCase3 d=new TestCase3();
		d.winter();
		d.raining();
		summer();
		d.launch();
		d.quit();
	}

}
