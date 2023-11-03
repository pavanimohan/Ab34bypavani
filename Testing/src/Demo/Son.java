package Demo;

import Demo1.Father;

public class Son {

	public static void main(String[] args) {
		Father b=new Father(); //case 4 only public method only called in child
		b.method1(); // even though it is a static method both are different package we should create obj
		
	}

}

