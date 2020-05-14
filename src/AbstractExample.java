
public class AbstractExample extends Sample {
	void m1()
	{
		System.out.println("Abstract method");
	}
	/*void m2()
	{
		System.out.println("Concrete method in sub class");
	}*/

public static void main(String args[]){
	AbstractExample obj = new AbstractExample();
	obj.m1();
	obj.m2();
}
}