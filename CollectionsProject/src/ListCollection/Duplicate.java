package ListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate {

	public static void main(String[] args)
	{
		List list=new ArrayList();
		list.add("a");
		list.add("s");
		list.add("e");
		list.add("a");
		list.add("c");
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					list.remove(j);
					j--;
				}
			}
		}
System.out.println(list);
	}

}
