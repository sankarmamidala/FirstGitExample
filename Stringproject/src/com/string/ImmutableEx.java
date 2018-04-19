package com.string;

import java.util.Date;

public final class ImmutableEx 
{
	private final String name;
	private final int age;
	private final Date date;
	
	private ImmutableEx(String name,int age,Date date)
	{
		this.name=name;
		this.age=age;
		this.date= new Date(date.getTime());
	}
	public static ImmutableEx createInstance(String name,int age,Date date)
	{
		return new ImmutableEx(name,age,date);
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public Date getDate()
	{
		return new Date(date.getTime());
	}
	@Override
    public String toString() {
        return name +" - "+ age+" - "+date;
	
	}
	

}
