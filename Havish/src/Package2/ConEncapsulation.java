package Package2;
class Authentication
{
	private String username ="pavani.dasari92@gmail.com";
	
	public String get_username()
	{
		return username;
	}
	public void set_username(String username)
	{
		
		this.username=username;
		
	}
	
	
	
}
public class ConEncapsulation {

	public static void main(String[] args) {

		Authentication a1=new Authentication();
		a1.set_username("knaidu222@gmail.com");
		System.out.println("username");
	}

}
