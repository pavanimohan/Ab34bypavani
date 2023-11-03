package GroTechLatest;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		String Str=sc.nextLine();
		String Str1=Str.substring(3,4);
		System.out.println(Str1);
		

	}

}
