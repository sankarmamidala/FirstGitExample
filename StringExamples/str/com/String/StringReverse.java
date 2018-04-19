package str.com.String;

public class StringReverse {

	public static void main(String[] args) 
	{
		String a="hirasiva";
		String b="porasankar";
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length(),(a.length()));
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		
	}
}


