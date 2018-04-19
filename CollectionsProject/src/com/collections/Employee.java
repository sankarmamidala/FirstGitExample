package com.collections;

import java.util.TreeSet;

public class Employee implements Comparable
{
	int eid;
	Employee(int eid)
	{
		this.eid=eid;
	}
	@Override
	public String toString() 
	{
		return "Employee [eid=" + eid + "]";
	}
	
public int compareTo(Object obj)
{
	int eid1=this.eid;
	Employee e=(Employee)obj;
	int eid2=e.eid;
	if(eid1<eid2)
		return -1;
	else if(eid1>eid2)
		return -1;
	else
		return 0;
}


}
