package com.sankar;

import java.util.Date;

public class Student {
	private String id;
	private String name;
	private Date d;
	public String getId() {
		return id;
	}
	public Student(String id, String name, Date d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	
	public int hashCode(){
		return Integer.parseInt(id);
	}
	public  boolean equals(Object o){
		Student st=(Student)o;
		if(this.id.equals(st.getId())){
			return true;
		}
		return false;
		
	}

}
