package package1;

public class TestCase2  extends PreCondition
{ void material()
	{
	System.out.println("i buy material");
	}
  void stitching()
  {
	  System.out.println("i stitched material");
  }
  static void wearing()
  {
	 System.out.println("i am wearing dress"); 
  }

	public static void main(String[] args) {
		TestCase2 g=new TestCase2();
		g.material();
		g.stitching();
		wearing();
		g.launch();
		g.quit();
	}

}
