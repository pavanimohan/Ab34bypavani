package package1;

import java.util.Scanner;
public class ConceptScann2 {

	static void add()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter value of a");
		int a=s1.nextInt();
		System.out.println("enter value of b");
		int b=s1.nextInt();
		System.out.println("addition of two numbers");
		int c=a+b;
		System.out.println("the value of addiding a :"+  a+"  and b :"+b+" results to :  "+c);
		 }
	static void sub()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter value of p");
		int p=s1.nextInt();
		System.out.println("enter value of q");
		int q=s1.nextInt();
		System.out.println("subtraction of two numbers");
		int r=p-q;
		System.out.println(r);
	}
	static void div()
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("enter value of x");
     int x=s1.nextInt();
    System.out.println("enter value of y");
    int y=s1.nextInt();
	System.out.println("division of two numbers");
      int z=x/y;
	System.out.println(z);

	}
static void mul()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("enter value of i");
    int i=s1.nextInt();
	System.out.println("enter value of j");
    int j=s1.nextInt();
	System.out.println("multplication of two numbers");
      int k=i*j;
  	System.out.println(k);

}

	public static void main(String[] args) {
    add();
    sub();
    div();
    mul();

	}

} 


