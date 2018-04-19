package com.collections;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) 
	{
		    Employee e=new Employee(981);
			Employee e1=new Employee(100);
			Employee e2=new Employee(400);
			Employee e3=new Employee(300);
			Employee e4=new Employee(800);
			Employee e5=new Employee(1000);
			
			TreeSet t=new TreeSet(new MyCompar());
			t.add(e);
			t.add(e1);
			t.add(e2);
			t.add(e3);
			t.add(e4);
			t.add(e5);
			System.out.println(t);
			
			
		}
		}
	
