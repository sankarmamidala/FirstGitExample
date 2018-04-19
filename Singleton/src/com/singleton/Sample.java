package com.singleton;

public class Sample {

	private static Sample obj = new Sample();
	private Sample()
	{}
	public static Sample getInstance()
	{
		/*if(obj==null)
		{
			obj=new Sample();
		}*/
		synchronized (Sample.class) {
			
			
		}
		return obj;
	}
		
	
public static void main(String[] args) {
	
	getInstance();	
	System.out.println(obj.hashCode());
	System.out.println(obj.hashCode());
	
}	
	

}
