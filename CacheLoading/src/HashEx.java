import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashEx {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"sankar");
		hm.put(2,"mukhi");
		hm.put(3,"raju");
		hm.put(5,"srinu");
		hm.put(7,"rajesh");
		
		Set<Integer> set = hm.keySet();
		Collection<String> values = hm.values();
		
		for (Integer integer : set)
		{
			System.out.println(integer+" " + hm.get(integer));	
		}
		
		
	}

}
