package javapackage1;

public class LogicalOperators {

	public static void main(String[] args) {
  int a=100;
  int b=55;
  int c=26;
  if(a>b&&b<c)
  {
	  System.out.println("1");
	  
  }
  if(a<b||b>c)
  {
	  System.out.println("2");
  }
  if(!(a<b&&b<c))
  {
	  System.out.println("3");
	    
  }
  if(!(a<b||b>c))
  {
	  
	  System.out.println("4");

  }

 
	}

}
