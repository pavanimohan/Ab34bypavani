package GroTechLatest;

public class ConOver {
static void add() {
	System.out.println("add1");
	
	
}
void add(int a)
{
	System.out.println("add2");

}
ConOver()
{
	System.out.println("constructor");
}
ConOver(int a)
{
	System.out.println("constructor2");
}
static void add(long a)
{
	System.out.println(2);

}
static void add(int b, int c )
{
	System.out.println(3);
}

void add(int e, int f,int g)
{
	System.out.println(4);
}


	public static void main(String[] args) {

add();
//ConOver h=new ConOver();
//h.add(12);
//h.add(2,4,1);
new ConOver(21);
new ConOver();
	}

}
