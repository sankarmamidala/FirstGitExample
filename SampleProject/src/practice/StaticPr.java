package practice;

public class StaticPr {
	static int x=10;
	
	
	
	

	public static void main(String[] args) {

		
		StaticPr s=new StaticPr();
		s.x=11;
		StaticPr s1=new StaticPr();
		s1.x=12;
		StaticPr s2=new StaticPr();
		s2.x=13;
		System.out.println(s.x+s1.x+s2.x);
		
	}

}
