package com.core;

public class Test {
	int eid;
	String ename;
	String esal;
	
	public void setEmpDetails()
	{
		eid = 11;
		ename="sankar";
		esal="123456";
		
	}
	public void getEmpDetails()
	{
		System.out.println("EmployeeId:"+eid);
		System.out.println("EmployeeEname:"+ename);
		System.out.println("EmployeeEsal:"+esal);
	}

	public static void main(String[] args)
	{
		Test t=new Test();
		t.setEmpDetails();
		t.getEmpDetails();
	}

}
