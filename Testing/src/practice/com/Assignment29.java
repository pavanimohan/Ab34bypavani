package practice.com;

public class Assignment29 {
	
	
	public static void main(String[] args) {
		Overmethod one =new Overmethod();
		one.name();
	}
	
  void name() {
	  System.out.println("My name is Apple");
  }
}
class Overmethod extends Assignment29{
	void name() {
		super.name();
		System.out.println("My name is Orange");
	}
}
