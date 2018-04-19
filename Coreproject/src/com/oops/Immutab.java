package com.oops;
public final class Immutab
{
	private final String name;
	private final int age;
	Immutab(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public static void main(String[] args) {
		Immutab im=new Immutab("sankar",123);
		System.out.println(im.getName());
		System.out.println(im.getAge());
	}
}
