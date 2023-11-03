package javapackage1;

public class NewClassvariable {
    static int age=23;
    String name;
    boolean answer =false;
    void add()
    {
    	int a=100;
    	System.out.println("a");
    }
    
	public static void main(String[] args) {
		int a=200;
		System.out.println(age);
		NewClassvariable n1 = new NewClassvariable();
		n1.name="pavani";
		System.out.println(n1.answer);
         n1.add();
	}

}
