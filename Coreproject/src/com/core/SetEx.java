package com.core;

public class SetEx
{
	private int empId;
	private String ename;
	private String eaddr;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SetEx emp=new SetEx();
		emp.setEaddr("pdrl");
		emp.setEname("sankar");
		emp.setEmpId(123);
		System.out.println("EmployeeDetais");
		System.out.println("empid:"+emp.getEmpId());
		System.out.println("empid:"+emp.getEaddr());
		System.out.println("empid:"+emp.getEname());
		emp.setEmpId(143);
		System.out.println("empid:"+emp.getEmpId());
	}

}
