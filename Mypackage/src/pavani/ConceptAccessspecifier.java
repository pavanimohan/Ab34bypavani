package pavani;

public class ConceptAccessspecifier {

	public static void add()
	{
		System.out.println("1");
	}
	protected static void sub()
	{
	System.out.println("2");	
	}
	private void div()
	{
		System.out.println("3");
	}
	void mul()
	{
		System.out.println("4");
	}
	public static void main(String[] args) {
		add();
		sub();
		
		ConceptAccessspecifier m=new ConceptAccessspecifier();
		m.div();
		m.mul();
	}

}
