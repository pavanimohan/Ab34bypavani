package package1;
class Madam
{
	Madam(int a)
	{
		System.out.println("1");
	}
}

public class Guru extends Madam
{
	Guru()
	{
		super(189);
		System.out.println("3");
	}

	public static void main(String[] args) {
      new Guru();
	}

}
