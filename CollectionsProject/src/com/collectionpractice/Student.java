package com.collectionpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Student implements Comparable<Student>
{
	int rollNo;
	String name;
	int age;
	
	Student(int rollNo,String name, int age)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student st)
	{
		if(rollNo==st.rollNo)
		{
			return 0;
		}
		else if(rollNo>st.rollNo)
		{
			return -1;
		}
		else 
			return -1;
		
		
	}

	public static void main(String[] args) {
		
		
		TreeSet<Student>al=new TreeSet<Student>();
		al.add(new Student(1,"sankar",28));
		al.add(new Student(45,"san",287));
		al.add(new Student(8,"skar",288));
		al.add(new Student(10,"kar",128));
		for(Student st:al){
			System.out.println(st.rollNo+st.name+st.age);
		}
		
		
	}

}
