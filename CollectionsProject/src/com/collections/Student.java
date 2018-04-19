package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Student
{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age
				+ "]";
	}
	public static void main(String[] args) {
		   TreeSet al=new TreeSet(new Name());
				//ArrayList al=new ArrayList();  
				al.add(new Student(101,"Vijay",23));  
				al.add(new Student(106,"Ajay",27));  
				al.add(new Student(105,"sankar",28));  
				al.add(new Student(107,"sankar",27));
		System.out.println("Sorting by Name...");  
		  
		//Collections.sort(al,new Name());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
	Student st=(Student)itr.next();  
    	System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("sorting by age...");  
		TreeSet al1=new TreeSet(new Age());
		//ArrayList al=new ArrayList();  
		al1.add(new Student(101,"Vijay",23));  
		al1.add(new Student(106,"Ajay",27));  
		al1.add(new Student(105,"Jai",21));  	
		al1.add(new Student(107,"sankar",27));
	//Collections.sort(al,new Age());  
		Iterator itr2=al1.iterator();  
		while(itr2.hasNext()){  
		Student st=(Student)itr2.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		  
		}  
		}  
