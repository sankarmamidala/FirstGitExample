package com.Arrays;


public class DuplicateElement {

	public static void main(String[] args) {
		Integer[] array={1,2,3,4,5,6,7,1,2,3};
		
//		HashSet<String>hs=new HashSet();
//		
//		for(String DuplicateElement:array)
//		{
//			if(!hs.add(DuplicateElement))
//			{
//				System.out.println("with out DuplicateElements:"+DuplicateElement);
		
//			}
//		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if((array[i].equals(array[j])))
				{
					System.out.println("with out DuplicateElements:"+array[j]);
				}
			}
		}
		
	}

}
