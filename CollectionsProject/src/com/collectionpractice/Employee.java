package com.collectionpractice;

import java.util.TreeSet;

public class Employee
{
	int rollNo;
	String name;
	int age;
	
	Employee(int rollNo,String name, int age)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		TreeSet<Employee> al=new TreeSet<Employee>(new AgeCompare());
		al.add(new Employee(101,"Vijay",23));  
		al.add(new Employee(106,"Ajay",27));  
		al.add(new Employee(105,"Jai",21));
		
		System.out.println("sort by age");
		for(Employee e:al)
		{
			System.out.println(e.rollNo+e.name+e.age);
		}
		
		System.out.println("------------------");
		
		TreeSet<Employee> al1=new TreeSet<Employee>(new NameCompare());
		al1.add(new Employee(101,"Vijay",23));  
		al1.add(new Employee(106,"Ajay",27));  
		al1.add(new Employee(105,"Jai",21));
		System.out.println("sort by name");
		for(Employee ee:al1)
		{
			System.out.println(ee.rollNo+ee.name+ee.age);
		}
	}

}
