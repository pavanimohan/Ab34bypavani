package package1;
interface Inparent  //interface
{
	void Username();  //no need to write abstract keyword in interface can have only AM
	void Password();
	
}
public class ConceptInterface implements Inparent             //concerte class
{

	public static void main(String[] args)
	{

		ConceptInterface g1=new ConceptInterface();
		g1.Username();
		g1.Password();
	}

	@Override
	public void Username() {
System.out.println("i am unimplemengted from interface class");		
	}

	@Override
	public void Password() {
System.out.println("i am unimplemengted from interface class method 2");		

	}

}
