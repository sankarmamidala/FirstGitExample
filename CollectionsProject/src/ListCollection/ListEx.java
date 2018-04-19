package ListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("x");
		list.add("y");
		list.add("z");
		System.out.println(list);
		list.add(0,"A");
		System.out.println(list);
		list.addAll(1,Arrays.asList("d","e"));
		System.out.println(list);
		list.addAll(Arrays.asList("B"));
        System.out.println(list);
                        //Modify the element useing set()
        list.set(0, "0");
        System.out.println(list);
        
	}

}
