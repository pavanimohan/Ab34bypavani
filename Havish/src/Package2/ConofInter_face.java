package Package2;
interface one //parent class
{
	void add();//abstarct method
	void sub();//abstarct method
}
//child class
public class ConofInter_face implements one
{

	public static void main(String[] args) {
		ConofInter_face s1=new ConofInter_face();
		s1.add();
		s1.sub();

	}

	@Override
	public void add() {
System.out.println("1");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

}
