package com.javalang;

public class ToStri
{
	int rollno;
	String name;
	ToStri(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public int hashCode()
	{
		return rollno;
	}
	public String toString()
	{
		return rollno+"--------"+name;
	}
	

	public static void main(String[] args) {
ToStri t =new ToStri(100,"sankar");
ToStri t1=new ToStri(20,"siva");
System.out.println(t);
System.out.println(t1);
	}

}
