package com.core;

public class ToStringEx {

	int rollno;
	String name;
	
	ToStringEx(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public int hascode()
	{
		return rollno;
		
	}
	public String toString()
	{
		return "rollno:"+rollno+" "+"name:"+name;
	}
	
	
	public static void main(String[] args) 
	{
		ToStringEx sex=new ToStringEx(35,"sankar");
		ToStringEx sexx=new ToStringEx(35,"sankar");
		ToStringEx sexxxx=new ToStringEx(35,"sankar");
		
		System.out.println(sex);
		System.out.println(sexx);
		System.out.println(sexxxx);

	}

}
