package com.javalang;

public class Equals
{
	int rollno;
	String name;
Equals(int rollno,String name)
{
	this.rollno=rollno;
	this.name=name;
	
}
public boolean equals(Object o)
{
	Equals e=(Equals)o;
	String name2=e.name;
	int rollno2=e.rollno;
	if(name.equals(name2)&&rollno==rollno2)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) 
	{
		

	Equals e1=new Equals(10,"sankar");
	Equals e11=new Equals(10,"durga");
	Equals e2=new Equals(10,"sankar");
	Equals e13=new Equals(10,null);
	Equals e14=e1;
	Boolean b=new Boolean(false);
	Boolean b1=new Boolean(true);
	System.out.println(b.equals(b1));
	System.out.println(b==b1);
//	System.out.println(e1.equals(e2));
//	System.out.println(e11.equals(e2));
//	System.out.println(e1.equals(e13));
//	System.out.println(e1.equals(e14));
//	System.out.println(e1==e14);
//	System.out.println(e11==e2);
	
	}

}
