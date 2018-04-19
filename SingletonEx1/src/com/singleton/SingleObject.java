package com.singleton;

public class SingleObject 
{
	//create an object of SingleObject
	   private static SingleObject instance=null;//new SingleObject();
private String name;
private String name1="ratna";
	   //make the constructor private so that this class cannot be
	   //instantiated
	  private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance()
	   {
		   
		   if(instance==null)
		   {
			   synchronized(SingleObject.class)
			   {
				   if(instance==null)
				   {
			   
			   instance=new SingleObject();
				   }
		   }
		   }
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
	}


