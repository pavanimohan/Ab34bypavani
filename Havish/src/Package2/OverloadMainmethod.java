package Package2;

public class OverloadMainmethod {
	void add()
	{
		System.out.println("1");
	}

	public static void main(String[] args) {
		
		System.out.println("2");
		OverloadMainmethod r=new OverloadMainmethod();
		r.add();

	}

}
