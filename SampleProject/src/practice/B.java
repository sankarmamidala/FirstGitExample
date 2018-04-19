package practice;

public class B extends A
{
	public  void m1()
	{
		//super.m1();
		System.out.println("b m1");
	}
	B()
	{
		super.m1();
	}
	public static void main(String[] args) {
	A a = new B();
		a.m1();
	}
	

}
