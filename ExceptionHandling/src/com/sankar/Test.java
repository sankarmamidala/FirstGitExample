package com.sankar;

public class Test {
	 static void validate(int age)throws InvalidAgeException{  
	     if(age<18)
			try {
				throw new InvalidAgeException("not valid");
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(19);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  