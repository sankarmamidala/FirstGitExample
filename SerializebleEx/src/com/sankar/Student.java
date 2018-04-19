package com.sankar;

import java.io.Serializable;

public class Student implements Serializable
{
	String name;
	int id;
	transient int age;
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

}
