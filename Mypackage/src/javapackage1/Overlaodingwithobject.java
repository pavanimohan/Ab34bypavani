package javapackage1;

public class Overlaodingwithobject {
	void add()
	{
		System.out.println("adding");
	}
     void add(int a)
     {
    	 System.out.println("adding 2");
     }
     static void add(int a,int b)
     {
    	 System.out.println("adding 3");
     }
	public static void main(String[] args) {
      
		Overlaodingwithobject m=new Overlaodingwithobject();
		m.add();
		m.add(32);
		add(43,43);
		
	}

}
