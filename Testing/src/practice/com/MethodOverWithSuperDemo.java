package practice.com;

class ABC {

	public void myMethod()
	{
		System.out.println("Overridden method");
	}
}
class Demo extends ABC {

	public void myMethod() {
		super.myMethod();
		System.out.println("Overriding method");
	}
	public class MethodOverWithSuperDemo{
		public static void main(String[] args) {


			Demo obj = new Demo();
			obj.myMethod();
		}
	}
}