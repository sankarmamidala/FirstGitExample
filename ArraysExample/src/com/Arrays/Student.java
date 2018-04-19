
package com.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	private int sno;
	private String name;
	private int age;
	
	Student(int sno,String name,int age)
	{
		this.sno=sno;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int compareTo(Student st) 
	{
		
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
		
		
	}
	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student(1,"sankar",22));
		al.add(new Student(2,"sankar",21));
		al.add(new Student(10,"sankar",2));
		al.add(new Student(4,"sankar",25));
		al.add(new Student(9,"sankar",228));
		
		Collections.sort(al);  
		for(Student st:al){  
		System.out.println(st.sno+" "+st.name+" "+st.age);  
	}
	}

	
}