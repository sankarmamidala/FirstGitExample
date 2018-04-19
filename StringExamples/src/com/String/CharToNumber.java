package src.com.String;



public class CharToNumber
{
	public static void main(String[] args) {
		
		String str="java4s";
		
		for(int i=0;i<str.length();i++)
		{
		boolean flag=Character.isDigit(str.charAt(i));
		if(flag==true)
		{
			System.out.println(str.charAt(i)+":number");
		}
		else
		{
			System.out.println(str.charAt(i)+":not number");
		}
		
				
	}
}
}