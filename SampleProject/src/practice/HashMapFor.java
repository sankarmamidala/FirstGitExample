package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapFor {
	
	
	
	public static void main(String[] args) {
		
	
		
		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		{
			count.put('c', 1);
			count.put('a', 6);
			count.put('d', 5);
			count.put('g', 4);
		}
		
		//for(Character set : count.keySet())
		for(Map.Entry m:count.entrySet())
		{
			System.out.println(m+" : "+count.get(m));
		}
	
}
}