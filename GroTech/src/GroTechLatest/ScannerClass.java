package GroTechLatest;

import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter first number");
       int a=sc.nextInt();
       System.out.println("Enter second number");
       int b=sc.nextInt();
       int c=a+b;
       System.out.println(c);
       int d=a-b;
       System.out.println(d);
       int e=a*b;
       System.out.println(e);
       int f=a/b;
       System.out.println(f);
       
	}

}
