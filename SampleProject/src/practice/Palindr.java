package practice;

public class Palindr {

	public static void main(String[] args)
	{
		String s="dad";
		String str="";
		System.out.println(s.length());
		int n=s.length();
		for(int i=n-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		if(s.equals(str))
			System.out.println("p");
		else
			System.out.println("n");
		
		
		
	}

}
