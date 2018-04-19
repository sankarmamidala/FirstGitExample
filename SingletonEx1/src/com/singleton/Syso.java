package com.singleton;

public class Syso
{
	private String name;
	private int Age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	
	public void setAge(int age) 
		{
		
		
		
			if(age>=100||age<=0)
			{
			
					try {
						throw new Exception("Not inserted valid age");
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
			
			else
			{
				System.out.println("valid age");
			}
			
			this.Age = age;	
			
}
}
