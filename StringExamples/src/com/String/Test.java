package src.com.String;


public class Test{
	
	
	public enum Season { WINTER, SPRING, SUMMER, FALL }  
	
	public enum Direction { NORTH,SOUTH,EAST,WEST }  
	  
	public static void main(String[] args) {  
	for (Season s : Season.values())  
	System.out.println(s);  
	 
		for (Direction d :Direction.values())  
		System.out.println(d);  
	
}
}