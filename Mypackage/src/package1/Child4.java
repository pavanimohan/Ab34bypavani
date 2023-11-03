package package1;
//hybrid level inheritance child 1to 4
class Child2
{ 
	void two()
	{
		System.out.println("push");
	}
	
}
class Child3 extends Child2
{
  void one()
  {
	  System.out.println("exit");
  }
}

public class Child4 extends Child3
 {
	void four()
	{
		System.out.println("enter");
	}

	public static void main(String[] args) {
		Child4 b=new Child4();
		b.four();
		b.one();
		b.two();
	}

}
