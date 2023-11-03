package javapackage1;

public class NewLocalglobal {
	static double pi=3.14; //global variable
	static void area()
	{
		int r=10;           //local variable
		double area=pi*r*r;
		System.out.println(area);
	}

	public static void main(String[] args) {
		int r=100;
		//pi =9; //if u don't mention datatype then global variable value change
       
		int pi =9; //if u mention datatype then it is used as local variable
		double area=pi*r*r;
		System.out.println(area);
		area();
	}

}
