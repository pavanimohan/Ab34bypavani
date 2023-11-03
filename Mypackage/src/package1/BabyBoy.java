package package1;
 //methodoveriding topic example

class Parentmom
{
	void add()
	{
		System.out.println("I am adding in parent class");
	}
	
}
public class BabyBoy extends Parentmom
{
	void add()
	{
		System.out.println("I adding in child class"); //because parent class overridden in child class so child class output only come
	}
	

	public static void main(String[] args) {
		BabyBoy d=new BabyBoy();
		d.add();
		
	}

}
