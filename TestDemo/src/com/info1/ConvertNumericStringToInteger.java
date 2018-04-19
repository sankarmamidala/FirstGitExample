package com.info1;

public class ConvertNumericStringToInteger {

	public static void main(String[] args) {
	
		String str="sankar";
		String vowels="aeiou";
		int count1=0;
		int count2=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<vowels.length();j++)
			{
				if(str.charAt(i)== vowels.charAt(j))
				{
					count1++;
				}
				
			}
		}
		System.out.println("Count of Vowels in"+" "+"("+str+")"+" "+" "+ count1);
		System.out.println("Count of Consonants in"+" "+"("+str+")"+" "+" "+ (str.length()-count1));
		
		
	}
}
