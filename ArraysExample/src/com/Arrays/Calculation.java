package com.Arrays;

public class Calculation {
	
	public int addOrSubtract(Integer a, int b ,boolean c){
		try{
		if(c){
			int d= a.intValue()+b;
			System.out.println("hi this add");
			return d;
		}else{
			System.out.println("hi this sub");
			return a-b;
		}
		}catch(NullPointerException e){
			throw e;
		}
	}

}
