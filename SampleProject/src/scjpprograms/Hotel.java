package scjpprograms;

class Hotel {
	    
	public static void main(String args[]) {
		try {
		int a[] = new int[5];
		a[10]=9;  // ArrayIndexOutOfBoundsException
		String s=null;
		s.length();
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
		System.out.println("1st catch block guide2java");
		System.out.println(e);
		}
		catch (NullPointerException e)
		{
		System.out.println("2nd catch block guide2java");
		}
		catch (NumberFormatException e)
		{
		System.out.println("3rd catch block guide2java");
		}
		System.out.println("rest of the code...");
		}
		}