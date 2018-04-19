package practice;

public class PrimeNo {

	public static void main(String[] args) {

		int num =11;
		int flag=0;
		for( int i =2;i<=num;i++)
		{
			if(num%2==0)
				flag=flag+1;
		}
		if(flag==1)
			System.out.println("not prime");
		else
			System.out.println("Prime");
		
		
	}

}
