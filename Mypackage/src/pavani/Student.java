package pavani;

public class Student {

	public static void main(String[] args) {
		AccessSpecifier_Teacher g1=new AccessSpecifier_Teacher();
		g1.Scooty();
		g1.Car();
		//g1.Pen(); with in same package but different class we can't able to access private accessspecifier
		g1.Paper();
	}

}
