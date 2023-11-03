package package1;

public class TestCase1 extends PreCondition
{
     void addingtheproduct()
{
	System.out.println("I liked product");
}
     void wishlist()
{
	System.out.println("i added product");
}
	void cod()
	{
		System.out.println("i am buying product");
	}

public static void main(String[] args) {

	TestCase1 n=new TestCase1();
	n.launch();
	n.addingtheproduct();
	n.wishlist();
	n.cod();
	n.quit();
	
	}

}
