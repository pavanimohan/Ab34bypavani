package package1;
interface GrandParent
{
	void add();
	
}
class Papa implements GrandParent
{
	 void sub()
	 {
		 int a=12;
		 int b=9;
		 int c=a-b;
		 System.out.println(c);
	 }

	@Override
	public void add() {
System.out.println("addition");		
	}
}
public class Brown extends Papa
{
	
static void div()
{
	int x=12;
	int y=4;
	int z=x/y;
	System.out.println(z);
}


	public static void main(String[] args) {
		Brown b=new Brown();
		b.add();
		b.sub();
		div();
		
		
	}

}
	


