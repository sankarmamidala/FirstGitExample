package ListCollection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HmapEx
{
	public static void main(String[] args) {
		  WeakHashMap<Integer, String> studentMap = new WeakHashMap<>();
		  
	        studentMap.put(1, "Ema");
	        studentMap.put(2, "John");
	 
	        System.out.println("Initial WeakHashMap size = " + studentMap.size());
	 
	        System.gc();
	 
	        System.out.println("WeakHashMap size after GC= " + studentMap.size());
}
}