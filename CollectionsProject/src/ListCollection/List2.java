package ListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List2 {

	public static void main(String[] args)
	{
		List list=new ArrayList();
		list.addAll(Arrays.asList("australia","India","chiana","japan"));
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.contains("India"));
		System.out.println(list.isEmpty());
		System.out.println(list.indexOf("japan"));
		System.out.println(list.lastIndexOf("chianaa"));
		System.out.println(list.remove("japan"));
		System.out.println(list);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
