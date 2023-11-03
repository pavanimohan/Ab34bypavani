package javapackage1;
 class ParentTwo
	{
   static  void method1()
   {
	   System.out.println("1");
   }
    void method2()//nonstatic
   {
	   System.out.println("2");
   }
   
}
 public class SingleInheritance extends ParentTwo
	{
		 void method3()     //nonstatic
		{
			System.out.println("3");
		}
		static void method4()
		{
			System.out.println("4");
		}
	
	

	public static void main(String[] args) {
		SingleInheritance m=new SingleInheritance();  //nonstatic creating object for child class and calling
		m.method3 ();
		method4 ();
		method1 ();
		m.method2 ();  // with the child class variable we can call nonstatic method from parent class
	}

}
