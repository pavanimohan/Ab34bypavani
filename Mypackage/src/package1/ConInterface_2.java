package package1;
interface GrandParent_22
{
	void login();
	void logout();
	
}
 abstract class Parent_11 implements GrandParent_22

{
	 abstract void Username();
	 abstract void password();
	 static void resetpassword()
	 {
		System.out.println("i am parent static method");
	 }
	
}
public class ConInterface_2 extends  Parent_11
{
void newexcelsheet()
{
	System.out.println("i am nonstatic cc1");
}
void oldexcelsheet()
{
	System.out.println("i am nonstatic2");
}
	public static void main(String[] args) {
		ConInterface_2 d=new ConInterface_2();
		d.newexcelsheet();
		d.oldexcelsheet();
		resetpassword();
		d.Username();
		d.password();
		d.login();
		d.logout();
	}
	@Override
	public void login() {
System.out.println("i am interface1");		
	}
	@Override
	public void logout() {
System.out.println("i am interface2");
	}
	@Override
	void Username() {
System.out.println("i am parent am");		
	}
	@Override
	void password() {
System.out.println(" i am parent am2");
	}

}
