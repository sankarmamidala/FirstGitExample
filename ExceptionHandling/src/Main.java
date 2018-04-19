public class Main
{
	int age;
	public static void m1(int age)
	{
		try
		{
			if(age<=18)
				throw new Test("smaller age");
			else if(age<50)
				System.out.println("Middleage");
			else
				System.out.println("old age");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	}
	public static void main(String args[])
	{
		m1(40);
	}

}