package scjpprograms;

public class EvenNumbers {

	public static void main(String[] args)
	{
		int count=0;
		for(int i=0;i<20;i++)
		{
			if(i % 2!=0)
			{
				System.out.println("eventNUmbers:"+i);
			    count++;
			}
		}
		System.out.println("Even numbers 1 to 20:"+count);

	}

}
