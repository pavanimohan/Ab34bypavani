package package1;

import java.util.Scanner;

public class ConceptScann4 {

	public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        //int age =s1.nextInt();  // int values stored but in run time i have given double exception error is comimg
 
                System.out.print("Enter an integer: ");
                int intValue = s1.nextInt();
                System.out.print("Enter a double: ");
                double doubleValue = s1.nextDouble();

                double sum = intValue + doubleValue;
                System.out.println( sum);

                s1.close();


	}

}
