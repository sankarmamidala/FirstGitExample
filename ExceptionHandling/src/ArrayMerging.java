
public class ArrayMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6};
		int b []={6,7,8,9};
		int c []=new int[a.length+b.length];
		
		
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			c[a.length+i]=b[i];
		}
		
		System.out.println(c);
		
		for (int i = 0; i < c.length; i++) {
			int count=0;	
			for (int j = 0; j < c.length; j++) {
				
				if(c[i]==c[j]){
					count++;
				}
				if(count==2){
					System.out.println(c[i]+" is repeated" + count +" times");
					count=0;
				}
			}
		
			
		}

	}

}
