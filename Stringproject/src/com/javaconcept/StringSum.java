package com.javaconcept;

public class StringSum {

	public static void main(String[] args) {

		String str="11jnj123aa101";
		
		
		int sum=0;
	String num="";
	for( int i=0;i<str.length();i++)
	{
		if(Character.isDigit(str.charAt(i)))
		{
			num=num+str.charAt(i);
			sum=sum+Integer.parseInt(""+str.charAt(i));
		}
		else
		{
			if(!num.equals(""))
			{
				sum=sum+Integer.parseInt(num);
				num="";
			}
		}
		if(i==str.length()-1 && !num.equals("")){
			sum=sum+Integer.parseInt(num);
		}
		
	}
	System.out.println(sum);
	
			
		
		
	}
		
	}