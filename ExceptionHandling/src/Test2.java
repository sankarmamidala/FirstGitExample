import java.io.IOException;



public class Test2 extends Overload
{
	public static void sum() throws IOException
	{
		System.out.println("hi sankar");
	}

	public static void main(String[] args) 
	{
		Test2 t=new Test2();
		try {
			t.sum();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
