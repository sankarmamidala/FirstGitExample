package practice;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2)
	{
		
		String I1=o1.toString();
		String I2=o2.toString();
		
		/*if(I1<I2)
			return -1;
		else if(I1>I2)
			return 1;
		else 
			return 0;*/
		
	return -I1.compareTo(I2);
		//return 1;
		
	}
	

}
