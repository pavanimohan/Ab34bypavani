package javapackage1;

public class Google {

	class GrandParent {
	    public static void staticMethod1() {
	        System.out.println("GrandParent's static method 1");
	    }

	    public static void staticMethod2() {
	        System.out.println("GrandParent's static method 2");
	    }

	    public void nonStaticMethod1() {
	        System.out.println("GrandParent's non-static method 1");
	    }

	    public void nonStaticMethod2() {
	        System.out.println("GrandParent's non-static method 2");
	    }
	}

	class Parent extends GrandParent {
	    public void nonStaticMethod1() {
	        System.out.println("Parent's non-static method 1");
	    }

	    public void nonStaticMethod2() {
	        System.out.println("Parent's non-static method 2");
	    }

	    public static void staticMethod1() {
	        System.out.println("Parent's static method 1");
	    }

	    public static void staticMethod2() {
	        System.out.println("Parent's static method 2");
	    }
	}

	class Child extends Parent {
	    public void nonStaticMethod1() {
	        System.out.println("Child's non-static method 1");
	    }

	    public void nonStaticMethod2() {
	        System.out.println("Child's non-static method 2");
	    }
	}

	
	    public static void main(String[] args) {
	        // Calling static methods
	        GrandParent.staticMethod1(); // Calls GrandParent's static method 1
	        GrandParent.staticMethod2(); // Calls GrandParent's static method 2

	        Parent.staticMethod1(); // Calls Parent's static method 1
	        Parent.staticMethod2(); // Calls Parent's static method 2

	        // Calling non-static methods
	        GrandParent grandParentObj = new GrandParent();
	        grandParentObj.nonStaticMethod1(); // Calls GrandParent's non-static method 1
	        grandParentObj.nonStaticMethod2(); // Calls GrandParent's non-static method 2

	        Parent parentObj = new Parent();
	        parentObj.nonStaticMethod1(); // Calls Parent's non-static method 1
	        parentObj.nonStaticMethod2(); // Calls Parent's non-static method 2

	        Child childObj = new Child();
	        childObj.nonStaticMethod1(); // Calls Child's non-static method 1
	        childObj.nonStaticMethod2(); // Calls Child's non-static method 2
	    }
	}


