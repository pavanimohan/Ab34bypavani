package package1;
interface FacebookAuth
{
	void Username();
	void Password();
}
interface GoogleAuth extends FacebookAuth
{
	void F_Username();
	void F_Password();
}
public class ConInterface_3 implements GoogleAuth
{
	void add()
	{
		int a=12;
		int b=14;
		int c=a+b;
		System.out.println(c); 
		
	}
static void sub()
{
	int x=22;
	int y=12;
	int z=x-y;
	System.out.println(z); 

	
}
	public static void main(String[] args) 
	{
		ConInterface_3 v=new ConInterface_3();
		v.add();
		sub();
		v.Username();
		v.Password();
		v.F_Username();
		v.F_Password();

	}

	@Override
	public void Username() {
System.out.println("Login");		
	}

	@Override
	public void Password() {
System.out.println("logout");
	}

	@Override
	public void F_Username() {
System.out.println("Enter");		
	}

	@Override
	public void F_Password() {
System.out.println("Exit");		
	}

}
