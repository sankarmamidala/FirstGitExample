package com.core;

public class Student {
	int rollno;
	String name;
	
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
public boolean equals(Object o)
{
	try{
		String name1=this.name;
		int rollno1=this.rollno;
		
		Student s=(Student)o;
		/*String name2=s.name;
		int rollno2=s.rollno;*/
		
		if(name1.equals(s.name) || rollno1==s.rollno){
			return true;
		}
		else
			return false;
		
	}
	catch(NullPointerException e){
	return false;}
}
	
	
	public static void main(String[] args) 
	{
		Student s1=new Student(35,"sankarr");
		Student s2=new Student(37,"sankarr");
		Student s3=new Student(35,"sankarr");
		Student s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s4));

	}

}
