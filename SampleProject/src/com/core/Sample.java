package com.core;

import java.util.HashSet;

public class Sample {

	public static void main(String[] args) {
			String[] array={"1","2","3","4","5","6","1","2","4"};
		//	String b[]={"1","2","3","4","6"};
			for(int i=0;i<array.length;i++)
			{
				for(int j=i+1;j<array.length;j++)
				{
					if((array[i].equals(array[j])))
					{
						System.out.println("with out DuplicateElements:"+array[i]);
					}
				}
			}
			
		
			}
	}


