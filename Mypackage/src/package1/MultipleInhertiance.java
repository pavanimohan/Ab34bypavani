package package1;
interface Addition
{
	void Username();
	void Password();
}
interface Subtraction
{
	void S_Username();
	void S_Password();
	
}
public class MultipleInhertiance implements  Addition, Subtraction
{
static void div()
{
	System.out.println("me");
}
	public static void main(String[] args) 
	{

		MultipleInhertiance n=new MultipleInhertiance();
		n.Username();
		n.Password();
		n.S_Username();
		n.S_Password();
		div();
	}

	@Override
	public void S_Username() {
System.out.println("login");		
	}

	@Override
	public void S_Password() {
System.out.println("logout");		
	}

	@Override
	public void Username() {
System.out.println("enter");		
	}

	@Override
	public void Password() {
System.out.println("exit");		
	}

}
